/* 
 * ControlFlowImpl.java
 *
 * Copyright (c) 2009–2014 Steinbeis Forschungszentrum (STZ Ölbronn),
 * Copyright (c) 2006–2014 by Michael Hoffer
 * 
 * This file is part of Visual Reflection Library (VRL).
 *
 * VRL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * see: http://opensource.org/licenses/LGPL-3.0
 *      file://path/to/VRL/src/eu/mihosoft/vrl/resources/license/lgplv3.txt
 *
 * VRL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * This version of VRL includes copyright notice and attribution requirements.
 * According to the LGPL this information must be displayed even if you modify
 * the source code of VRL. Neither the VRL Canvas attribution icon nor any
 * copyright statement/attribution may be removed.
 *
 * Attribution Requirements:
 *
 * If you create derived work you must do three things regarding copyright
 * notice and author attribution.
 *
 * First, the following text must be displayed on the Canvas or an equivalent location:
 * "based on VRL source code".
 * 
 * Second, the copyright notice must remain. It must be reproduced in any
 * program that uses VRL.
 *
 * Third, add an additional notice, stating that you modified VRL. In addition
 * you must cite the publications listed below. A suitable notice might read
 * "VRL source code modified by YourName 2012".
 * 
 * Note, that these requirements are in full accordance with the LGPL v3
 * (see 7. Additional Terms, b).
 *
 * Publications:
 *
 * M. Hoffer, C.Poliwoda, G.Wittum. Visual Reflection Library -
 * A Framework for Declarative GUI Programming on the Java Platform.
 * Computing and Visualization in Science, in press.
 */
package eu.mihosoft.vrl.lang.model;

import eu.mihosoft.vrl.lang.model.Scope;
import eu.mihosoft.vrl.lang.model.ControlFlow;
import eu.mihosoft.vrl.lang.model.IType;
import eu.mihosoft.vrl.lang.model.Invocation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael Hoffer &lt;info@michaelhoffer.de&gt;
 */
class ControlFlowImpl implements ControlFlow {

    private final List<Invocation> invocations = new ArrayList<>();

    private final Scope parent;

    public ControlFlowImpl(Scope parent) {
        this.parent = parent;
    }

    @Override
    public Invocation createInstance(String id, IType type, String varName, IArgument... args) {
        Invocation result = new InvocationImpl(parent, id, type.getFullClassName(), "<init>", type, true, false, true, args);
        getInvocations().add(result);
        return result;
    }

    @Override
    public Invocation callMethod(String id, String varName, String mName, IType returnType, boolean isVoid, IArgument... args) {
        Invocation result = new InvocationImpl(parent, id, varName, mName, returnType, false, isVoid, false, args);
        getInvocations().add(result);
        return result;
    }

    @Override
    public Invocation callStaticMethod(String id, IType type, String mName, IType returnType, boolean isVoid, IArgument... args) {
        Invocation result = new InvocationImpl(parent, id, type.getFullClassName(), mName, returnType, false, isVoid, true, args);
        getInvocations().add(result);
        return result;
    }

    @Override
    public ScopeInvocation callScope(Scope scope) {
        ScopeInvocation result = new ScopeInvocationImpl(scope);
        getInvocations().add(result);
        return result;
    }

    @Override
    public String toString() {
        String result = "[\n";
        for (Invocation invocation : getInvocations()) {
            result += invocation.toString() + "\n";
        }

        result += "]";

        return result;
    }

    /**
     * @return the invocations
     */
    @Override
    public List<Invocation> getInvocations() {
        return invocations;
    }

    @Override
    public Invocation callMethod(String id, String varName, MethodDeclaration mDec, IArgument... args) {

        if (mDec.getModifiers().getModifiers().contains(Modifier.STATIC)) {
            return callStaticMethod(id, mDec.getClassDeclaration().getClassType(), varName, mDec.getReturnType(), true, args);
        } else {
            return callMethod(id, varName, mDec.getName(), mDec.getReturnType(), Type.VOID.equals(mDec.getReturnType()), args);
        }

    }

    @Override
    public boolean isUsedAsInput(Invocation invocation) {

        for (Invocation inv : invocations) {

            for (IArgument arg : inv.getArguments()) {

                if (arg.getArgType() == ArgumentType.INVOCATION) {
                    if (arg.getInvocation().get().equals(invocation)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public AssignmentInvocation assignConstant(String id, String varName, IArgument arg) {
        Variable var = parent.getVariable(varName);

        if (var == null) {
            throw new IllegalArgumentException("Variable " + varName + " does not exist!");
        }
        
        AssignmentInvocationImpl invocation = new AssignmentInvocationImpl(parent, var, arg);
        
        getInvocations().add(invocation);
        
        return invocation;
    }

    @Override
    public AssignmentInvocation assignVariable(String id, String varName, IArgument arg) {
        Variable var = parent.getVariable(varName);

        if (var == null) {
            throw new IllegalArgumentException("Variable " + varName + " does not exist!");
        }
        
        AssignmentInvocationImpl invocation = new AssignmentInvocationImpl(parent, var, arg);
        
        getInvocations().add(invocation);
        
        return invocation;
    }

}
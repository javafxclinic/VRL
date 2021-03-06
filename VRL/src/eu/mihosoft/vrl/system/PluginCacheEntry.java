/* 
 * PluginCacheEntry.java
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2009–2012 Steinbeis Forschungszentrum (STZ Ölbronn),
 * Copyright (c) 2006–2012 by Michael Hoffer
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
 * First, the following text must be displayed on the Canvas:
 * "based on VRL source code". In this case the VRL canvas icon must be removed.
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
 * Computing and Visualization in Science, 2011, in press.
 */

package eu.mihosoft.vrl.system;

import eu.mihosoft.vrl.io.IOUtil;
import eu.mihosoft.vrl.io.VJarUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Hoffer &lt;info@michaelhoffer.de&gt;
 */


public class PluginCacheEntry {
    private String jarFile;
    private String configuratorClass;
    private String jarFileChecksum;

    public PluginCacheEntry() {

    }
    
    public PluginCacheEntry(PluginConfigurator pConf) {
        configuratorClass = pConf.getClass().getName();
        File f = VJarUtil.getClassLocation(pConf.getClass());
        
        jarFile = f.getName();
        
//        // make jarfile relative to plugin directory
//        // plugin cache is 
//        if (jarFile.startsWith(Constants.PLUGIN_DIR)) {
//            jarFile = jarFile.substring(
//                    Constants.PLUGIN_DIR.length()+1, jarFile.length());
//        }
        
        if (!PluginCacheController.isChecksumsEnabled()) {
            return;
        }
        
        try {
            jarFileChecksum = IOUtil.generateSHA1Sum(IOUtil.fileToByteArray(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PluginCacheEntry.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PluginCacheEntry.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the jarFile
     */
    public String getJarFile() {
        return jarFile;
    }

    /**
     * @param jarFile the jarFile to set
     */
    public void setJarFile(String jarFile) {
        this.jarFile = jarFile;
    }

    /**
     * @return the configuratorClass
     */
    public String getConfiguratorClass() {
        return configuratorClass;
    }

    /**
     * @param configuratorClass the configuratorClass to set
     */
    public void setConfiguratorClass(String configuratorClass) {
        this.configuratorClass = configuratorClass;
    }

    /**
     * @return the jarFileChecksum
     */
    public String getJarFileChecksum() {
        return jarFileChecksum;
    }

    /**
     * @param jarFileChecksum the jarFileChecksum to set
     */
    public void setJarFileChecksum(String jarFileChecksum) {
        this.jarFileChecksum = jarFileChecksum;
    }
}

package my.testpackage;

@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class MyFileClass {
    
    public int m1(int v1) {
        m1(v1);
    }
    public int m2(int v1, int v2) {
        //        m1(v1);
        //        m1(v2);
        m2(m1(v1), m1(v2));
    }
    public int m3(int v1, int v2, int v3) {
        m1(v1);
        for(int i = 0; i <= 30; i++) {
            m3(v1, v2, m2(v2, v3));
        }
        for(int j = 2; j <= 3; j++) {
            m3(v1, v2, m2(v2, v3));
        }
        // test
        m2(m1(v1), m1(v2));
        m2(m1(v1), m1(v2));
        m1(v1);
        //test2
        for(int k = 3; k <= 5; k++) {
            m3(v1, v2, m2(v2, v3));
        }
        // test3
        m1(v1);
        // test4
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class MyFileClass2 {
    
    public int abc123(int a) {
    }
    public int abc1234(int a) {
    }
    public int m1(int v1) {
        m1(v1);
    }
    public int m2(int v1, int v2) {
        m1(v1);
        m1(v2);
        m2(v1, v2);
    }
    //<!VRL!> my special comment
    public int m3(int v1, int v2, int v3) {
        m2(v1, v2);
        m3(v1, v2, v3);
        m1(v1);
        println("1");
    }
    public int abc(int a) {
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class A {
    
    public void abc() {
    }
    public void a123() {
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class B {
    
    public void abc() {
    }
    public void a123() {
    }
}
// <editor-fold defaultstate="collapsed" desc="VRL-Data">
/*<!VRL!><Type:VRL-Layout>
<map>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m1</string>
    <layout>
      <x>704.6441964063256</x>
      <y>657.0494725665422</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m1:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc123</string>
    <layout>
      <x>28.233934581271335</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2:inv:m2</string>
    <layout>
      <x>155.44654214514003</x>
      <y>211.94893698115638</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m3</string>
    <layout>
      <x>695.08033690119</x>
      <y>457.78689961571</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc</string>
    <layout>
      <x>451.60502411078517</x>
      <y>448.52184732334626</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B:abc</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:println</string>
    <layout>
      <x>1395.211771290391</x>
      <y>788.7401451111365</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script</string>
    <layout>
      <x>3.897787500255235</x>
      <y>11.693744253795897</y>
      <width>1584.5566416968957</width>
      <height>1327.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>435.9632529082364</width>
      <height>382.0612281360378</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2:inv:m2</string>
    <layout>
      <x>747.9520294977849</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m2:0</string>
    <layout>
      <x>1548.569319792319</x>
      <y>1073.007694972397</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2</string>
    <layout>
      <x>597.6369700386794</x>
      <y>30.669288227192084</y>
      <width>932.9157515412787</width>
      <height>681.1564477435569</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>26.998517613932762</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3</string>
    <layout>
      <x>76.35773210407676</x>
      <y>777.1278154948259</y>
      <width>936.235179687246</width>
      <height>426.2143794441772</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B:a123</string>
    <layout>
      <x>404.5740125995741</x>
      <y>482.1635492625061</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=i:0</string>
    <layout>
      <x>446.0105239492883</x>
      <y>272.28309848948766</y>
      <width>400.0</width>
      <height>266.58284162463104</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=k:0</string>
    <layout>
      <x>2726.957155260628</x>
      <y>454.4003421302341</y>
      <width>400.0</width>
      <height>368.1147612175987</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=i:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=k:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2:inv:m1:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=k:inv:m3</string>
    <layout>
      <x>525.4515685612281</x>
      <y>210.18062742449126</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=i:inv:m3</string>
    <layout>
      <x>219.86366155610776</x>
      <y>190.54850668196005</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc1234</string>
    <layout>
      <x>28.233934581271335</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m1</string>
    <layout>
      <x>927.4917684084309</x>
      <y>416.40834440957184</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A</string>
    <layout>
      <x>0.0</x>
      <y>12.062974466788082</y>
      <width>550.0</width>
      <height>503.26843633505877</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B</string>
    <layout>
      <x>1678.8174598510075</x>
      <y>890.6253620824241</y>
      <width>550.0</width>
      <height>800.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass</string>
    <layout>
      <x>47.22394471210078</x>
      <y>909.5855795705927</y>
      <width>1063.643780451588</width>
      <height>897.6218186664387</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2</string>
    <layout>
      <x>0.0</x>
      <y>379.78109541165634</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3</string>
    <layout>
      <x>754.6523754338882</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2</string>
    <layout>
      <x>994.8029940652832</x>
      <y>0.0</y>
      <width>1220.421598292887</width>
      <height>860.236342502569</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:3</string>
    <layout>
      <x>828.7387160403304</x>
      <y>1066.784838190429</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m1:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:2</string>
    <layout>
      <x>887.8558554690278</x>
      <y>532.5492924628188</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:0</string>
    <layout>
      <x>3104.5849822477144</x>
      <y>1317.9250131294898</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1</string>
    <layout>
      <x>2144.935415355583</x>
      <y>746.4688489256375</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m2</string>
    <layout>
      <x>2145.0012456947857</x>
      <y>896.4023449913892</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A:abc</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:5</string>
    <layout>
      <x>1522.904527851456</x>
      <y>594.6264873613256</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1:4</string>
    <layout>
      <x>1550.5901027486373</x>
      <y>855.207707603511</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=i</string>
    <layout>
      <x>446.0105239492883</x>
      <y>272.28309848948766</y>
      <width>400.0</width>
      <height>266.58284162463104</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=k</string>
    <layout>
      <x>2726.957155260628</x>
      <y>454.4003421302341</y>
      <width>400.0</width>
      <height>368.1147612175987</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=j:0</string>
    <layout>
      <x>881.6329986870596</x>
      <y>211.142030669806</y>
      <width>400.0</width>
      <height>253.67298114293638</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=j</string>
    <layout>
      <x>881.6329986870596</x>
      <y>211.142030669806</y>
      <width>400.0</width>
      <height>253.67298114293638</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2:inv:m1:0</string>
    <layout>
      <x>737.5658724510042</x>
      <y>235.10326459621368</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A:a123</string>
    <layout>
      <x>566.3572831975526</x>
      <y>296.59494180870087</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=j:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:for:var=j:inv:m3</string>
    <layout>
      <x>519.9020301241247</x>
      <y>267.1718765915641</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
</map>
*/
// </editor-fold>
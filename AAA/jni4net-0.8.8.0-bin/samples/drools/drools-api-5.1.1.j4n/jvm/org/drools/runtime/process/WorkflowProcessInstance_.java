// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.runtime.process;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class WorkflowProcessInstance_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return org.drools.runtime.process.WorkflowProcessInstance_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.runtime.process.WorkflowProcessInstance_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __WorkflowProcessInstance extends system.Object implements org.drools.runtime.process.WorkflowProcessInstance {
    
    protected __WorkflowProcessInstance(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/Object;)V")
    public native void signalEvent(java.lang.String par0, java.lang.Object par1);
    
    @net.sf.jni4net.attributes.ClrMethod("()[Ljava/lang/String;")
    public native java.lang.String[] getEventTypes();
    
    @net.sf.jni4net.attributes.ClrMethod("()J")
    public native long getId();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getState();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getProcessId();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getProcessName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/util/Collection;")
    public native java.util.Collection getNodeInstances();
    
    @net.sf.jni4net.attributes.ClrMethod("(J)Lorg/drools/runtime/process/NodeInstance;")
    public native org.drools.runtime.process.NodeInstance getNodeInstance(long par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;)Ljava/lang/Object;")
    public native java.lang.Object getVariable(java.lang.String par0);
}
//</generated-proxy>
// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.command;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class CommandFactoryService_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return org.drools.command.CommandFactoryService_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.command.CommandFactoryService_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __CommandFactoryService extends system.Object implements org.drools.command.CommandFactoryService {
    
    protected __CommandFactoryService(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newInsert(java.lang.Object par0, java.lang.String par1, boolean par2, java.lang.String par3);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newInsert(java.lang.Object par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/util/Collection;Ljava/lang/String;ZLjava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newInsertElements(java.util.Collection par0, java.lang.String par1, boolean par2, java.lang.String par3);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/util/Collection;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newInsertElements(java.util.Collection par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/runtime/rule/FactHandle;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newRetract(org.drools.runtime.rule.FactHandle par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/String;)Lorg/drools/command/Setter;")
    public native org.drools.command.Setter newSetter(java.lang.String par0, java.lang.String par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/runtime/rule/FactHandle;Ljava/util/List;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newModify(org.drools.runtime.rule.FactHandle par0, java.util.List par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/runtime/rule/FactHandle;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newGetObject(org.drools.runtime.rule.FactHandle par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Lorg/drools/command/Command;")
    public native org.drools.command.Command newGetObjects();
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/runtime/ObjectFilter;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newGetObjects(org.drools.runtime.ObjectFilter par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/Object;Z)Lorg/drools/command/Command;")
    public native org.drools.command.Command newSetGlobal(java.lang.String par0, java.lang.Object par1, boolean par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newSetGlobal(java.lang.String par0, java.lang.Object par1, java.lang.String par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/Object;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newSetGlobal(java.lang.String par0, java.lang.Object par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newGetGlobal(java.lang.String par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newGetGlobal(java.lang.String par0, java.lang.String par1);
    
    @net.sf.jni4net.attributes.ClrMethod("()Lorg/drools/command/Command;")
    public native org.drools.command.Command newFireAllRules();
    
    @net.sf.jni4net.attributes.ClrMethod("(I)Lorg/drools/command/Command;")
    public native org.drools.command.Command newFireAllRules(int par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/util/Map;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newStartProcess(java.lang.String par0, java.util.Map par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newStartProcess(java.lang.String par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/Object;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newSignalEvent(java.lang.String par0, java.lang.Object par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(JLjava/lang/String;Ljava/lang/Object;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newSignalEvent(long par0, java.lang.String par1, java.lang.Object par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(JLjava/util/Map;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newCompleteWorkItem(long par0, java.util.Map par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(J)Lorg/drools/command/Command;")
    public native org.drools.command.Command newAbortWorkItem(long par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newQuery(java.lang.String par0, java.lang.String par1, java.lang.Object[] par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/String;Ljava/lang/String;)Lorg/drools/command/Command;")
    public native org.drools.command.Command newQuery(java.lang.String par0, java.lang.String par1);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/util/List;Ljava/lang/String;)Lorg/drools/command/BatchExecutionCommand;")
    public native org.drools.command.BatchExecutionCommand newBatchExecution(java.util.List par0, java.lang.String par1);
}
//</generated-proxy>

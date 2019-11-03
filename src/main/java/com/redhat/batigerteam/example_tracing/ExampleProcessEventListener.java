package com.redhat.batigerteam.example_tracing;

import org.kie.api.event.process.ProcessVariableChangedEvent;

public class ExampleProcessEventListener extends com.redhat.batigerteam.tracing.CustomProcessEventListener {
	
    /** 
     * @param event
     */
	@Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        ") ->Variable ("+
                                event.getVariableId()+
                                ") (("+
                                event.getVariableInstanceId()+
                                ")) is about to be changed from "+
                                "{"+event.getOldValue()+
                                "} to {"+
                                event.getNewValue()+"}"
        );
    }

    /** 
     * @param event
     */
	@Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        ") ->Variable ("+
                                event.getVariableId()+
                                ") (("+
                                event.getVariableInstanceId()+
                                ")) has been changed from "+
                                "{"+event.getOldValue()+
                                "} to {"+
                                event.getNewValue()+"}"
        );
    }

}
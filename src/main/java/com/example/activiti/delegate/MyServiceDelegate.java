package com.example.activiti.delegate;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * java service task
 */
public class MyServiceDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        String processDefinitionId = delegateExecution.getProcessDefinitionId();
        String processInstanceId = delegateExecution.getProcessInstanceId();
        String id = delegateExecution.getId();
        System.out.println("end serviceTask");
    }
}

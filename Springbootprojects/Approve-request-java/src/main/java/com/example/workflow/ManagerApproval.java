
package com.example.workflow;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.JavaDelegate;
        import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ManagerApproval implements JavaDelegate  {
    @Override
    // to include the Java class you have to always put it in the execute function
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("approval", approval((Integer)execution.getVariable("days")));
    }

    public boolean approval(Integer days) {
        if(days != null){
            boolean approval;
            if (days >= 30) {
                approval = false;
                return approval;
            } else {
                approval = true;
                return approval;
            }
        }
        else {
            return false;
        }
    }
}

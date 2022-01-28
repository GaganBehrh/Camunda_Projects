package com.example.workflow.processes.delegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class ApplicationRejectedDelegate implements JavaDelegate{

    private static final Logger log = LoggerFactory.getLogger(ApplicationRejectedDelegate.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("Your application is rejected");
    }


    }

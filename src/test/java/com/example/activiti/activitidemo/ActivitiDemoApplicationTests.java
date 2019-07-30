package com.example.activiti.activitidemo;


        import org.activiti.engine.RuntimeService;
        import org.activiti.engine.TaskService;
        import org.activiti.engine.runtime.ProcessInstance;
        import org.junit.Test;
        import org.junit.runner.RunWith;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitiDemoApplicationTests {

    @Autowired
    RuntimeService runtimeService;

    @Test
    public void contextLoads() {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("waiter2");
//        List<ProcessInstance> processInstanceList = runtimeService.createProcessInstanceQuery().processDefinitionKey("waiter2").listPage(0, 100);
        String name = processInstance.getName();

    }


}

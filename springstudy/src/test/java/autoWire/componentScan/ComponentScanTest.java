package autoWire.componentScan;

import beanStudy.autoWire.componentScan.scanpackage1.FirstDemo;
import beanStudy.autoWire.componentScan.scanpackage2.SecondDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


//设置JUnit运行测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring上下文配置类
//@ContextConfiguration(classes = ComponetScanJavaConfig.class)
//设置spring上下文配置文件
@ContextConfiguration(locations = { "classpath*:/spring*.xml"})
public class ComponentScanTest {
    @Autowired
    private FirstDemo firstDemo;

    @Autowired
    private SecondDemo secondDemo;

    @Test
    public void testComponentScanForJavaConfig(){
        assertNotNull(firstDemo);
        assertNotNull(secondDemo);
        assertEquals("first demo",firstDemo.getDescription());
        assertEquals("second demo",secondDemo.getDescription());
        System.out.println(firstDemo.getDescription());
        System.out.println(secondDemo.getDescription());
    }

}

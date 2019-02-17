package beanStudy.autoWire.componentScan;

import org.springframework.context.annotation.ComponentScan;

/**
 * Spring bean自动装配学习
 *
 * 方式一：组件扫描 -- JavaConfig类
 *
 * 组件扫描配置可以有两种方式
 * 方式一：javaConfig类
 * 方式二：xml文件
 *
 * @componetScan
 * 可以指定组件扫描的范围即基础包，基础包作为其参数进行设定，可以设置多个以数组的形式展示
 * 未设定时其范围是config类所在包及其子包
 *
 */
//@Configuration
@ComponentScan(basePackages = {"beanStudy.autoWire.componentScan.scanpackage1",
        "beanStudy.autoWire.componentScan.scanpackage2"})
public class ComponetScanJavaConfig {
}

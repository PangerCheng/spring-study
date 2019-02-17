package beanStudy.autoWire.componentScan.scanpackage2;

import org.springframework.stereotype.Component;

@Component
public class SecondDemo {
    private String description = "second demo";

    public String getDescription() {
        return description;
    }

    private void descript(){
        System.out.println(this.description);
    }
}

package beanStudy.autoWire.componentScan.scanpackage1;

import org.springframework.stereotype.Component;

@Component
public class FirstDemo {
    private String description = "first demo";

    public String getDescription() {
        return description;
    }

    private void descript(){
        System.out.println(this.description);
    }
}

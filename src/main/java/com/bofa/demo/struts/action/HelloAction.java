package com.bofa.demo.struts.action;

import com.bofa.demo.struts.service.HelloMessageService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;


@SuppressWarnings("serial")
@Namespaces({
        @Namespace("/")
})
@Action(value = "/car")
@Result(name = "success", location = "/WEB-INF/content/result.jsp")
public class HelloAction extends ActionSupport {
    private String carName;
    private String carMessage;

    private HelloMessageService carMessageService;

    public HelloAction(HelloMessageService carMessageService) {
        this.carMessageService = carMessageService;
    }

    @Override
    public String execute() {
        System.out.println("   ***** CarAction called *****");
        this.setCarMessage(this.carMessageService.getLanguage(carName));
        return SUCCESS;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarMessage() {
        return carMessage;
    }

    public void setCarMessage(String carMessage) {
        this.carMessage = carMessage;
    }

}

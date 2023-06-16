package com.bofa.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.stereotype.Service;

import static com.opensymphony.xwork2.Action.SUCCESS;


public class TestAnnotationAction { //extends ActionSupport {
    //@Override
    public String execute(){
        //Business logic here...
        return SUCCESS;
    }
}

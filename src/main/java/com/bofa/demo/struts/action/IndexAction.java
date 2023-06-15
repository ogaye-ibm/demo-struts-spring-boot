package com.bofa.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Service;

@SuppressWarnings("serial")
@Service
@Namespaces({
        @Namespace("/")
})
@Action(value = "/index")
@Result(name = "success", location = "/WEB-INF/content/input.jsp")
public class IndexAction extends ActionSupport {
    @Override
    public String execute() {
        System.out.println("   ***** IndexAction called *****");
        return SUCCESS;
    }
}
package com.bofa.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.stereotype.Service;

@SuppressWarnings("serial")
@Service
@Namespaces({
        @Namespace("/a_name_space")
})
@InterceptorRefs({
        @InterceptorRef(value = "defaultStack"),
        @InterceptorRef(value = "execAndWait")}
)
@Action(value = "/some_action",
        results = {
            @Result(type = "a_type", params = {
                "location", "/WEB-INF/content/legacy_jsp.jsp" }
            )
        }
)
public class TestAnnotationAction extends ActionSupport {
    @Override
    public String execute(){
        //Business logic here...
        return SUCCESS;
    }
}

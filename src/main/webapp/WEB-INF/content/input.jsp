<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html lang="en-US">
    <head>
        <meta charset="UTF-8"/>
        <title>Hello</title>
    </head>
    <body>
        <form method="get" action="hello.html">
            <p>Welcome to Struts2 and Spring Boot integration demo</p>
            <p>How do you want your customized greeting?</p>
            <p>Please choose english or french</p>

            <select name="language">
                <option value="French" label="french"/>
                <option value="English" label="english"/>
            </select> <input type="submit" value=" Enter! "/>
        </form>
    </body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 7/15/2019
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC 5 - form handling | Java Guides</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP + MySQL
            Example - Customer Management</h3>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Customer</div>
            </div>
            <div class="panel-body">
                <form:form action="saveBlog" cssClass="form-horizontal"
                           method="post" modelAttribute="blog">

                    <!-- need to associate this data with customer id -->
                    <form:hidden path="id" />

                    <div class="form-group">
                        <label for="title" class="col-md-3 control-label">Title</label>
                        <div class="col-md-9">
                            <form:input path="title" cssClass="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="des" class="col-md-3 control-label">Des</label>
                        <div class="col-md-9">
                            <form:input path="des" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="author" class="col-md-3 control-label">Author</label>
                        <div class="col-md-9">
                            <form:input path="author" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="body" class="col-md-3 control-label">Body</label>
                        <div class="col-md-9">
                            <form:input path="body" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-md-offset-3 col-md-9">
                            <form:button cssClass="btn btn-primary">Submit</form:button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
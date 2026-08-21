<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <link rel="stylesheet"
          type="text/css"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>

<body>

<div class="container mt-5">

    <h1>Employee Registration Form</h1>

    <form:form action="processForm" modelAttribute="userModel">

        <div class="form-group mt-3">

            <label>Username</label>

            <form:input
                    type="text"
                    placeholder="Enter Username"
                    path="username"
                    cssClass="form-control"/>

            <form:errors
                    path="username"
                    cssClass="text-danger"/>

        </div>


        <div class="form-group mt-3">

            <label>Email address</label>

            <form:input
                    type="text"
                    placeholder="Enter Email"
                    path="email"
                    cssClass="form-control"/>

            <form:errors
                    path="email"
                    cssClass="text-danger"/>

        </div>


        <div class="form-group mt-3">

            <label>Password</label>

            <form:input
                    type="password"
                    placeholder="Enter Password"
                    path="password"
                    cssClass="form-control"/>

            <form:errors
                    path="password"
                    cssClass="text-danger"/>

        </div>


        <div class="form-group mt-3">

            <label>Confirm Password</label>

            <form:input
                    type="password"
                    placeholder="Confirm Password"
                    path="confirmPassword"
                    cssClass="form-control"/>

            <form:errors
                    path="confirmPassword"
                    cssClass="text-danger"/>

        </div>


        <input
                type="submit"
                value="Submit"
                class="btn btn-primary mt-3"/>

    </form:form>

</div>

</body>
</html>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>User Profile Form</title>

    <link rel="stylesheet"
          type="text/css"
          href="${pageContext.request.contextPath}/resources/css/style.css">

    <link rel="stylesheet"
          type="text/css"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <h2 class="text-center mb-4">
                User Profile Form
            </h2>

            <form:form
                    action="processForm"
                    modelAttribute="userModel"
                    class="p-4 border rounded bg-white shadow">

                <!-- First Name -->

                <div class="form-group mb-3">

                    <form:input
                            type="text"
                            placeholder="First Name"
                            path="firstName"
                            class="form-control"/>

                </div>


                <!-- Last Name -->

                <div class="form-group mb-3">

                    <form:input
                            type="text"
                            placeholder="Last Name"
                            path="lastName"
                            class="form-control"/>

                </div>

                <!-- Email  -->

                <div class="form-group mb-3">

                    <form:input
                            type="email"
                            placeholder="Email"
                            path="email"
                            class="form-control"/>

                </div>


                <!-- Date Of Birth  -->

                <div class="form-group mb-3">

                    <form:input
                            type="date"
                            path="dateOfBirth"
                            class="form-control"/>

                </div>


                <!-- City -->

                <div class="form-group mb-3">

                    <form:input
                            type="text"
                            placeholder="City"
                            path="city"
                            class="form-control"/>

                </div>

                <!-- Submit -->

                <div class="form-group">

                    <input type="submit"
                           class="btn btn-danger btn-block"/>

                </div>


            </form:form>

        </div>

    </div>

</div>


</body>

</html>
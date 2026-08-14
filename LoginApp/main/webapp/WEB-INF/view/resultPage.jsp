<html>
<head>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

  <h1>Data submitted successfully</h1>

  <h3>First Name is : ${userModelResult.firstName}</h3>

  <h3>Last Name is : ${userModelResult.lastName}</h3>

  <h3>Email is : ${userModelResult.email}</h3>

  <h3>Date Of Birth is : ${userModelResult.dateOfBirth}</h3>

  <h3>City is : ${userModelResult.city}</h3>

</body>
</html>
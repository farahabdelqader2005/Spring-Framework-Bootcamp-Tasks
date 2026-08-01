<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1">

    <title>Age Calculator</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <h2 class="mb-4">Age Calculator</h2>

    <form action="${pageContext.request.contextPath}/calculate-age"
          method="get">

        <div class="row g-2">

            <div class="col-md-3">
                <input type="number"
                       name="year"
                       class="form-control"
                       placeholder="Year"
                       required>
            </div>

            <div class="col-md-3">
                <input type="number"
                       name="month"
                       class="form-control"
                       placeholder="Month"
                       min="1"
                       max="12"
                       required>
            </div>

            <div class="col-md-3">
                <input type="number"
                       name="day"
                       class="form-control"
                       placeholder="Day"
                       min="1"
                       max="31"
                       required>
            </div>

            <div class="col-md-3">
                <button type="submit"
                        class="btn btn-primary w-100">
                    Submit
                </button>
            </div>

        </div>

    </form>

    <div class="mt-4">

        <div class="alert alert-success">
            ${result}
        </div>

        <div class="alert alert-danger">
            ${error}
        </div>

    </div>

</div>

</body>
</html>


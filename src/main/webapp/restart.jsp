<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Restart</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="background-image: url('image/win.png');">

<div class="container-fluid">
    <br>
    <br>
    <h1 class="text-center" style="${sessionScope.result ? 'color: green;' : 'color: red;'}">${sessionScope.result ? 'Победа' : 'Поражение'} </h1>
    <br>
    <p class="text-center">${sessionScope.outcome} </p>

    <form action="start" method="POST" class="form-horizontal">
        <fieldset>
            <div class="form-group">
                <label class="col-md-4 control-label" for=""></label>
                <div class="col text-center">
                    <button id="" name="" class="btn btn-primary">restart</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>
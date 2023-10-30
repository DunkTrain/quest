<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quest</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="background-image: url('image/quest.png');">
<div class="container-fluid">
    <form action="controller" method="POST" class="form-horizontal">
        <fieldset>
            <div class="container" >
                <h1>Выбор: ${sessionScope.gameId}</h1>
                <div class="form-group">${sessionScope.currentQuestion}</div><br>
                <% ArrayList<String> list = (ArrayList<String>) request.getSession().getAttribute("currentOptions"); %>
                <% for (String option : list) {%>
                <div class="form-group">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" value="<%=option%>">
                    <label class="form-check-label"><%=option%>
                    </label>
                </div>
                <%
                    }
                %>

                <div class="form-group">
                    <label class="col-md-4 control-label" for=""></label>
                    <div class="col-md-4">
                        <button id="" name="" class="btn btn-primary">next</button>
                    </div>
                </div>
            </div>

        </fieldset>
    </form>
    <div class="spoiler_wrap">
        <input type="checkbox" class="read-more-state" id="visible" />
        <div class="spoiler_content">
            <br>
            <p class="text_hide">имя: ${sessionScope.name}</p>
            <p class="text_hide">кол-во попыток: ${sessionScope.counter}</p>
        </div>
        <label for="visible" class="read-more-trigger"></label>
    </div>
</div>
</body>
</html>
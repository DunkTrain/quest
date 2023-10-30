<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Start</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body style="background-image: url('image/warhammerStart.png');">

<div class="container-fluid">
    <h1 class="text-center">Пролог</h1>
    <p>Ты находишься на зеленой планете, окруженной развалинами и пламенными небесами.
       Перед тобой стоит могучий орк, готовый подняться на борт своего военного флота орков.
       Разве ты не об этом мечтал? Стать правой рукой могучего варбоса оркской флотилии,
       которая будет совершать разрушительные походы во имя великого Горка и Морка.</p>
    <p>Так что вперед!</p>
    <br>
    <h1 class="text-center">Знакомство с Оркским Флотом</h1>
    <p>Когда ты поднялся на борт флота орков, тебя встретил огромный орк-громила с железной бородой, механической рукой и в черной шляпе:</p>
    <p>- Оркуэр-бро! Я Громбрейкер - капитан этой здоровенной флотилии! Заметил, как бойцы веселятся?
         Там в углу варбос Грубгулл пьет бензин, а под палубой наш мехбосс Гринсмэшер собирает новую боеголовку.</p>
    <p>А как обращаться к тебе?</p>
    <form action="start" method="POST" class="form-horizontal">
        <fieldset>

            <div class="form-group">
                <label class="col-md-4 control-label" for="name"></label>
                <div class="col text-center">
                    <input autocomplete="anon" id="name" name="name" type="text" placeholder="Введите имя" class="form-control input-md">
                </div>
            </div>


            <div class="form-group">
                <label class="col-md-4 control-label" for=""></label>
                <div class="col text-center">
                    <button id="" name="" class="btn btn-primary">start</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
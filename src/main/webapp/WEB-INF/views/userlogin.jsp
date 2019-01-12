<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>User Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A project management Bootstrap theme by Medium Rare">
        <link href="assets/img/blacklionlogo.jpg" rel="icon" type="image/x-icon">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Gothic+A1" rel="stylesheet">
        <link href="assets/css/theme.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body style="background-color:black;">
        <div class="main-container fullscreen">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-xl-5 col-lg-6 col-md-7">
                        <div class="text-center">
                        <img src="assets/img/blacklionlogo.jpg" alt="Black Lion Logo" width="500" height="333">
                            <h1 class="h2">Black Lion Republic</h1>
                            <p class="lead">Log in to your account to continue</p>
                            <form:form method="post" action="/dashboard" modelAttribute="user">
                                <div class="form-group">
                                    <form:input class="form-control" type="email" 
                                    	placeholder="Email Address" name="login-email" path="email"/>
                                </div>
                                <div class="form-group">
                                    <form:input class="form-control" type="password" 
                                    placeholder="Password" name="login-password" path="password" />
                                </div>
                                <button class="btn btn-lg btn-block btn-primary" role="button" type="submit">
                                    Log in
                                </button>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="assets/js/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/autosize.min.js"></script>
        <script type="text/javascript" src="assets/js/popper.min.js"></script>
        <script type="text/javascript" src="assets/js/prism.js"></script>
        <script type="text/javascript" src="assets/js/draggable.bundle.legacy.js"></script>
        <script type="text/javascript" src="assets/js/swap-animation.js"></script>
        <script type="text/javascript" src="assets/js/dropzone.min.js"></script>
        <script type="text/javascript" src="assets/js/list.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.js"></script>
        <script type="text/javascript" src="assets/js/theme.js"></script>


    </body>

</html>

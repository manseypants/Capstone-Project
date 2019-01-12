<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
	<head>
        <meta charset="utf-8">
        <title>Black Lion CRM - Order Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Black Lion Order Form">
        <link href="assets/img/blacklionlogo.jpg" rel="icon" type="image/x-icon">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Gothic+A1" rel="stylesheet">
        <link href="assets/css/theme.css" rel="stylesheet" type="text/css" media="all" />
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">


    <!-- Core Style CSS -->
    	<link rel="stylesheet" href="css/core-style.css">
    	<link rel="stylesheet" href="style.css">
    </head>
    
<body>

<div class="layout layout-nav-side">
            <div class="navbar navbar-expand-lg bg-dark navbar-dark sticky-top">
                <a class="navbar-brand" href="order.html">
                    <img alt="Pipeline" src="assets/img/logo.svg" />
                </a>
                <div class="d-flex align-items-center">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-collapse" aria-controls="navbar-collapse" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="d-block d-lg-none ml-2">
                        <div class="dropdown">
                            <a href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img alt="Image" src="assets/img/avatar-male-4.jpg" class="avatar" />
                            </a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <a href="register" class="dropdown-item">Profile</a>
                                <a href="userlogin" class="dropdown-item">Log Out</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="collapse navbar-collapse flex-column" id="navbar-collapse">
                    <ul class="navbar-nav d-lg-block">

                        <li class="nav-item">
                           <a class="nav-link" href="/dashboard">Dashboard</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/account">New Account</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="/order">New Order</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/tasks">New Task</a>
                        </li>
                    </ul>
                    <hr>
                </div>
                <div class="d-none d-lg-block">
                    <div class="dropup">
                        <a href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img alt="Image" src="assets/img/avatar-male-4.jpg" class="avatar" />
                        </a>
                        <div class="dropdown-menu">
                           <a href="register" class="dropdown-item">Profile</a>
                           <a href="userlogin" class="dropdown-item">Log Out</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
				<div class="col-xl-8 col-lg-9">
						<div class="card">
							<div class="card-body">
								<div class="tab-content">
									<div class="tab-pane fade show active" role="tabpanel"
										id="profile" aria-labelledby="profile-tab">
										<div class="media mb-4">
											<img alt="Image" src="assets/img/avatar-male-4.jpg"
												class="avatar avatar-lg" />
											<div class="media-body ml-3">
												<h1>Order Form</h1>
											</div>
										</div>
										<!--end of avatar-->
										
										
										
										<form:form method="POST" modelAttribute="myOrder" action="/orderSent">
									<div class="form-group row align-items-center">
										<label class="col-3">Account Name</label>
										<!-- drop down list of accounts -->

										<div class="col">
											<form:select path="accountName">
												<form:option value="NONE" label="Select" />
												<form:options items="${accountNames}" />
											</form:select>
										</div>
									</div>
									
									<div class="form-group row align-items-center">
										<label class="col-3">Beers</label>
										<!-- drop down list of accounts -->

										<div class="col">
											<form:checkboxes items = "${beerList}" path = "beerNames" delimiter="<br/>" />  
										</div>
									</div>
									
											<div class="row justify-content-end">
												<input type="submit" class="btn btn-primary" value="Save">
											</div>
										</form:form>
									</div>
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
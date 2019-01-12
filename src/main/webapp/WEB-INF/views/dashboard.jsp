<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!doctype html>
            <html lang="en">

            <head>
                <meta charset="utf-8">
                <title>Black Lion CRM - DASHBOARD</title>
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <meta name="description" content="Black Lion Dashboard">
                <link href="assets/img/blacklionlogo.jpg" rel="icon" type="image/x-icon">
                <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
                <link href="https://fonts.googleapis.com/css?family=Gothic+A1" rel="stylesheet">
                <link href="assets/css/theme.css" rel="stylesheet" type="text/css" media="all" />
            </head>

            <body>

                <div class="layout layout-nav-side">
                    <div class="navbar navbar-expand-lg bg-dark navbar-dark sticky-top">
                        <a class="navbar-brand" href="dashboard.html">
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
                    <div class="main-container">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-11 col-xl-10">
                                    <div class="page-header">
                                        <h1>Dashboard</h1>
                                        <div class="d-flex align-items-center">
                                        </div>
                                    </div>

                                    <div class="tab-content">
                                        <div class="tab-pane fade show active" id="task" role="tabpanel" aria-labelledby="task-tab">
                                            <div class="content-list" data-filter-list="checklist">
                                                <div class="row content-list-head">
                                                    <div class="col-auto">
                                                        <h3> My Tasks</h3>
                                                    </div>

                                                </div>
                                                <!--Task List-->
                                                <div class="content-list-body">
                                                    <form class="checklist">

                                                        <c:forEach items="${taskList}" var="tlItem">
                                                            <!-- Task Section-->
                                                            <div class="row">
                                                                <div class="form-group col">
                                                                    <span class="checklist-reorder">
                                                            <i class="material-icons">reorder</i>
                                                        </span>
                                                                    <div class="custom-control custom-checkbox col">
                                                                        <input type="checkbox" class="custom-control-input" id="checklist-item-4">
                                                                        <label class="custom-control-label" for="checklist-item-4"></label>
                                                                        <div>
                                                                            <a href="/taskDetail?id=${tlItem.taskNumber}">
                                                                			${tlItem.taskName}
                                                                			</a>
                                                                        </div>
                                                                    </div>
                                                                    
                                                                </div>
                                                            </div>
                                                        </c:forEach>
                                                    </form>
                                                </div>
                                                <!-- My Accounts Section -->
                                                <div class="tab-content">
                                        <div class="tab-pane fade show active" id="task" role="tabpanel" aria-labelledby="task-tab">
                                            <div class="content-list" data-filter-list="checklist">
                                                <div class="row content-list-head">
                                                    <div class="col-auto">
                                                        <h3> My Accounts</h3>
                                                    </div>

                                                </div>
                                                <div class="content-list-body">
                                                    <form class="checklist">

                                                        <c:forEach items="${accountsList}" var="tlItem">
                                                            <div class="row">
                                                                <div class="form-group col">
                                                                    <span class="checklist-reorder">
                                                            <i class="material-icons">reorder</i>
                                                        </span>
                                                                    <div class="custom-control custom-checkbox col">
                                                                        <div>
                                                                            <a href="/accountDetail?id=${tlItem.accountName}">
                                                                			${tlItem.accountName}
                                                                			</a>
                                                                        </div>
                                                                    </div>
                                                                    
                                                                </div>
                                                            </div>
                                                        </c:forEach>
                                                    </form>
                                                </div>
                                                    </div>
                                            </div>
                                        </div>
                                    </div>
                                            </div>
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

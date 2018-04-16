<!DOCTYPE html>
<html>
<head>
<title>Login to CAP account</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>
<style>
</style>
</head>

<body>

	<%@include file="NavBar.jsp" %>

	<div class="container">
		<div class="contentSection"><!--  style="display: flex; -->
			<div class="registerForm1"></div>
			<div class="loginForm">
				<div class="container">
				<div class="row">
		<div class="col-md-4 col-md-offset-4 text-center">
					<h3>Login</h3>
					<form class="" method="post" action="#">

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">User Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="username" id="username"
										placeholder="Enter your Username" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="password"
										id="password" placeholder="Enter your Password" />
								</div>
							</div>
						</div>

						<div class="form-group ">
							<a href="" target="_blank" type="button" id="button"
								class="btn btn-primary btn-lg btn-block login-button">Login</a>
						</div>
					</form>
					<span style="padding-left: 110px">Forgot Password?<a
						href="Reset">Reset your Password.</a></span> <br> <span
						style="padding-left: 110px">New User?<a href="SignUp">Click
							here.</a></span>

				</div>
			</div>
			</div>
			</div>
			<div class="registerForm2"></div>
		</div>
	</div>

</body>
</html>
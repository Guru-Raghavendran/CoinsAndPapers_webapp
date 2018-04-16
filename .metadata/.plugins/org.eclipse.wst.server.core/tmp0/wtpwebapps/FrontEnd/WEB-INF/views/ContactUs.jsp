<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact Us</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style type="text/css">
/*   	.jumbotron {
background: #c82021;
color: #FFF;
border-radius: 0px;
}

.jumbotron-sm { padding-top: 12px;
padding-bottom: 12px; }
.jumbotron small {
color: #FFF;
}
 */
.h1 small {
	font-size: 24px;
}

.button {
	background: #c82021;
	color: #FFF;
	border-radius: 3px;
}

.button.hover {
	background: #c82021;
	color: #358CCE;
}
</style>


</head>
<body>
	<%@include file="NavBar.jsp" %>
	<!-- <nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				
				
				<a class="navbar-brand" href="#">Coppers And Papers</a>
			</div>
			<div class="navbar navbar-collapse" id=myNavbar>
			<ul class="nav navbar-nav ">
				<li><a href="#">Home</a></li>

				<li><a href="#">About Us</a></li>

				<li class="active"><a href="#">Contact Us</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
			</div>
		</div>
	</nav> -->

	<div class="container"></div>





	<!-- <div class="jumbotron jumbotron-sm">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-sm-12">
                <h1 class="h1">
                    Contact us <small>We value your messages</small></h1>
            </div>
        </div>
    </div>
</div> -->
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="well well-sm">
					<form>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="name"> Name</label>
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-user"></span> </span> <input type="text"
											class="form-control" id="name" placeholder="Enter your name"
											required="required" />
									</div>
								</div>
								<div class="form-group">
									<label for="email"> Email Address</label>
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-envelope"></span> </span> <input
											type="email" class="form-control" id="email"
											placeholder="Enter your email" required="required" />
									</div>
								</div>
								<div class="form-group">
									<label for="subject"> Mobile No.</label>
									<div class="input-group">
										<span class="input-group-addon"><span
											class="glyphicon glyphicon-phone"></span> </span> <input
											type="number" class="form-control" id="phone"
											placeholder="Enter your phone no." required="required" />
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="name"> Message</label>
									<textarea name="message" id="message" class="form-control"
										rows="9" cols="25" required="required" placeholder="Message"></textarea>
								</div>
							</div>
							<div class="form-group">

								<div class="col-md-12">
									<button type="submit" class="btn btn-primary pull-right">
										Send <span class="glyphicon glyphicon-send"></span>
									</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="col-md-4">
				<form>
					<span class="glyphicon glyphicon-globe"></span> Our Location
					<address>
						<strong>coppersandpapers.com</strong><br> 412, 3rd Floor,<br>
						Gandhipuram, Coimbatore - 641012<br> <b>Phone:</b> (+91)
						97892 53382 <br>
					</address>
					<address>
						Email: <a href="mailto:#">info@coppersandpapers.com</a>
					</address>
				</form>
			</div>
		</div>



		<div id="map" style="width: 100%; height: 400px;"></div>

		<script>
		
			
			function myMap() {
				  var myCenter = new google.maps.LatLng(11.019788, 76.963657);
				  var mapCanvas = document.getElementById("map");
				  var mapOptions = {center: myCenter, zoom: 16};
				  var map = new google.maps.Map(mapCanvas, mapOptions);
				  var marker = new google.maps.Marker({position:myCenter});
				  marker.setMap(map);
				  
				}
			
		</script>

		<script
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAv8CzzOE0YXAQfWm6wzaWEfd44L1Ood28&callback=myMap"></script>
	</div>





	<%-- <jsp:include page="/WEB-INF/lib/jsp/Footer.jsp"></jsp:include> --%>

	<script type="text/javascript">
		
	</script>




</body>
</html>

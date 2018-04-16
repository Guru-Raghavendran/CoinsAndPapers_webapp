
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">

    <title>Sign Up Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
   
.alignleft {
    float: left;
    margin-right: 15px;
}
.alignright {
    float: right;
    margin-left: 15px;
}
.aligncenter {
    display: block;
    margin: 0 auto 15px;
}
a:focus { outline: 0 solid }
img {
    max-width: 100%;
    height: auto;
}
.fix { overflow: hidden }
h1,
h2,
h3,
h4,
h5,
h6 {
    margin: 0 0 15px;
    font-weight: 700;
}
html,
body { height: 100% }

a {
    -moz-transition: 0.3s;
    -o-transition: 0.3s;
    -webkit-transition: 0.3s;
    transition: 0.3s;
    color: #333;
}
a:hover { text-decoration: none }



.search-box{margin:80px auto;position:absolute;}
.caption{margin-bottom:50px;}
.SignUpForm input[type=text], .SignUpForm input[type=password],.SignUpForm input[type=number]{
	margin-bottom:10px;
}
.SignUpForm input[type=submit]{
	background:#fb044a;
	color:#fff;
	font-weight:700;
	
}


#pswd_info {
	background: #dfdfdf none repeat scroll 0 0;
	color: #fff;
	left: 20px;
	position: absolute;
	top: 115px;
}
#pswd_info h4{
    background: black none repeat scroll 0 0;
    display: block;
    font-size: 14px;
    letter-spacing: 0;
    padding: 17px 0;
    text-align: center;
    text-transform: uppercase;
}
#pswd_info ul {
    list-style: outside none none;
}
#pswd_info ul li {
   padding: 10px 45px;
}



.valid {
	background: rgba(0, 0, 0, 0) url("https://s19.postimg.org/vq43s2wib/valid.png") no-repeat scroll 2px 6px;
	color: green;
	line-height: 21px;
	padding-left: 22px;
}

.invalid {
	background: rgba(0, 0, 0, 0) url("https://s19.postimg.org/olmaj1p8z/invalid.png") no-repeat scroll 2px 6px;
	color: red;
	line-height: 21px;
	padding-left: 22px;
}


#pswd_info::before {
    background: #dfdfdf none repeat scroll 0 0;
    content: "";
    height: 25px;
    left: -13px;
    margin-top: -12.5px;
    position: absolute;
    top: 50%;
    transform: rotate(45deg);
    width: 25px;
}
#pswd_info {
    display:none;
}
    </style>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'https://bootsnipp.com');
        });
    </script>
</head>
<body>
	<%@include file="NavBar.jsp" %>
	<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4 text-center">
			<div class="search-box">
				<div class="caption">
					<h2>Sign Up</h2>
				</div>
				<form action="" class="SignUpForm">
					<div class="input-group">
						<input type="text" id="name" class="form-control" placeholder="Full Name">
						<input type="number" id="doorno" class="form-control" placeholder="Door Number">
						<input type="password" id="paw" class="form-control" placeholder="Password">
						<input type="password" id="paw1" class="form-control" placeholder="Confirm Password">
						<input type="submit" id="submit" class="form-control" value="Sign Up">
					</div>
				</form>
			</div>
		</div>
		<div class="col-md-4">
			<div class="aro-pswd_info">
				<div id="pswd_info">
					<h4>Password must meet the following requirements</h4>
					<ul>
						<li id="letter" class="invalid">Must have at least <strong>one letter</strong></li>
						<li id="capital" class="invalid">Must have at least <strong>one capital letter</strong></li>
						<li id="number" class="invalid">Must have at least <strong>one number</strong></li>
						<li id="length" class="invalid">Must have at least <strong>8 characters</strong></li>
						<li id="space" class="invalid"> Must use <strong> ~,!,@,#,$,%,^,*,-,=,.,;,' </strong></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
	<script type="text/javascript">
	$(document).ready(function(){
	
	$('input[id=paw]').keyup(function() {
		var pswd = $(this).val();
		
		//validate the length
		if ( pswd.length < 8 ) {
			$('#length').removeClass('valid').addClass('invalid');
		} else {
			$('#length').removeClass('invalid').addClass('valid');
		}
		
		//validate letter
		if ( pswd.match(/[A-z]/) ) {
			$('#letter').removeClass('invalid').addClass('valid');
		} else {
			$('#letter').removeClass('valid').addClass('invalid');
		}

		//validate capital letter
		if ( pswd.match(/[A-Z]/) ) {
			$('#capital').removeClass('invalid').addClass('valid');
		} else {
			$('#capital').removeClass('valid').addClass('invalid');
		}

		//validate number
		if ( pswd.match(/\d/) ) {
			$('#number').removeClass('invalid').addClass('valid');
		} else {
			$('#number').removeClass('valid').addClass('invalid');
		}
		
		//validate space
		if ( pswd.match(/[^a-zA-Z0-9\-\/]/) ) {
			$('#space').removeClass('invalid').addClass('valid');
		} else {
			$('#space').removeClass('valid').addClass('invalid');
		}
		
	}).focus(function() {
		$('#pswd_info').show();
	}).blur(function() {
		$('#pswd_info').hide();
	});
	
	
	$('input[id=paw1]').keyup(function() {
		var pswd1=$(this).val();
		
		if(pswd!=pswd1)
			alert();
			
		
	});
	
	
	
});
	
	
	
	
	
	</script>
</body>
</html>

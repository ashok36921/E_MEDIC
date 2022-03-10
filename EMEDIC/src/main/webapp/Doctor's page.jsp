<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor's Login!!!</title>
<style>
            body {
                 background-image: url('dpage.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }
        </style>
         <link rel="icon" href="tit.jpg" type="image/x-icon" >
</head>
<body>
<style>
.hh1{
	width: 650px;  
height: 0px;  
top: 0px;
left: 570px;
font-weight: bold;
     color: black;
     font-size: 3.5vw; 
position: absolute;

}
.aadhar{
        color: white;
        text-align: left;
        position: relative;
        font:bold 100% Gungsuh;
        left: 20px;
        top:340px;
        background-color: black;
        margin-right: 1000px;
        border-radius: 15%,50%;
        padding: 10px;

    }

</style>

<p class="hh1"> DOCTOR's   PAGE!!</p>

<form class="aadhar" action="DocBack" method="post"> 
        <fieldset style="border-inline-color: crimson;">
            <legend>Details:</legend>
            <br>
            <pre><label for="aadhar" style="font:bold 100% Gungsuh;">DOCTOR'S ID  :   </label>      <input class="aadha" type="text" id="aadhar" name="docnum" size="30" pattern="[0-9]{4} [0-9]{4} [0-9]{4}" placeholder="xxxx  xxxx  xxxx" required ></pre>
            <br>
        <pre><label for="aadhar" style="font:bold 100% Gungsuh;">PATIENT'S AADHAR :</label> <input class="aadha" type="text" id="aadhar" name="aad" size="30" pattern="[0-9]{4} [0-9]{4} [0-9]{4}" placeholder="xxxx  xxxx  xxxx" required ></pre>
        <br>
        <pre><label for="pass" style="font:bold 100% Gungsuh;"> PASSWORD : </label>         <input type="password" id="pass" name="pass" size="30"  required></pre>
        <br>
        <pre style="text-align: center;"><input type="submit" required> <input type="reset" required></pre>
        <br>
        
        </fieldset>
    </form>

</body>
</html>
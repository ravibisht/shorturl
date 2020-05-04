<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


<style type="text/css">
  
.container{
  background-color:#2ecc71; 
  padding-top:px;
  padding-bottom: 20px;
}

body{
  background-color: #95a5a6;
}
</style>

<script type="text/javascript">
${alert}
</script>
</head>
<body>


<center> <h1> Create Your Own Short Link In Just A Decades :) </h1></center>


<div class="container mt-5 w-75 h-75 shadow-lg">


<form action="/save" method="post" >

  <div class="form-group mt-5">
    <label for="uname" class="font-weight-bold " style="font-size:2.4rem; color: #0652DD;">ENTER OR PASTE URL HERE :</label>
    <input type="url" class="form-control" id="uname"  name="original_url" required>
  </div>
  
  <div class="form-group">
    <label for="pwd" class="font-weight-bold " style="font-size:2.4rem; color: #0652DD;">ENTER NAME THAT YOU WANT TO AS URL HERE:</label>
    <input type="text" class="form-control" id="pwd"  name="short_url" required>
   
    <span style="color:red;">${error }</span>
  </div>
  <div class="text-center">
    <button type="submit" class="btn btn-primary d-block">Create</button>
  </div>

</form>


</div>
</body>
</html>
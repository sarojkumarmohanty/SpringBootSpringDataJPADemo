<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js">
	
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js">
	
</script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js">
	
</script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js">
	
</script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>





</head>
<body>


	<div class='container'>

		<form class='form-group' action='./getEmpData' method="post">
			<div class='row'>
				<div class='col-md-4'>
					<label for='dp1'>From Date</label> <input type='text'
						name='fromDate' id='dp1' class='form-control datepicker'>
				</div>


				<div class='col-md-4'>
					<label for='dp2'>To Date</label> <input type='text' name='toDate'
						id='dp2' class='form-control datepicker'>
				</div>
			</div>
			<div class='row mt-2'>
				<div class='col-md-3'>
					<input type='submit' class='btn btn-success form-control'
						value='Get Emp Data'>
				</div>

			</div>

		</form>
	</div>
	<div class='container'>
		<table class='table table-striped'>
			
			<thead>
				<tr>
					<th>sl#</th>
					<th>empid</th>
					<th>last name</th>
					<th>salary</th>
					<th>hire date</th>
					<th>dept name</th>
				</tr>
			
			</thead>
			<tbody>
			
			</tbody>
			
			<c:forEach items="${empList}" var="emp" varStatus="counter">
					<tr>
						<td>${counter.count}</td>
						<td>${emp.employeeId}</td>
						<td>${emp.lastName}</td>
						<td>$ ${emp.salary}</td>
						<td>${emp.hireDate}</td>
						<td>${emp.departments.departmentName}</td>
					</tr>
			</c:forEach>
		</table>
	</div>

</body>
<script type="text/javascript">
	$(function() {
		$('.datepicker').datepicker({
			format : 'dd-mm-yyyy'
		});

	});
</script>


</html>
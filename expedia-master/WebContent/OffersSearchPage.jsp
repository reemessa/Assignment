<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/ExpediaOffersFinder/css/styles.css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="/ExpediaOffersFinder/js/script.js"  type="text/javascript"></script>


</head>
<body>
<div id="searchDiv" style="width:40% !important;">
  <form action="OffersFinderServlet" method="get">
  
  	<span style="line-height: 35px">
    	<input type="text" class="w3-input w3-border" id="destinationName" name="destinationName" placeholder="Destination Name">
    </span>
    
    <span style="line-height: 35px">
    <input type="text" class="w3-input w3-border" id="lengthOfStay" name="lengthOfStay" placeholder="Length Of Stay">
    </span>
    
    <span style="line-height: 35px">
    <input type="text" class="w3-input w3-border" style="width:48%" id="tripStartDate" name="minTripStartDate" placeholder="Min Trip Start Date">
     -
    <input type="text" class="w3-input w3-border" style="width:48%" id="tripStartDate" name="maxTripStartDate" placeholder="Max Trip Start Date">
    </span>
    
    <span style="line-height: 35px">  
    <input type="text" class="w3-input w3-border" style="width:48%" id="startRating" name="minStarRating" placeholder="Min Star Rating">
     -
    <input type="text" class="w3-input w3-border" style="width:48%" id="maxStartRating" name="maxStarRating" placeholder="Max Star Rating"> 
     </span>
     
     <span style="line-height: 35px"> 
    <input type="text" class="w3-input w3-border" style="width:48%" id="totalRating" name="minTotalRating" placeholder="Min Total Rating">
     -
    <input type="text" class="w3-input w3-border" style="width:48%" id="maxTotalRating" name="maxTotalRating" placeholder="Max Total Rating"> 
    </span>
          
    <span style="line-height: 35px">    
    <input type="text" class="w3-input w3-border" style="width:48%" id="guestRating" name="minGuestRating" placeholder="Min Guest Rating">
     -
    <input type="text" class="w3-input w3-border" style="width:48%" id="maxGuestRating" name="maxGuestRating" placeholder="Max Guest Rating"> 
    </span>
    
    
    <input type="submit" value="Find Offers">
  </form>
</div>

<div id="resultsDiv" style="width:52% !important;display:none">
  <table style="width:100%" id="resultsTable">
  <c:forEach items="${offersInfo.hotels}" var="hotel">
  <tr>
  <td><image src="${hotel.hotelInfo.hotelImageUrl}" /></td>
  <td>${hotel.hotelInfo.hotelName}</td>
  <td>
  <table>
  <tr><td style="text-decoration:line-through;">${hotel.hotelPricingInfo.crossOutPriceValue}</td></tr>
  <tr><td>${hotel.hotelPricingInfo.averagePriceValue}</td></tr>
  </table>
  </td>
  </tr>
  <tr style="height:60px"></tr>
  </c:forEach>
  </table>
  
</div>
<div id="noDataFoundDiv" style="width:52% !important;display:none">

Please Enter A Valid Search Criteria 
  
</div>
    <style>
        input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #0A6E6E;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #48BCBC;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
	margin: 2%;
	float : left;
}

td {
	
	color : #0A6E6E;
	font-size : 14px;
	font-weight: bold;
}
        </style>
</body>
</html>

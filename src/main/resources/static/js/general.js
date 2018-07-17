$('#registerUser').click(function() {
	registerUser();
	});
function registerUser(){
	var name = $("#uname").val();
	$.ajax({
		url : 'registration/hellocall',
		type : 'post',
		dataType : "json",
		data : {
			"name" : name
		},
		error : function(data, status, error) {
			console.log(error);
			
		},
		success : function(data) {
			if (data!=undefined && data!="") {
				$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
						"Thanks For Registration! <br>" +
						"UserName = " + 
						data.returnObj + "</p>");
			} else {
				alert("Something Went Wrong In Data Fetching")
			}
		}
	});
}

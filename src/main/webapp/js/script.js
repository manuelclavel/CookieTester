$(document).ready(function() {
	
	
	
	$("#go_servlet1").click(function() {
		
		var xhr = new XMLHttpRequest();
		xhr.withCredentials = true;
		
		d=new Date();	 
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet1?t=' + d.getTime(), true)
		xhr.send(null);
		})
		
	$("#go_servlet1b").click(function() {
		
		var xhr = new XMLHttpRequest();
		xhr.withCredentials = true;
		d=new Date();
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet1b?t=' + d.getTime(), true);
		xhr.send(null);
		})
		
	$("#go_servlet2").click(function() {
		
		var xhr = new XMLHttpRequest();
		xhr.withCredentials = true;
		d=new Date();
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet2?t=' + d.getTime(), true);
		xhr.send(null);
		})
		
	$("#go_servlet3").click(function() {
		
		var xhr = new XMLHttpRequest();
		xhr.withCredentials = true;
		d=new Date();
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet3?t=' + d.getTime(), true);	
		xhr.send(null);
	})

    	$("#check_cookies").click(function() {
		
		var xhr = new XMLHttpRequest();
		//xhr.withCredentials = false;
		xhr.withCredentials = true;
		
		xhr.onreadystatechange = () => {
		if (xhr.readyState === 4) {
			if (xhr.status == 200) {
			alert(xhr.responseText)
			} else {
				alert(xhr.responseText);
			}
		}
	}
	
	    d=new Date();
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/check?t=' + d.getTime(), true);	
		xhr.send(null);
	})
	
	$("#remove_cookies").click(function() {
		
		var xhr = new XMLHttpRequest();
		xhr.withCredentials = true;
		
		xhr.onreadystatechange = () => {
		if (xhr.readyState === 4) {
			if (xhr.status == 200) {
				alert("Cookies removed")
			} else {
				alert("Something went wrong");
				
			}
		}
	}
	
	    d=new Date();
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/remove?t=' + d.getTime(), true);	
		xhr.send(null);
	})

    
})


	
	 

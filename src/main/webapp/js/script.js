$(document).ready(function() {
	
	$("#go_cookies_for_ever").click(function() {
		//var timestamp = Date.now()
		$.ajax({
			type: 'GET',
			//url: "rest/cookiesforever/" + timestamp + "?time=" + timestamp,
			url: "https://webprog3.s3.ap-southeast-1.amazonaws.com/april23.webp?response-content-disposition=inline&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEPD%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkgwRgIhAM9F0RTkgZbRayvHfXXAex24z7Q22K97sc5awLrVoEfDAiEAxfgOPK5Q9KAn3BRU9fT%2FEHmYnE7OY4vClDkSa9Qat0oq5AIIORAAGgwyNzIzMDA0MDAxNzkiDPEJPMJetwcA%2F8aouyrBAtvOTaOZ9nQSkfO3RkMdpJs%2FWjzQSXYBwsMLQFiHj8uSn7T1zb0ji5fI7cuEBV6y7oL6spXghD7d3jILMkK8cfqMX%2FFfHPI1Kd95nWKuvxGz1Sur3Ipsqe7fROtagYhfwe99oczownJWbCtUC21Qm0OfcgZW2X%2FfvLYUQg2oOofz0HN3k%2B%2FAU6miePJ5axa3CrMVfXEg9NWBWNyYECGmoES1P3a5mMGSV9%2FHj3IQxmscWHdmHnSqjWiIr%2FfG1pECZPtNxcRAhwPGJZwIWsM%2B0o4r053kRGVnGgWwFvNce41NcjnCwhvGfeXngs1J3T8Nvkw1vbWVv7uD51BM0H8ffQCwdF4FVNTKcrQ1lNRQdByFfzzYeOCj3YSEAcGAquWRaeuRkmo%2F4gvTyyy16tFeMfz0KhEZiz1rrhBtcH1WphL1oDCs4fmjBjqyAg5VV703oAOUP%2BV8pMje8N1DDailR4w%2Fr0ERHZrOr4y2urvM5xMyo5JDlILTgOp1PDR3BOjRa035iU710TfjO8OvyMLBOFewVOlXZHaI3t9V0VD23njUOt8q86sg66r0L1YIIKvjRMogkHmTdoE2VvFQsVX4F%2FFamio2DuUjqfviD2WMpI489yrDsUkJt0888oAV3PAmnzmwSuLhSA2eBF0rHIPbm2h8dgVx4m0loBe8F7Tcuh%2BZKvXmqDbhuvMfRNlsDVN1YgvdpE0oiT%2BtnDzudrXLnJwo1yepQ%2BWPvtvZXnSE%2FAEw4aJQQ6%2BsfMW24diJX%2BLHgbSxrn8lyKxIDIuPXkUOsUXtJ2Bs6GINVC5flndYA9DZ3dKc9iCFwFaXWECzHpLvYgofu42zTovEe8lOWQ%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230605T234833Z&X-Amz-SignedHeaders=host&X-Amz-Expires=1800&X-Amz-Credential=ASIAT6ZS6LYZS6D7HRFL%2F20230605%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=bb20d8656bcebf2dd2d07d77ba83d9a98264ef196112ec457849928ef0c47382",
			success: function() {
			}
		});
	})
	
	
	$("#go_servlet1").click(function() {
		
		var xhr = new XMLHttpRequest();
		//xhr.withCredentials = false;
		xhr.withCredentials = true;
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet1', true)
		xhr.send(null);
		})
		
	$("#go_servlet1b").click(function() {
		
		var xhr = new XMLHttpRequest();
		//xhr.withCredentials = false;
		xhr.withCredentials = true;
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet1b', true);
		xhr.send(null);
		})
		
	$("#go_servlet2").click(function() {
		
		var xhr = new XMLHttpRequest();
		//xhr.withCredentials = false;
		xhr.withCredentials = true;
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet2', true);
		xhr.send(null);
		})
		
	$("#go_servlet3").click(function() {
		
		var xhr = new XMLHttpRequest();
		//xhr.withCredentials = false;
		xhr.withCredentials = true;
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/servlet3', true);	
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
				alert(xhr.status + " : " + xhr.responseText);
			}
		}
	}
		xhr.open('GET', 'https://www.tanbinhtech.com/cookietester/check', true);	
		xhr.send(null);
	})

    
})


	
	 

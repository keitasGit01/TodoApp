package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	
	
	@GetMapping("/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are Authenticated");
	}
	
	
//	@GetMapping("/hello-world/path-variable/{name}")
//	public HelloWorldBean helloWorldBean(@PathVariable String name) {
//		return new HelloWorldBean(String.format("Hello World, %s ", name));
//	}
//	
//	
//	
	

}

//
//handleBasicAuthLogin(){
//    // console.log(this.username)
//    // if(this.username === 'user' && this.password ==='1234'){
//      if(this.basicAuthenticationService.executeAuthenticationService(this.username, this.password)
//      .subscribe(
//        data => {
//          console.log(data)
//      this.router.navigate(['welcome', this.username])
//      this.invalidLogin = false;
//        },
//        error => {
//          console.log(error)
//          this.invalidLogin = true
//
//        }
//      
//      )
//  }
//}
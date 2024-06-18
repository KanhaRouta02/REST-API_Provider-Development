package in.kanha.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	
	@PostMapping("/save")
	public ResponseEntity<String> saveMessage()
	{
		// logic for save
		String response= "Saved...";
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/welcome")
	public String showMessage()
	{
		return "Good Morning";
	}
	
	@GetMapping("/greet")
	public String greetMessage()
	{
		return "Thank you";
	}
}

package snmaddula.youtube.springbootswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myApp")
public class SampleController {

	@GetMapping(value="/hello")
	public String hello() {
		return "Hello World!";
	}
}

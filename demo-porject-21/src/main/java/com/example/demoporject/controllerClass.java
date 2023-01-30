package com.example.demoporject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class controllerClass {

	@GetMapping("/hey")
	public String hi(@Valid @RequestBody RequestLoad requestLoad)
	{
		for (int i =0; i<requestLoad.getNrics().size();  i++)
		{
			System.out.println(requestLoad.getNrics().get(i));
		}
		return "heya";
	}
}

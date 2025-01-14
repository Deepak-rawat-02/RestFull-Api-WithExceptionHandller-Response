package com.RestApiProject1.packages.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestApiProject1.packages.Model.CloudVender;
import com.RestApiProject1.packages.Responses.ResponseHandler;
import com.RestApiProject1.packages.Service.CloudeVenderService;

@RestController
@RequestMapping("/cloudvender")
public class CloudVenderController {
	
	@Autowired
	private CloudeVenderService cloudeVenderService;

	@GetMapping("{venderId}")
	public ResponseEntity<Object> getSingleVender(@PathVariable ("venderId") Long id )
	{
	return 	ResponseHandler.responseBuilder("Requested vender data is here", HttpStatus.OK, cloudeVenderService.getSingleVender(id));	
	}
	
	@GetMapping()
	public List<CloudVender> getAllVender()
	{
		return  cloudeVenderService.getAllVender();	
	}
	
	@PostMapping()
	public CloudVender createVender(@RequestBody CloudVender cloudVender )
	{
		return cloudeVenderService.createVender(cloudVender);
		
	}
	
	@PutMapping()
	public String updateVender(@RequestBody CloudVender cloudVender)
	{
		return cloudeVenderService.updatCloudVender(cloudVender);
	}
	
	@DeleteMapping("{venderId}")
	public String deleteVender(@PathVariable("venderId") Long id)
	{
		return cloudeVenderService.deleteVender(id);
	}

}

package com.RestApiProject1.packages.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApiProject1.packages.Model.CloudVender;


public interface CloudeVenderService {
	public CloudVender getSingleVender(Long venderId);
	public CloudVender createVender(CloudVender cloudVender);
	public String updatCloudVender(CloudVender cloudVender);
	public String deleteVender(Long venderId);
	public List<CloudVender> getAllVender();

}

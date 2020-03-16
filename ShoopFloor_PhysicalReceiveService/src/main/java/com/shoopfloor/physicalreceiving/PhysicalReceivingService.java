package com.shoopfloor.physicalreceiving;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhysicalReceivingService {

	@RequestMapping("/physicalreceive")
	public String receiving() {
		return "hello world";
	}
}

package com.shoopfloor.physicalreceiving;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="creating-item")
@RibbonClient(name="creating-item")
public interface PhysicalItemProxy {
	@GetMapping(path="item/{id}")
	PhysicalItem receiveById(@PathVariable String id);
	@GetMapping(path="item/all")
	Iterable<PhysicalItem> getAll();
}
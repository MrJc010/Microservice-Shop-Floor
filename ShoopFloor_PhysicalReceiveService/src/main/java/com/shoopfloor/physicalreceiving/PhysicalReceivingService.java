package com.shoopfloor.physicalreceiving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@RequestMapping(path="/item")
public class PhysicalReceivingService {
	@Autowired
	private PhysicalItemProxy proxy;
	
	
	@RequestMapping("/all")
	public @ResponseBody Iterable<PhysicalItem> receiveAll() {
		Iterable<PhysicalItem> item = proxy.getAll();
		//return new PhysicalItem(item.getPpid(), item.getRma(), item.getmPN(), "sn", "mac", "cpu", "revision", "mPN", item.getLot(), item.getdescp(), item.getProblemCode(), item.getDps(), "userId", "userId");
		return item;
	}
	
	
	@RequestMapping("/{id}")
	public PhysicalItem receiving(@PathVariable String id) {
		PhysicalItem item = proxy.receiveById(id);
		return new PhysicalItem(item.getPpid(), item.getRma(), item.getmPN(), "sn", "mac", "cpu", "revision", "mPN", item.getLot(), item.getdescp(), item.getProblemCode(), item.getDps(), "userId", "userId");
	}
}

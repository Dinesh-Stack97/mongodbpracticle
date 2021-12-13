package mongo_Start.mongodb_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mongo_Start.mongodb_test.modules.Donations;
import mongo_Start.mongodb_test.service.DonationService;

@RestController
@RequestMapping("Donations")
public class DonationController {
	
	@Autowired
	private DonationService donationService;
	
	@PostMapping("/temple/{id}/donations")
    private Donations  saveDonations(@PathVariable("id") int id,@RequestBody Donations Donation)
    {
		return donationService.saveDonations(id, Donation);
    }
	
	@GetMapping("/temple/{id}/donations")
	private  List<Donations> getAllDonationsDetails(@PathVariable("id") int id) 
	{
		return donationService.getAllDonationsDetails(id);
	}

}

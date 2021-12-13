package mongo_Start.mongodb_test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mongo_Start.mongodb_test.Exception.Spring_Boot_Apk_Exception;
import mongo_Start.mongodb_test.modules.Donations;
import mongo_Start.mongodb_test.modules.Temple;
import mongo_Start.mongodb_test.repository.DonationRepository;
import mongo_Start.mongodb_test.repository.TempleRepository;
import mongo_Start.mongodb_test.service.DonationService;

@Service
public class DonationServiceimpl implements DonationService{
	
	@Autowired
	private DonationRepository donationRepository;
	
	private TempleRepository templeRepository;
	


	@Override
	public Donations saveDonations(int id,Donations Donation) {
		// TODO Auto-generated method stub
		//Temple temple = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		//temple.AddDonations(Donation);
		//return templeRepository.save(temple);
	 templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		return donationRepository.save(Donation);
	}

	@Override
	public List<Donations> getAllDonationsDetails(int id) {
		// TODO Auto-generated method stub
	 templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
	        return donationRepository.findAll();
	}

	@Override
	public Donations getDonationById(int id) {
		// TODO Auto-generated method stub
		return donationRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Donation", "id", id));
	}

	@Override
	public Donations updateDonationById(Temple temple, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletedonationById(int id) {
		// TODO Auto-generated method stub
		donationRepository.deleteById(id);
		
	}

}

package com.scp.RestProduces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdharService {
	static HashMap<Integer, AdharDetails> adharIdMap=getAdharIdMap();

	public AdharService() {
		super();
		if(adharIdMap==null){
			adharIdMap=new HashMap<Integer, AdharDetails>();
			Address add=new Address("Laxmi Road", "Sangavi","Pune", "Maharashtra", 413067);
			Address add1=new Address("Shingad Road", "Vadgaon","Dharawad", "Karnataka", 514651);
			Address add2=new Address("Pune Road", "A.Nagar","A.Nagar", "Maharashtra", 411005);
			AdharDetails ad1=new AdharDetails(101, "Anu", "125625859663", add);
			AdharDetails ad2=new AdharDetails(102, "Varsha", "152567891212", add1);
			AdharDetails ad3=new AdharDetails(103, "Nikita", "646890969749", add2);
			
			adharIdMap.put(101, ad1);
			adharIdMap.put(102, ad2);
			adharIdMap.put(103, ad3);
		}
	}

	private static HashMap<Integer, AdharDetails> getAdharIdMap() {
		return adharIdMap;
	}
	public AdharDetails addAdDetails(AdharDetails ad) {
		ad.setId(adharIdMap.size()+1);
		adharIdMap.put(ad.getId(), ad);
		return ad;
	}

	public List<AdharDetails> getAdharDetails() {
		List<AdharDetails> adharDetails = new ArrayList<AdharDetails>(adharIdMap.values());
		return  adharDetails;
	}
}

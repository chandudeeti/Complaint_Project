package com.hib.complaint;

import java.util.List;

public interface ComplaintDAO {

	
	List<Complaint> ShowAllComplaint();
	String AddComplaint(Complaint complaint);
}

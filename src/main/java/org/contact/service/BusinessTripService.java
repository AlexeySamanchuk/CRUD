package org.contact.service;

import java.util.List;

import org.contact.entity.BusinessTrip;


public interface BusinessTripService {

    public void addBusinessTrip(BusinessTrip businessTrip);

    public List<BusinessTrip> listBusinessTrip();

    public void removeBusinessTrip(Integer id);

    public void updateBusinessTrip(BusinessTrip businessTrip);
}

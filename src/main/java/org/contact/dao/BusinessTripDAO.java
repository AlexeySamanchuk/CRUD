package org.contact.dao;


import org.contact.entity.BusinessTrip;

import java.util.List;

public interface BusinessTripDAO {
    public void addBusinessTrip(BusinessTrip businessTrip);

    public List<BusinessTrip> listBusinessTrip();

    public void removeBusinessTrip(Integer id);

    public void updateBusinessTrip(BusinessTrip businessTrip);
}

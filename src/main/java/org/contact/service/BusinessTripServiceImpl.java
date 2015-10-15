package org.contact.service;

import java.util.List;

import org.contact.dao.BusinessTripDAO;
import org.contact.dao.BusinessTripDAOImpl;
import org.contact.entity.BusinessTrip;


public  class BusinessTripServiceImpl implements BusinessTripService {

    private BusinessTripDAO addBusinessTripDAO = new BusinessTripDAOImpl();

    @Override
    public void addBusinessTrip(BusinessTrip businessTrip) {
        addBusinessTripDAO.addBusinessTrip(businessTrip);
    }

    @Override
    public List<BusinessTrip> listBusinessTrip() {
        return addBusinessTripDAO.listBusinessTrip();
    }

    @Override
    public void removeBusinessTrip(Integer id) {
        addBusinessTripDAO.removeBusinessTrip(id);
    }

    @Override
    public void updateBusinessTrip(BusinessTrip businessTrip) {
        addBusinessTripDAO.updateBusinessTrip(businessTrip);
    }
}

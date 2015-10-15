package org.contact.app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.contact.entity.BusinessTrip;
import org.contact.service.BusinessTripService;
import org.contact.service.BusinessTripServiceImpl;


import java.util.List;


public class BusinessTripController {
    private BusinessTripService businessTripService = new BusinessTripServiceImpl();
    private ObservableList<BusinessTrip> BusinessTripList = FXCollections.observableArrayList();

    public void addBusinessTrip(BusinessTrip businessTrip) {
        businessTripService.addBusinessTrip(businessTrip);
    }

    public ObservableList<BusinessTrip> getBusinessTripList() {
        if (!BusinessTripList.isEmpty()) BusinessTripList.clear();
        BusinessTripList = FXCollections.observableList((List<BusinessTrip>) businessTripService.listBusinessTrip());
        return BusinessTripList;
    }

    public void removeBusinessTrip(Integer id) {
        businessTripService.removeBusinessTrip(id);
    }

    public void updateBusinessTrip(BusinessTrip businessTrip) {
        businessTripService.updateBusinessTrip(businessTrip);
    }
}


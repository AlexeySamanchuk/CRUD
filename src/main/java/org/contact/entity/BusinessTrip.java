package org.contact.entity;
import javax.persistence.*;

@Entity
@Table(name = "BUSINESS_TRIP")
public class BusinessTrip {
    @Id
    @GeneratedValue
    @Column(name = "BUSINESS_TRIP_ID")
    private Integer businessTripId;
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "BUSINESS TRIPCOL")
    private String businessTripCol;
    @Column(name = "TERM")
    private Integer term;
    @Column(name = "PURPOSE")
    private String purpose;
    @Column(name = "AT_THE_EXPENSE_OF_MEANS")
    private Integer atTheExpenseOfMeans;

    public BusinessTrip() {
        super();
    }

    public BusinessTrip(Integer businessTripId, Integer employeeId, String destination, String businessTripCol, Integer term, String purpose, Integer atTheExpenseOfMeans) {
        super();
        this.businessTripId = businessTripId;
        this.employeeId = employeeId;
        this.destination = destination;
        this.businessTripCol = businessTripCol;
        this.term = term;
        this.purpose = purpose;
        this.atTheExpenseOfMeans = atTheExpenseOfMeans;
    }

    public Integer getBusinessTripId() {
        return businessTripId;
    }

    public void setBusinessTripId(Integer businessTripId) {
        this.businessTripId = businessTripId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBusinessTripColl() {
        return businessTripCol;
    }

    public void setBusinessTripCol(String businessTripCol) {
        this.businessTripCol = businessTripCol;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getAtTheExpenseOfMeans() {
        return atTheExpenseOfMeans;
    }

    public void setAtTheExpenseOfMeans(Integer atTheExpenseOfMeans) {
        this.atTheExpenseOfMeans = atTheExpenseOfMeans;
    }
}

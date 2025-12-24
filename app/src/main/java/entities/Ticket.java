package entities;

import java.util.Date;

public class Ticket {

    private String ticketId;
    private String source;
    private String destination;
    private String userID;
    private Date dateOfTravel;
    private Train train;


    public  Ticket(String ticketId, String source, String destination, String userID, Date dateOfTravel, Train train){
        this.ticketId=ticketId;
        this.dateOfTravel=dateOfTravel;
        this.source=source;
        this.destination=destination;
        this.userID=userID;
        this.train=train;
    }

    public Ticket(){
    }


    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId,userID,source,destination,dateOfTravel);
    }




    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }


}

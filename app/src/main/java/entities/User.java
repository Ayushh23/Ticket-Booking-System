package entities;
import java.util.*;

public class User {

    private String name;
    private String password;
    private String Hashpassword;
    private String userID;
    private List<Ticket> ticketList;

    public User(String name, String password, String Hashpassword, String userID, List<Ticket> ticketList){
        this.Hashpassword=Hashpassword;
        this.name=name;
        this.password=password;
        this.userID=userID;
        this.ticketList=ticketList;
    }


    public User(){
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedpassword(){
        return Hashpassword;
    }

    public List<Ticket> getTicketBooked(){
        return ticketList;
    }
    public void printTickets(){
        for (int i = 0; i < ticketList.size(); i++) {
            System.out.println(ticketList.get(i).getTicketInfo());
        }
    }

    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setHashpassword(String hashpassword) {
        Hashpassword = hashpassword;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}

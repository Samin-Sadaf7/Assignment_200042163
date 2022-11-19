package Assignment2.Common_Coupling;

/*
    Explanation is written in MovieTheatre.java
 */
public class Booking {
        public void BuyTicket(){
            if(MovieTheatre.total_tickets>0)
                    MovieTheatre.total_tickets=MovieTheatre.total_tickets-1;
        }
}

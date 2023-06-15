import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
public class Menu {
    //class variables
    private ArrayList<MenuItem>menuItem = new ArrayList<>();
    private Date lastUpdated;


    //Constructors
    public Menu(){
        this.lastUpdated = new Date
    }

    //Methods

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

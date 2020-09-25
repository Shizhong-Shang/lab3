import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfo;

    public AddressBook(){
        this.buddyInfo = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy1){
        if (buddy1 != null){
            this.buddyInfo.add(buddy1);
        }
    }

    public void removeBuddy(BuddyInfo buddy1){
        this.buddyInfo.remove(buddy1);
    }



}

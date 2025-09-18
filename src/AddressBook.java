import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        this.myBuddies = new ArrayList<>();
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("tod", "carton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("hello");
    }
    public void addBuddy(BuddyInfo buddy){myBuddies.add(buddy);}

    public void removeBuddy(BuddyInfo buddy){myBuddies.remove(buddy);}
}

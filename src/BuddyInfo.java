public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this.name = "Greg";
        this.address = "default";
        this.phoneNumber = "613";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Bruce", "67 Something road", "61312");
        String name1 = buddyInfo.getName();
        System.out.println("Hello " + name1);
    }

    public String getName() {return name;}

    public String getAddress(){return address;}

    public String getPhoneNumber() {return phoneNumber;}
}
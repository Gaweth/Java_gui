package someBasics.friend;

public class Friend {
     String friend;
     static int numOfFriends;

     Friend(String friend) {
        this.friend = friend;
        numOfFriends++;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public static int getNumOfFriends() {
        return numOfFriends;
    }

    public static void setNumOfFriends(int numOfFriends) {
        Friend.numOfFriends = numOfFriends;
    }
}

public class ContactsManager {
    // Attributs
    Contact[] myFriends;
    int friendsCount;

    // Constructeur
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact d'ami
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode pour rechercher un ami par son nom
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
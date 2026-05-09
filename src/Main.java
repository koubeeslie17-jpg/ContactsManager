//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Création du ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // 2. Premier ami
        Contact friend1 = new Contact();
        friend1.name = "Eslie";
        friend1.phoneNumber = "0777781605";
        myContactsManager.addContact(friend1);

        // 3. Deuxième ami
        Contact friend2 = new Contact();
        friend2.name = "Amoi";
        friend2.phoneNumber = "0102205513";
        myContactsManager.addContact(friend2);

        // 4. Troisième ami
        Contact friend3 = new Contact();
        friend3.name = "Foto";
        friend3.phoneNumber = "0554447899";
        myContactsManager.addContact(friend3);

        // 5. Quatrième ami
        Contact friend4 = new Contact();
        friend4.name = "Cheick";
        friend4.phoneNumber = "0748076652";
        myContactsManager.addContact(friend4);

        // 6. Cinquième ami
        Contact friend5 = new Contact();
        friend5.name = "Zelika";
        friend5.phoneNumber = "0709457789";
        myContactsManager.addContact(friend5);

        // 7. Rechercher un contact
        Contact result = myContactsManager.searchContact("Foto");

        // 8. Afficher le résultat avec ton IF
        if (result != null) {
            System.out.println("Numéro trouvé : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé");
        }
    }
}
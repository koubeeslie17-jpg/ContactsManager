//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création du ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Pour enrégistrer les différents contacts
        
        Contact friend1 = new Contact();
        friend1.name = "Eslie";
        friend1.phoneNumber = "0777781605";
        myContactsManager.addContact(friend1);

        Contact friend2 = new Contact();
        friend2.name = "Amoi";
        friend2.phoneNumber = "0102205513";
        myContactsManager.addContact(friend2);

        Contact friend3 = new Contact();
        friend3.name = "Foto";
        friend3.phoneNumber = "0554447899";
        myContactsManager.addContact(friend3);

        Contact friend4 = new Contact();
        friend4.name = "Cheick";
        friend4.phoneNumber = "0748076652";
        myContactsManager.addContact(friend4);

        // pour rechercher un contact
        Contact result = myContactsManager.searchContact("Foto");

        // Pour afficher le résultat 
        if (result != null) {
            System.out.println("Le numéro trouvé est : " + result.phoneNumber);
        } else {
            System.out.println("Aucun numéro trouvé");
        }
    }
}

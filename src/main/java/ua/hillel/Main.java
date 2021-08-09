package ua.hillel;

import ua.hillel.menu.Menu;
import ua.hillel.menu.action.*;
import ua.hillel.services.ContactService;
import ua.hillel.services.inMemoryContactService;
import ua.hillel.ui.ContactView;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactView contactView=new ContactView(scanner);
        ContactService contactService = new inMemoryContactService();
        List<MenuAction> menuActions = Arrays.asList(
                new ShowAllContactsMenuAction(contactService,contactView),
                new AddContactMenuAction(contactService,contactView),
                new DeleteContactMenuAction(contactService,contactView),
                new SearchContactMenuAction(contactService,contactView)
        );


        Menu menu = new Menu(menuActions, scanner);
        menu.run();
    }
}

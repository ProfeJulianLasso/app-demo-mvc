package org.sofka.view;

import org.jboss.logging.Logger;
import org.sofka.model.user;

public class menu {
    private static final Logger logger = Logger.getLogger(menu.class);
    private Integer option;
    private user myUser = new user();

    public Integer getOption() {
        return option;
    }

    public void showMenu() {
        logger.info("\n1. Insertar nombre\n2. Insertar apellido\n3. Mostrar datos\n4.Salir");
    }

    public void insertName() {
        logger.info("\nDigite su nombre: ");
    }

    public void insertLastname() {
        logger.info("\nDigite su apellido: ");
    }

    public void showFullName(String nombre, String apellido) {
        logger.info("\n" + nombre + " " + apellido);
    }

    public void showMessageForOption() {
        switch (option) {
            case 1:
                insertName();
                myUser.setName(myScanner.getInstance().getString());
                break;
            case 2:
                insertLastname();
                myUser.setLastname(myScanner.getInstance().getString());
                break;
            case 3:
                showFullName(myUser.getName(), myUser.getLastname());
                break;
            case 4:
                // salir del sistema
                break;
        }
    }

    public void captureOption() {
        option = myScanner.getInstance().getInteger();
    }
}

package org.sofka.controller;

import org.sofka.view.menu;

public class myApp {
    public void run() {
        menu view = new menu();
        do {
            view.showMenu();
            view.captureOption();
            view.showMessageForOption();
        } while (view.getOption() != 4);
    }
}

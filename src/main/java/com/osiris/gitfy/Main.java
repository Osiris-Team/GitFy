package com.osiris.gitfy;

import dorkbox.systemTray.Menu;
import dorkbox.systemTray.MenuItem;
import dorkbox.systemTray.SystemTray;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        SystemTray tray = SystemTray.get();
        if (tray == null){
            System.out.println("Couldn't access the systems tray. Terminated Gitfy.");
            return;
        }

        try{
            tray.getMenu().add(new MenuItem("Item 1"));
            tray.getMenu().add(new MenuItem("Item 2"));
            tray.getMenu().add(new MenuItem("Item 3"));
        } catch (Exception e) {
            System.err.println("Failed at menu creation.");
            e.printStackTrace();
        }

        try{
            tray.setTooltip("Gitfy");
        } catch (Exception e) {
            System.err.println("Failed to set tooltip.");
            e.printStackTrace();
        }


        tray.setEnabled(true);


        try{
            tray.setImage(new URL("https://image.flaticon.com/icons/png/128/4868/4868034.png"));
            while(true){
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

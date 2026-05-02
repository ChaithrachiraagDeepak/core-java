package com.xworkz.application;

import com.xworkz.application.apps.Apps;
import com.xworkz.application.apps.Server;

public class AppRunner {
    public static void main(String[] args) {

        Server server= new Apps();
        server.network();
    }
}

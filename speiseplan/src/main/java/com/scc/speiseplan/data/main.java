package com.scc.speiseplan.data;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {

        //direct access to DB
        String mysql_url = "jdbc:mysql://localhost:3306/scc";


        ////// LOGIN bzw. vor jeder anderen Abfrage Authentifizierung ////////
        // Authentification
        System.out.println("Test Authentification");
        System.out.println(new MyDBHandler(mysql_url).login(1,"admin"));
        // Authorization
        System.out.println("Test Authorization");
        System.out.println(new MyDBHandler(mysql_url).isAdmin("as"));

        //LOGIN
        //System.out.println("Test set token");
        //new MyDBHandler(mysql_url).setToken(1, "s");

        // get Userdata
        System.out.println("Test get userdata");
        String json_user = new ObjectMapper().writeValueAsString(new MyDBHandler(mysql_url).getUserDataByToken("44khbfcj5gkrg0ee5oaj696bope"));
        System.out.println(json_user);

        new MyDBHandler(mysql_url).setMenuItemSchedule(20190101,1,1);
        new MyDBHandler(mysql_url).setMenuItemSchedule(20190101,1,2);
        new MyDBHandler(mysql_url).setMenuItemSchedule(20190101,2,2);
        /////// MENUSCHEDULE //////
        System.out.println("Test get MenuItemSchedule");
        String json_schedule = new ObjectMapper().writeValueAsString(new MyDBHandler(mysql_url).getMenuItemSchedule(20190101,20200202));
        System.out.println(json_schedule);



        /////// MENUITEMS /////////
        // MyDBHandler con_menu = new MyDBHandler();
        // GET
      /**  ArrayList<MenuItem> menuItemList = new MyDBHandler(mysql_url).getMenuItemList();

        String json_menulist = "{ \"menuItemList\" :" +new ObjectMapper().writeValueAsString(menuItemList)+"}";
        System.out.println(json_menulist);
        //man bekommt hier nur n Array raus, könnte man quick n dirty lösen und einfach damit weiterarbeiten
       **/

        ///// create / update / delete MenuItem /////////
        /**
         new MyDBHandler(mysql_url).insertMenuItem("huehnchen",new BigDecimal("3.00"));
        new MyDBHandler(mysql_url).insertMenuItem("huehnchen",new BigDecimal("3.00"));
        new MyDBHandler(mysql_url).deleteMenuItem(4);
        new MyDBHandler(mysql_url).updateMenuItem(5,"kein hühnchen", new BigDecimal("2.00"));

        String json_menulist = "{ \"menuItemList\" :" +new ObjectMapper().writeValueAsString(new MyDBHandler(mysql_url).getMenuItemList())+"}";
         System.out.println(json_menulist);

         **/

        ////// Admin Scheduling  ///////


        ///// User scheduling //////
        
    }
}

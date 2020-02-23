package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// Third comment to show that Git Desktop sees this change and then have the repository see it.


public class ThreeSolidMain
{   


   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }





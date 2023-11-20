/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package modul8;

/**
 *
 * @author natha
 */
public class tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String[][] bukuAlamat = {{"Florence", "735-1234", "Manila"},
                                 {"Joyce", "983-3333", "Quezon City"},
                                 {"Becca", "456-3322", "Manila"}};

            for(int i = 0; i < bukuAlamat.length; i++) {
            System.out.println("Name : " + bukuAlamat[i][0]);
            System.out.println("Tel. # : " + bukuAlamat[i][1]);
            System.out.println("Address : " + bukuAlamat[i][2] + "\n");
           }

    }
}

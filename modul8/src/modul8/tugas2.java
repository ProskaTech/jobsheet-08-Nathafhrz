/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package modul8;

/**
 *
 * @author natha
 */
import javax.swing.JOptionPane;

public class tugas2 {

    public static void main(String args[]) {
        double[] nomor = new double[10];

    for(int i = 0; i < nomor.length; i++) {
      String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1));
      nomor[i] = Double.parseDouble(input);
    }

    double terbesar = nomor[0];

    for(int i = 1; i < nomor.length; i++) {
      if(nomor[i] > terbesar) {
        terbesar = nomor[i];
      }
    }

    JOptionPane.showMessageDialog(null, "Nomor terbesar yang telah diberikan oleh pengguna adalah " + terbesar);

  }

}

    

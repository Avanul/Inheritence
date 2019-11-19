/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author windows
 */
class Persegi_Panjang extends bangun_datar {
float panjang;
float lebar;
public void luas(){
 Persegi_Panjang pp =new Persegi_Panjang();
 pp.luas=panjang*lebar;
 System.out.println("luas persegi panjang : "+pp.luas);
 }
public void keliling(){
 Persegi_Panjang pp =new Persegi_Panjang();
 pp.keliling=2*(panjang+lebar);
 System.out.println("keliling persegi panjang : "+pp.keliling);
} 
}

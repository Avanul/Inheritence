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
class Lingkaran extends bangun_datar {
float jari;
float phi=22/7;
public void luas(){
Lingkaran ll =new Lingkaran();
ll.luas=phi*(jari*jari);
System.out.println("luas lingkaran : "+ll.luas);
}
public void keliling(){
Lingkaran ll =new Lingkaran();
ll.keliling=2*phi*jari;
System.out.println("keliling lingkaran : "+ll.keliling);
}
}

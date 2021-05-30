/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021srp.nope;

/**
 *
 * @author eduar
 */
public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto(1, "Toalha", 20);
        double icms = produto.calcularICMS(0.08);

        System.out.println("Valor ICMS: " + icms);
    }
}

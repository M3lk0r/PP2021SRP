/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

/**
 *
 * @author eduar
 */
class Main {

    public static void main(String[] args) {
        Produto produto = new Produto(1, "Calculadora", 10);
        CalculaImposto calculaImposto = new CalculaImposto();
        double icms = calculaImposto.calcularICMS(produto, 0.08);

        System.out.println("Valor ICMS = " + icms);
    }
}

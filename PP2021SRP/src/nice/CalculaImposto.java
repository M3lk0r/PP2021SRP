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
public class CalculaImposto {

    double calcularICMS(Produto produto, double taxa) {
        return produto.preco * taxa;
    }
}

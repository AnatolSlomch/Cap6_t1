/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap6_t1;

/**
 *
 * @author anatol
 */
public class Cap6_t1 extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=100;
        double fact = MathUtil.factorial(n);
        System.out.println(String.valueOf(fact));
        long fact_l = MathUtil.factorial_long(n);
        System.out.println(String.valueOf(fact_l));
        int fact_i = MathUtil.factorial_int(n);
        System.out.println(String.valueOf(fact_i));
    }
    
}

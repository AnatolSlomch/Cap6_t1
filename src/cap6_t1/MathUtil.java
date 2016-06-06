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
public class MathUtil {
    
    public static double factorial(int n){
        double factor=1;
        for (double k=1; k<=n; k++) {
            factor = factor*k;
        }
        return factor;
    }
    
    public static long factorial_long(int n){
        long factor=1;
        for (long k=1; k<=n; k++) {
            factor = factor*k;
        }
        return factor;
    }
    public static int factorial_int(int n){
        int factor=1;
        for (int k=1; k<=n; k++) {
            factor = factor*k;
        }
        return factor;
    }    
}

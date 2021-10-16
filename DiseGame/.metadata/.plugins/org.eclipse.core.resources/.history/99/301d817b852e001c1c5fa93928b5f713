/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diksonyacompany.quadraticequation;

/**
 *
 * @author sonya dik
 */
public class QuadraticEquation {
//    coefficient of equation
    private double a;
    private double b;
    private double c;
//    roots of equation
    private double root1;
    private double root2;
    
    public QuadraticEquation() {}
    
    public double[] getCoefficients(){
        double[] coefficients = new double[3];
        coefficients[0]=this.a;
        coefficients[1]=this.b;
        coefficients[2]=this.c;
        System.out.println("a = "+coefficients[0]+" b = "+coefficients[1]+" c = "+coefficients[2]);
        return coefficients;
    }
    
    public void setCoefficients(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
//    Inner Class
    class Discriminant {
        
        public double getDiscriminant(){
            return (b*b - 4*a*c);
        }
    }
    
    public void solveEquation(){
        Discriminant d = this.new Discriminant();
        if (d.getDiscriminant()<0){
            System.out.println("This equation doesn't have real roots");
        }
        else if (d.getDiscriminant()==0){
            root1 = root2 = -b/(2*a);
            System.out.println("Root 1 = Root 2 = "+this.root2);
        }
        else {
            root1 = (-b+Math.sqrt(d.getDiscriminant()))/(2*a);
            root2 = (-b-Math.sqrt(d.getDiscriminant()))/(2*a);
            System.out.println("Root 1 = "+this.root1+" "+ "Root 2 = "+this.root2);
        }
    }
    
        public static void main(String[] args){
            QuadraticEquation test = new QuadraticEquation();
            test.setCoefficients(2, 4, 2);
            test.getCoefficients();
            test.solveEquation();
        }
    
}

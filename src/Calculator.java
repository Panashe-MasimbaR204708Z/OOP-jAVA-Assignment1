//Panashe Masimba
//R204708Z
//OOP(Java) Assignment 1

class Calculator {
    //class fields
    private double num1, num2;

    public Calculator(double num1, double num2) {
        //assigning variables to the respective fields in the class
        this.num1 = num1;
        this.num2 = num2;
    }
    double add() {
        //returning the addition of num1 and num2
        return this.num1+this.num2;
    }
    double subtract() {
        //returning the subtraction of num1 from num2
        return this.num2-this.num1;
    }
    double multiply() {
        //returning the multiplication of num1 and num2
        return this.num1*this.num2;
    }
    double divide() {
        //returning the division of num2 by num1
        return this.num2/this.num1;
    }
}
class Demo {
    public static void main(String args[]) {
        Calculator obj = new Calculator(10, 94);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}

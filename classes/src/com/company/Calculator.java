package com.company;

public class Calculator {
    public double leftVal;
    public double rightVal;
    public char opChar;
    public double result;

    public void execute() {
        switch(opChar) {
            case 'a':
                this.result = this.leftVal + this.rightVal;
                break;
            case 's':
                this.result = this.leftVal - this.rightVal;
                break;
            case 'm':
                this.result = this.leftVal * this.rightVal;
                break;
            case 'd':
                this.result = this.rightVal != 0.0d ? this.leftVal / this.rightVal : 0.0d;
                break;
            default:
                System.out.println("Unable to process the equation");
        }
    }
}

class Complex {
    int real;   
    int imag; 

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);  
        Complex c2 = new Complex(1, 7); 

        Complex sum = c1.add(c2);
        sum.display();
    }
}

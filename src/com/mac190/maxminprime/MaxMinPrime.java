package com.mac190.maxminprime;

import com.mac190.prime.Prime;

import java.util.Objects;

/*
Modify the maxmin class we wrote so that the private members of the class
are objects of the class Prime.
 */
public class MaxMinPrime {
    private Prime min, max;

    //default constructor
    public MaxMinPrime() {
        min = new Prime();
        max = new Prime();
    }

    //constructor that accepts one integer
    public MaxMinPrime(int a) {
        min = new Prime(a);
        max = new Prime(a);
    }

    //constructor that accepts two integers
    public MaxMinPrime(int a, int b) {
        if (a < b) {
            min = new Prime(a);
            max = new Prime(b);
        } else {
            min = new Prime(b);
            max = new Prime(a);
        }
    }

    //constructor that accepts one Prime
    public MaxMinPrime(Prime a) {
        min = new Prime(a.getPrime());
        max = new Prime(a.getPrime());
    }

    //construcotr that accepts two primes
    public MaxMinPrime(Prime a, Prime b) {
        if (a.getPrime() < b.getPrime()) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
    }

    public int getMin() {
        return min.getPrime();
    }

    public int getMax() {
        return max.getPrime();
    }

    public Prime getMinPrime() {
        return min;
    }

    public Prime getMaxPrime() {
        return max;
    }


    public void setMin(int a) {
        if (a > max.getPrime()) {
            min.setPrime(max.getPrime());
            max.setPrime(a);
        } else {
            min.setPrime(a);
        }
    }

    public void setMin(Prime a) {
        if (a.getPrime() > max.getPrime()) {
            min = max;
            max = a;
        } else {
            min = a;
        }
    }

    public void setMax(int a) {
        if (a < min.getPrime()) {
            max.setPrime(min.getPrime());
            min.setPrime(a);
        } else {
            max.setPrime(a);
        }
    }

    public void setMax(Prime a) {
        if (a.getPrime() < min.getPrime()) {
            max.setPrime(min.getPrime());
            min.setPrime(a.getPrime());
        } else {
            max.setPrime(a.getPrime());
        }
    }

    public void setMaxMin(int a, int b) {
        if (a < b) {
            min.setPrime(a);
            max.setPrime(b);
        } else {
            min.setPrime(b);
            max.setPrime(a);
        }
    }

    public void setMaxMin(Prime a, Prime b) {
        if (a.getPrime() < b.getPrime()) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
    }


    //equals()


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        MaxMinPrime that = (MaxMinPrime) o; //casting
        return Objects.equals(this.min, that.min) && Objects.equals(max, that.max);
    }

    public MaxMinPrime add(int a) {
        return new MaxMinPrime(this.min.add(a), this.max.add(a));
    }

    public MaxMinPrime add(Prime m) {
        return new MaxMinPrime(this.min.getPrime() + m.getPrime(), this.max.getPrime() + m.getPrime());
        //return new MaxMinPrime(this.min.add(m), this.max.add(m));
    }

    public MaxMinPrime add(MaxMinPrime m) {
        return new MaxMinPrime(this.min.add(m.min), this.max.add(m.max));
    }

    public static MaxMinPrime add(MaxMinPrime m1, MaxMinPrime m2) {
        return new MaxMinPrime(m1.min.add(m2.min), m1.max.add(m2.max));
    }
    //toString()

    @Override
    public String toString() {
        return "MaxMinPrime{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}

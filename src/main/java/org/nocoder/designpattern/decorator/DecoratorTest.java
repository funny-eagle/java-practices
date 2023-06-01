package org.nocoder.designpattern.decorator;

/**
 * @author yangjl
 * @description decorator test
 * @date 2022-11-03 20:59
 **/
public class DecoratorTest {

    public static void main(String[] args) {
        Invoice t = new Invoice();
        Invoice ticket;
        ticket = new HeadDecorator(new FootDecorator(t));
        ticket.printInvoice();

        System.out.println("------");

        ticket = new HeadDecorator(new FootDecorator(null));
        ticket.printInvoice();
    }

}

class Invoice {
    public void printInvoice() {
        System.out.println("invoice content");
    }
}

class Decorator extends Invoice {
    protected Invoice ticket;

    public Decorator(Invoice t) {
        ticket = t;
    }

    @Override
    public void printInvoice() {
        if (ticket != null) {
            ticket.printInvoice();
        }
    }
}


class HeadDecorator extends Decorator {
    public HeadDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        System.out.println("invoice header");
        super.printInvoice();
    }
}

class FootDecorator extends Decorator {
    public FootDecorator(Invoice t) {
        super(t);
    }

    @Override
    public void printInvoice() {
        super.printInvoice();
        System.out.println("invoice foot");
    }
}

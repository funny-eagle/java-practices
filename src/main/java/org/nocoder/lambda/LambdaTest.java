package org.nocoder.lambda;

/**
 * Java Lambda Expressions
 * https://www.javatpoint.com/java-lambda-expressions
 * @author yangjl
 * @date 2022-10-31 10:13
 **/
public class LambdaTest {

    interface Drawable{
        /**
         * draw
         */
        void draw();
    }

    interface Sayable1 {
        String say();
    }

    interface Sayable2{
        String say(String name);
    }

    public static void main(String[] args) {
        int width = 10;

        // without lambda
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("without lambda : Drawing " + width);
            }
        };
        drawable.draw();

        // with lambda
        Drawable drawable2 = () ->{
            System.out.println("with lambda: Drawing " + width);
        };
        drawable2.draw();

        // Java Lambda Expression Example: No Parameter
        Sayable1 s = ()->{return "I have nothing to say!";};
        System.out.println(s.say());

        // Java Lambda Expression Example: Single Parameter
        Sayable2 s2 = (name) ->{
            return "Hello, " + name;
        };
        System.out.println(s2.say("Jason"));
    }

}

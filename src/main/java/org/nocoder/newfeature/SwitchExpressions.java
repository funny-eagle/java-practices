package org.nocoder.newfeature;

/**
 *
 * https://dzone.com/articles/whats-new-between-java-11-and-java-17
 */
public class SwitchExpressions {
    public static void main(String[] args) {
        oldStyleWithoutBreak(Fruit.APPLE);
        oldStyleWithBreak(Fruit.APPLE);
        withSwitchExpression(Fruit.APPLE);
        withReturnValue(Fruit.APPLE);
        withYield(Fruit.APPLE);
        withYield(Fruit.ORANGE);
        oldStyleWithYield(Fruit.ORANGE);
    }

    private static void oldStyleWithoutBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void oldStyleWithBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
                break;
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void withSwitchExpression(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    private static void withReturnValue(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void withYield(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void oldStyleWithYield(Fruit fruit) {
        System.out.println(switch (fruit) {
            case APPLE, PEAR:
                yield "Common fruit";
            case ORANGE, AVOCADO:
                yield "Exotic fruit";
            default:
                yield "Undefined fruit";
        });
    }
}


enum Fruit {
    APPLE, PEAR, ORANGE, AVOCADO
}

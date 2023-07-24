package org.nocoder.newfeature;

import java.awt.*;
import java.util.Objects;

/**
 * Records
 *
 * https://dzone.com/articles/whats-new-between-java-11-and-java-17
 *
 * @author yangjl
 * @date 2023/6/1 16:48
 */
public class GrapeClass {
    private final Color color;
    private final int nbrOfPits;

    public GrapeClass(Color color, int nbrOfPits) {
        this.color = color;
        this.nbrOfPits = nbrOfPits;
    }

    public Color getColor() {
        return color;
    }

    public int getNbrOfPits() {
        return nbrOfPits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrapeClass that)) return false;
        return getNbrOfPits() == that.getNbrOfPits() && Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getNbrOfPits());
    }

    @Override
    public String toString() {
        return "GrapeClass{" +
                "color=" + color +
                ", nbrOfPits=" + nbrOfPits +
                '}';
    }

    private static void oldStyle() {
        GrapeClass grape1 = new GrapeClass(Color.BLUE, 1);
        GrapeClass grape2 = new GrapeClass(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeClass grape1Copy = new GrapeClass(grape1.getColor(), grape1.getNbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
    }

    public static void main(String[] args) {
//        oldStyle();
//        basicRecord();
        basicRecordWithValidation();
    }

    private static void basicRecord() {
        record GrapeRecord(Color color, int nbrOfPits) {}
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        GrapeRecord grape2 = new GrapeRecord(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeRecord grape1Copy = new GrapeRecord(grape1.color(), grape1.nbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
        System.out.println(grape1.hashCode() + " " + grape1Copy.hashCode());
    }

    private static void basicRecordWithValidation() {
        record GrapeRecord(Color color, int nbrOfPits) {
            GrapeRecord {
                System.out.println("Parameter color=" + color + ", Field color=" + this.color());
                System.out.println("Parameter nbrOfPits=" + nbrOfPits + ", Field nbrOfPits=" + this.nbrOfPits());
                if (color == null) {
                    throw new IllegalArgumentException("Color may not be null");
                }
            }
        }
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        System.out.println("Grape 1 is " + grape1);
        GrapeRecord grapeNull = new GrapeRecord(null, 2);
    }
}

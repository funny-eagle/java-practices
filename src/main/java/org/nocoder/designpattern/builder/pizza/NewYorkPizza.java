package org.nocoder.designpattern.builder.pizza;

import java.util.Objects;

/**
 * NewYorkPizza
 * 必须参数：Size 尺寸
 */
public class NewYorkPizza extends Pizza {

    private final Size size;

    private NewYorkPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public Size getSize() {
        return size;
    }


    public enum Size {SMALL, MEDIUM, LARGE}

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

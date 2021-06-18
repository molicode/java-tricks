package tricks.java.good.practices.one.avoid.constructors.with.many.parameters;

import java.util.Objects;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;
    private int cornerRadius;

    private Rectangle(Builder builder) {
        x = builder.x;
        y = builder.y;
        width = builder.width;
        height = builder.height;
        cornerRadius = builder.cornerRadius;
    }

    public static class Builder {
        private int x = 0;
        private int y = 0;
        private int width;
        private int height;
        private int cornerRadius = 0;

        public Builder(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle build() {
            return new Rectangle(this);
        }

        public Builder x(int value) {
            x = value;
            return this;
        }

        public Builder y(int value) {
            y = value;
            return this;
        }

        public Builder width(int value) {
            width = value;
            return this;
        }

        public Builder height(int value) {
            height = value;
            return this;
        }

        public Builder cornerRadius(int value) {
            cornerRadius = value;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y && width == rectangle.width && height == rectangle.height && cornerRadius == rectangle.cornerRadius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height, cornerRadius);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", cornerRadius=" + cornerRadius +
                '}';
    }
}

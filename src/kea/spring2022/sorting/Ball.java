package kea.spring2022.sorting;

public class Ball implements Sammenlignbar, Comparable {
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random()*16));
    }

    public Ball(int brightness) {
        this.brightness = brightness%16;
    }

    public boolean brighterThan(Ball otherBall) {
        if(otherBall.brightness < this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }

    @Override
    public boolean sorteresEfter(Sammenlignbar andetobject) {
        return brighterThan((Ball) andetobject);
    }

    @Override
    public int compareTo(Object o) {
        Ball otherBall = (Ball) o;
        if (brightness < this.brightness){
        return 1;
        }
    else return -1;
    }

}

package edu.up.cs301threadslab;

/**
 * Created by wagnern17 on 11/19/2015.
 */
public class StarAnimationThread extends Thread implements Runnable {
    private StarAnimation sa;

    public StarAnimationThread(StarAnimation starAnimation) {
        super();
        this.sa=starAnimation;
    }

    @Override
    public void run() {
        while (true) {
            if (Math.random() > 0.5) {
                sa.addStar();
            } else {
                sa.removeStar();
            }

            try {
                this.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

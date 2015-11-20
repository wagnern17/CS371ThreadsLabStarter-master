package edu.up.cs301threadslab;

/**
 * Created by wagnern17 on 11/19/2015.
 */
public class AnimationThread extends Thread implements Runnable {
    private AnimationView av;

    public AnimationThread(AnimationView animationView) {
        super();
        this.av = animationView;
    }

    @Override
    public void run() {
        while(true) {
            av.postInvalidate();
            try {
                this.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

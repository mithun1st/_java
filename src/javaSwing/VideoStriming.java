
package javaSwing;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VideoStriming {
    
    void stream(){
        
    }

    public void main(String[] args) {
        try {
            OpenCVFrameGrabber frameGrabber = new OpenCVFrameGrabber("http://192.168.43.1:4747/video?.mjpg");
            frameGrabber.setFormat("mjpeg");
            frameGrabber.start();
            opencv_core.IplImage iPimg = frameGrabber.grab();
            CanvasFrame canvasFrame = new CanvasFrame("Camera");
            canvasFrame.setCanvasSize(iPimg.width(), iPimg.height());
            while (canvasFrame.isVisible() && (iPimg = frameGrabber.grab()) != null) {
                canvasFrame.setDefaultCloseOperation(3);
                canvasFrame.showImage(iPimg);
            }
            frameGrabber.stop();
            canvasFrame.dispose();
        } catch (Exception e) {
        }
        System.exit(0);
        
        
    }

}

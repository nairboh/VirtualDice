package ca.brianho.virtualdice;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class OpenGLES20Activity extends Activity {

    private GLSurfaceView mGLView;
    private GLRenderer mRenderer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new GLSurfaceView(getApplicationContext());
        mGLView.setEGLContextClientVersion(2);

        mRenderer = new GLRenderer();
        mGLView.setRenderer(mRenderer);

        setContentView(mGLView);
    }
}

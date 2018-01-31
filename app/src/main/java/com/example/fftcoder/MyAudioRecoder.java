package com.example.fftcoder;

import java.io.File;
import java.io.IOException;
import android.media.MediaRecorder;
public class MyAudioRecoder {
    private File recordFile;
    private MediaRecorder mediaRecorder;
    public MyAudioRecoder (String FileName){
        this.recordFile = new File("./res/raw", "kk.amr");
    }
    private void startRecording(){
        mediaRecorder = new MediaRecorder();
        if (recordFile.exists()){
            recordFile.delete();
        }
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC); //设置麦克风
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
        mediaRecorder.setOutputFile(recordFile.getAbsolutePath());
        try{
            mediaRecorder.prepare();
            mediaRecorder.start();
        }catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void stopRecording(){
        if (recordFile != null){
            mediaRecorder.stop();
            mediaRecorder.release();
        }
    }
}
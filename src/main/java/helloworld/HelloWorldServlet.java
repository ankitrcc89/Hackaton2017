package helloworld;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;

public class HelloWorldServlet extends SpeechletServlet{
    public HelloWorldServlet() {
        System.out.println("Inside hello world Handler");
        this.setSpeechlet(new HelloWorldSpeechlet());
    }
}

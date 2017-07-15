package sample;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;

public class HelloWorldHandler extends SpeechletServlet {
    public HelloWorldHandler() {
        System.out.println("Inside hello world Handler");
        this.setSpeechlet(new HelloWorldUsingWebService());
    }
}


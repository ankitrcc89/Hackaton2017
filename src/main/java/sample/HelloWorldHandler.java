package sample;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;

public class HelloWorldHandler extends SpeechletServlet {
    public HelloWorldHandler() {
        this.setSpeechlet(new HelloWorldUsingWebService());
    }
}


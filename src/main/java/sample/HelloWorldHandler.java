package sample;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;

import java.util.HashSet;
import java.util.Set;

public class HelloWorldHandler extends SpeechletServlet {
    private static final Set<String> supportedIds = new HashSet<String>();
    static  {
        supportedIds.add("");
    }



}

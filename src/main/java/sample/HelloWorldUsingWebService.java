package sample;

import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;

public class HelloWorldUsingWebService implements Speechlet {


    public void onSessionStarted(final SessionStartedRequest sessionStartedRequest, final Session session) throws SpeechletException {

    }

    public SpeechletResponse onLaunch(final LaunchRequest launchRequest, final Session session) throws SpeechletException {
        return null;
    }

    public SpeechletResponse onIntent(final IntentRequest intentRequest, final Session session) throws SpeechletException {
        return null;
    }

    public void onSessionEnded(final SessionEndedRequest sessionEndedRequest, final Session session) throws SpeechletException {

    }
}

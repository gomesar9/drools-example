package com.example;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsExample {

    public static final void main(final String[] args) {
        // From the kie services, a container is created from the classpath
        KieServices kService = KieServices.get();
        KieContainer kContainer = kService.getKieClasspathContainer();

        execute( kService, kContainer );
    }

    public static void execute( KieServices kService, KieContainer kContainer ) {
        // Deve condizer com o declarado em META-INF/kmodule.xml
        KieSession ksession = kContainer.newKieSession("Comment");

        ksession.setGlobal( "list", new ArrayList<Object>() );

        // The application can also setup listeners
        //ksession.addEventListener( new DebugAgendaEventListener() );
        //ksession.addEventListener( new DebugRuleRuntimeEventListener() );

        KieRuntimeLogger logger = kService.getLoggers().newFileLogger( ksession, "./drools-example" );

        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );

        // The application can insert facts into the session
        final Comment message = new Comment( "John", "Jane", "Muito bem Jane." );
        final Comment message2 = new Comment( "Jane", "John", "Preciso falar com você sobre isso urgente, me ligue." );

        ksession.insert( message );
        ksession.insert( message2 );

        // and fire the rules
        ksession.fireAllRules();

        // Close logger
        logger.close();

        // and then dispose the session
        ksession.dispose();
    }

    public static class Comment {
        private String sender;
        private String receiver;
        private String text;
        private Priority priority;

        public Comment() {
            this.priority = Priority.NORMAL;
        }

        public Comment(String sender, String receiver, String text) {
            this.sender = sender;
            this.receiver = receiver;
            this.text = text;
            this.priority = Priority.NORMAL;
        }

        public String getReceiver() {
            return this.receiver;
        }

        public void setReceiver(final String receiver) {
            this.receiver = receiver;
        }

        public String getSender() {
            return this.sender;
        }

        public void setSender(final String sender) {
            this.sender = sender;
        }

        public Priority getPriority() {
            return this.priority;
        }

        public void setPriority(final Priority priority) {
            this.priority = priority;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
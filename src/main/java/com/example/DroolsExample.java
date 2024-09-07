package com.example;

import java.util.ArrayList;
import java.util.Collection;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.proto.CommentProto.Comment;

public class DroolsExample {

    public static final void main(final String[] args) {
        // From the kie services, a container is created from the classpath
        KieServices kService = KieServices.get();
        KieContainer kContainer = kService.getKieClasspathContainer();

        execute( kService, kContainer );
    }

    public static void execute( KieServices kService, KieContainer kContainer ) {
        // Deve condizer com o declarado em META-INF/kmodule.xml
        KieSession kSession = kContainer.newKieSession("Comment");

        kSession.setGlobal( "list", new ArrayList<Object>() );

        // The application can also setup listeners
        //ksession.addEventListener( new DebugAgendaEventListener() );
        //ksession.addEventListener( new DebugRuleRuntimeEventListener() );

        KieRuntimeLogger logger = kService.getLoggers().newFileLogger( kSession, "./drools-example" );

        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );

        // The application can insert facts into the session
        final Comment message1 = Comment.newBuilder()
            .setSender("")
            .setReceiver("Jane")
            .setText("Muito bem Jane.")
            .setPriority(Comment.Priority.URGENT)
            .build();
        
        final Comment message2 = Comment.newBuilder()
            .setSender("Jane")
            .setReceiver("John")
            .setText("Preciso falar com você sobre isso urgente, me ligue.")
            .build();
        
        final Comment message3 = message2.toBuilder()
            .setPriority(Comment.Priority.URGENT)
            .setText("")
            .build();
        
        kSession.insert( message1 );
        kSession.insert( message2 );
        kSession.insert( message3 );

        // and fire the rules
        kSession.fireAllRules();

        // Recuperando os objetos atualizados na sessão
        Collection<? extends Object> objects = kSession.getObjects(new ClassObjectFilter(Comment.class));
        for (Object obj : objects) {
            if (obj instanceof Comment) {
                Comment updatedComment = (Comment) obj;
                System.out.println("Updated Comment: " + updatedComment);
            }
        }

        // Close logger
        logger.close();

        // and then dispose the session
        kSession.dispose();
    }

}
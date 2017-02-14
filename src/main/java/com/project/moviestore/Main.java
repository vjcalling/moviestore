package com.project.moviestore;

import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.project.moviestore.model.Actor;
import com.project.moviestore.model.Dummy;
import com.project.moviestore.utilities.HibernateUtil;

/**
 * Main class.
 *
 */
public class Main {
    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "http://localhost:8080/moviestore/";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in com.project.moviestore package
        final ResourceConfig rc = new ResourceConfig().packages("com.project.moviestore");

        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
//        final HttpServer server = startServer();
//        System.out.println(String.format("Jersey app started with WADL available at "
//                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
//        System.in.read();
//        server.stop();
    	
    	
    	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Dummy.class);
		//cr.add(Restrictions.eq("level", "Easy"));
		List actors = cr.list();
		System.out.println(actors.size());
		//session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
    	
    }
}


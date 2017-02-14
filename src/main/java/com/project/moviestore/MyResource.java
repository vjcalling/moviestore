package com.project.moviestore;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.project.moviestore.model.Actor;
import com.project.moviestore.model.BaseModel;
import com.project.moviestore.model.Dummy;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Dummy> getIt() {

    	Criterion cr = Restrictions.conjunction().add(Restrictions.gt("a", 9));
    	List<Dummy> dummies = BaseModel.getInstance().findByCriteria(Dummy.class, cr);
    	return dummies;

    }
}

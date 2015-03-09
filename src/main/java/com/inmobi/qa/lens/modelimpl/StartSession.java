package com.inmobi.qa.lens.modelimpl;

import com.inmobi.StartSessionStateNew;
import org.apache.log4j.Logger;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

/**
 * Created by samarthg on 4/3/15.
 */

@GraphWalker(value = "random(edge_coverage(100))")
public class StartSession extends ExecutionContext implements StartSessionStateNew {

    public static final Logger LOGGER = Logger.getLogger(StartSession.class);

    @Override public void e_StartSession() {
     //   LOGGER.info("Executing edge e_StartSession");
    }

    @Override public void v_SessionStarted() {
      //  LOGGER.info("Validating vertex v_SessionStarted");
    }

    @Override public void e_StartServer() {

    }

    @Override public void e_CloseSession() {
      //  LOGGER.info("Validating vertex e_CloseSession()");
    }

    @Override public void e_getResultsWOSession() {

    }

    @Override public void v_ServerStarted() {

    }
}

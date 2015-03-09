package com.inmobi.qa.lens.modelimpl;

import com.inmobi.RunningSessionState;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

/**
 * Created by samarthg on 9/3/15.
 */
@GraphWalker(value = "random(edge_coverage(100))")
public class RunningSession extends ExecutionContext implements RunningSessionState {
    @Override public void v_SessionStarted() {

    }

    @Override public void e_WaitForQueryFinished() {

    }

    @Override public void e_QueryKilledFromQueue() {

    }

    @Override public void v_QueryRunning() {

    }

    @Override public void e_WaitForQueryToFail() {

    }

    @Override public void e_getSucceedResult() {

    }

    @Override public void v_QueryFailed() {

    }

    @Override public void e_SubmitQuery() {

    }

    @Override public void e_WaitForQueryRunning() {

    }

    @Override public void v_QueryFinished() {

    }

    @Override public void v_VerifyResults() {

    }

    @Override public void v_QueryKilled() {

    }

    @Override public void e_getFailedResult() {

    }

    @Override public void e_SessionStartFromVerifyResult() {

    }

    @Override public void e_QueueKilledFromRunning() {

    }

    @Override public void v_QueryQueue() {

    }
}

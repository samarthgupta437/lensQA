package com.inmobi.qa.lens.runners;

/**
 * Created by samarthg on 4/3/15.
 */



import com.inmobi.qa.lens.modelimpl.RunningSession;
import com.inmobi.qa.lens.modelimpl.StartSession;
import com.inmobi.qa.lens.observers.GraphStreamObserver;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphwalker.core.event.Observer;
import org.graphwalker.java.test.Executor;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;

/**
 * @author Nils Olsson
 */
public class GraphStreamApplication {

    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui.renderer",
                "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("GraphWalker MeetUp");
        graph.display(true);
        Executor executor = new TestExecutor(StartSession.class, RunningSession.class);
        Observer observer = new GraphStreamObserver(graph);
        executor.getMachine().addObserver(observer);
        Result result = executor.execute();
        System.out.println("Done: [" + result.getCompletedCount() + "," + result.getFailedCount() + "]");
    }
}

package edu.aa12;

import lpsolve.*;

/**
 *
 * @author Jens Raaby
 */
public class CircleLowerBound {
    private LpSolve lp;
    
    public CircleLowerBound(Graph graph)
    {
        
        // work out the number of radius variables
        int variables = graph.getVertices();
        
        // create default arrays for all the variables
        int[] colno = new int[variables];
        double[] row = new double[variables];
        
        try {
            lp = LpSolve.makeLp(0,variables);
            lp.setAddRowmode(true);
            
            // add variables
            //  a radius for each vertex, r_v
            for (int i=1; i<=variables; i++)
            {
                lp.addColumn(row);
            }
            // add distance constraints
            //  radius_u + radius_v <= length(u,v)
            
            // add non negativity constraints
            //  radius_v >= 0
            
            
            // set objective function
        }
        catch (LpSolveException e) {
            e.printStackTrace();
        }
        
    }
   
}

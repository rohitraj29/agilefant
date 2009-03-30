package fi.hut.soberit.agilefant.business;

import fi.hut.soberit.agilefant.model.Iteration;
import fi.hut.soberit.agilefant.util.IterationDataContainer;

public interface IterationBusiness {
    
    public IterationDataContainer getIterationContents(int iterationId);
    
    public IterationDataContainer getIterationContents(Iteration iter);

}

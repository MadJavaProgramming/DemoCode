/** The maintainable interface for any item
 *  that need to be maintained.
 *  @author pawaite
 */
public interface Maintainable {

    /** determines the cost of maintenance.
     *  @return maintenance
     */
     public abstract double determineMaintenanceCost();
}

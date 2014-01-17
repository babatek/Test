package specification;

public class ClassPoint implements InterfacePoint{
	
	private int ord;
	private int abs;

	public int getOrd() 
	{
		return ord;
	}
	
    public int getAbs()
    {
    	return abs;
    }
    
    public void setOrd(int ord)
    {
    	this.ord = ord;    
    }
    
    public void setAbs(int abs)
    {
    	this.abs = abs;
    }

    /**
     *
     * Retourne la somme des deux points.
     */
    public InterfacePoint add(InterfacePoint p)
    {
    	int abscisse = this.getAbs()+p.getAbs();
    	int ordonne = this.getOrd()+p.getOrd();
    	InterfacePoint c = new ClassPoint();
    	c.setAbs(abscisse);
    	c.setOrd(ordonne);
    	return c;
    }

}

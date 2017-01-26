public class Human
{
    private String eyes,hair,skin;
	
    public Human()
    {
        eyes="";
        hair="";
        skin="";
      
    }

    public Human(String E, String H, String S)
    {
        eyes= E;
        hair= H;
        skin= S;
    }

    public void setHES(String E, String H, String S)
    {
        eyes=E;
        hair=H;
        skin=S;
    }
    public String getEyes()
    {
        return eyes;
    }
    public String getHair()
    {
        return hair;
    }
    public String getSkin()
    {
        return skin;
    }
}
public class Human
{
    private String eyeColor,hairColor,hairType,skinColor;
    private int height, weight;

    public Human()
    {
        eyeColor="";
        hairColor="";
        hairType="";
        skinColor="";
        height = 0;
        weight=0;
    }

    public Human(String eC, String hC, String hT, String sC, int h, int w)
    {
        eyeColor=eC;
        hairColor=hC;
        hairType=hT;
        skinColor=sC;
        height = h;
        weight=w;
    }

    public void setHuman(String eC, String hC, String hT, String sC, int h, int w)
    {
        eyeColor=eC;
        hairColor=hC;
        hairType=hT;
        skinColor=sC;
        height = h;
        weight=w;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }
    public String getHairColor()
    {
        return hairColor;
    }
    public String getHairType()
    {
        return hairType;
    }
    public String getSkinColor()
    {
        return skinColor;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWeight()
    {
        return weight;
    }


}

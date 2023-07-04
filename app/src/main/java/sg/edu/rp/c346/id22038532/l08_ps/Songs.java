package sg.edu.rp.c346.id22038532.l08_ps;

public class Songs {
    private int id;
    private String title;
    private String singers;
    private int years;
    private int stars;

    public Songs(int id, String title, String singers, int years, int stars)
    {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.years = years;
        this.stars = stars;

    }
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public String getSingers()
    {
        return singers;
    }
    public int getYear()
    {
        return years;
    }
    public int getStars()
    {
        return stars;
    }
}

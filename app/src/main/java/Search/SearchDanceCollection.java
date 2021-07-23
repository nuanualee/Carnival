package Search;

public class SearchDanceCollection {
    private String id;
    private String name;
    private String creator;
    private int drawable;


    public SearchDanceCollection(String id, String name, String creator, int drawable) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.drawable = drawable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}

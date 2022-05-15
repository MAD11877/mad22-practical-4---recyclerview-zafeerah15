package sg.edu.np.edu.mad.s10205175_week2practical;

public class userclass {
    String name;
    String description;
    int id;
    boolean followed;

    public userclass(String name, String description, int id, boolean followed){
        this.name= name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }

}

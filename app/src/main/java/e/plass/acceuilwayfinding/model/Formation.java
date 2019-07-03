package e.plass.acceuilwayfinding.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Formation implements Comparable< Formation >{
    private int id;
    private String    name;
    private ArrayList<String> debouches;
    private String Description;
    private float notes;
    private String image;

    public Formation(int id, String name, ArrayList<String> debouches, String Description ,float notes, String image) {
        this.id = id;
        this.name = name;

        this.debouches = debouches;
        this.Description = Description;
        this.notes = notes;
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Formation() {
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getNotes() {
        return notes;
    }

    public void setNotes(float notes) {
        this.notes = notes;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDebouches() {
        return debouches;
    }

    public void setDebouches(ArrayList<String> debouches) {
        this.debouches = debouches;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", debouches=" + debouches +
                '}';
    }

    @Override
    public int compareTo(Formation o) {
        return this.getName().toLowerCase().trim().compareToIgnoreCase(o.getName().trim());
    }
    /*public static Comparator<Formation> comparableByName = new Comparator<Formation>() {
        @Override
        public int compare(Formation o1, Formation o2) {

            return o1.name.trim().toLowerCase().compareTo(o2.name.trim());
        }
    };
    public static Comparator<Formation> comparableByNote = new Comparator<Formation>() {
        @Override
        public int compare(Formation o1, Formation o2) {

            return (int) (o1.notes - o2.notes);
        }
    };*/
}

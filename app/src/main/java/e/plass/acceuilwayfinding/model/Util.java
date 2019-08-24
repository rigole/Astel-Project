package e.plass.acceuilwayfinding.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Util {
    private static ArrayList<Ecole>     ecoles     = new ArrayList<>();
    private static ArrayList<Formation> formations = new ArrayList<Formation>();
    private static Formation currentFormation;

    public static Formation getCurrentFormation() {
        return currentFormation;
    }

    public static void setCurrentFormation(Formation currentFormation) {
        Util.currentFormation = currentFormation;
    }

    public Util(){
        ecoles.clear();
        Calendar c = Calendar.getInstance();
        c.set(2010,01,01);
        ecoles.add(new Ecole(1,12f,"Schneider","camtel", c,"Douala","",""
        ,"loriem ipsum At nunc si ad aliquem bene nummatum tumentemque ideo honestus advena salutatum introieris, primitus tamquam exoptatus suscipieris et interrogatus multa coactusque mentiri"));

        c.set(1971,06,04);
        ecoles.add(new Ecole(2,10f,"Schlumberger","auto", c,"Yaoundé","",""
        ,"loriem ipsum At nunc si ad aliquem bene nummatum tumentemque ideo honestus advena salutatum introieris, primitus tamquam exoptatus suscipieris et interrogatus multa coactusque mentiri  "));

        c.set(2002,01,01);
        ecoles.add(new Ecole(3,15f,"Ingelec","electromenager", c,"Douala","","Paul GUIMEZAP"
        ,"loriem ipsum At nunc si ad aliquem bene nummatum tumentemque ideo honestus advena salutatum introieris, primitus tamquam exoptatus suscipieris et interrogatus multa coactusque mentiri"));


        c.set(1993,01,01);
        ecoles.add(new Ecole(4,16f,"Bosch","bosch", c,"Douala","",""
        ,"loriem ipsum At nunc si ad aliquem bene nummatum tumentemque ideo honestus advena salutatum introieris, primitus tamquam exoptatus suscipieris et interrogatus multa coactusque mentiri"));

        c.set(2010,01,01);




        c.set(2010,01,01);
        ecoles.add(new Ecole(6,8f,"Toyota","electromenager", c,"Douala","",""
        ,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

        c.set(2010,01,01);
        ecoles.add(new Ecole(7,8f,"FNE","electromenager", c,"Douala","",""
        ,"loriem ipsum At nunc si ad aliquem bene nummatum tumentemque ideo honestus advena salutatum introieris, primitus tamquam exoptatus suscipieris et interrogatus multa coactusque mentiri."));


        //------------------------------------------------------------
        formations.clear();
        ArrayList<String> d = new ArrayList<String>();
        d.add("Formation");
        d.add("Formation");
        d.add("Formation");
        d.add("Formation");
        d.add("Formation");
        d.add("Formation");
        formations.add(new Formation(1," Materiel Informatique",d,"Nous disposons de materiel informatique capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail", 15.7f,"materiel_informatique"));
        formations.add(new Formation(2,"Mobilier de Bureau",d,"Nous disposons de Mobilier de bureau capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail", 15.7f,"mobilierdebureau"));
        formations.add(new Formation(3,"Mobilier de Maison",d,"Nous disposons de mobilier de maison capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail" ,15.7f,"mobilierdemaison"));
        formations.add(new Formation(4,"Photo Voltaique",d,"Nous disposons de materiel ecologique capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail",15.7f,"voltaique"));
        formations.add(new Formation(4,"Automobiles",d,"Nous disposons de plusieurs automobiles capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail" ,15.7f,"auto"));
        formations.add(new Formation(4,"ElectroMenager",d, "Nous disposons de materiel electromenager capable de satisfaire vos besoin,Consultez notre catalogue pour plus de detail", 15.7f,"electro"));



    }

    public static ArrayList<Ecole> getEcoles() {
        return ecoles;
    }

    public static void setEcoles(ArrayList<Ecole> ecoles) {
        Util.ecoles = ecoles;
    }

    public static ArrayList<Formation> getFormations() {
        return formations;
    }

    public static void setFormations(ArrayList<Formation> formations) {
        Util.formations = formations;
    }
}

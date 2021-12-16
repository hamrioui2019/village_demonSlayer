import java.util.ArrayList;

public class Grade
{
    private String intitule;
    private int niveauPuissance;
    private ArrayList<DemonSlayer> listDemonSlayer = new ArrayList<DemonSlayer>();


    public Grade(String intitule, int niveau)
    {
        this.intitule = intitule;
        this.niveauPuissance = niveau;
    }


    public int getNiveauPuissance()
    {
        return this.niveauPuissance;
    }

    public String getIntitule(){
        return this.intitule;
    }

    public void setNiveauPuissance(int niveau){
        this.niveauPuissance = niveau;
    }

    public void setIntitule(String intitule){
        this.intitule = intitule;
    }

    public void ajouterDemonSlayerDansGrade(DemonSlayer demon){
        this.listDemonSlayer.add(demon);
    }

    public boolean estDansLeGrade(DemonSlayer demon) {
        return this.listDemonSlayer.contains(demon);
    }
}

public class DemonSlayer
{
    private String nom;
    private int nbDeMouvements;
    private String typeDeSouffle;
    private DemonSlayer coequipier = null;
    private Grade grade;

    public DemonSlayer(String n, int nb, String type)
    {
        this.nom = n;
        this.nbDeMouvements = nb;
        this.typeDeSouffle = type;
    }

    public void setTypeDeSouffle(String t){
        this.typeDeSouffle = t;
    }

    public void setNom(String n){
        this.nom =n;
    }

    public void setNbDeMouvements(int nbmov){
        if (nbmov <= 0)
            throw new Error("nbDeMouvements négatif");
        this.nbDeMouvements = nbmov;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getTypeDeSouffle(){
        return this.typeDeSouffle;
    }

    public int getNbDeMouvements(){
        return this.nbDeMouvements;
    }

    public String getNom(){
        return this.nom;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public boolean faireEquipe(DemonSlayer d){
        return this.getTypeDeSouffle() != d.getTypeDeSouffle();
    }

    public void setCoequipier(DemonSlayer d){
        this.coequipier = d;
    }

    public void ajouterCoequipier(DemonSlayer d){
        if(this.faireEquipe(d)){
            this.setCoequipier(d);
            d.setCoequipier(this);
        }
    }

    public String getCoequipier(){
        return this.coequipier.getNom();
    }

    public boolean peutVaincreUnDemon() {
        int puissanceGroupe = this.getGrade().getNiveauPuissance() + this.coequipier.getGrade().getNiveauPuissance();
        if (puissanceGroupe > (int)Math.random()*8) {
            return true;
        }
        return false;
    }
}
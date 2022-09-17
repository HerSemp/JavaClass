package edoxi;

public interface Scholarship {
    double CutOff = 80;
    String ScholarshipName = "CEO Award";
    default String scholarship(){
        return ScholarshipName;
    }
}

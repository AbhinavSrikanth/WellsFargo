public class FinancialAdvisor {

    private Long advisorId;
    private String name;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name) {
        this.name = name;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
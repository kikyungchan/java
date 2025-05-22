package 자습.p20250509;

class Student {
    String name;
    int koreanScore;
    int mathScore;

    public void setName(String name) {
        this.name = name;
    }

    public void setKoreanScore(int koreanScore) {
        if (koreanScore >= 0 && koreanScore <= 100) {
            this.koreanScore = koreanScore;
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }
    }

    public void setMathScore(int mathScore) {
        if (mathScore >= 0 && mathScore <= 100) {
            this.mathScore = mathScore;
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
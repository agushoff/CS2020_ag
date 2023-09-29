public class GradeCalculator{
    public static void main(String[] args){
        int maxscore = 100;
        int bestehensgrenze = 50;
        int score = 74;

        String[] Noten ={"A", "B","C", "D", "E", "F"};

        for (int i = 1; i <= 5; i++){
            if(score >= maxscore - i*10){
                //System.out.println(i);
                System.out.println(Noten[i-1]);
                break;
            }
        }


       /* for (int i = 9; i >= 0; i--){

            if(score > i*10 )


        }

        if (score >= 90){
            System.out.println("Grade A");
        }
        else if(score>=80){
            System.out.println("Grade B");
        }
        else if(score>=70){
            System.out.println("Grade C");
        }
        else if(score>=60){
            System.out.println("Grade D");
        }
        else if(score>= 20)&&(score)*/






    }
}
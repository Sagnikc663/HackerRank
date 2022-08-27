class Student extends Person{
	private int[] testScores;
        Student(String firstName,String lastName,int id,int[] scores){
            super(firstName,lastName,id);
            this.testScores = scores;
        }
        char calculate(){
            double avg =0.0;
            for(int i=0;i<testScores.length;i++){
                avg += testScores[i];
            }
            avg = avg/testScores.length;
            if(avg<40){
                return 'T';
            }
            else if(avg<55){
                return 'D';
            }
            else if(avg<70){
                return 'P';
            }
            else if(avg<80){
                return 'A';
            }
            else if(avg<90){
                return 'E';
            }
            else{
                return 'O';
            }
        }
    
}
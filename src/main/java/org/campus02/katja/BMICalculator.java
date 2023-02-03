package org.campus02.katja;

public class BMICalculator {

    private double weightIngKG;
    private double heightInMeters;

    public BMICalculator(double weightIngKG, double heightInMeters) {
        this.weightIngKG = weightIngKG;
        this.heightInMeters = heightInMeters;
    }

    public double getWeightIngKG() {
        return weightIngKG;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
    private double calculateBMI(){
        return weightIngKG/(heightInMeters * heightInMeters);
    }
    //bmi < 18,5 = underweight
    // 18,5 - 25 = normal
    //25 - 30 = overweight
    // > 30 = obese
    //return classification
    public String result(){
        double bmi = calculateBMI();
        if(bmi < 18.5){
            return "underweight";
        } else if(bmi < 25){
            return "normal";
        }else if(bmi <30){
            return "overweight";
        }else{
            return "obese";
        }
    }
}

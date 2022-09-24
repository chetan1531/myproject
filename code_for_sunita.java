package com.company;
import java.util.Scanner;
public class SunitaSharmaCode {
    public static void main(String []args) {
        System.out.println("Hello Sunita Sharma!  \n"+"Welcome to healthline");
        System.out.println("How I can Help You!!");
        System.out.println("Press 1 to check BMI(Body Mass Index).");
        System.out.println("Press 2 For health checkup.");
        System.out.println("Press 3 For Pro Exercise Tips.");

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Input weight in kilogram:");
                double weight = sc.nextDouble();
                System.out.println("Input height in meters: ");
                double height = sc.nextDouble();
                double BMI = 10000 * (weight / (height * height));
                System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
                if (BMI < 18.5) {
                    System.out.println("Hey Sunita You are Underweight.");
                    System.out.println("Here are following tips to make Normal BMI.\n" +
                            "Eat more frequently. When you're underweight, you may feel full faster.\n" +
                            "Choose nutrient-rich foods.\n" +
                            "Try smoothies and shakes.\n" +
                            "Watch when you drink.\n" +
                            "Make every bite count.\n" +
                            "Top it off.\n" +
                            "Have an occasional treat.\n" +
                            "Exercise.\n");
                } else if (BMI >= 18.5 && BMI <= 25) {
                    System.out.println("Congratuation Sunit your BMI is Normal.");
                } else if (BMI <= 30) {
                    System.out.println("Hey Sunita You are Overweighted.");
                    System.out.println("Here are following tips to make Normal BMI");
                    System.out.println("Fruit and vegetables. Adding five servings of fruit and vegetables a day can add nutrition to your diet, which will also serve to fill you up.\n" +
                            "Whole grain replacements.\n" +
                            "Attack snacks.\n" +
                            "Ditch highly processed foods.\n" +
                            "Fibre intake.\n" +
                            "Make use of protein.\n" +
                            "Lean meat.");
                } else {
                    System.out.println("Hey Sunita You are Obese.");
                    System.out.println("Here are following tips to make Normal BMI");
                    System.out.println("Fruit and vegetables. Adding five servings of fruit and vegetables a day can add nutrition to your diet, which will also serve to fill you up.\n" +
                            "Whole grain replacements.\n" +
                            "Attack snacks.\n" +
                            "Ditch highly processed foods.\n" +
                            "Fibre intake.\n" +
                            "Make use of protein.\n" +
                            "Lean meat.");
                }
                break;

            case 2:
                System.out.println("Enter how many months ago was the last Routine Checkup done");
                int months = sc.nextInt();
                System.out.println("Enter Cholestrol level in mg/dl");
                int chol = sc.nextInt();
                System.out.println("Enter Diastolic and Systolic Blood Pressure in mm Hg");
                int dbp = sc.nextInt();
                int sbp = sc.nextInt();
                System.out.println("Enter Sugar Levels Before meal and After meal in mg/dl");
                int bef = sc.nextInt();
                int aft = sc.nextInt();


                if ((months >= 3) && (chol >= 200 || dbp < 80 || sbp > 150 || bef < 70 || bef > 130 || aft > 180)) {
                    System.out.println("\nMonths :" + months + "\nCholestrol  level in mg/dl : " + chol + "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" + dbp + "\nSystolic :" + sbp + "\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" + bef + "\nAfter meal:" + aft + "\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range and your last visit exceeded the time span of 3 Months");
                }
                else if (chol >= 200 || dbp < 80 || sbp > 150 || bef < 70 || bef > 130 || aft > 180) {
                    System.out.println("\nCholestrol  level in mg/dl : " + chol + "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" + dbp + "\nSystolic :" + dbp + "\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" + bef + "\nAfter meal:" + aft + "\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range");
                }
                else if (months >= 3) {
                    System.out.println("\nYou need to visit the doctor since your last visit exceeded the time span of 3 Months \nMonths :" + months);
                }
                System.out.println("Also follow the points given below");
                System.out.println("1.Do Yoga and exercises on daily basis");
                System.out.println("2.Eat healthy");
                System.out.println("3.Take care of Joints and Bones");
                break;
            case 3:
                System.out.println("Exercise plan for seniors!!");
                SunitaSharmaCode a=new SunitaSharmaCode();

                System.out.println("Press A for !! Strength Routine !!\n"+"Press B for !! Balance Routine !!\n"+"Press C for !! Flexibility Routine !!");
                char x=sc.next().charAt(0);
                if(x=='A'){
                    a.StrengthRoutine();
                }
                else if(x=='B'){
                    a.BalanceRoutine();
                }
                else if(x=='C'){
                    a.FlexibilityRoutine();
                }

              break;
            default:
                System.out.println("You have Press Wrong key.");


        }

    }
      void  StrengthRoutine(){
          System.out.println("**Strength Routine**");
        System.out.println("There are dozens of exercises you can do to build strength without having to set foot in a gym. Here are a few examples for people who are just getting started.");
        System.out.println("(a)Abdominal contractions\n"+"**To increase strength in the abdominal muscles**" +
                "1)Take a deep breath and tighten your abdominal muscles.\n" +
                "2)Hold for 3 breaths and then release the contraction.\n" +
                "3)Repeat 10 times");
        System.out.println("(b)Heel raises\n"+
                "**To strengthen the upper calves**\n" +
                "1)Sitting in a chair, keep your toes and the balls of your feet on the floor and lift your heels.\n" +
                "2)Repeat 20 times.");
        System.out.println("(c)Ankle rotations"+
                "**To strengthen the calves**\n" +
                "1)Seated in a chair, lift your right foot off the floor and slowly rotate your foot 5 times to the right and then 5 times to the left.\n" +
                "2)Repeat with the left foot");
          System.out.println("Thanks For coming.");

    }
    void BalanceRoutine(){
        System.out.println("**Balance boosters**");
        System.out.println("Since accidental falls are a significant source of injury for many older adults, incorporating balance exercises in your exercise regimen is essential. Doing balance exercises, such as the ones described here, or an activity such as tai chi or yoga, makes it easier to walk on uneven surfaces without losing balance. You can do these balance exercises every day, several times a day — even when you’re standing in line at the bank or the grocery store.");
        System.out.println("(a)Shifting weight\n"+
                "1)Stand with your feet hip-width apart and your weight evenly distributed on both feet.\n" +
                "2)Relax your hands at your sides. You can also do this exercise with a sturdy chair in front of you in case you need to grab it for balance.\n" +
                "3)Shift your weight on to your right side, then lift your left foot a few inches off of the floor.\n" +
                "4)Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "5)Return to the starting position and repeat with the opposite leg.\n" +
                "6)Repeat 3 times.\n");
        System.out.println("(b)Single leg balance**\n"+
                "1)Stand with your feet hip-width apart, with your hands on your hips or on the back of a sturdy chair if you need support.\n" +
                "2)Lift your left foot off of the floor, bending at the knee and lifting your heel halfway between the floor and your buttocks.\n" +
                "3)Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "4)Return to the starting position and repeat with the opposite leg.\n" +
                "5)Repeat 3 times");
        System.out.println("Thanks For coming.");
    }
    void FlexibilityRoutine(){
        System.out.println("**FlexibilityRoutine**");
        System.out.println("**Stretching Exercises for Seniors**\n"+
        "1)Standing Quadriceps Stretch. The first exercise on our list is the standing quadriceps stretch.\n"+
        "2)Seated Knee to Chest.\n"+
        "3)Hamstring Stretch.\n"+
        "4)Soleus Stretch.\n"+
        "5)Overhead Side Stretch.\n"+
        "6)Shoulder Stretch.\n"+
        "7)Tricep Stretch.\n"+
        "8)Lunge in a Chair – Advanced.");
        System.out.println("Thanks For coming.");
    }

}

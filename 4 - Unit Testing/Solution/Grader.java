public class Grader {
    String grade(String mark, String credit){
        try{
            double mark2 = Double.parseDouble(mark);
            double credit2 = Double.parseDouble(credit);
            if(credit2==3){
                if(mark2<0){
                    return "Invalid number that exceed lower bound";
                }
                else if(mark2>300){
                    return "Invalid number that exceed upper bound";
                }
                else{
                    mark2 = Math.ceil(mark2);
                    if(mark2>=240) return "A";
                    if(mark2>=210) return "B";
                    if(mark2>=180) return "C";
                    else return "F";
                }
            }
            else if(credit2==4){
                if(mark2<0){
                    return "Invalid number that exceed lower bound";
                }
                else if(mark2>400){
                    return "Invalid number that exceed upper bound";
                }
                else{
                    mark2 = Math.ceil(mark2);
                    if(mark2>=320) return "A";
                    if(mark2>=280) return "B";
                    if(mark2>=240) return "C";
                    else return "F";
                }
            }
            else{
                return "Credit must be 3 or 4";
            }

        }catch (NumberFormatException e){
            return "Non-number input";
        }
    }
}

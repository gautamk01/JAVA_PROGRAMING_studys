package Lab2;

public class animal {
    int cat_A;
    int cat_B;
    int mouse;

    animal()
    {
        cat_A = 0;
        cat_B = 0;
        mouse = 0;
    }
    public String catAndMouse(){
        String ans="";
        if(Math.abs(cat_A-mouse)<Math.abs(cat_B-mouse)){
            ans = "Cat A will catch the mouse ";
        }
        else if (Math.abs(cat_A-mouse)>Math.abs(cat_B-mouse)){
            ans = "Cat B will catch the mouse ";
        }
        else if(Math.abs(cat_A-mouse)==Math.abs(cat_B-mouse))
        {
            ans = "The two cats fight and mouse escapes ";
        }
        return ans;
    }
}

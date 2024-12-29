public class Keywords {

    public final String[] keywords={"return","const"};


    public boolean isPresent(String inputKeyword)
    {
        for(String keyword : keywords)
        {
            if(keyword.equals(inputKeyword))
            {
                return true;
            }

        }
        return false;
    }


}

public class DomainParser {
    public static String getTopLevelDomain(String url){
       char lastChar=url.charAt(url.length()-1);
       char secondtoLast =url.charAt(url.length()-2);
        char thirdLast =url.charAt(url.length()-3);
        if(thirdLast=='.'){
            String domain= String.valueOf(secondtoLast)+String.valueOf(lastChar);
            return  domain;
        }
        //return String.valueOf(thirdLast+secondtoLast+lastChar);
        return String.valueOf(url.charAt(url.length()-3))+String.valueOf(secondtoLast)+String.valueOf(lastChar);
    }
}

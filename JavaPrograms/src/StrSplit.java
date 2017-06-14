class StrSplit{
  public static void main(String []args){
   String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
  
    String[] arrSplit = strMain.split(", ",3);
    for (int i=0; i< arrSplit.length; i++)
    {
      System.out.println(arrSplit[i]);
      System.out.println(i);
    }
  }
}
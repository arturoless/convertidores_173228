import java.util.ArrayList;
public class Convertidor{

    public void codo(String ipIngresada){
        ArrayList<Integer> partes= new ArrayList<Integer>();
        String final_ip="";
        char[] ip = ipIngresada.toCharArray();
        String numero="";
        for (char caracter : ip) {
			if (caracter != '.')
                numero+=caracter;
            else{
                partes.add(Integer.valueOf(numero));
                numero="";
            }
		}
        partes.add(Integer.valueOf(numero));
        for (Integer cosa : partes) {
            final_ip+=ip_decode(cosa);
        }
        System.out.println(final_ip);
    }

    public String ip_decode(int ip){
        int pi = ip;
        ArrayList<Character> decode= new ArrayList<Character>();
        String final_="";
        if (pi==0){
            decode.add(0,'0');
        }
        else{
            while (pi!=0){
                if (Integer.valueOf(pi) % 2 !=0){
                    decode.add(0,'1');
                } 
                else{
                    decode.add(0,'0');
                } 
                pi=Integer.valueOf(pi/2);
            }
        }
        while(decode.size()!=8){
            decode.add(0,'0');
        }
        for (char n : decode) {
            final_+=String.valueOf(n);
        }
        return final_;
    }

    public void iniciar(){
        Convertidor c = new Convertidor();
        try {
            c.codo(System.getenv("ip1"));
            c.codo(System.getenv("ip2"));
            c.codo(System.getenv("ip3"));
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }

    public static void main(String[] args){
       
    }
}
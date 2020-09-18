package webClient;

public class Client {
    public static void main(String args[]){
        TellService tellService=new TellService();
        Tell tell=tellService.getTellPort();
        String result = tell.hello("bingbao");
        System.out.println(result);
    }
}

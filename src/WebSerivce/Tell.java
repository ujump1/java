package WebSerivce;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Tell implements WebServiceTest {
    @Override
    public String Hello(String name) {
        return "Hello,"+name;
    }

    @Override
    public String Love(String name) {
        return "Love,"+name;
    }

    @Override
    @WebMethod(exclude=true)
    public String Hate(String name) {
        return "Hate,"+name;
    }

    //需要在web项目里面才行
    public static void main(String args[]) {
            Tell tell=new Tell();
            //调用Endpoint的publish方法发布Web Service
            Endpoint.publish("http://127.0.0.1:8080/tell", tell);
            System.out.println("Web Service暴露成功！");
        }
}


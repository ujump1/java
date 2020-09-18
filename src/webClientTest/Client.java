package webClientTest;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        SIEitfApInforsOutSynService siEitfApInforsOutSynService = new SIEitfApInforsOutSynService();
        SIEitfApInforsOutSyn siEitfApInforsOutSyn = siEitfApInforsOutSynService.getHTTPPort();
        DTEitfApInforsReq dtEitfApInforsReq=new DTEitfApInforsReq();
        List<DTEitfApInforsReq.CONTEXT.RECORD> records=new ArrayList<>();
        DTEitfApInforsReq.CONTEXT.RECORD record=new DTEitfApInforsReq.CONTEXT.RECORD();
        record.setATTRIBUTE1("1");
        records.add(record);
        DTEitfApInforsReq.CONTEXT context=new DTEitfApInforsReq.CONTEXT();
        context.record=records;
        dtEitfApInforsReq.setCONTEXT(context);
        DTEitfApInforsResp result = siEitfApInforsOutSyn.siEitfApInforsOutSyn(dtEitfApInforsReq);
        System.out.println(result);
    }
}

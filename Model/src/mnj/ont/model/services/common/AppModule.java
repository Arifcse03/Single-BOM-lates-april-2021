package mnj.ont.model.services.common;

import java.util.HashMap;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Feb 09 18:43:14 PKT 2015
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void fetchLines();

    void fetchMethod(Number pId);

    int callPost(String hederId);


    String CopyBOM(String bomId);

    void findSelLines();

    void populateOrderLines(String saleOrderID);

    String createPR(String bomId, String bomLineId);

    void callMatFetch();

    String fillZipper(String bomId);

    String fillThread(String bpo, String style);

    void HeaderActions(String type);

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    void refreshSizes();

    String getAttachments();

    void selectAllLines(String flag);

    void setMultiSearchWherClause(String saleOrderID);

    void poplateMultiSearch(String headerId);

    void sizesCiritSelectDesel(String flag, String type);

    void fillSizeBreakUp();

    void postAdditionalQty();

    void populateBPOLines1();

    void callBPOFetch();

    void selectAllBPO(String flag);
}

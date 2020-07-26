package pmp.sdk.builders;

import pmp.sdk.ApiClient;
import pmp.sdk.api.AgreementsApi;
import pmp.sdk.model.Agreement;

import java.util.Date;
import java.util.UUID;

public class AgreementBuilder {

    Agreement builtObject;

    public AgreementBuilder() {
        builtObject = new Agreement();
    }

    public AgreementBuilder withDefaults() {
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public Agreement getAgreement() {
        return builtObject;
    }

    public AgreementBuilder withItemIdentifier(String inItem) {
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public AgreementBuilder withEffectiveDate(String inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public AgreementBuilder withExpirationDate(String inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public AgreementBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public AgreementBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public AgreementBuilder withJsonString(String inItem) {
        builtObject.setJsonString(inItem);
        return this;
    }

    public AgreementBuilder withAncestorItemIdentifier(String inItem) {
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public AgreementBuilder withVersionNumber(int inItem) {
        builtObject.setVersionNumber(inItem);
        return this;
    }

    public AgreementBuilder withItemStatusuilder(Agreement.ItemStatusEnum inItem) {
        builtObject.setItemStatus(inItem);
        return this;
    }

    public AgreementBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public AgreementBuilder withAgreementNumber(String inItem) {
        builtObject.setAgreementNumber(inItem);
        return this;
    }

    public AgreementBuilder withAcceptanceDate(Date inItem) {
        builtObject.setAcceptanceDate(inItem);
        return this;
    }

    public AgreementBuilder withDescription(String inItem) {
        builtObject.setDescription(inItem);
        return this;
    }

    public AgreementBuilder withCustomerAgreementNo(String inItem) {
        builtObject.setCustomerAgreementNo(inItem);
        return this;
    }

    public AgreementBuilder withCanceledDate(Date inItem) {
        builtObject.setCanceledDate(inItem);
        return this;
    }

    public AgreementBuilder withCancelReasonDesc(String inItem) {
        builtObject.setCancelReasonDesc(inItem);
        return this;
    }

    public AgreementBuilder withCancelReason(Agreement.CancelReasonEnum inItem) {
        builtObject.setCancelReason(inItem);
        return this;
    }

    public AgreementBuilder withAgreementStatus(Agreement.AgreementStatusEnum inItem) {
        builtObject.setAgreementStatus(inItem);
        return this;
    }

    public AgreementBuilder withAgreementType(Agreement.AgreementTypeEnum inItem) {
        builtObject.setAgreementType(inItem);
        return this;
    }

    public Agreement update() {
        AgreementsApi api = new ApiClient().buildClient(AgreementsApi.class);
        Agreement response = api.agreementsCreate(builtObject);
        return response;
    }
}

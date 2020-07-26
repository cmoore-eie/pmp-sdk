package pmp.sdk.builders;

import pmp.sdk.model.*;

import java.util.ArrayList;
import java.util.UUID;

public class VirtualProductBuilder {

    VirtualProduct builtObject;

    public VirtualProductBuilder(){
        builtObject = new VirtualProduct();
    }

    public VirtualProduct getVirtualProduct(){
        return builtObject;
    }

    public VirtualProductBuilder withDefaults(){
        withAllowAffinity(false);
        withAllowCampaign(false);
        withCode("testvirtualproduct");
        withEffectiveDate("2020/01/01");
        withItemIdentifier(UUID.randomUUID().toString());
        withItemStatus(VirtualProduct.ItemStatusEnum.DRAFT);
        withLocked(false);
        withName("Test Virtual Product");
        withProductCode("CommercialProperty");
        withVersionNumber(1);
        return this;
    }

    public VirtualProductBuilder withAllowAffinity(boolean inItem){
        builtObject.setAllowAffinity(inItem);
        return this;
    }

    public VirtualProductBuilder withAllowCampaign(boolean inItem){
        builtObject.setAllowCampaign(inItem);
        return this;
    }

    public VirtualProductBuilder withAncestorItemIdentifier(String inItem){
        builtObject.setAncestorItemIdentifier(inItem);
        return this;
    }

    public VirtualProductBuilder withCode(String inItem){
        builtObject.setCode(inItem);
        return this;
    }

    public VirtualProductBuilder withEffectiveDate(String inItem){
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public VirtualProductBuilder withExpirationDate(String inItem){
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public VirtualProductBuilder withItemIdentifier(String inItem){
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public VirtualProductBuilder withItemStatus(VirtualProduct.ItemStatusEnum inItem){
        builtObject.setItemStatus(inItem);
        return this;
    }

    public VirtualProductBuilder withLocked(boolean inItem){
        builtObject.setLocked(inItem);
        return this;
    }

    public VirtualProductBuilder withName(String inItem){
        builtObject.setName(inItem);
        return this;
    }

    public VirtualProductBuilder withProductCode(String inItem){
        builtObject.setProductCode(inItem);
        return this;
    }

    public VirtualProductBuilder withVersionNumber(int inItem){
        builtObject.setVersionNumber(inItem);
        return this;
    }

    public VirtualProductBuilder withVirtualProductFlavours(VirtualProductFlavour inItem){
        if(builtObject.getVirtualProductFlavours() == null){
            builtObject.setVirtualProductFlavours(new ArrayList<VirtualProductFlavour>());
        }
        builtObject.addVirtualProductFlavoursItem(inItem);
        return this;
    }

    public VirtualProductBuilder withVirtualProductLine(VirtualProductLine inItem){
        if(builtObject.getVirtualProductLines() == null){
            builtObject.setVirtualProductLines(new ArrayList<VirtualProductLine>());
        }
        builtObject.addVirtualProductLinesItem(inItem);
        return this;
    }

    public VirtualProductBuilder withVirtualProductContract(VirtualProductContract inItem){
        if(builtObject.getVirtualProductContracts() == null){
            builtObject.setVirtualProductContracts(new ArrayList<VirtualProductContract>());
        }
        builtObject.addVirtualProductContractsItem(inItem);
        return this;
    }

    public VirtualProductBuilder withVirtualProductCategory(VirtualProductCategory inItem){
        if(builtObject.getVirtualProductCategories() == null){
            builtObject.setVirtualProductCategories(new ArrayList<VirtualProductCategory>());
        }
        builtObject.addVirtualProductCategoriesItem(inItem);
        return this;
    }
}

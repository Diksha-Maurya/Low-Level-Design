package Inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class Inventory {
    private Map<Integer, Product> aisleToProductMap;
    private Map<Integer, Integer> productIdToCountMap;
    Queue<Integer> availableAisle;

    public Inventory(int aisleCount){
        availableAisle = new LinkedList<>();

        for(int aisleNo = 1; aisleNo <= aisleCount; aisleNo++){
            availableAisle.add(aisleNo);
        }
        aisleToProductMap = new HashMap<>();
        productIdToCountMap = new HashMap<>();
    }

    public void addProduct(Product product) throws Exception{
        int productId = product.getId();
        int productCount = productIdToCountMap.getOrDefault(productId, 0);
        if(productCount == 0){
            if(availableAisle.isEmpty())
                throw new Exception("Out of space to add");
            aisleToProductMap.put(availableAisle.poll(), product);
        }
        productIdToCountMap.put(productId, productCount + 1);
    }

    public Product getProductAt(int aisleNumber){
        return aisleToProductMap.get(aisleNumber);
    }

    public boolean checkIfProductAvailable(int productId){
        int productCount = productIdToCountMap.getOrDefault(productId, 0);
        return productCount > 0;
    }

    public void deductProductCount(int aisleNumber){
        int productId = aisleToProductMap.get(aisleNumber).getId();
        int updatedProductCount = productIdToCountMap.get(productId) - 1;
        if(updatedProductCount == 0){
            productIdToCountMap.remove(productId);
            aisleToProductMap.remove(aisleNumber);
            availableAisle.add(aisleNumber);
        }
        else{
            productIdToCountMap.put(productId, updatedProductCount);
        }
    }
}

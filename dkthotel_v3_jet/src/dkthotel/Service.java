/*
 * V1- MAT
 * 
 */
package dkthotel;

/**
 *
 * @author mat
 */
public class Service {
    private String serviceId;
    private String serviceName;
    private float servicePrice;

    public Service(String serviceId, String serviceName, float servicePrice) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }
    public Service(){
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(float servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceId=" + serviceId + ", serviceName=" + serviceName + ", servicePrice=" + servicePrice + '}';
    }
    
    
}

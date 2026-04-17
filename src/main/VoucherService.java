public class VoucherService {
    public double calculatePrice(double total, double discount) {
        // ÁP DỤNG POKA-YOKE: Dùng Math.max để chặn giá sàn là 0
        double finalPrice = total - discount;
        return Math.max(0, finalPrice); 
    }
}

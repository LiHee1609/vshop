import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoucherServiceTest {
    @Test
    public void testVoucherBoundary() {
        VoucherService service = new VoucherService();
        // Giả sử đơn hàng 400k, voucher 500k
        double result = service.calculatePrice(400000, 500000);
        
        // Mong đợi: Giá không được âm. Nếu âm => Test thất bại.
        assertTrue(result >= 0, "LỖI: Giá đơn hàng bị âm: " + result);
    }
}

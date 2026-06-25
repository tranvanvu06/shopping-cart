package com.shashi.utility;

import jakarta.mail.MessagingException;

public class MailMessage {
	public static void registrationSuccess(String emailId, String name) {
		String recipient = emailId;
		String subject = "Đăng ký tài khoản thành công";
		String htmlTextMessage = "" + "<html>" + "<body>"
				+ "<h2 style='color:green;'>Chào mừng bạn đến với Van Vu Electronics Store</h2>" + "" + "Xin chào " + name + ","
				+ "<br><br>Cảm ơn bạn đã đăng ký tài khoản tại Van Vu Electronics Store.<br>"
				+ "Chúng tôi rất vui mừng vì bạn đã lựa chọn chúng tôi. Mời bạn ghé xem bộ sưu tập thiết bị điện tử mới nhất của cửa hàng."
				+ "<br>Chúng tôi đang áp dụng chương trình giảm giá lên đến 60% cho hầu hết các thiết bị điện tử. Hãy truy cập trang web để khám phá ngay nhé."
				+ "<br><br>Hệ thống mua sắm trực tuyến của chúng tôi đang ngày càng phát triển mạnh mẽ và nhận được sự quan tâm lớn từ khách hàng, "
				+ "chúng tôi chân thành cảm ơn bạn đã đồng hành để đạt được vị thế này. Chúng tôi giao hàng tận nơi hoàn toàn MIỄN PHÍ giao hàng và sở hữu danh mục sản phẩm từ các thương hiệu hàng đầu.<br><br>"
				+ "Như một món quà chào mừng khách hàng mới, chúng tôi tặng bạn ưu đãi giảm thêm 10% (Tối đa 500.000 VNĐ) cho đơn hàng đầu tiên. "
				+ "<br>Để áp dụng ưu đãi này, bạn chỉ cần nhập mã giảm giá được cung cấp bên dưới khi thanh toán:<br><br><br> MÃ GIẢM GIÁ: " + "VANVU500<br><br><br>"
				+ "Chúc bạn một ngày tốt lành!<br>" + "" + "</body>" + "</html>";
		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transactionSuccess(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Đơn hàng đã đặt thành công tại Van Vu Electronics Store";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Xin chào " + name + ",<br/><br/>"
				+ "      Chúng tôi rất vui vì bạn đã mua sắm tại Van Vu Electronics Store!" + "      <br/><br/>"
				+ "      Đơn hàng của bạn đã được đặt thành công và đang trong quá trình xử lý để vận chuyển."
				+ "<br/><h6>Lưu ý: Đây là Email từ dự án thử nghiệm (demo project) và bạn chưa thực hiện bất kỳ giao dịch thực tế nào với chúng tôi!</h6>"
				+ "      <br/>" + "      Dưới đây là chi tiết giao dịch của bạn:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Mã đơn hàng:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Số tiền đã thanh toán:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + " VNĐ</font>" + "      <br/><br/>" + "      Cảm ơn bạn đã mua sắm cùng chúng tôi!<br/><br/>"
				+ "      Hẹn gặp lại bạn trong lần mua sắm tới! <br/<br/> <font style=\"color:green;font-weight:bold;\">Van Vu Electronics Store.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void orderShipped(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Tuyệt vời!! Đơn hàng của bạn đã được vận chuyển từ Van Vu Electronics Store";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Xin chào " + name + ",<br/><br/>"
				+ "      Chúng tôi rất vui vì bạn đã mua sắm tại Van Vu Electronics Store!" + "      <br/><br/>"
				+ "      Đơn hàng của bạn đã được vận chuyển thành công và đang trên đường giao đến bạn."
				+ "<br/><h6>Lưu ý: Đây là Email từ dự án thử nghiệm (demo project) và bạn chưa thực hiện bất kỳ giao dịch thực tế nào với chúng tôi!</h6>"
				+ "      <br/>" + "      Dưới đây là chi tiết giao dịch của bạn:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Mã đơn hàng:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Số tiền đã thanh toán:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + " VNĐ</font>" + "      <br/><br/>" + "      Cảm ơn bạn đã mua sắm cùng chúng tôi!<br/><br/>"
				+ "      Hẹn gặp lại bạn trong lần mua sắm tới! <br/<br/> <font style=\"color:green;font-weight:bold;\">Van Vu Electronics Store.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void productAvailableNow(String recipientEmail, String name, String prodName, String prodId) {
		String recipient = recipientEmail;
		String subject = "Sản phẩm " + prodName + " hiện đã có hàng tại Van Vu Electronics Store";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Xin chào " + name + ",<br/><br/>"
				+ "      Chúng tôi rất vui vì bạn đã quan tâm đến Van Vu Electronics Store!" + "      <br/><br/>"
				+ "      Dựa trên lịch sử xem hàng gần đây, chúng tôi thấy bạn từng tìm kiếm một sản phẩm tạm thời hết hàng vào thời điểm đó. <br/><br/>"
				+ "      Chúng tôi rất vui mừng thông báo rằng sản phẩm có tên <font style=\"color:green;font-weight:bold;\">" + prodName
				+ "</font> với " + "mã sản phẩm <font style=\"color:green;font-weight:bold;\">" + prodId
				+ "</font> hiện đã được bổ sung đầy đủ và sẵn sàng để bạn mua sắm tại cửa hàng!"
				+ "<br/><h6>Lưu ý: Đây là Email từ dự án thử nghiệm (demo project), bạn chưa thực hiện giao dịch thực tế và chưa đặt mua sản phẩm này!</h6>"
				+ "      <br/>" + "      Dưới đây là thông tin chi tiết sản phẩm vừa có hàng:<br/>"
				+ "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Mã sản phẩm: </font><font style=\"color:green;font-weight:bold;\">"
				+ prodId + " " + "      </font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Tên sản phẩm: </font> <font style=\"color:green;font-weight:bold;\">"
				+ prodName + "</font>" + "      <br/><br/>" + "      Cảm ơn bạn đã mua sắm cùng chúng tôi!<br/><br/>"
				+ "      Hẹn gặp lại bạn! <br/<br/><br/> <font style=\"color:green;font-weight:bold;\">Van Vu Electronics Store.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static String sendMessage(String toEmailId, String subject, String htmlTextMessage) {
		try {
			JavaMailUtil.sendMail(toEmailId, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
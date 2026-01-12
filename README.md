WEBSITE BÁN HÀNG SẢN PHẨM CÔNG NGHỆ - UTEShop

GIỚI THIỆU

UTESHOP là một website thương mại điện tử được phát triển bằng Java Spring Boot, chuyên bán các sản phẩm công nghệ. Đây là đồ án Lập trình Web, Trường Đại học Sư Phạm Kĩ Thuật TP.HCM.


TÍNH NĂNG NỔI BẬT
Cho người Quản trị(Admin)
- Quản lý sản phẩm: Thêm, sửa, xóa sản phẩm và danh mục.
- Quản lý đơn hàng: Duyệt đơn, cập nhật trạng thái đơn hàng.
- Quản lý người dùng: Phân quyền, quản lý tài khoản.
- Thống kê: Báo cáo doanh thu, sản phẩm bán chạy theo thời gian.
- Quản lý bình luận: Kiểm duyệt đánh giá từ khách hàng.

Cho khách hàng:
- Đăng ký, Đăng nhập: Tài khoản cá nhân với xác thực bảo mật.
- Tìm kiếm & lọc: Tìm kiếm sản phẩm theo tiêu chí.
- Giỏ hàng thông minh: Quản lý giỏ hàng với AngularJS + LocalStorage.
- Đặt hàng: Quy trình đặt hàng đơn giản, tiện lợi.
- Theo dõi đơn hàng: Xem lịch sử và trạng thái đơn hàng.
- Đánh giá sản phẩm: Bình luận và nhận xét về sản phẩm đã mua.

CÔNG NGHÊ SỬ DỤNG:
*Backend:
- Framework: Spring Boot.
- Ngôn ngữ: Java.
- Bảo mật: Spring Security.
- Database: SQL Server với JPA/Hibernate.
- Template Engine: Thymeleaf
- Email: JavaMailSender.
*Frontend:
- HTML/CSS: Bootstrap
- JavaScript: jQuery, AngularJS.
- Icons: FrontAwesome.
- CLient Storage: LocalStorage.

CÔNG CỤ PHÁT TRIỂN
- IDE: Eclipse, Spring Tool Suite.
- Build Tool: Apache Maven.
- Database Management: SQL Server Management Studio.

CẤU TRÚC DỰ ÁN
##UTEShop/
##├── src/
##│   ├── main/
##   │   ├── java/
##│   │   │   └── com/websiteshop/
##│   │   │       ├── AdminController.java      
##│   │   │       ├── HomeController.java       
##│   │   │       ├── RestController.java       
##│   │   │       ├── config/                   
##│   │   │       ├── dao/                      
##│   │   │       ├── entity/                   
##│   │   │       ├── exception/                
##│   │   │       ├── interceptor/              
##│   │   │       ├── language/                 
##│   │   │       ├── model/                    
##│   │   │       ├── service/                  
##│   │   │       └── service/impl/             
##│   │   └── resources/
##│   │       ├── db/                          
##│   │       ├── i18n/                        
##│   │       ├── static/
##│   │       │   ├── assets/                  
##│   │       │   ├── css/                     
##│   │       │   ├── images/                  
##│   │       │   └── js/                      
##│   │       └── templates/
##│   │           ├── admin/                   
##│   │           ├── cart/                    
##│   │           ├── help/                    
##│   │           ├── layout/                  
##│   │           ├── order/                   
##│   │           ├── product/                 
##│   │           ├── security/                
##│   │           ├── SendMail/                
##│   │           └── user/                    
##│   └── test/
##       └── java/                            
##├── target/
##├── mvnw
##├── mvnw.cmd
##├── pom.xml
##└── README.md

*Configuration
- config: Cấu hình Spring Security, Interceptor, etc.
- Interceoptor: Xử lý request/response.
- language: Hỗ trợ đa ngôn ngữ.

CÀI ĐẶT VÀ CHẠY DƯ ÁN:
- Java jdk 17
- SQL Server.
- Maven 3.6+
Các bước triển khai:
1. Clone dự án:
2. Câú hình database:
- Tạo database mới trong SQL Server
- Chạy script khởi tạo trong thư mục: src/main/resource/db/
3. Cấu hình application,properties:
- Database Configuration
- spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=WebShop
- spring.datasource.username=your_username
- spring.datasource.password=your_password
- spring.jpa.hibernate.ddl-auto=update
4. Build và chạy ứng dụng:
- Sử dụng Maven Wrapper:
./mvnw clean install
./mvnw spring-boot:run

- Hoặc sử dụng Maven trực tiếp:
mvn clean install
mvn spring-boot:run

5. Truy cập ứng dụng:
- Website chính: http://localhost:8080
- Trang quản trị: http://localhost:8080/admin

MÔ HÌNH HỆ THỐNG:
*Kiến trúc MVC:
- Model: entity, model/ classes
- View: Thymeleaf templates trong templates/
- Controller: controller.java classes.
* Các Controller chính:
- HomeController: Xử lý trang chủ, sản phẩm, tìm kiếm.
- AdminController: Quản lý hệ thống
- RestController: Cung cấp APT cho frontend.


HƯỚNG PHÁT TRIỂN
- Tích hợp thanh toán trực tuyến (VNPay, MoMo).
- Nâng cấp bảo mật với JWT và HTTPS
- Đồng bộ giỏ hàng với database.
- Gửi email xác nhận đơn hàng.
- Phát triển ứng dụng di động.
- Tích hợp chatbot hỗ trợ.
- Hệ thống gơi ý sản phẩm thông minh.
- Triển khai lên cloud (AWS, Heroku).

LICENSE
Dự án được phát triển cho mục đích học tập và nghiên cứu.

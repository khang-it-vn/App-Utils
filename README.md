# App-Utils 
App tiện ích cuộc sống, đồ án môn lập trình di động nên chương trình sẽ không đề cập đến vấn đề bảo mật, hay quản lý session hay sso. 


## Chức năng
### 1. Đăng ký tài khoản
      UI Flow:
      Khi người dùng khởi động phần mềm, người dùng cần đăng nhập, nếu chưa có tài khoản, người dùng cần đăng ký tài khoản,
      để đăng ký tài khoản người dùng cần điền các thông tin: họ tên, số điện thoại, mật khẩu. Trong đó, mỗi tài khoản chỉ 
      sử dụng 1 số điện thoại, mật khẩu chứa các ký tự hoa, thường và đăc biệt, và trên 12 ký tự.
      
      API:
      ==> Method: [POST] 
      ==> URL:    domain/v1/api/User
      ==> Body: @TaiKhoanModel {HoTen: String, MatKhau: String, SoDienThoai: String}
      
      Response: 
              {
                Data= success ?  @TaiKhoanModel : MessageError,
                Message= "Create New Account",
                Success = success ? true : false
              }
              
 ### 2. Đăng nhập
      
      UI Flow:
      Khi đăng nhập, người dùng cần điền 2 thông tin là số điện thoại và mật khẩu. Nếu nhập sai hệ thống sẽ thông báo 
      “sai số điện thoại hoặc mật khẩu”. Nếu đăng nhập thành công sẽ chuyển đến trang chủ. 
      
      API:
      ==> Method: [POST] 
      ==> URL:    domain/v1/api/User/Login
      ==> Body: @TaiKhoan {MatKhau: String, SoDienThoai: String}
      
      Response: 
              {
                Data= success ?  @TaiKhoan : MessageError,
                Message= "Login",
                Success = success ? true : false
              }
             
### 3. Trang chủ
    UI Flow:
    Tại trang chủ sẽ hiển thị danh sách các chức năng mà chương trình hỗ trợ: Tìm kiếm thợ sửa điện, tìm kiếm thợ sửa nước,
    tìm kiếm cây xăng gần đây, tìm kiếm tiệm sửa xe gần đây, cấp cứu xe máy, cấp cứu ô tô, ...
    
### 4. Thông tin thợ sửa chữa
    
    UI Flow:
    Khi người dùng chọn chức năng tìm kiếm thợ sửa điện, người dùng sẽ xem được danh sách các thợ sửa chữa gần đây đang hoạt động. 
    
    API:
      ==> Method: [GET] 
      ==> URL:    domain/v1/api/User/GetRepairerArround
      ==> Param:  Latitude: String , Longitude: String, page: int

      Response: 
              {
                Data= success ?  @List<Repairer> : MessageError,
                Message= "Get List Repairer Arround",
                Success = success ? true : false
              }
          
    UI Flow:
    Khi người dùng chọn vào một thợ sửa chữa có thể xem được thông tin của thợ sửa chữa bao gồm: họ tên, địa chỉ, số điện thoại,
    giới tính, hình ảnh.
    API:
      ==> Method: [GET] 
      ==> URL:    domain/v1/api/User/RepairerInfomation
      ==> Param:  ID: Guid(C#) UUID(java)

      Response: 
              {
                Data= success ?  @Repairer : MessageError,
                Message= "Get Infomation of Repairer By ID",
                Success = success ? true : false
              }
              
 ### 5. Liên hệ
      Tại mục xem thông tin thợ sửa chữa người dùng có thể nhấn liên hệ trưc tiếp với thợ sửa chữa. 
      
 ### 6. Góp ý
      Trong quá trình sử dụng ứng dụng, người dùng có thể gửi góp ý về quá trình sử dụng chương trình cho nhà phát triển
      để cải thiện sản phẩm tốt hơn.
      
      

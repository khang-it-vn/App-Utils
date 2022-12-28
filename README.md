# App-Utils 
App tiện ích cuộc sống, đồ án môn lập trình di động nên chương trình sẽ không đề cập đến vấn đề bảo mật, hay quản lý session hay sso. 


## Chức năng
### 1. Đăng ký tài khoản
      Khi người dùng khởi động phần mềm, người dùng cần đăng nhập, nếu chưa có tài khoản, người dùng cần đăng ký tài khoản, để đăng ký tài khoản người dùng cần điền các thông tin: họ tên, số điện thoại, mật khẩu. Trong đó, mỗi tài khoản chỉ sử dụng 1 số điện thoại, mật khẩu chứa các ký tự hoa, thường và đăc biệt, và trên 12 ký tự.
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
      Khi đăng nhập, người dùng cần điền 2 thông tin là số điện thoại và mật khẩu. Nếu nhập sai hệ thống sẽ thông báo “sai số điện thoại hoặc mật khẩu”. Nếu đăng nhập thành công sẽ chuyển đến trang chủ. 
       ==> Method: [POST] 
      ==> URL:    domain/v1/api/User/Login
      ==> Body: @TaiKhoan {MatKhau: String, SoDienThoai: String}
      
      Response: 
              {
                Data= success ?  @TaiKhoan : MessageError,
                Message= "Login",
                Success = success ? true : false
              }
      

package mobile.kt.apputils.UI.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import mobile.kt.apputils.Apis.ApiService;
import mobile.kt.apputils.Apis.Prototypes.DataUserApiResponse;
import mobile.kt.apputils.Models.TaiKhoan;
import mobile.kt.apputils.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void callApi(View view) {
        ApiService.apiService.login(new TaiKhoan("string", "string")).enqueue(new Callback<DataUserApiResponse>() {
            @Override
            public void onResponse(Call<DataUserApiResponse> call, Response<DataUserApiResponse> response) {
                DataUserApiResponse res = response.body();
                System.out.println(res.getData().getHoTen());
            }

            @Override
            public void onFailure(Call<DataUserApiResponse> call, Throwable t) {

            }
        });


    }
}
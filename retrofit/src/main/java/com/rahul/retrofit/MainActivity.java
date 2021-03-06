package com.rahul.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;

import com.rahul.retrofit.domain.EmployeeResponse;
import com.rahul.retrofit.rest.GetDataService;
import com.rahul.retrofit.rest.RetrofitClientInstance;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllEMployees();
    }
    private void getAllEMployees(){
        GetDataService service= RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<EmployeeResponse> call=service.getAllEmployees();
        call.enqueue(new Callback<EmployeeResponse>() {
            @Override
            public void onResponse(Call<EmployeeResponse> call, Response<EmployeeResponse> response) {
                if(response.code()==200){
                    Log.i("@main","Employee================>"+response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<EmployeeResponse> call, Throwable t) {
                Log.i("@maim","error===============> Sorry app is of Rangila type");

            }
        });
    }
}

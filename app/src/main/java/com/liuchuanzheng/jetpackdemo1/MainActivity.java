package com.liuchuanzheng.jetpackdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.liuchuanzheng.jetpackdemo1.databinding.ActivityMainBinding;
/**
 * @author: 刘传政
 * @date: 2019-12-01 22:32
 * QQ:1052374416
 * 作用:使用google官方的jetpack组件,最标准简单的用法
 *     使用dataBinding+viewModel+liveData+ConstraintLayout(现在已经是Android默认布局)
 *     因为使用了viewModel,所以在不进行任何额外设置时,旋转屏幕也不会丢失页面数据
 *     因为使用了ConstraintLayout,所以旋转屏幕也不会导致布局错乱.
 *     因为使用了viewModel,所以架构分层是标准的MVVM
 *     因为使用了dataBinding,所以不再写findviewbyid,也不使用butternife
 *     因为使用了liveData,所以数据的变动,自动会更新ui
 * 注意事项:
 */
public class MainActivity extends AppCompatActivity {
    MyViewModel myViewModel;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        binding.setViewModel(myViewModel);
        binding.setLifecycleOwner(this);
    }
}

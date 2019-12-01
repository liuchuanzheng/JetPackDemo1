package com.liuchuanzheng.jetpackdemo1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author 刘传政
 * @date 2019-12-01 21:56
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> fenA;
    private MutableLiveData<Integer> fenB;

    public MutableLiveData<Integer> getFenA() {
        if (fenA == null){
            fenA = new MutableLiveData<>();
            fenA.setValue(0);
        }
        return fenA;
    }

    public MutableLiveData<Integer> getFenB() {
        if (fenB == null){
            fenB = new MutableLiveData<>();
            fenB.setValue(0);
        }
        return fenB;
    }

    public void addFenA(int fen){
        fenA.setValue(getFenA().getValue()+fen);
    }
    public void addFenB(int fen){
        fenB.setValue(getFenB().getValue()+fen);
    }
}

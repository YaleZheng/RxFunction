package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface Action4<T1, T2, T3, T4> extends Function {
    void call(T1 arg1, T2 arg2, T3 arg3, T4 arg4);
}

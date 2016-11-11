package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface SafeAction3<T1, T2, T3> extends Function {
    void call(T1 arg1, T2 arg2, T3 arg3) throws Exception;
}

package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface SafeFunc2<T1, T2, R> extends Function {
    R call(T1 arg1, T2 arg2) throws Exception;
}

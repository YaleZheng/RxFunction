package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface SafeFunc1<T,R> extends Function {
    R call(T arg) throws Exception;
}

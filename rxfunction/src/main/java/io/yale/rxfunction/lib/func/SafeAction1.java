package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface SafeAction1<T> extends Function {
    void call(T arg) throws Exception;
}

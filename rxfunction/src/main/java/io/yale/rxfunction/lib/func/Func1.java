package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface Func1<T,R> extends Function {
    R call(T arg);
}

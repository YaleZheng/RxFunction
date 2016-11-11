package io.yale.rxfunction.lib.func;

/**
 * Created by yalez on 2016/11/11.
 */

public interface SafeFunc0<R> extends Function {
    R call() throws Exception;
}

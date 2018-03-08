/**
 * Created by Administrator on 2018/3/8 0008.
 */
/**
 * jjs是个基于Nashorn引擎的命令行工具。它接受一些JavaScript源代码为参数，并且执行这些源代码。例如，我们创建一个具有如下内容的func.js文件：
 * @returns {number}
 */
function f() {
    return 1;
};

print( f() + 1 );
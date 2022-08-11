//aplicacao parcial Curry e Groovy que nos permite denifir,
// ele retornará em um novo fechamento, exceto em um parametro a menos

def log = {String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}
log("DEBUG", new Date(),"This is my first degub statement")

//quando precisamos escrever varias vezes alterando os parametros
def debugLog = log.curry("DEBUG")
debugLog(new Date(),"This is my first degub statement")


def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("message")


//right curry
def crazyPersonLog = log.rcurry("Why am I logging this way")
crazyPersonLog("ERROR", new Date())

// index based currying, curry baseado em index
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "This is using ncurry")



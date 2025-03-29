sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val error: String) : Result()
    object Loading : Result()
}

fun handleResult(result: Result) {
    when(result){
        is Result.Success -> println("Success ${result.data}")
        is Result.Error -> println("Error ${result.error}")
        is Result.Loading -> println("Loading...")
    }

}

fun main() {

    val success = Result.Success("Data loaded");
    val error = Result.Error("Data error");
    handleResult(success);
    handleResult(error)

}
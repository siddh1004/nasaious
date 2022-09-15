-if class com.example.nasaious.data.remote.response.ErrorResponse
-keepnames class com.example.nasaious.data.remote.response.ErrorResponse
-if class com.example.nasaious.data.remote.response.ErrorResponse
-keep class com.example.nasaious.data.remote.response.ErrorResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}

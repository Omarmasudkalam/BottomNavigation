package com.ict.bottomnavigation.di
    import com.ict.bottomnavigation.data.ApiDetails
    import dagger.Module
    import dagger.Provides
    import dagger.hilt.InstallIn
    import dagger.hilt.components.SingletonComponent
    import retrofit2.Retrofit
    import retrofit2.converter.gson.GsonConverterFactory


@Module  // to define the definition of dependency injection
@InstallIn(SingletonComponent::class) // to define scope of dependency injection
class AppModule {
    // define all the dependencies you will use in project


    @Provides // to define providing value
    // provide the retrofit instance
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(ApiDetails.BASE_URL)
        .build()

    @Provides
    // to provide the API instance references in code use
    fun provideAPI(retrofit: Retrofit): ApiDetails = retrofit.create(ApiDetails::class.java)
}
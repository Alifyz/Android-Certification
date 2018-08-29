# App data and files

## Define data using Room entities
The following code snippet is used to serialize a TV Series object fetched using The Movie DB API found here: https://www.themoviedb.org/documentation/api

The SerializeName is used to link the variables with the proper field whenever we use a different variable name for the object. 

```kotlin
@Entity(tableName = "popular")
data class Popular(
        @PrimaryKey
        var id: Int? = null,
        @SerializedName("original_name")
        @Expose
        var originalName: String? = null,
        @SerializedName("name")
        @Expose
        var name: String? = null,
        @SerializedName("popularity")
        @Expose
        var popularity: Double? = null,
        @SerializedName("vote_count")
        @Expose
        var voteCount: Int? = null,
        @SerializedName("vote_average")
        @Expose
        var voteAverage: Double? = null,
        @SerializedName("first_air_date")
        @Expose
        var firstAirDate: String? = null,
        @SerializedName("poster_path")
        @Expose
        var posterPath: String? = null,
        @SerializedName("genre_ids")
        @Expose
        var genreIds: List<Int>? = null,
        @SerializedName("original_language")
        @Expose
        var originalLanguage: String? = null,
        @SerializedName("backdrop_path")
        @Expose
        var backdropPath: String? = null,
        @SerializedName("overview")
        @Expose
        var overview: String? = null,
        @SerializedName("origin_country")
        @Expose
        var originCountry: List<String>? = null
)
```


## Access Room database with data access object (DAO)
The code-snippet below is an example of how we can use the Room Library to create a simple Interface that will be implemented by the Room library to create routes to add, fetch, update and delete data from the SQLite Database. 

```kotlin
@Dao
interface SeriesDao {

    @Query("SELECT * FROM popular")
    fun getAllPopular() : List<Popular>

    @Query("SELECT * FROM top")
    fun getAllTop() : List<Top>

    @Insert
    fun insertPopular(vararg series: Popular)
    //If we try to insert the same data, the table will be replaced
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTop(vararg  series : Top)
    
    @Delete
    fun delete(vararg  series: Top)
}
```

* Observe and respond to changing data using LiveData
* Use a Repository to handle data operations
* Read and parse raw resources or asset files
* Create persistent preference data from user input
* Change the behavior of the app based on user preferences

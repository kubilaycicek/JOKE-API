# Joke API
 * Java 17
 * Spring Boot 3.1.0

# Resource API
 Chuck Norris API URL : https://api.chucknorris.io/
 
 # Requests
 
 #### Get Joke Categories
 ```code
curl --location 'http://localhost:8080/joke-app/categories'
```
Response :
 ```json
 {
    "categories": [
        "ANIMAL",
        "CAREER",
        "CELEBRITY",
        "DEV",
        "EXPLICIT",
        "FASHION",
        "FOOD",
        "HISTORY",
        "MONEY",
        "MOVIE",
        "MUSIC",
        "POLITICIAL",
        "RELIGION",
        "SCIENCE",
        "SPORT",
        "TRAVEL"
    ]
}
 ```

### Get Random Joke
 ```code
curl --location 'http://localhost:8080/joke-app/random-joke'
```
Respone :
```json
{
    "joke": "Chuck Norris is like God, sex and kung-fu put in a blender to create undiluted manliness."
}
 ```

### Get Random Joke By Category
 ```code
curl --location --request GET 'http://localhost:8080/joke-app/random-joke-by-category' \ --header 'Content-Type: application/json' \ --data '{ "category":"ANIMAL"}'
```
Response:
```json
{
    "joke": "Chuck Norris' first roundhouse kick ever is now known as The Big Bang."
}
 ```

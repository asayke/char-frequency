# char-frequency
Для работы с приложением достаточно сделать post-запрос по адресу /string/find-frequency с json-телом :
```json
{
    "string" : "aaaaabcccc"
}
```
Для указанного примера получим ответ :
```json
[
    {
        "a": 5
    },
    {
        "c": 4
    },
    {
        "b": 1
    }
]
```

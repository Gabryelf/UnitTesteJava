1___Заглушки позволяют изолировать модуль или компонент от внешних зависимостей.Это уменьшает влияние внешних факторов и делает тестирование и его результаты корректными, не допуская лишних ошибок и исключений.
2___Для проверки вызова метода с определенными аргументами следует использовать Mockito.verify() с аргументами, которые ожидаются при вызове метода.
3___Если нужно вернуть определенное значение или сгенерировать исключение при вызове метода, следует использовать Mockito.when().
4___Для имитации взаимодействия с внешним API или базой данных я бы использовал Mockito и созданные с его помощью mock объекты(ExternalApiService, TestContainers).

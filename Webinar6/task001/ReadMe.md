## Создать систему управления библиотекой(SOLID)
1. Book - должен отвечать только за хранение информации о книге.
(единственная ответственность -> Single Responsibility Principle)
2. Genre - должен хранить информацию о жанрах книг. (открыт для расширения,
но закрыт для изменения -> Open-Closed Principle)
3. ElectronBook - должна иметь формат чтения и размер. (Принцип подстановки
Барбары Лисков - >Liskov Substitution Principle)
4. Searchable - должен производить поиск по авторам книг. (Принцип
разделения интерфейса -> Interface Segregation Principle)
5. Formatter - должен выводить информацию в различных форматах( без
формата,json,html)- заглушки (Принцип инверсии зависимостей -> Dependency
Inversion Principle)
# Java — RTU MIREA

Учебный репозиторий по курсу «Программирование на Java» (РТУ-МИРЭА). Здесь собраны исходники, практические задания и небольшие демонстрационные программы.

---

## Навигация

- 📦 **Исходники**: [`/src`](./src)
- 📚 Практики:
    - [Практика 1](./ПнЯД_практика_1.docx) → [код](./src/practice1)
    - [Практика 2](./ПнЯД_практика_2.docx) → [код](./src/practice2)
    - [Практика 3](./ПнЯД_практика_3.docx) → [код](./src/practice3)
    - [Практика 4](./ПнЯД_практика_4.docx) → [код](./src/practice4)
    - [Практика 5](./ПнЯД_практика_5.docx) → [код](./src/practice5)
    - [Практика 6](./ПнЯД_практика_6.docx) → [код](./src/practice6)
    - [Практика 7](./ПнЯД_практика_7.docx) → [код](./src/practice7)
    - [Практика 8](./ПнЯД_практика_8.docx) → [код](./src/practice8)

> В каждой папке `practiceX` лежат соответствующие Java-классы, тестовые программы и вспомогательные файлы.

---

## Быстрый старт

### В IntelliJ IDEA
1. Открой папку репозитория → **File → Open…** (`/src` должен быть помечен как *Sources Root*).
2. Убедись, что выбран JDK (рекомендуется 17+): **File → Project Structure → Project SDK**.
3. Запусти любой класс с `public static void main(...)` (например, `TestTriangle`/`TestCompare`) через зелёный ▶.

### В Visual Studio Code
1. Установи расширения:
    - [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
    - (опционально) [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)

2. Убедись, что JDK установлен и прописан в `PATH` (проверь командой `java -version`).

3. Открой папку репозитория в VS Code (**File → Open Folder…**).

4. Настрой рабочую папку:
    - В `src` должны лежать все пакеты (`practice1`, `practice2`, …).
    - VS Code автоматически распознает `src` как *Sources Root*.  
      Если нет → открой `.vscode/settings.json` и добавь:
      ```json
      {
        "java.project.sourcePaths": ["src"]
      }
      ```

5. Запуск:
    - Открой любой класс с методом `public static void main(String[] args)`.
    - Вверху над методом появится кнопка **Run | Debug**.
    - Нажми **Run** для запуска программы.

6. Запуск через терминал:
   ```bash
   # компиляция
   javac -d out $(find src -name "*.java")
   # запуск (пример для practice4.app.TestTriangle)
   java -cp out practice4.app.TestTriangle
   

### Через терминал (macOS/Linux)
```bash
# из корня репозитория
find src -name "*.java" > sources.txt
javac -d out @sources.txt
# пример запуска (замени на свой пакет/класс с main):
java -cp out practice4.app.TestTriangle
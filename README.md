# Java テンプレート

[![Copier](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/copier-org/copier/master/img/badge/badge-black.json)](https://github.com/copier-org/copier)

Java project template powered by [Copier](https://copier.readthedocs.io/).

## クイックスタート

### 前提条件

- [Visual Studio Code](https://code.visualstudio.com/): Your code editor. Redefined with AI
- [Docker](https://www.docker.com/): Develop faster. Run anywhere
- [uv](https://docs.astral.sh/uv/): Fast Python package installer
- [copier](https://copier.readthedocs.io/en/stable/): For rendering project templates

### 新規プロジェクト作成

uvとcopierを利用して、コピーします

```bash
uvx copier copy gh:hiroshees/java-template <your-project-name>
```

プロンプトに従って、プロジェクトの基礎情報を入力します

### テンプレートの更新

```bash
cd <your-project-name>
uv copier update -A
```

## VS Code Devcontainer

VSCodeの場合、Devcontainerを開きます

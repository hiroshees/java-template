# Javaテンプレート

[![Copier](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/copier-org/copier/master/img/badge/badge-black.json)](https://github.com/copier-org/copier)

Java project template powered by [Copier](https://copier.readthedocs.io/).

## クイックスタートa

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

### 開発用セットアップ

プロジェクト構築後に、以下の手順で実行環境を構築します。voltaを利用してnodejsをインストールします。プロジェクト管理ツールとしてpnpmを利用します

```bash
cd <your-project-name>

# install node via volta
./bin/postCreate.sh

# Install dependencies
gradle

# Run formatting and linting (automatically runs on commit)
gradle

# Run tests


```

### テンプレートの更新

```bash
cd <your-project-name>
uv copier update -A
```

## VS Code Devcontainer

VSCodeの場合、Devcontainerを開きます

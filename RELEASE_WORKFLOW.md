# Flujo de Trabajo de Release Please

Este proyecto utiliza [Release Please](https://github.com/googleapis/release-please) para automatizar la gestión de versiones y releases.

## Estrategia de Ramas

### 🌿 Rama `main` - Versiones Estables

- **Propósito**: Contiene código de producción con versiones estables
- **Formato de versión**: `X.Y.Z` (ej: `1.0.0`, `1.2.3`)
- **Workflow**: `.github/workflows/release-please.yml`
- **Comportamiento**:
  - Cada push a `main` activa Release Please
  - Se crea un PR automático que actualiza el CHANGELOG y la versión
  - Al mergear el PR, se crea un release y tag en GitHub
  - Las versiones siguen [Semantic Versioning](https://semver.org/)

### 🔧 Rama `dev` - Release Candidates

- **Propósito**: Rama de desarrollo con versiones pre-release
- **Formato de versión**: `X.Y.Z-rc.N` (ej: `1.0.0-rc.1`, `1.2.0-rc.3`)
- **Workflow**: `.github/workflows/release-please-dev.yml`
- **Comportamiento**:
  - Cada push a `dev` activa Release Please con prerelease
  - Se crean release candidates para testing
  - Permite validar cambios antes de mergear a `main`

## Conventional Commits

Release Please utiliza [Conventional Commits](https://www.conventionalcommits.org/) para determinar el tipo de versión:

### Tipos de Commits y su Impacto

| Tipo                          | Descripción             | Impacto en Versión | Ejemplo                           |
| ----------------------------- | ----------------------- | ------------------ | --------------------------------- |
| `feat:`                       | Nueva funcionalidad     | MINOR (0.X.0)      | `feat: add user authentication`   |
| `fix:`                        | Corrección de bug       | PATCH (0.0.X)      | `fix: resolve login issue`        |
| `feat!:` o `BREAKING CHANGE:` | Cambio incompatible     | MAJOR (X.0.0)      | `feat!: redesign API endpoints`   |
| `docs:`                       | Documentación           | No incrementa      | `docs: update README`             |
| `style:`                      | Formato de código       | No incrementa      | `style: fix indentation`          |
| `refactor:`                   | Refactorización         | No incrementa      | `refactor: simplify auth logic`   |
| `test:`                       | Tests                   | No incrementa      | `test: add unit tests`            |
| `chore:`                      | Tareas de mantenimiento | No incrementa      | `chore: update dependencies`      |
| `ci:`                         | CI/CD                   | No incrementa      | `ci: update workflow`             |
| `perf:`                       | Mejoras de rendimiento  | PATCH (0.0.X)      | `perf: optimize database queries` |

### Ejemplos de Commits

```bash
# Feature (incrementa versión MINOR)
git commit -m "feat: add password reset functionality"

# Bug fix (incrementa versión PATCH)
git commit -m "fix: correct email validation regex"

# Breaking change (incrementa versión MAJOR)
git commit -m "feat!: change API response format

BREAKING CHANGE: API now returns data in a different structure"

# Documentación (no incrementa versión)
git commit -m "docs: add API documentation"

# Múltiples cambios
git commit -m "feat: add user profile page

- Add profile component
- Add profile API endpoint
- Add profile tests"
```

## Flujo de Trabajo Recomendado

### 1. Desarrollo en `dev`

```bash
# Crear rama de feature desde dev
git checkout dev
git pull origin dev
git checkout -b feature/nueva-funcionalidad

# Hacer cambios y commits con conventional commits
git add .
git commit -m "feat: add new feature"

# Push y crear PR a dev
git push origin feature/nueva-funcionalidad
```

### 2. Release Candidate en `dev`

- Al mergear el PR a `dev`, Release Please crea automáticamente:
  - Un PR con el CHANGELOG actualizado
  - Versión con formato `X.Y.Z-rc.N`
- Mergear el PR de Release Please para crear el release candidate
- Probar el release candidate en entorno de staging

### 3. Promoción a `main`

```bash
# Una vez validado el RC, mergear dev a main
git checkout main
git pull origin main
git merge dev
git push origin main
```

### 4. Release Estable en `main`

- Release Please crea un PR en `main` con:
  - CHANGELOG actualizado
  - Versión estable `X.Y.Z`
- Mergear el PR para crear el release oficial

## Archivos de Configuración

### `release-please-config.json`

Configuración principal de Release Please:

- Define el tipo de release (maven)
- Configura las secciones del CHANGELOG
- Establece reglas de versionado

### `.release-please-manifest.json`

Mantiene el tracking de la versión actual del proyecto.

### `pom.xml`

Release Please actualiza automáticamente la versión en este archivo.

## Comandos Útiles

### Ver versión actual

```bash
# En pom.xml
grep -A 1 "<version>" pom.xml | head -2

# En manifest
cat .release-please-manifest.json
```

### Forzar un tipo de release

```bash
# Para forzar una versión MAJOR
git commit -m "feat!: breaking change

BREAKING CHANGE: This changes the API"

# Para forzar una versión MINOR
git commit -m "feat: new feature"

# Para forzar una versión PATCH
git commit -m "fix: bug fix"
```

### Ver historial de releases

```bash
# Tags locales
git tag -l

# Releases en GitHub
gh release list
```

## Troubleshooting

### El PR de Release Please no se crea

- Verifica que los commits sigan Conventional Commits
- Asegúrate de que `MY_RELEASE_PLEASE_TOKEN` esté configurado
- Revisa los logs del workflow en GitHub Actions

### La versión no se incrementa correctamente

- Verifica el tipo de commit usado
- Revisa el archivo `.release-please-manifest.json`
- Consulta el CHANGELOG.md generado

### Conflictos en el PR de Release Please

- Resuelve los conflictos manualmente
- Actualiza el PR con los cambios resueltos
- Release Please actualizará automáticamente

## Referencias

- [Release Please Documentation](https://github.com/googleapis/release-please)
- [Conventional Commits](https://www.conventionalcommits.org/)
- [Semantic Versioning](https://semver.org/)
- [GitHub Actions](https://docs.github.com/en/actions)

## Configuración Inicial

### Requisitos

1. Token de GitHub con permisos:
   - `contents: write`
   - `issues: write`
   - `pull-requests: write`

2. Configurar el secret `MY_RELEASE_PLEASE_TOKEN` en GitHub:
   - Settings → Secrets and variables → Actions
   - New repository secret
   - Name: `MY_RELEASE_PLEASE_TOKEN`
   - Value: tu Personal Access Token

### Primera Ejecución

1. Hacer push a `dev` o `main` con conventional commits
2. Release Please creará el primer PR automáticamente
3. Revisar y mergear el PR
4. El release se creará automáticamente

## Ejemplo Completo

```bash
# 1. Desarrollo en dev
git checkout dev
git checkout -b feat/user-profile
git commit -m "feat: add user profile page"
git push origin feat/user-profile
# Crear PR y mergear a dev

# 2. Release Please crea PR en dev con versión 1.1.0-rc.1
# Mergear el PR de Release Please

# 3. Testing del RC
# Validar en staging

# 4. Promoción a main
git checkout main
git merge dev
git push origin main

# 5. Release Please crea PR en main con versión 1.1.0
# Mergear el PR de Release Please

# 6. Release 1.1.0 creado automáticamente
```

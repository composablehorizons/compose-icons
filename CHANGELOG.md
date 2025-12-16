# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [2.1.1] - 2025-12-16

### Added

- Added [Radix](https://composables.com/icons/icon-libraries/radix) and [Codicons](https://composables.com/icons/icon-libraries/vscode-codicons) icon libraries.

## [2.0.1] - 2025-12-16

### Changed

- Removed Android's `Lucide` object in favor of adding all icons to `R`. This is done in order to allow R8 to remove unused resources from the final APK.
- Add Android resources are now prefixed with `lucide_ic_`
- Reverted CMP library back to `Lucide.X` properties. The previous approach prevented icons to be removed by ProGuard.

## [2.0.0] - 2025-12-15

### Added

- Bundle icons as resources instead of Kotlin. This way there is no compilation overhead for apps.
- Ship separate Android and Compose Multiplatform artifacts.

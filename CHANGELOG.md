# Changelog

## [1.6.0](https://github.com/amerinoo/Release-please-sandbox/compare/v1.5.3...v1.6.0) (2026-03-31)


### Features

* add maven package command for dev builds ([b9cd2f0](https://github.com/amerinoo/Release-please-sandbox/commit/b9cd2f0421cf67a2cee70e8b39fd91f599b4672b))
* add Release Information section to RC notes ([d370d5f](https://github.com/amerinoo/Release-please-sandbox/commit/d370d5fdb34f3f5c23aa3613563fc9d4ad80456e))
* auto-calculate RC number from existing prereleases ([8cbddef](https://github.com/amerinoo/Release-please-sandbox/commit/8cbddefdb5949620d58a7fd2c4a5a558803f7cdd))
* auto-detect version from Release Please PR for RC builds ([d858165](https://github.com/amerinoo/Release-please-sandbox/commit/d8581656c4253de0e0ef48512f43c0f1acc55b43))
* create GitHub prerelease when building RC ([1ad9c71](https://github.com/amerinoo/Release-please-sandbox/commit/1ad9c713384118337d16f829e520670d9efc96f0))
* enable build and release steps for RC workflow ([140cba5](https://github.com/amerinoo/Release-please-sandbox/commit/140cba56598fee751e003efcffa30c026ce6f855))
* extract version from PR for dev builds ([86241df](https://github.com/amerinoo/Release-please-sandbox/commit/86241dff325852a153f533e7cfc58854c3c5577b))
* include Release Please PR changelog in RC release notes ([0accd0e](https://github.com/amerinoo/Release-please-sandbox/commit/0accd0e218d99c9f914b4bbc4188169d6c1e2a3b))


### Bug Fixes

* checkout PR branch to get updated manifest version ([86cb744](https://github.com/amerinoo/Release-please-sandbox/commit/86cb744d0116b521252932bdb5f949dea9613dae))
* correct yaml syntax for if condition ([46c0cf2](https://github.com/amerinoo/Release-please-sandbox/commit/46c0cf2265074289ac29ee71608dd5ec8d6e270b))
* get version from manifest file instead of PR output ([6cda50b](https://github.com/amerinoo/Release-please-sandbox/commit/6cda50b29cc93a19b2c09ab1c99379b00e7a6982))
* handle empty PR in dev job ([82d5fcf](https://github.com/amerinoo/Release-please-sandbox/commit/82d5fcfd038a83c224385988ffdf15d5a82e49af))
* properly expand RC_VERSION variable and filter changelog content ([f6a2e8b](https://github.com/amerinoo/Release-please-sandbox/commit/f6a2e8b5ac91b33d5be89c42c386a9572894f8ad))
* skip dev-build workflow when merging release-please PR ([d816ddb](https://github.com/amerinoo/Release-please-sandbox/commit/d816ddbde9a259859c41adc71361257378130aef))
* use env vars in debug step to avoid bash syntax errors ([28d4fb1](https://github.com/amerinoo/Release-please-sandbox/commit/28d4fb12f41e82698ed77bc5bce2e8bf54eba84e))

## [1.5.3](https://github.com/amerinoo/Release-please-sandbox/compare/v1.5.2...v1.5.3) (2026-03-30)


### Bug Fixes

* correct variable interpolation in deploy step ([b89965e](https://github.com/amerinoo/Release-please-sandbox/commit/b89965ef155e2fb576e7097f3884e766f0173028))
* update release-please workflow ([98b525c](https://github.com/amerinoo/Release-please-sandbox/commit/98b525c1de287635e5f7ca089600ea728a082473))

## [1.5.2](https://github.com/amerinoo/Release-please-sandbox/compare/v1.5.1...v1.5.2) (2026-03-30)


### Bug Fixes

* update release-please config ([06188ad](https://github.com/amerinoo/Release-please-sandbox/commit/06188adc8525dfc3c738e96aee07c8842daf7a75))

## [1.5.1](https://github.com/amerinoo/Release-please-sandbox/compare/v1.5.0...v1.5.1) (2026-03-30)


### Bug Fixes

* add condition to deploy job to only run when release is created ([e15ab70](https://github.com/amerinoo/Release-please-sandbox/commit/e15ab70c37d839d7b5a470fcf96e10916ec570ea))
* add debug output in release-please job to see step outputs ([0038aea](https://github.com/amerinoo/Release-please-sandbox/commit/0038aeacd9baed2ee1f95786ae57400fd99ea5a7))
* add debug output to see all release-please outputs ([b3cd2b0](https://github.com/amerinoo/Release-please-sandbox/commit/b3cd2b04e654a06e1473fdc122c8c2a734c5eca1))
* improve outputs handling and add proper condition for deploy ([ccad1c2](https://github.com/amerinoo/Release-please-sandbox/commit/ccad1c26f532e4353269eba96b9f3c0e739b168f))
* remove CI-friendly version pattern to work with maven release-type ([138ca33](https://github.com/amerinoo/Release-please-sandbox/commit/138ca33daeb50dab72a8751e613598c37b4f8538))
* remove toJSON to avoid bash syntax error ([ec7eda8](https://github.com/amerinoo/Release-please-sandbox/commit/ec7eda8bd05f5814dd74998645c0c050ff0c36f8))
* restore CI-friendly version and change release-type to java ([7f8fdd2](https://github.com/amerinoo/Release-please-sandbox/commit/7f8fdd2767bd26ab5c4d129276dd18f2f72e6b87))
* update release-please configuration and pom version ([9edef14](https://github.com/amerinoo/Release-please-sandbox/commit/9edef14f9be8defcd6d9137909f0f947767e6ccd))
* update release-please workflow ([2ca58a8](https://github.com/amerinoo/Release-please-sandbox/commit/2ca58a82dbedb6b9262bc126c78280ed38caff6b))
* use env vars to avoid bash syntax errors with special characters ([8f8468c](https://github.com/amerinoo/Release-please-sandbox/commit/8f8468ccf82778b56a846e2273f6a2611246c82a))

## [1.5.0](https://github.com/amerinoo/Release-please-sandbox/compare/v1.4.0...v1.5.0) (2026-03-30)


### Features

* add release-please configuration ([e554c60](https://github.com/amerinoo/Release-please-sandbox/commit/e554c60296be5505c8abc4c08729176ed6ae1291))
* test release candidate flow ([ab35037](https://github.com/amerinoo/Release-please-sandbox/commit/ab3503721a17fbca3e61939aacd276a88ac9688b))


### Bug Fixes

* another patch test ([fef7668](https://github.com/amerinoo/Release-please-sandbox/commit/fef766899ca7616e7076725109766de8d103f2c6))
* fifth patch test ([b66a23e](https://github.com/amerinoo/Release-please-sandbox/commit/b66a23e0938774d844e9b2e356158839bfccb7c8))
* forzar cambio a rc ([a25e3e3](https://github.com/amerinoo/Release-please-sandbox/commit/a25e3e368defd04920336a4fed750c50ee28ee20))
* fourth patch test ([47e2b66](https://github.com/amerinoo/Release-please-sandbox/commit/47e2b66467d0813e495025e4d9932642b7c72996))
* test patch version increment ([3962409](https://github.com/amerinoo/Release-please-sandbox/commit/3962409c6eadb1df14446113abbb10a303603206))
* third patch test ([a279bc5](https://github.com/amerinoo/Release-please-sandbox/commit/a279bc5a69a90ecd1df3b84fa107ead1a12620a3))
* update workflows configuration ([54eef4d](https://github.com/amerinoo/Release-please-sandbox/commit/54eef4dd6f6bb7e4ee580795a6a469ffd2bc4167))

## [1.4.0](https://github.com/amerinoo/Release-please-sandbox/compare/v1.3.3...v1.4.0) (2026-03-30)


### Features

* add release-please configuration ([e554c60](https://github.com/amerinoo/Release-please-sandbox/commit/e554c60296be5505c8abc4c08729176ed6ae1291))
* test release candidate flow ([ab35037](https://github.com/amerinoo/Release-please-sandbox/commit/ab3503721a17fbca3e61939aacd276a88ac9688b))


### Bug Fixes

* another patch test ([fef7668](https://github.com/amerinoo/Release-please-sandbox/commit/fef766899ca7616e7076725109766de8d103f2c6))
* fifth patch test ([b66a23e](https://github.com/amerinoo/Release-please-sandbox/commit/b66a23e0938774d844e9b2e356158839bfccb7c8))
* forzar cambio a rc ([a25e3e3](https://github.com/amerinoo/Release-please-sandbox/commit/a25e3e368defd04920336a4fed750c50ee28ee20))
* fourth patch test ([47e2b66](https://github.com/amerinoo/Release-please-sandbox/commit/47e2b66467d0813e495025e4d9932642b7c72996))
* test patch version increment ([3962409](https://github.com/amerinoo/Release-please-sandbox/commit/3962409c6eadb1df14446113abbb10a303603206))
* third patch test ([a279bc5](https://github.com/amerinoo/Release-please-sandbox/commit/a279bc5a69a90ecd1df3b84fa107ead1a12620a3))

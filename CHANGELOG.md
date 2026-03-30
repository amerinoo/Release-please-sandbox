# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.1.0](https://github.com/amerinoo/Release-please-sandbox/compare/1.1.0...1.1.0) (2026-03-30)


### Features

* add testing documentation for release please flow ([f60e5cd](https://github.com/amerinoo/Release-please-sandbox/commit/f60e5cd4dfee2e2b8a4a9937e5e76b6220c90200))
* auto-sync dev manifest after main release ([7ad6505](https://github.com/amerinoo/Release-please-sandbox/commit/7ad6505092625502c595bec6bf4a3db3907ac843))


### Bug Fixes

* change to simple release-type for proper prerelease support ([007d6ab](https://github.com/amerinoo/Release-please-sandbox/commit/007d6ab730db01acebaeb55cdb5392ee25dad0ba))
* change versioning strategy to always-bump-patch for RC numbering ([3eb98ce](https://github.com/amerinoo/Release-please-sandbox/commit/3eb98ce4e5c0e9658ab0e5bbfdf0e0f10ac3c452))
* correct test file formatting ([d1414a1](https://github.com/amerinoo/Release-please-sandbox/commit/d1414a156c25c0b8e80bd9185b0e97310944ef9b))
* create RC.0 tag when syncing dev after release ([ba80821](https://github.com/amerinoo/Release-please-sandbox/commit/ba80821f41da5cd5b24186a9b9a73f9f0aba0fc7))
* ensure dev manifest always has RC prerelease for proper numbering ([0123615](https://github.com/amerinoo/Release-please-sandbox/commit/0123615d6259fecc5a463bc3219e63295c3ef410))
* improve test documentation ([a3c8a97](https://github.com/amerinoo/Release-please-sandbox/commit/a3c8a977b71bce92ef20d875269169473bd68a61))
* remove versioning strategy from prerelease config ([5e1419f](https://github.com/amerinoo/Release-please-sandbox/commit/5e1419ffcd5887e455e92030fc614aab4079616b))
* reset dev manifest to 1.1.0 after cleaning tags ([b1f1d26](https://github.com/amerinoo/Release-please-sandbox/commit/b1f1d26f66448783811be7bdce3db1d3f9e855f3))
* reset manifest to 1.0.0 to generate correct 1.1.0 release ([d11e063](https://github.com/amerinoo/Release-please-sandbox/commit/d11e063ea317b60e8d44b79d4e6a0374acd0d00f))
* revert to prerelease versioning strategy ([9bd95a0](https://github.com/amerinoo/Release-please-sandbox/commit/9bd95a0db804071fbaac9cd81f3922ccc87126e1))
* test RC iteration increment ([8f27b10](https://github.com/amerinoo/Release-please-sandbox/commit/8f27b10eb988badbc09ee824e13ff0707fb521a8))


### Miscellaneous Chores

* **dev:** release 1.1.0-RC.1 ([#7](https://github.com/amerinoo/Release-please-sandbox/issues/7)) ([cbc8bcf](https://github.com/amerinoo/Release-please-sandbox/commit/cbc8bcfe663ddfea11156023ba4f9482725c0311))
* restore manifest to 1.1.0 ([19850ac](https://github.com/amerinoo/Release-please-sandbox/commit/19850ac29f923eefb1dd1829c42bb6ec41c14b03))
* sync dev manifest with main release 1.1.0 ([946dba3](https://github.com/amerinoo/Release-please-sandbox/commit/946dba3b641531eb57eb2c3ea5c3e2c8324c81af))
* trigger release please with corrected config ([0169da1](https://github.com/amerinoo/Release-please-sandbox/commit/0169da1bcb07b397d45fd8709e4e342601af19d8))
* trigger release please workflow ([9b1c7b3](https://github.com/amerinoo/Release-please-sandbox/commit/9b1c7b36dcbe0918149abf20a9d64148481aa62c))


### Code Refactoring

* let release-please handle version bumping in dev ([1db6d8f](https://github.com/amerinoo/Release-please-sandbox/commit/1db6d8f909201c7bb03858565b58f708a8ecd1c9))

## [1.1.0-RC.1](https://github.com/amerinoo/Release-please-sandbox/compare/1.1.0-RC.0...1.1.0-RC.1) (2026-03-30)


### Bug Fixes

* change versioning strategy to always-bump-patch for RC numbering ([3eb98ce](https://github.com/amerinoo/Release-please-sandbox/commit/3eb98ce4e5c0e9658ab0e5bbfdf0e0f10ac3c452))
* ensure dev manifest always has RC prerelease for proper numbering ([0123615](https://github.com/amerinoo/Release-please-sandbox/commit/0123615d6259fecc5a463bc3219e63295c3ef410))
* improve test documentation ([a3c8a97](https://github.com/amerinoo/Release-please-sandbox/commit/a3c8a977b71bce92ef20d875269169473bd68a61))
* revert to prerelease versioning strategy ([9bd95a0](https://github.com/amerinoo/Release-please-sandbox/commit/9bd95a0db804071fbaac9cd81f3922ccc87126e1))


### Code Refactoring

* let release-please handle version bumping in dev ([1db6d8f](https://github.com/amerinoo/Release-please-sandbox/commit/1db6d8f909201c7bb03858565b58f708a8ecd1c9))

## [1.1.0](https://github.com/amerinoo/Release-please-sandbox/compare/1.0.0...1.1.0) (2026-03-30)


### Features

* add additional test for RC versioning ([00f6f31](https://github.com/amerinoo/Release-please-sandbox/commit/00f6f31d4a9bf562cd531ebd3f51cf261d718d7c))
* Add empty test method ([ce81ebb](https://github.com/amerinoo/Release-please-sandbox/commit/ce81ebb1a1e7fe49c5a12b98ea088ab98f70f052))
* add test file to trigger release please ([9212dd5](https://github.com/amerinoo/Release-please-sandbox/commit/9212dd5808b6921b6afd3773ae8d31fa72ce65f3))
* configure RC in uppercase and remove SNAPSHOT suffix ([ba602a2](https://github.com/amerinoo/Release-please-sandbox/commit/ba602a2fe957784bb2f828e731aa261a7d7d39fc))
* configure release please with dual branch strategy ([9982979](https://github.com/amerinoo/Release-please-sandbox/commit/9982979f3507f87290943d60aa6039ad2c8f5e57))
* set initial version to rc.0 for prerelease versioning ([a75319d](https://github.com/amerinoo/Release-please-sandbox/commit/a75319d75ebb089d8cc939fcfbdc92e72b5f8939))
* test RC versioning after first release ([239918c](https://github.com/amerinoo/Release-please-sandbox/commit/239918cea413661facca78be2d958c3c4094e7f6))
* test uppercase RC versioning ([c417261](https://github.com/amerinoo/Release-please-sandbox/commit/c417261df54a2c1943d7e1e5af47eda53f5b68de))
* use separate manifest for dev branch prereleases ([285233c](https://github.com/amerinoo/Release-please-sandbox/commit/285233c66dd222b0578233bda7115ee325545171))


### Bug Fixes

* add prerelease flag to config ([bcc7bdc](https://github.com/amerinoo/Release-please-sandbox/commit/bcc7bdc5d2eb7284c42a4c57ac24f5b59005df59))
* add skip-snapshot to remove SNAPSHOT suffix ([78c1377](https://github.com/amerinoo/Release-please-sandbox/commit/78c13779aeb63cd7c899745d77941b040926278a))
* add target-branch parameter to dev workflow ([fb305e6](https://github.com/amerinoo/Release-please-sandbox/commit/fb305e6667a587da521ddf80f91751882f0f2130))
* add versioning prerelease strategy for RC support ([5cc8096](https://github.com/amerinoo/Release-please-sandbox/commit/5cc809601fef5e1b14fefcd3db402902edf97031))
* change rc to RC in manifest ([57dc376](https://github.com/amerinoo/Release-please-sandbox/commit/57dc37679bc5e4345c1d29a0c1a215171ca015eb))
* Create a variable ([6748cd4](https://github.com/amerinoo/Release-please-sandbox/commit/6748cd460952214d2273a15996b9930a10a63e05))
* Create b variable ([a0bb3a1](https://github.com/amerinoo/Release-please-sandbox/commit/a0bb3a18c2c7c252b6d7cfabe10c0d464ea00be1))
* Move release please to workflows folder ([18dde6a](https://github.com/amerinoo/Release-please-sandbox/commit/18dde6af48cd2aed7801af35301972442ccc0d88))
* restore MY_RELEASE_PLEASE_TOKEN for PR creation permissions ([473753b](https://github.com/amerinoo/Release-please-sandbox/commit/473753bfae1bfe674aec5c8ed0e2c9d038adea37))
* separate config for main without prerelease ([0552c6d](https://github.com/amerinoo/Release-please-sandbox/commit/0552c6dd11c68b7a7c8e16159194330aaa7b5252))
* switch to simple release-type to support prerelease suffixes ([82a4457](https://github.com/amerinoo/Release-please-sandbox/commit/82a445706c02e0e116dd428bf99249feebd4ca2f))
* update workflows to use GITHUB_TOKEN instead of custom token ([e72f300](https://github.com/amerinoo/Release-please-sandbox/commit/e72f3000551d220f05a34d94a0a458d5079f4b4d))
* Variable a equals 1 ([2a1ff61](https://github.com/amerinoo/Release-please-sandbox/commit/2a1ff610799521f641a70285a152469dbcc3e47a))


### Miscellaneous Chores

* add initial CHANGELOG.md ([6e7793e](https://github.com/amerinoo/Release-please-sandbox/commit/6e7793e6332f5df4f5164a0c2017cbb4302b6f34))
* **dev:** release 1.0.0-rc.1 ([4b1ebcd](https://github.com/amerinoo/Release-please-sandbox/commit/4b1ebcd45ffec99144da44ee6436d0f82ea0c05b))
* **dev:** release 1.0.0-rc.1 ([96032a4](https://github.com/amerinoo/Release-please-sandbox/commit/96032a492de756baf07cac699d31dbc4ee062a64))
* **dev:** release 1.0.0-RC.2 ([244c967](https://github.com/amerinoo/Release-please-sandbox/commit/244c9673a439934939e376b7641027323c16f738))
* **dev:** release 1.0.0-RC.2 ([c00159b](https://github.com/amerinoo/Release-please-sandbox/commit/c00159b552aedd74afa639e0f7affb2c57bbef4c))
* **dev:** release 1.0.0-RC.3 ([#6](https://github.com/amerinoo/Release-please-sandbox/issues/6)) ([d2852b8](https://github.com/amerinoo/Release-please-sandbox/commit/d2852b8e5867cf97b35379d449083091c2a9c9c0))
* Initial commit ([2060832](https://github.com/amerinoo/Release-please-sandbox/commit/2060832581f659318f778015aacd41e9e2af987f))

## [1.0.0-RC.3](https://github.com/amerinoo/Release-please-sandbox/compare/1.0.0-RC.2...1.0.0-RC.3) (2026-03-30)


### Features

* test uppercase RC versioning ([c417261](https://github.com/amerinoo/Release-please-sandbox/commit/c417261df54a2c1943d7e1e5af47eda53f5b68de))

## [1.0.0-RC.2](https://github.com/amerinoo/Release-please-sandbox/compare/1.0.0-RC.1...1.0.0-RC.2) (2026-03-30)


### Features

* add additional test for RC versioning ([00f6f31](https://github.com/amerinoo/Release-please-sandbox/commit/00f6f31d4a9bf562cd531ebd3f51cf261d718d7c))
* Add empty test method ([ce81ebb](https://github.com/amerinoo/Release-please-sandbox/commit/ce81ebb1a1e7fe49c5a12b98ea088ab98f70f052))
* add test file to trigger release please ([9212dd5](https://github.com/amerinoo/Release-please-sandbox/commit/9212dd5808b6921b6afd3773ae8d31fa72ce65f3))
* configure RC in uppercase and remove SNAPSHOT suffix ([ba602a2](https://github.com/amerinoo/Release-please-sandbox/commit/ba602a2fe957784bb2f828e731aa261a7d7d39fc))
* configure release please with dual branch strategy ([9982979](https://github.com/amerinoo/Release-please-sandbox/commit/9982979f3507f87290943d60aa6039ad2c8f5e57))
* set initial version to rc.0 for prerelease versioning ([a75319d](https://github.com/amerinoo/Release-please-sandbox/commit/a75319d75ebb089d8cc939fcfbdc92e72b5f8939))
* test RC versioning after first release ([239918c](https://github.com/amerinoo/Release-please-sandbox/commit/239918cea413661facca78be2d958c3c4094e7f6))
* use separate manifest for dev branch prereleases ([285233c](https://github.com/amerinoo/Release-please-sandbox/commit/285233c66dd222b0578233bda7115ee325545171))


### Bug Fixes

* add prerelease flag to config ([bcc7bdc](https://github.com/amerinoo/Release-please-sandbox/commit/bcc7bdc5d2eb7284c42a4c57ac24f5b59005df59))
* add skip-snapshot to remove SNAPSHOT suffix ([78c1377](https://github.com/amerinoo/Release-please-sandbox/commit/78c13779aeb63cd7c899745d77941b040926278a))
* add target-branch parameter to dev workflow ([fb305e6](https://github.com/amerinoo/Release-please-sandbox/commit/fb305e6667a587da521ddf80f91751882f0f2130))
* add versioning prerelease strategy for RC support ([5cc8096](https://github.com/amerinoo/Release-please-sandbox/commit/5cc809601fef5e1b14fefcd3db402902edf97031))
* change rc to RC in manifest ([57dc376](https://github.com/amerinoo/Release-please-sandbox/commit/57dc37679bc5e4345c1d29a0c1a215171ca015eb))
* Create a variable ([6748cd4](https://github.com/amerinoo/Release-please-sandbox/commit/6748cd460952214d2273a15996b9930a10a63e05))
* Create b variable ([a0bb3a1](https://github.com/amerinoo/Release-please-sandbox/commit/a0bb3a18c2c7c252b6d7cfabe10c0d464ea00be1))
* Move release please to workflows folder ([18dde6a](https://github.com/amerinoo/Release-please-sandbox/commit/18dde6af48cd2aed7801af35301972442ccc0d88))
* restore MY_RELEASE_PLEASE_TOKEN for PR creation permissions ([473753b](https://github.com/amerinoo/Release-please-sandbox/commit/473753bfae1bfe674aec5c8ed0e2c9d038adea37))
* switch to simple release-type to support prerelease suffixes ([82a4457](https://github.com/amerinoo/Release-please-sandbox/commit/82a445706c02e0e116dd428bf99249feebd4ca2f))
* update workflows to use GITHUB_TOKEN instead of custom token ([e72f300](https://github.com/amerinoo/Release-please-sandbox/commit/e72f3000551d220f05a34d94a0a458d5079f4b4d))
* Variable a equals 1 ([2a1ff61](https://github.com/amerinoo/Release-please-sandbox/commit/2a1ff610799521f641a70285a152469dbcc3e47a))


### Miscellaneous Chores

* add initial CHANGELOG.md ([6e7793e](https://github.com/amerinoo/Release-please-sandbox/commit/6e7793e6332f5df4f5164a0c2017cbb4302b6f34))
* **dev:** release 1.0.0-rc.1 ([4b1ebcd](https://github.com/amerinoo/Release-please-sandbox/commit/4b1ebcd45ffec99144da44ee6436d0f82ea0c05b))
* **dev:** release 1.0.0-rc.1 ([96032a4](https://github.com/amerinoo/Release-please-sandbox/commit/96032a492de756baf07cac699d31dbc4ee062a64))
* Initial commit ([2060832](https://github.com/amerinoo/Release-please-sandbox/commit/2060832581f659318f778015aacd41e9e2af987f))

## [1.0.0-rc.1](https://github.com/amerinoo/Release-please-sandbox/compare/1.0.0-rc.0...1.0.0-rc.1) (2026-03-30)


### Features

* Add empty test method ([ce81ebb](https://github.com/amerinoo/Release-please-sandbox/commit/ce81ebb1a1e7fe49c5a12b98ea088ab98f70f052))
* add test file to trigger release please ([9212dd5](https://github.com/amerinoo/Release-please-sandbox/commit/9212dd5808b6921b6afd3773ae8d31fa72ce65f3))
* configure RC in uppercase and remove SNAPSHOT suffix ([ba602a2](https://github.com/amerinoo/Release-please-sandbox/commit/ba602a2fe957784bb2f828e731aa261a7d7d39fc))
* configure release please with dual branch strategy ([9982979](https://github.com/amerinoo/Release-please-sandbox/commit/9982979f3507f87290943d60aa6039ad2c8f5e57))
* set initial version to rc.0 for prerelease versioning ([a75319d](https://github.com/amerinoo/Release-please-sandbox/commit/a75319d75ebb089d8cc939fcfbdc92e72b5f8939))
* use separate manifest for dev branch prereleases ([285233c](https://github.com/amerinoo/Release-please-sandbox/commit/285233c66dd222b0578233bda7115ee325545171))


### Bug Fixes

* add target-branch parameter to dev workflow ([fb305e6](https://github.com/amerinoo/Release-please-sandbox/commit/fb305e6667a587da521ddf80f91751882f0f2130))
* add versioning prerelease strategy for RC support ([5cc8096](https://github.com/amerinoo/Release-please-sandbox/commit/5cc809601fef5e1b14fefcd3db402902edf97031))
* Create a variable ([6748cd4](https://github.com/amerinoo/Release-please-sandbox/commit/6748cd460952214d2273a15996b9930a10a63e05))
* Create b variable ([a0bb3a1](https://github.com/amerinoo/Release-please-sandbox/commit/a0bb3a18c2c7c252b6d7cfabe10c0d464ea00be1))
* Move release please to workflows folder ([18dde6a](https://github.com/amerinoo/Release-please-sandbox/commit/18dde6af48cd2aed7801af35301972442ccc0d88))
* restore MY_RELEASE_PLEASE_TOKEN for PR creation permissions ([473753b](https://github.com/amerinoo/Release-please-sandbox/commit/473753bfae1bfe674aec5c8ed0e2c9d038adea37))
* switch to simple release-type to support prerelease suffixes ([82a4457](https://github.com/amerinoo/Release-please-sandbox/commit/82a445706c02e0e116dd428bf99249feebd4ca2f))
* update workflows to use GITHUB_TOKEN instead of custom token ([e72f300](https://github.com/amerinoo/Release-please-sandbox/commit/e72f3000551d220f05a34d94a0a458d5079f4b4d))
* Variable a equals 1 ([2a1ff61](https://github.com/amerinoo/Release-please-sandbox/commit/2a1ff610799521f641a70285a152469dbcc3e47a))


### Miscellaneous Chores

* add initial CHANGELOG.md ([6e7793e](https://github.com/amerinoo/Release-please-sandbox/commit/6e7793e6332f5df4f5164a0c2017cbb4302b6f34))
* Initial commit ([2060832](https://github.com/amerinoo/Release-please-sandbox/commit/2060832581f659318f778015aacd41e9e2af987f))

## [1.0.0] - 2026-03-30

### Features

- Initial release of Release Please Sandbox
- Configure release please with dual branch strategy
- Add test file to trigger release please

### Bug Fixes

- Update workflows to use GITHUB_TOKEN instead of custom token

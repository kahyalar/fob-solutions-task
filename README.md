# FOB-Solutions' Task

# Prerequisites
* Maven
* Java
* Android Device

# Technology Stack
* Java
* Maven
* Appium
* JUnit

# TODOs

- [ ] Assertion messages will change hardcoded to functional one.
- [ ] Static wait method will replased with dynamic one.
- [ ] Variables should be static.
- [ ] Test cases class should be renamed - test class should have correct name that shows what feature test cases are inside that file.
- [ ] Assertion should be done within tests.
- [ ] APK file should be in tests resources.
- [ ] Constants will be rewriting according to POM Pattern.
- [ ] Test cases class should be renamed - test class should have correct name that shows what feature test cases are inside that file.
- [ ] Test method's code will rewrite according to POM Pattern.

# Scenarios

1-) isStudyInfoVisibleAfterRoleChanging
* User logins as 'Guest'
* Clicks to the menu button and check 'Study Info' is visible
* Goes to Settings Page and checks the title for Settings Page.
* Changes role to 'Local Student'
* Clicks again to the menu button
* 'Study Info' button should be visible

2-) isCheckedItemsStaysCheckedAfterRestart
* User logins as 'Local Student'
* Goes to Checklist Page and checks the title for Checklist Page.
* Clicks to first item on the list and make it checked
* Goes to Main Page and checks the title for Main Page.
* Comes back to Checklist Page and checks it's Checklist Page
* First item on the list should be still checked

3-) isCalendarRedirectsToEvent
* User logins as 'Local Student'
* User checks 'December 23rd' and related event is visible on page
* User goes to 'December' month
* Clicks to '23' on calendar
* 23rd of December's 'checked' value should be true and related event should be visible on page

# Usage
1. Clone the project and go to root folder which is pom.xml located
2. Install .apk to phone with `adb install /path/to/app.apk` command. APK file is located in `/src/main/resources/ttu.apk`
3. You can run all tests with `mvn test -Dudid=<<UDID_OF_ANDROID_DEVICE>>` command. UDID can be obtain with `adb devices` command
4. If you want to run a specific test method use `mvn test -Dudid=<<UDID_OF_ANDROID_DEVICE>> -Dtest="TestCases#<<TEST_METHOD_FROM_SCENARIOS>>"`
* Ex. `mvn test -Dudid=123456789 -Dtest="TestCases#isStudyInfoVisibleAfterRoleChanging"`

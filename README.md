
# react-native-drag-n-drop

## Getting started

`$ npm install react-native-drag-n-drop --save`

### Mostly automatic installation

`$ react-native link react-native-drag-n-drop`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-drag-n-drop` and add `RNDragNDrop.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNDragNDrop.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import co.buckets.modules.dnd.RNDragNDropPackage;` to the imports at the top of the file
  - Add `new RNDragNDropPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-drag-n-drop'
  	project(':react-native-drag-n-drop').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-drag-n-drop/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-drag-n-drop')
  	```


## Usage
```javascript
import RNDragNDrop from 'react-native-drag-n-drop';

// TODO: What to do with the module?
RNDragNDrop;
```
  
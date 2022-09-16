import 'react-native';
import renderer from 'react-test-renderer'
import React from 'react';
import AboutUsScreeen from '../screens/AboutUsScreen';

test('test about us screen', () => {
    const tree = renderer.create(<AboutUsScreeen />).toJSON();
    expect(tree).toMatchSnapshot();
  });
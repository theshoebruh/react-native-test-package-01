// This guard prevent this file to be compiled in the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
#import <React/RCTViewComponentView.h>
#import <UIKit/UIKit.h>

#ifndef TestPackage01ViewNativeComponent_h
#define TestPackage01ViewNativeComponent_h

NS_ASSUME_NONNULL_BEGIN

@interface TestPackage01View : RCTViewComponentView
@end

NS_ASSUME_NONNULL_END

#endif /* TestPackage01ViewNativeComponent_h */
#endif /* RCT_NEW_ARCH_ENABLED */

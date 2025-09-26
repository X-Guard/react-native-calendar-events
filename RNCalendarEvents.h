#if __has_include(<React/RCTBridgeModule.h>)
  #import <React/RCTBridgeModule.h>
#else
  #import "RCTBridgeModule.h"
#endif
#import <React/RCTEventDispatcher.h>

@interface RNCalendarEvents : NSObject <RCTBridgeModule>
#if __has_include(<React/RCTTurboModule.h>)
#import <React/RCTTurboModule.h>
@interface RNCalendarEvents () <RCTTurboModule>
#endif
@end

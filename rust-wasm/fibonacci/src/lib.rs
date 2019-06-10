extern crate wasm_bindgen;

use wasm_bindgen::prelude::*;

// When the `wee_alloc` feature is enabled, use `wee_alloc` as the global
// allocator.
#[cfg(feature = "wee_alloc")]
#[global_allocator]
static ALLOC: wee_alloc::WeeAlloc = wee_alloc::WeeAlloc::INIT;

#[wasm_bindgen]
pub fn fib(n: i32) -> i32 {
    let mut prev = 0;
    let mut next = 1;
    let mut result = 0;
    if n == 0 {
        return 0;
    }

    for _i in 2..=n {
        result = prev + next;
        prev = next;
        next = result;
    }
    return result;
}
// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from my_enum.djinni

#pragma once

#include <functional>

enum class MyEnum : int {
    OPTION1,
    OPTION2,
    OPTION3,
};

namespace std {

template <>
struct hash<::MyEnum> {
    size_t operator()(::MyEnum type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
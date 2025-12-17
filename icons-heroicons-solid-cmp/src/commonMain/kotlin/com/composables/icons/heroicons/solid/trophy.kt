package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.166f, 2.621f)
                verticalLineToRelative(0.858f)
                curveToRelative(-1.035f, 0.148f, -2.059f, 0.33f, -3.071f, 0.543f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.584f, 0.859f)
                arcToRelative(6.753f, 6.753f, 0f, false, false, 6.138f, 5.6f)
                arcToRelative(6.73f, 6.73f, 0f, false, false, 2.743f, 1.346f)
                arcTo(6.707f, 6.707f, 0f, false, true, 9.279f, 15f)
                horizontalLineTo(8.54f)
                curveToRelative(-1.036f, 0f, -1.875f, 0.84f, -1.875f, 1.875f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-2.625f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineToRelative(-0.739f)
                arcToRelative(6.706f, 6.706f, 0f, false, true, -1.112f, -3.173f)
                arcToRelative(6.73f, 6.73f, 0f, false, false, 2.743f, -1.347f)
                arcToRelative(6.753f, 6.753f, 0f, false, false, 6.139f, -5.6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.585f, -0.858f)
                arcToRelative(47.077f, 47.077f, 0f, false, false, -3.07f, -0.543f)
                verticalLineTo(2.62f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.658f, -0.744f)
                arcToRelative(49.22f, 49.22f, 0f, false, false, -6.093f, -0.377f)
                curveToRelative(-2.063f, 0f, -4.096f, 0.128f, -6.093f, 0.377f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.657f, 0.744f)
                close()
                moveToRelative(0f, 2.629f)
                curveToRelative(0f, 1.196f, 0.312f, 2.32f, 0.857f, 3.294f)
                arcTo(5.266f, 5.266f, 0f, false, true, 3.16f, 5.337f)
                arcToRelative(45.6f, 45.6f, 0f, false, true, 2.006f, -0.343f)
                verticalLineToRelative(0.256f)
                close()
                moveToRelative(13.5f, 0f)
                verticalLineToRelative(-0.256f)
                curveToRelative(0.674f, 0.1f, 1.343f, 0.214f, 2.006f, 0.343f)
                arcToRelative(5.265f, 5.265f, 0f, false, true, -2.863f, 3.207f)
                arcToRelative(6.72f, 6.72f, 0f, false, false, 0.857f, -3.294f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null


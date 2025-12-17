package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.H3: ImageVector
    get() {
        if (_H3 != null) return _H3!!
        
        _H3 = ImageVector.Builder(
            name = "h3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.749f, 3.743f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(15.002f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                horizontalLineTo(2.997f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.494f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.5f, 0f)
                verticalLineToRelative(6.75f)
                horizontalLineTo(12f)
                verticalLineToRelative(-6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(18.75f, 10.5f)
                curveToRelative(-0.727f, 0f, -1.441f, 0.055f, -2.139f, 0.16f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.223f, -1.483f)
                arcToRelative(15.87f, 15.87f, 0f, false, true, 3.82f, -0.11f)
                curveToRelative(0.95f, 0.088f, 1.926f, 0.705f, 2.168f, 1.794f)
                arcToRelative(5.265f, 5.265f, 0f, false, true, -0.579f, 3.765f)
                arcToRelative(5.265f, 5.265f, 0f, false, true, 0.578f, 3.765f)
                curveToRelative(-0.24f, 1.088f, -1.216f, 1.706f, -2.167f, 1.793f)
                arcToRelative(15.942f, 15.942f, 0f, false, true, -3.82f, -0.109f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.223f, -1.483f)
                arcToRelative(14.366f, 14.366f, 0f, false, false, 3.46f, 0.099f)
                curveToRelative(0.467f, -0.043f, 0.773f, -0.322f, 0.84f, -0.624f)
                arcToRelative(3.768f, 3.768f, 0f, false, false, -0.413f, -2.691f)
                horizontalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.498f)
                arcToRelative(3.768f, 3.768f, 0f, false, false, 0.413f, -2.69f)
                curveToRelative(-0.067f, -0.303f, -0.373f, -0.582f, -0.84f, -0.625f)
                curveToRelative(-0.435f, -0.04f, -0.876f, -0.06f, -1.321f, -0.06f)
                close()
            }
        }.build()
        
        return _H3!!
    }

private var _H3: ImageVector? = null


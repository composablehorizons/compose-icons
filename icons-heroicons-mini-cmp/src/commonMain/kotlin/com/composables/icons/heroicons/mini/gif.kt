package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 3f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 5.25f)
                verticalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.75f, 17f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 14.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveToRelative(4.026f, 2.879f)
                curveTo(5.356f, 7.65f, 5.72f, 7.5f, 6f, 7.5f)
                reflectiveCurveToRelative(0.643f, 0.15f, 0.974f, 0.629f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.234f, -0.854f)
                curveTo(7.66f, 6.484f, 6.873f, 6f, 6f, 6f)
                curveToRelative(-0.873f, 0f, -1.66f, 0.484f, -2.208f, 1.275f)
                curveTo(3.25f, 8.059f, 3f, 9.048f, 3f, 10f)
                curveToRelative(0f, 0.952f, 0.25f, 1.941f, 0.792f, 2.725f)
                curveTo(4.34f, 13.516f, 5.127f, 14f, 6f, 14f)
                curveToRelative(0.873f, 0f, 1.66f, -0.484f, 2.208f, -1.275f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.133f, -0.427f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(6.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.591f)
                verticalLineToRelative(1.295f)
                curveToRelative(-0.293f, 0.342f, -0.6f, 0.455f, -0.841f, 0.455f)
                curveToRelative(-0.279f, 0f, -0.643f, -0.15f, -0.974f, -0.629f)
                curveTo(4.69f, 11.386f, 4.5f, 10.711f, 4.5f, 10f)
                curveToRelative(0f, -0.711f, 0.19f, -1.386f, 0.526f, -1.871f)
                close()
                moveTo(10.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null


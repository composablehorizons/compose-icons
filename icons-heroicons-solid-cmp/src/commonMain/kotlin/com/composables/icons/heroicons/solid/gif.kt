package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-15f)
                close()
                moveToRelative(9f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-7.5f)
                close()
                moveToRelative(1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(6.636f, 9.78f)
                curveToRelative(0.404f, -0.575f, 0.867f, -0.78f, 1.25f, -0.78f)
                reflectiveCurveToRelative(0.846f, 0.205f, 1.25f, 0.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.228f, -0.863f)
                curveTo(9.738f, 8.027f, 8.853f, 7.5f, 7.886f, 7.5f)
                curveToRelative(-0.966f, 0f, -1.852f, 0.527f, -2.478f, 1.417f)
                curveToRelative(-0.62f, 0.882f, -0.908f, 2f, -0.908f, 3.083f)
                curveToRelative(0f, 1.083f, 0.288f, 2.201f, 0.909f, 3.083f)
                curveToRelative(0.625f, 0.89f, 1.51f, 1.417f, 2.477f, 1.417f)
                curveToRelative(0.967f, 0f, 1.852f, -0.527f, 2.478f, -1.417f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.136f, -0.431f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(9f)
                verticalLineToRelative(1.648f)
                curveToRelative(-0.37f, 0.44f, -0.774f, 0.602f, -1.114f, 0.602f)
                curveToRelative(-0.383f, 0f, -0.846f, -0.205f, -1.25f, -0.78f)
                curveTo(6.226f, 13.638f, 6f, 12.837f, 6f, 12f)
                curveToRelative(0f, -0.837f, 0.226f, -1.638f, 0.636f, -2.22f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null


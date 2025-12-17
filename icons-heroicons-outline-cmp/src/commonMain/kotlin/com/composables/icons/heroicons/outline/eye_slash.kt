package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) return _EyeSlash!!
        
        _EyeSlash = ImageVector.Builder(
            name = "eye-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.98f, 8.223f)
                arcTo(10.477f, 10.477f, 0f, false, false, 1.934f, 12f)
                curveTo(3.226f, 16.338f, 7.244f, 19.5f, 12f, 19.5f)
                curveToRelative(0.993f, 0f, 1.953f, -0.138f, 2.863f, -0.395f)
                moveTo(6.228f, 6.228f)
                arcTo(10.451f, 10.451f, 0f, false, true, 12f, 4.5f)
                curveToRelative(4.756f, 0f, 8.773f, 3.162f, 10.065f, 7.498f)
                arcToRelative(10.522f, 10.522f, 0f, false, true, -4.293f, 5.774f)
                moveTo(6.228f, 6.228f)
                lineTo(3f, 3f)
                moveToRelative(3.228f, 3.228f)
                lineToRelative(3.65f, 3.65f)
                moveToRelative(7.894f, 7.894f)
                lineTo(21f, 21f)
                moveToRelative(-3.228f, -3.228f)
                lineToRelative(-3.65f, -3.65f)
                moveToRelative(0f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -4.243f, -4.243f)
                moveToRelative(4.242f, 4.242f)
                lineTo(9.88f, 9.88f)
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null


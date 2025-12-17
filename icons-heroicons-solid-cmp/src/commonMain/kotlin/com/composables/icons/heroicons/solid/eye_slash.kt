package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.EyeSlash: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(18f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-18f, -18f)
                close()
                moveTo(22.676f, 12.553f)
                arcToRelative(11.249f, 11.249f, 0f, false, true, -2.631f, 4.31f)
                lineToRelative(-3.099f, -3.099f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -6.71f, -6.71f)
                lineTo(7.759f, 4.577f)
                arcToRelative(11.217f, 11.217f, 0f, false, true, 4.242f, -0.827f)
                curveToRelative(4.97f, 0f, 9.185f, 3.223f, 10.675f, 7.69f)
                curveToRelative(0.12f, 0.362f, 0.12f, 0.752f, 0f, 1.113f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 12f)
                curveToRelative(0f, 0.18f, -0.013f, 0.357f, -0.037f, 0.53f)
                lineToRelative(-4.244f, -4.243f)
                arcTo(3.75f, 3.75f, 0f, false, true, 15.75f, 12f)
                close()
                moveTo(12.53f, 15.713f)
                lineToRelative(-4.243f, -4.244f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 4.244f, 4.243f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.75f, 12f)
                curveToRelative(0f, -0.619f, 0.107f, -1.213f, 0.304f, -1.764f)
                lineToRelative(-3.1f, -3.1f)
                arcToRelative(11.25f, 11.25f, 0f, false, false, -2.63f, 4.31f)
                curveToRelative(-0.12f, 0.362f, -0.12f, 0.752f, 0f, 1.114f)
                curveToRelative(1.489f, 4.467f, 5.704f, 7.69f, 10.675f, 7.69f)
                curveToRelative(1.5f, 0f, 2.933f, -0.294f, 4.242f, -0.827f)
                lineToRelative(-2.477f, -2.477f)
                arcTo(5.25f, 5.25f, 0f, false, true, 6.75f, 12f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null


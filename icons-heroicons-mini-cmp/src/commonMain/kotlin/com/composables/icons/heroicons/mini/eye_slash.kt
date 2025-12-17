package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) return _EyeSlash!!
        
        _EyeSlash = ImageVector.Builder(
            name = "eye-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(14.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.745f, -1.745f)
                arcToRelative(10.029f, 10.029f, 0f, false, false, 3.3f, -4.38f)
                arcToRelative(1.651f, 1.651f, 0f, false, false, 0f, -1.185f)
                arcTo(10.004f, 10.004f, 0f, false, false, 9.999f, 3f)
                arcToRelative(9.956f, 9.956f, 0f, false, false, -4.744f, 1.194f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(7.752f, 6.69f)
                lineToRelative(1.092f, 1.092f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.374f, 3.373f)
                lineToRelative(1.091f, 1.092f)
                arcToRelative(4f, 4f, 0f, false, false, -5.557f, -5.557f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.748f, 13.93f)
                lineToRelative(2.523f, 2.523f)
                arcToRelative(9.987f, 9.987f, 0f, false, true, -3.27f, 0.547f)
                curveToRelative(-4.258f, 0f, -7.894f, -2.66f, -9.337f, -6.41f)
                arcToRelative(1.651f, 1.651f, 0f, false, true, 0f, -1.186f)
                arcTo(10.007f, 10.007f, 0f, false, true, 2.839f, 6.02f)
                lineTo(6.07f, 9.252f)
                arcToRelative(4f, 4f, 0f, false, false, 4.678f, 4.678f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null


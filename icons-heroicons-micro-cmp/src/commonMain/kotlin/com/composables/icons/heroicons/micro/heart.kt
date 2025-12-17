package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6.342f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 6f, -2.088f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 5.997f, 2.26f)
                curveToRelative(-0.063f, 2.134f, -1.618f, 3.76f, -2.955f, 4.784f)
                arcToRelative(14.437f, 14.437f, 0f, false, true, -2.676f, 1.61f)
                curveToRelative(-0.02f, 0.01f, -0.038f, 0.017f, -0.05f, 0.022f)
                lineToRelative(-0.014f, 0.006f)
                lineToRelative(-0.004f, 0.002f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.592f, 0.001f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.004f, -0.003f)
                lineToRelative(-0.015f, -0.006f)
                arcToRelative(5.528f, 5.528f, 0f, false, true, -0.232f, -0.107f)
                arcToRelative(14.395f, 14.395f, 0f, false, true, -2.535f, -1.557f)
                curveTo(3.564f, 10.22f, 1.999f, 8.558f, 1.999f, 6.38f)
                lineTo(2f, 6.342f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null


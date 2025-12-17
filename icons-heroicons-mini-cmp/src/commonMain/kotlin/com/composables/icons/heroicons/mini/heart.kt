package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.653f, 16.915f)
                lineToRelative(-0.005f, -0.003f)
                lineToRelative(-0.019f, -0.01f)
                arcToRelative(20.759f, 20.759f, 0f, false, true, -1.162f, -0.682f)
                arcToRelative(22.045f, 22.045f, 0f, false, true, -2.582f, -1.9f)
                curveTo(4.045f, 12.733f, 2f, 10.352f, 2f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 8f, -2.828f)
                arcTo(4.5f, 4.5f, 0f, false, true, 18f, 7.5f)
                curveToRelative(0f, 2.852f, -2.044f, 5.233f, -3.885f, 6.82f)
                arcToRelative(22.049f, 22.049f, 0f, false, true, -3.744f, 2.582f)
                lineToRelative(-0.019f, 0.01f)
                lineToRelative(-0.005f, 0.003f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.739f, 0.739f, 0f, false, true, -0.69f, 0.001f)
                lineToRelative(-0.002f, -0.001f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null


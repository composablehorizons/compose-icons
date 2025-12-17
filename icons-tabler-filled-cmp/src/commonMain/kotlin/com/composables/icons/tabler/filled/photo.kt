package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Photo: ImageVector
    get() {
        if (_Photo != null) return _Photo!!
        
        _Photo = ImageVector.Builder(
            name = "photo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.813f, 11.612f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(4.986f, 4.986f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(0.292f, -0.293f)
                lineToRelative(0.106f, -0.095f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(4.674f, 4.675f)
                arcToRelative(4f, 4f, 0f, false, true, -3.775f, 3.599f)
                lineToRelative(-0.206f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, -3.98f, -3.603f)
                lineToRelative(6.687f, -6.69f)
                lineToRelative(0.106f, -0.095f)
                close()
                moveToRelative(9.187f, -9.612f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(9.585f)
                lineToRelative(-3.293f, -3.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-0.307f, 0.306f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-5.307f, 5.306f)
                verticalLineToRelative(-9.585f)
                arcToRelative(4f, 4f, 0f, false, true, 3.8f, -3.995f)
                lineToRelative(0.2f, -0.005f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-2.99f, 5f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()
        
        return _Photo!!
    }

private var _Photo: ImageVector? = null


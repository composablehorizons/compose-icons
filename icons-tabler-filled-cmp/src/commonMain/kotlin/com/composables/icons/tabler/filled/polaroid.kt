package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Polaroid: ImageVector
    get() {
        if (_Polaroid != null) return _Polaroid!!
        
        _Polaroid = ImageVector.Builder(
            name = "polaroid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.199f, 9.623f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(3.986f, 3.986f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.292f, -0.293f)
                lineToRelative(1.292f, -1.293f)
                lineToRelative(0.106f, -0.095f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(4.502f, 4.503f)
                arcToRelative(4.003f, 4.003f, 0f, false, true, -3.596f, 2.77f)
                lineToRelative(-0.213f, 0.006f)
                horizontalLineToRelative(-12f)
                arcToRelative(4.002f, 4.002f, 0f, false, true, -3.809f, -2.775f)
                lineToRelative(5.516f, -5.518f)
                lineToRelative(0.106f, -0.095f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                close()
                moveToRelative(8.801f, -7.623f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(6.585f)
                lineToRelative(-3.293f, -3.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-1.307f, 1.306f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-4.307f, 4.306f)
                verticalLineToRelative(-6.585f)
                arcToRelative(4f, 4f, 0f, false, true, 3.8f, -3.995f)
                lineToRelative(0.2f, -0.005f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-2.99f, 3f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.01f, 20f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.127f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.01f, 20f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.127f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.01f, 20f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.127f, -0.007f)
                close()
            }
        }.build()
        
        return _Polaroid!!
    }

private var _Polaroid: ImageVector? = null


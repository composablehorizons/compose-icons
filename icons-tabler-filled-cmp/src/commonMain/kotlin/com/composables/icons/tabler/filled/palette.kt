package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.498f, 0f, 10f, 4.002f, 10f, 9f)
                curveToRelative(0f, 1.351f, -0.6f, 2.64f, -1.654f, 3.576f)
                curveToRelative(-1.03f, 0.914f, -2.412f, 1.424f, -3.846f, 1.424f)
                horizontalLineToRelative(-2.516f)
                arcToRelative(1f, 1f, 0f, false, false, -0.5f, 1.875f)
                arcToRelative(1f, 1f, 0f, false, true, 0.194f, 0.14f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -1.597f, 3.99f)
                lineToRelative(-0.156f, -0.009f)
                lineToRelative(0.068f, 0.004f)
                lineToRelative(-0.273f, -0.004f)
                curveToRelative(-5.3f, -0.146f, -9.57f, -4.416f, -9.716f, -9.716f)
                lineToRelative(-0.004f, -0.28f)
                curveToRelative(0f, -5.523f, 4.477f, -10f, 10f, -10f)
                moveToRelative(-3.5f, 6.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                moveToRelative(8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                moveToRelative(-4f, -3f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null


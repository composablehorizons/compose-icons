package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Microwave: ImageVector
    get() {
        if (_Microwave != null) return _Microwave!!
        
        _Microwave = ImageVector.Builder(
            name = "microwave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-16f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveToRelative(-6f, 2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                close()
                moveToRelative(4.01f, 7f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.945f, 9.668f)
                curveToRelative(1.336f, -0.891f, 2.274f, -0.891f, 3.61f, 0f)
                lineToRelative(-0.089f, -0.056f)
                lineToRelative(0.04f, 0.017f)
                lineToRelative(0.146f, 0.064f)
                lineToRelative(0.095f, 0.044f)
                curveToRelative(0.378f, 0.171f, 0.533f, 0.23f, 0.674f, 0.255f)
                curveToRelative(0.133f, 0.023f, 0.186f, 0.005f, 0.336f, -0.16f)
                arcToRelative(1f, 1f, 0f, true, true, 1.486f, 1.337f)
                curveToRelative(-0.613f, 0.681f, -1.358f, 0.934f, -2.164f, 0.794f)
                curveToRelative(-0.368f, -0.064f, -0.621f, -0.161f, -1.158f, -0.405f)
                arcToRelative(10f, 10f, 0f, false, false, -0.306f, -0.135f)
                lineToRelative(-0.17f, -0.091f)
                curveToRelative(-0.664f, -0.443f, -0.726f, -0.443f, -1.39f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -1.11f, -1.664f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.945f, 12.668f)
                curveToRelative(1.336f, -0.891f, 2.274f, -0.891f, 3.61f, 0f)
                lineToRelative(-0.089f, -0.056f)
                lineToRelative(0.04f, 0.017f)
                lineToRelative(0.146f, 0.064f)
                lineToRelative(0.095f, 0.044f)
                curveToRelative(0.378f, 0.171f, 0.533f, 0.23f, 0.674f, 0.255f)
                curveToRelative(0.133f, 0.023f, 0.186f, 0.005f, 0.336f, -0.16f)
                arcToRelative(1f, 1f, 0f, false, true, 1.486f, 1.337f)
                curveToRelative(-0.613f, 0.681f, -1.358f, 0.934f, -2.164f, 0.794f)
                curveToRelative(-0.368f, -0.064f, -0.621f, -0.161f, -1.158f, -0.405f)
                arcToRelative(10f, 10f, 0f, false, false, -0.306f, -0.135f)
                lineToRelative(-0.17f, -0.091f)
                curveToRelative(-0.664f, -0.443f, -0.726f, -0.443f, -1.39f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -1.11f, -1.664f)
            }
        }.build()
        
        return _Microwave!!
    }

private var _Microwave: ImageVector? = null


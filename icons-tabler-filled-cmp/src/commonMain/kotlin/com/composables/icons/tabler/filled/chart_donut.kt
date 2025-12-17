package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartDonut: ImageVector
    get() {
        if (_ChartDonut != null) return _ChartDonut!!
        
        _ChartDonut = ImageVector.Builder(
            name = "chart-donut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.292f, 2.61f)
                curveToRelative(0.396f, 0.318f, 0.65f, 0.78f, 0.703f, 1.286f)
                lineToRelative(0.005f, 0.104f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.748f, 0.968f)
                arcToRelative(3.1f, 3.1f, 0f, true, false, 3.78f, 3.78f)
                arcToRelative(1f, 1f, 0f, false, true, 0.968f, -0.748f)
                horizontalLineToRelative(3.8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.026f, 0.226f)
                arcToRelative(10f, 10f, 0f, true, true, -12f, -12f)
                lineToRelative(0.057f, -0.01f)
                lineToRelative(0.052f, -0.01f)
                arcToRelative(1.9f, 1.9f, 0f, false, true, 1.409f, 0.404f)
                moveToRelative(3.703f, -0.11f)
                lineToRelative(0.045f, 0.002f)
                lineToRelative(0.067f, 0.004f)
                lineToRelative(0.081f, 0.014f)
                lineToRelative(0.032f, 0.004f)
                lineToRelative(0.072f, 0.022f)
                lineToRelative(0.04f, 0.01f)
                arcToRelative(10f, 10f, 0f, false, true, 6.003f, 5.818f)
                lineToRelative(0.108f, 0.294f)
                arcToRelative(1f, 1f, 0f, false, true, -0.943f, 1.332f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.76f, -0.35f)
                arcToRelative(8f, 8f, 0f, false, false, -0.89f, -0.89f)
                arcToRelative(1f, 1f, 0f, false, true, -0.35f, -0.76f)
                verticalLineToRelative(-4.5f)
                quadToRelative(0.001f, -0.119f, 0.026f, -0.23f)
                lineToRelative(0.03f, -0.102f)
                arcToRelative(1f, 1f, 0f, false, true, 0.168f, -0.299f)
                lineToRelative(0.03f, -0.033f)
                lineToRelative(0.039f, -0.043f)
                arcToRelative(1f, 1f, 0f, false, true, 0.089f, -0.08f)
                lineToRelative(0.051f, -0.034f)
                lineToRelative(0.03f, -0.023f)
                lineToRelative(0.045f, -0.025f)
                lineToRelative(0.052f, -0.03f)
                arcToRelative(1f, 1f, 0f, false, true, 0.435f, -0.101f)
            }
        }.build()
        
        return _ChartDonut!!
    }

private var _ChartDonut: ImageVector? = null


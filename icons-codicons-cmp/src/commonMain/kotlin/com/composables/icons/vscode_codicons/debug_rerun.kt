package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugRerun: ImageVector
    get() {
        if (_DebugRerun != null) return _DebugRerun!!
        
        _DebugRerun = ImageVector.Builder(
            name = "debug-rerun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.001f, 8f)
                curveTo(14.001f, 8.542f, 13.708f, 9.043f, 13.236f, 9.308f)
                lineTo(7.977f, 12.266f)
                curveTo(7.958f, 11.911f, 7.892f, 11.563f, 7.79f, 11.224f)
                lineTo(12.745f, 8.437f)
                curveTo(12.903f, 8.348f, 13f, 8.181f, 13f, 8f)
                curveTo(13f, 7.819f, 12.902f, 7.652f, 12.745f, 7.563f)
                lineTo(4.745f, 3.063f)
                curveTo(4.67f, 3.021f, 4.587f, 3f, 4.5f, 3f)
                curveTo(4.224f, 3f, 4f, 3.225f, 4f, 3.5f)
                verticalLineTo(8.082f)
                curveTo(3.833f, 8.064f, 3.669f, 8.034f, 3.5f, 8.034f)
                curveTo(3.331f, 8.034f, 3.167f, 8.07f, 3f, 8.088f)
                verticalLineTo(3.5f)
                curveTo(3f, 2.673f, 3.673f, 2f, 4.5f, 2f)
                curveTo(4.756f, 2f, 5.01f, 2.066f, 5.234f, 2.191f)
                lineTo(13.235f, 6.692f)
                curveTo(13.707f, 6.957f, 14f, 7.459f, 14f, 8f)
                horizontalLineTo(14.001f)
                close()
                moveTo(3.5f, 9.034f)
                curveTo(2.578f, 9.034f, 1.692f, 9.389f, 1.025f, 10.025f)
                lineTo(1f, 10.051f)
                verticalLineTo(9.499f)
                curveTo(1f, 9.366f, 0.947f, 9.239f, 0.854f, 9.145f)
                curveTo(0.76f, 9.051f, 0.633f, 8.999f, 0.5f, 8.999f)
                curveTo(0.367f, 8.999f, 0.24f, 9.052f, 0.146f, 9.145f)
                curveTo(0.052f, 9.239f, 0f, 9.366f, 0f, 9.499f)
                verticalLineTo(11.499f)
                curveTo(0f, 11.632f, 0.053f, 11.759f, 0.146f, 11.853f)
                curveTo(0.24f, 11.947f, 0.367f, 11.999f, 0.5f, 11.999f)
                horizontalLineTo(2.5f)
                curveTo(2.633f, 11.999f, 2.76f, 11.946f, 2.854f, 11.853f)
                curveTo(2.948f, 11.759f, 3f, 11.632f, 3f, 11.499f)
                curveTo(3f, 11.366f, 2.947f, 11.239f, 2.854f, 11.145f)
                curveTo(2.76f, 11.051f, 2.633f, 10.999f, 2.5f, 10.999f)
                horizontalLineTo(1.5f)
                curveTo(1.571f, 10.905f, 1.648f, 10.815f, 1.732f, 10.732f)
                curveTo(2.208f, 10.277f, 2.842f, 10.024f, 3.5f, 10.024f)
                curveTo(4.158f, 10.024f, 4.792f, 10.278f, 5.268f, 10.732f)
                curveTo(5.5f, 10.964f, 5.684f, 11.24f, 5.81f, 11.543f)
                curveTo(5.936f, 11.846f, 6f, 12.172f, 6f, 12.5f)
                curveTo(6f, 12.828f, 5.935f, 13.154f, 5.81f, 13.457f)
                curveTo(5.684f, 13.76f, 5.5f, 14.036f, 5.268f, 14.268f)
                curveTo(4.791f, 14.722f, 4.158f, 14.976f, 3.5f, 14.976f)
                curveTo(2.842f, 14.976f, 2.208f, 14.722f, 1.732f, 14.268f)
                curveTo(1.638f, 14.177f, 1.511f, 14.127f, 1.38f, 14.128f)
                curveTo(1.249f, 14.129f, 1.123f, 14.182f, 1.031f, 14.274f)
                curveTo(0.938f, 14.367f, 0.886f, 14.492f, 0.885f, 14.623f)
                curveTo(0.884f, 14.754f, 0.934f, 14.88f, 1.025f, 14.975f)
                curveTo(1.681f, 15.631f, 2.572f, 16f, 3.5f, 16f)
                curveTo(4.428f, 16f, 5.319f, 15.631f, 5.975f, 14.975f)
                curveTo(6.631f, 14.319f, 7f, 13.428f, 7f, 12.5f)
                curveTo(7f, 11.572f, 6.631f, 10.681f, 5.975f, 10.025f)
                curveTo(5.308f, 9.389f, 4.422f, 9.034f, 3.5f, 9.034f)
                close()
            }
        }.build()
        
        return _DebugRerun!!
    }

private var _DebugRerun: ImageVector? = null


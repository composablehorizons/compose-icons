package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.EyeClosed: ImageVector
    get() {
        if (_EyeClosed != null) return _EyeClosed!!
        
        _EyeClosed = ImageVector.Builder(
            name = "eye-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.1196f, 10.8267f)
                lineTo(14.1464f, 14.8536f)
                curveTo(14.3417f, 15.0488f, 14.6583f, 15.0488f, 14.8536f, 14.8536f)
                curveTo(15.0488f, 14.6583f, 15.0488f, 14.3417f, 14.8536f, 14.1464f)
                lineTo(1.85355f, 1.14645f)
                curveTo(1.65829f, 0.951184f, 1.34171f, 0.951184f, 1.14645f, 1.14645f)
                curveTo(0.951184f, 1.34171f, 0.951184f, 1.65829f, 1.14645f, 1.85355f)
                lineTo(4.37624f, 5.08334f)
                curveTo(3.90117f, 5.4183f, 3.5126f, 5.80026f, 3.19877f, 6.18295f)
                curveTo(2.75443f, 6.72477f, 2.46154f, 7.26493f, 2.27931f, 7.66977f)
                curveTo(2.18795f, 7.87274f, 2.12369f, 8.04329f, 2.08166f, 8.1653f)
                curveTo(2.06063f, 8.22636f, 2.03453f, 8.31047f, 2.03453f, 8.31047f)
                lineTo(2.01687f, 8.37186f)
                curveTo(2.01687f, 8.37186f, 1.94098f, 8.86907f, 2.37202f, 8.9833f)
                curveTo(2.63879f, 9.05404f, 2.91251f, 8.8948f, 2.98346f, 8.62815f)
                lineTo(2.98444f, 8.62471f)
                lineTo(2.99179f, 8.5997f)
                curveTo(2.9989f, 8.57616f, 3.01051f, 8.53927f, 3.02715f, 8.49095f)
                curveTo(3.06047f, 8.39421f, 3.11375f, 8.25227f, 3.19119f, 8.08023f)
                curveTo(3.34655f, 7.73507f, 3.59627f, 7.27523f, 3.97201f, 6.81706f)
                curveTo(4.26363f, 6.46146f, 4.63213f, 6.10494f, 5.09595f, 5.80306f)
                lineTo(6.67356f, 7.38067f)
                curveTo(5.9688f, 7.82277f, 5.50024f, 8.60667f, 5.50024f, 9.5f)
                curveTo(5.50024f, 10.8807f, 6.61953f, 12f, 8.00024f, 12f)
                curveTo(8.89358f, 12f, 9.67747f, 11.5314f, 10.1196f, 10.8267f)
                close()
                moveTo(9.3807f, 10.0878f)
                curveTo(9.15205f, 10.6241f, 8.62005f, 11f, 8.00024f, 11f)
                curveTo(7.17182f, 11f, 6.50024f, 10.3284f, 6.50024f, 9.5f)
                curveTo(6.50024f, 8.88019f, 6.87616f, 8.34819f, 7.41244f, 8.11955f)
                lineTo(9.3807f, 10.0878f)
                close()
                moveTo(6.31962f, 4.19853f)
                lineTo(7.174f, 5.05291f)
                curveTo(7.43366f, 5.01852f, 7.70875f, 5f, 8.00017f, 5f)
                curveTo(10.0445f, 5f, 11.2857f, 5.9115f, 12.0283f, 6.81706f)
                curveTo(12.4041f, 7.27523f, 12.6538f, 7.73507f, 12.8091f, 8.08023f)
                curveTo(12.8866f, 8.25227f, 12.9399f, 8.39421f, 12.9732f, 8.49095f)
                curveTo(12.9898f, 8.53927f, 13.0014f, 8.57616f, 13.0085f, 8.5997f)
                lineTo(13.0159f, 8.62471f)
                lineTo(13.0169f, 8.62815f)
                lineTo(13.0172f, 8.62937f)
                curveTo(13.0885f, 8.89555f, 13.3618f, 9.05397f, 13.6283f, 8.9833f)
                curveTo(13.8952f, 8.91253f, 14.0542f, 8.63878f, 13.9835f, 8.37186f)
                lineTo(13.9832f, 8.37069f)
                lineTo(13.9827f, 8.36916f)
                lineTo(13.9816f, 8.365f)
                lineTo(13.9781f, 8.35236f)
                curveTo(13.9752f, 8.34204f, 13.9711f, 8.328f, 13.9658f, 8.31047f)
                curveTo(13.9552f, 8.27541f, 13.9397f, 8.22636f, 13.9187f, 8.1653f)
                curveTo(13.8766f, 8.04329f, 13.8124f, 7.87274f, 13.721f, 7.66977f)
                curveTo(13.5388f, 7.26493f, 13.2459f, 6.72477f, 12.8016f, 6.18295f)
                curveTo(11.904f, 5.0885f, 10.3952f, 4f, 8.00017f, 4f)
                curveTo(7.38264f, 4f, 6.82403f, 4.07236f, 6.31962f, 4.19853f)
                close()
            }
        }.build()
        
        return _EyeClosed!!
    }

private var _EyeClosed: ImageVector? = null


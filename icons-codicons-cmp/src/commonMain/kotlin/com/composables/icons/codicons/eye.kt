package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.98444f, 8.62471f)
                lineTo(2.98346f, 8.62815f)
                curveTo(2.91251f, 8.8948f, 2.63879f, 9.05404f, 2.37202f, 8.9833f)
                curveTo(1.94098f, 8.86907f, 2.01687f, 8.37186f, 2.01687f, 8.37186f)
                lineTo(2.03453f, 8.31047f)
                curveTo(2.03453f, 8.31047f, 2.06063f, 8.22636f, 2.08166f, 8.1653f)
                curveTo(2.12369f, 8.04329f, 2.18795f, 7.87274f, 2.27931f, 7.66977f)
                curveTo(2.46154f, 7.26493f, 2.75443f, 6.72477f, 3.19877f, 6.18295f)
                curveTo(4.09629f, 5.08851f, 5.60509f, 4f, 8.00017f, 4f)
                curveTo(10.3952f, 4f, 11.904f, 5.08851f, 12.8016f, 6.18295f)
                curveTo(13.2459f, 6.72477f, 13.5388f, 7.26493f, 13.721f, 7.66977f)
                curveTo(13.8124f, 7.87274f, 13.8766f, 8.04329f, 13.9187f, 8.1653f)
                curveTo(13.9397f, 8.22636f, 13.9552f, 8.27541f, 13.9658f, 8.31047f)
                curveTo(13.9711f, 8.328f, 13.9752f, 8.34204f, 13.9781f, 8.35236f)
                lineTo(13.9816f, 8.365f)
                lineTo(13.9827f, 8.36916f)
                lineTo(13.9832f, 8.37069f)
                lineTo(13.9835f, 8.37186f)
                curveTo(14.0542f, 8.63878f, 13.8952f, 8.91253f, 13.6283f, 8.9833f)
                curveTo(13.3618f, 9.05397f, 13.0885f, 8.89556f, 13.0172f, 8.62937f)
                lineTo(13.0169f, 8.62815f)
                lineTo(13.0159f, 8.62471f)
                lineTo(13.0085f, 8.5997f)
                curveTo(13.0014f, 8.57616f, 12.9898f, 8.53927f, 12.9732f, 8.49095f)
                curveTo(12.9399f, 8.39422f, 12.8866f, 8.25227f, 12.8091f, 8.08023f)
                curveTo(12.6538f, 7.73508f, 12.4041f, 7.27523f, 12.0283f, 6.81706f)
                curveTo(11.2857f, 5.9115f, 10.0445f, 5f, 8.00017f, 5f)
                curveTo(5.95584f, 5f, 4.71464f, 5.9115f, 3.97201f, 6.81706f)
                curveTo(3.59627f, 7.27523f, 3.34655f, 7.73508f, 3.19119f, 8.08023f)
                curveTo(3.11375f, 8.25227f, 3.06047f, 8.39422f, 3.02715f, 8.49095f)
                curveTo(3.01051f, 8.53927f, 2.9989f, 8.57616f, 2.99179f, 8.5997f)
                lineTo(2.98444f, 8.62471f)
                close()
                moveTo(8.00024f, 7f)
                curveTo(6.61953f, 7f, 5.50024f, 8.11929f, 5.50024f, 9.5f)
                curveTo(5.50024f, 10.8807f, 6.61953f, 12f, 8.00024f, 12f)
                curveTo(9.38096f, 12f, 10.5002f, 10.8807f, 10.5002f, 9.5f)
                curveTo(10.5002f, 8.11929f, 9.38096f, 7f, 8.00024f, 7f)
                close()
                moveTo(6.50024f, 9.5f)
                curveTo(6.50024f, 8.67157f, 7.17182f, 8f, 8.00024f, 8f)
                curveTo(8.82867f, 8f, 9.50024f, 8.67157f, 9.50024f, 9.5f)
                curveTo(9.50024f, 10.3284f, 8.82867f, 11f, 8.00024f, 11f)
                curveTo(7.17182f, 11f, 6.50024f, 10.3284f, 6.50024f, 9.5f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null


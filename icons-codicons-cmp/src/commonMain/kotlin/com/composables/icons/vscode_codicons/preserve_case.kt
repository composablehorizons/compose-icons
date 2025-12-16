package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PreserveCase: ImageVector
    get() {
        if (_PreserveCase != null) return _PreserveCase!!
        
        _PreserveCase = ImageVector.Builder(
            name = "preserve-case",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.02602f, 3.3418f)
                curveTo(4.16216f, 2.93404f, 4.8382f, 2.93397f, 4.97426f, 3.3418f)
                lineTo(6.97426f, 9.34277f)
                curveTo(6.97526f, 9.34677f, 6.97817f, 9.35547f, 6.97817f, 9.35547f)
                lineTo(7.97426f, 12.3428f)
                curveTo(8.06126f, 12.6048f, 7.91985f, 12.8876f, 7.65786f, 12.9756f)
                curveTo(7.60486f, 12.9926f, 7.55165f, 13.001f, 7.49965f, 13.001f)
                curveTo(7.29083f, 13.0008f, 7.09603f, 12.868f, 7.02602f, 12.6592f)
                lineTo(6.14028f, 10.001f)
                horizontalLineTo(2.86f)
                lineTo(1.97426f, 12.6592f)
                curveTo(1.88727f, 12.919f, 1.60632f, 13.0634f, 1.34243f, 12.9746f)
                curveTo(1.08043f, 12.8866f, 0.93902f, 12.6038f, 1.02602f, 12.3418f)
                lineTo(2.02211f, 9.35547f)
                curveTo(2.02311f, 9.35147f, 2.02602f, 9.34277f, 2.02602f, 9.34277f)
                lineTo(4.02602f, 3.3418f)
                close()
                moveTo(3.19399f, 9f)
                horizontalLineTo(5.80629f)
                lineTo(4.49965f, 5.08105f)
                lineTo(3.19399f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.4997f, 3f)
                curveTo(12.8777f, 3f, 13.9997f, 4.121f, 13.9997f, 5.5f)
                curveTo(13.9997f, 6.19496f, 13.7164f, 6.82435f, 13.2575f, 7.27734f)
                curveTo(14.2852f, 7.75346f, 14.9997f, 8.79421f, 14.9997f, 10f)
                curveTo(14.9997f, 11.654f, 13.6537f, 13f, 11.9997f, 13f)
                horizontalLineTo(9.49965f)
                curveTo(9.22381f, 12.9998f, 8.99965f, 12.7759f, 8.99965f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(8.99965f, 3.22411f, 9.22381f, 3.00018f, 9.49965f, 3f)
                horizontalLineTo(11.4997f)
                close()
                moveTo(9.99965f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(11.9997f)
                curveTo(13.1027f, 12f, 13.9997f, 11.103f, 13.9997f, 10f)
                curveTo(13.9997f, 8.897f, 13.1027f, 8f, 11.9997f, 8f)
                horizontalLineTo(9.99965f)
                close()
                moveTo(9.99965f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(11.4997f)
                curveTo(12.3267f, 7f, 12.9997f, 6.327f, 12.9997f, 5.5f)
                curveTo(12.9997f, 4.673f, 12.3267f, 4f, 11.4997f, 4f)
                horizontalLineTo(9.99965f)
                close()
            }
        }.build()
        
        return _PreserveCase!!
    }

private var _PreserveCase: ImageVector? = null


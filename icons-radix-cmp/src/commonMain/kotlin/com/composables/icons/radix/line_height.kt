package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LineHeight: ImageVector
    get() {
        if (_LineHeight != null) return _LineHeight!!
        
        _LineHeight = ImageVector.Builder(
            name = "line-height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.49984f, 2.09999f)
                curveTo(3.6058f, 2.10009f, 3.70812f, 2.14225f, 3.78305f, 2.21718f)
                lineTo(5.78305f, 4.21718f)
                lineTo(5.83383f, 4.28065f)
                curveTo(5.93587f, 4.43586f, 5.91954f, 4.64709f, 5.78305f, 4.78358f)
                curveTo(5.64655f, 4.92007f, 5.43531f, 4.93641f, 5.28012f, 4.83437f)
                lineTo(5.21664f, 4.78358f)
                lineTo(3.90023f, 3.46718f)
                verticalLineTo(11.5336f)
                lineTo(5.21664f, 10.2172f)
                curveTo(5.37285f, 10.061f, 5.62684f, 10.061f, 5.78305f, 10.2172f)
                curveTo(5.93888f, 10.3734f, 5.93913f, 10.6275f, 5.78305f, 10.7836f)
                lineTo(3.78305f, 12.7836f)
                curveTo(3.70812f, 12.8585f, 3.60579f, 12.9007f, 3.49984f, 12.9008f)
                curveTo(3.39393f, 12.9008f, 3.29162f, 12.8584f, 3.21664f, 12.7836f)
                lineTo(1.21664f, 10.7836f)
                lineTo(1.16586f, 10.7201f)
                curveTo(1.0635f, 10.5649f, 1.08002f, 10.3538f, 1.21664f, 10.2172f)
                curveTo(1.35326f, 10.0806f, 1.56433f, 10.064f, 1.71957f, 10.1664f)
                lineTo(1.78305f, 10.2172f)
                lineTo(3.09945f, 11.5336f)
                verticalLineTo(3.46718f)
                lineTo(1.78305f, 4.78358f)
                curveTo(1.62696f, 4.93966f, 1.37288f, 4.93941f, 1.21664f, 4.78358f)
                curveTo(1.06043f, 4.62738f, 1.06044f, 4.37339f, 1.21664f, 4.21718f)
                lineTo(3.21664f, 2.21718f)
                lineTo(3.27816f, 2.16737f)
                curveTo(3.34333f, 2.12402f, 3.42042f, 2.09999f, 3.49984f, 2.09999f)
                close()
                moveTo(14.4998f, 10.0004f)
                curveTo(14.776f, 10.0004f, 14.9998f, 10.2242f, 14.9998f, 10.5004f)
                curveTo(14.9996f, 10.7763f, 14.7759f, 11.0004f, 14.4998f, 11.0004f)
                horizontalLineTo(8.49984f)
                curveTo(8.22389f, 11.0003f, 8.00006f, 10.7763f, 7.99984f, 10.5004f)
                curveTo(7.99984f, 10.2243f, 8.22376f, 10.0004f, 8.49984f, 10.0004f)
                horizontalLineTo(14.4998f)
                close()
                moveTo(14.4998f, 7.00038f)
                curveTo(14.776f, 7.00038f, 14.9998f, 7.22424f, 14.9998f, 7.50038f)
                curveTo(14.9996f, 7.77634f, 14.7759f, 8.00038f, 14.4998f, 8.00038f)
                horizontalLineTo(8.49984f)
                curveTo(8.22389f, 8.00032f, 8.00006f, 7.7763f, 7.99984f, 7.50038f)
                curveTo(7.99984f, 7.22428f, 8.22376f, 7.00045f, 8.49984f, 7.00038f)
                horizontalLineTo(14.4998f)
                close()
                moveTo(14.4998f, 4.00038f)
                curveTo(14.776f, 4.00038f, 14.9998f, 4.22424f, 14.9998f, 4.50038f)
                curveTo(14.9996f, 4.77634f, 14.7759f, 5.00038f, 14.4998f, 5.00038f)
                horizontalLineTo(8.49984f)
                curveTo(8.22389f, 5.00032f, 8.00006f, 4.7763f, 7.99984f, 4.50038f)
                curveTo(7.99984f, 4.22428f, 8.22376f, 4.00045f, 8.49984f, 4.00038f)
                horizontalLineTo(14.4998f)
                close()
            }
        }.build()
        
        return _LineHeight!!
    }

private var _LineHeight: ImageVector? = null


package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignTop: ImageVector
    get() {
        if (_TextAlignTop != null) return _TextAlignTop!!
        
        _TextAlignTop = ImageVector.Builder(
            name = "text-align-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.49993f, 1.10001f)
                curveTo(3.60588f, 1.10011f, 3.70821f, 1.14227f, 3.78313f, 1.21719f)
                lineTo(5.78313f, 3.21719f)
                curveTo(5.93895f, 3.37344f, 5.93921f, 3.62752f, 5.78313f, 3.7836f)
                curveTo(5.62705f, 3.93968f, 5.37297f, 3.93942f, 5.21673f, 3.7836f)
                lineTo(3.90032f, 2.46719f)
                verticalLineTo(9.5004f)
                curveTo(3.90011f, 9.721f, 3.72053f, 9.90058f, 3.49993f, 9.90079f)
                curveTo(3.27915f, 9.90079f, 3.09975f, 9.72113f, 3.09954f, 9.5004f)
                verticalLineTo(2.46719f)
                lineTo(1.78313f, 3.7836f)
                lineTo(1.71966f, 3.83438f)
                curveTo(1.56456f, 3.93665f, 1.35336f, 3.91986f, 1.21673f, 3.7836f)
                curveTo(1.08013f, 3.647f, 1.06365f, 3.4359f, 1.16595f, 3.28067f)
                lineTo(1.21673f, 3.21719f)
                lineTo(3.21673f, 1.21719f)
                curveTo(3.29174f, 1.14218f, 3.39384f, 1.10001f, 3.49993f, 1.10001f)
                close()
                moveTo(14.4999f, 8.0004f)
                curveTo(14.7761f, 8.0004f, 14.9999f, 8.22425f, 14.9999f, 8.5004f)
                curveTo(14.9997f, 8.77636f, 14.7759f, 9.0004f, 14.4999f, 9.0004f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 9.00034f, 8.00014f, 8.77633f, 7.99993f, 8.5004f)
                curveTo(7.99993f, 8.22429f, 8.22383f, 8.00045f, 8.49993f, 8.0004f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(14.4999f, 5.0004f)
                curveTo(14.7761f, 5.0004f, 14.9999f, 5.22425f, 14.9999f, 5.5004f)
                curveTo(14.9997f, 5.77636f, 14.7759f, 6.0004f, 14.4999f, 6.0004f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 6.00034f, 8.00014f, 5.77633f, 7.99993f, 5.5004f)
                curveTo(7.99993f, 5.22429f, 8.22383f, 5.00045f, 8.49993f, 5.0004f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(14.4999f, 2.0004f)
                curveTo(14.7761f, 2.0004f, 14.9999f, 2.22425f, 14.9999f, 2.5004f)
                curveTo(14.9997f, 2.77636f, 14.7759f, 3.0004f, 14.4999f, 3.0004f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 3.00034f, 8.00014f, 2.77633f, 7.99993f, 2.5004f)
                curveTo(7.99993f, 2.22429f, 8.22383f, 2.00045f, 8.49993f, 2.0004f)
                horizontalLineTo(14.4999f)
                close()
            }
        }.build()
        
        return _TextAlignTop!!
    }

private var _TextAlignTop: ImageVector? = null


package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignBottom: ImageVector
    get() {
        if (_TextAlignBottom != null) return _TextAlignBottom!!
        
        _TextAlignBottom = ImageVector.Builder(
            name = "text-align-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.49993f, 13.9f)
                curveTo(3.60588f, 13.8999f, 3.70821f, 13.8577f, 3.78313f, 13.7828f)
                lineTo(5.78313f, 11.7828f)
                curveTo(5.93895f, 11.6266f, 5.93921f, 11.3725f, 5.78313f, 11.2164f)
                curveTo(5.62705f, 11.0603f, 5.37297f, 11.0606f, 5.21673f, 11.2164f)
                lineTo(3.90032f, 12.5328f)
                verticalLineTo(5.4996f)
                curveTo(3.90011f, 5.279f, 3.72053f, 5.09942f, 3.49993f, 5.09921f)
                curveTo(3.27915f, 5.09921f, 3.09975f, 5.27887f, 3.09954f, 5.4996f)
                verticalLineTo(12.5328f)
                lineTo(1.78313f, 11.2164f)
                lineTo(1.71966f, 11.1656f)
                curveTo(1.56456f, 11.0634f, 1.35336f, 11.0801f, 1.21673f, 11.2164f)
                curveTo(1.08013f, 11.353f, 1.06365f, 11.5641f, 1.16595f, 11.7193f)
                lineTo(1.21673f, 11.7828f)
                lineTo(3.21673f, 13.7828f)
                curveTo(3.29174f, 13.8578f, 3.39384f, 13.9f, 3.49993f, 13.9f)
                close()
                moveTo(14.4999f, 6.9996f)
                curveTo(14.7761f, 6.9996f, 14.9999f, 6.77575f, 14.9999f, 6.4996f)
                curveTo(14.9997f, 6.22364f, 14.7759f, 5.9996f, 14.4999f, 5.9996f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 5.99966f, 8.00014f, 6.22367f, 7.99993f, 6.4996f)
                curveTo(7.99993f, 6.77571f, 8.22383f, 6.99955f, 8.49993f, 6.9996f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(14.4999f, 9.9996f)
                curveTo(14.7761f, 9.9996f, 14.9999f, 9.77575f, 14.9999f, 9.4996f)
                curveTo(14.9997f, 9.22364f, 14.7759f, 8.9996f, 14.4999f, 8.9996f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 8.99966f, 8.00014f, 9.22367f, 7.99993f, 9.4996f)
                curveTo(7.99993f, 9.77571f, 8.22383f, 9.99955f, 8.49993f, 9.9996f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(14.4999f, 12.9996f)
                curveTo(14.7761f, 12.9996f, 14.9999f, 12.7757f, 14.9999f, 12.4996f)
                curveTo(14.9997f, 12.2236f, 14.7759f, 11.9996f, 14.4999f, 11.9996f)
                horizontalLineTo(8.49993f)
                curveTo(8.22396f, 11.9997f, 8.00014f, 12.2237f, 7.99993f, 12.4996f)
                curveTo(7.99993f, 12.7757f, 8.22383f, 12.9996f, 8.49993f, 12.9996f)
                horizontalLineTo(14.4999f)
                close()
            }
        }.build()
        
        return _TextAlignBottom!!
    }

private var _TextAlignBottom: ImageVector? = null


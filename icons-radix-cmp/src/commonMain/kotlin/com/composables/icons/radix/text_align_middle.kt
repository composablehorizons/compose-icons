package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignMiddle: ImageVector
    get() {
        if (_TextAlignMiddle != null) return _TextAlignMiddle!!
        
        _TextAlignMiddle = ImageVector.Builder(
            name = "text-align-middle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.49991f, 5.89999f)
                curveTo(3.60585f, 5.89989f, 3.70819f, 5.85773f, 3.78311f, 5.78281f)
                lineTo(5.78311f, 3.78281f)
                curveTo(5.93893f, 3.62656f, 5.93919f, 3.37248f, 5.78311f, 3.2164f)
                curveTo(5.62703f, 3.06032f, 5.37294f, 3.06058f, 5.2167f, 3.2164f)
                lineTo(3.9003f, 4.53281f)
                verticalLineTo(0.499603f)
                lineTo(3.89151f, 0.418549f)
                curveTo(3.85394f, 0.236784f, 3.69276f, 0.0993977f, 3.49991f, 0.0992126f)
                curveTo(3.27912f, 0.0992126f, 3.09973f, 0.278869f, 3.09952f, 0.499603f)
                verticalLineTo(4.53281f)
                lineTo(1.78311f, 3.2164f)
                lineTo(1.71963f, 3.16562f)
                curveTo(1.56454f, 3.06335f, 1.35334f, 3.08014f, 1.2167f, 3.2164f)
                curveTo(1.08011f, 3.353f, 1.06363f, 3.5641f, 1.16592f, 3.71933f)
                lineTo(1.2167f, 3.78281f)
                lineTo(3.2167f, 5.78281f)
                curveTo(3.29172f, 5.85782f, 3.39382f, 5.89999f, 3.49991f, 5.89999f)
                close()
                moveTo(14.4999f, 4.9996f)
                curveTo(14.776f, 4.9996f, 14.9999f, 4.77575f, 14.9999f, 4.4996f)
                curveTo(14.9997f, 4.22364f, 14.7759f, 3.9996f, 14.4999f, 3.9996f)
                horizontalLineTo(8.49991f)
                curveTo(8.22394f, 3.99966f, 8.00012f, 4.22367f, 7.99991f, 4.4996f)
                curveTo(7.99991f, 4.77571f, 8.22381f, 4.99955f, 8.49991f, 4.9996f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(14.4999f, 7.9996f)
                curveTo(14.776f, 7.9996f, 14.9999f, 7.77575f, 14.9999f, 7.4996f)
                curveTo(14.9997f, 7.22364f, 14.7759f, 6.9996f, 14.4999f, 6.9996f)
                horizontalLineTo(8.49991f)
                curveTo(8.22394f, 6.99966f, 8.00012f, 7.22367f, 7.99991f, 7.4996f)
                curveTo(7.99991f, 7.77571f, 8.22381f, 7.99955f, 8.49991f, 7.9996f)
                horizontalLineTo(14.4999f)
                close()
                moveTo(3.49991f, 14.9f)
                curveTo(3.69286f, 14.8998f, 3.85405f, 14.7626f, 3.89151f, 14.5807f)
                lineTo(3.9003f, 14.4996f)
                verticalLineTo(10.4664f)
                lineTo(5.2167f, 11.7828f)
                curveTo(5.37291f, 11.939f, 5.6269f, 11.939f, 5.78311f, 11.7828f)
                curveTo(5.93893f, 11.6266f, 5.93919f, 11.3725f, 5.78311f, 11.2164f)
                lineTo(3.78311f, 9.2164f)
                curveTo(3.70819f, 9.14148f, 3.60585f, 9.09932f, 3.49991f, 9.09921f)
                curveTo(3.394f, 9.09921f, 3.29168f, 9.14163f, 3.2167f, 9.2164f)
                lineTo(1.2167f, 11.2164f)
                lineTo(1.16592f, 11.2799f)
                curveTo(1.06356f, 11.4351f, 1.08008f, 11.6462f, 1.2167f, 11.7828f)
                curveTo(1.35333f, 11.9194f, 1.56439f, 11.936f, 1.71963f, 11.8336f)
                lineTo(1.78311f, 11.7828f)
                lineTo(3.09952f, 10.4664f)
                verticalLineTo(14.4996f)
                curveTo(3.09952f, 14.7205f, 3.27899f, 14.9f, 3.49991f, 14.9f)
                close()
                moveTo(14.4999f, 10.9996f)
                curveTo(14.776f, 10.9996f, 14.9999f, 10.7757f, 14.9999f, 10.4996f)
                curveTo(14.9997f, 10.2236f, 14.7759f, 9.9996f, 14.4999f, 9.9996f)
                horizontalLineTo(8.49991f)
                curveTo(8.22394f, 9.99966f, 8.00012f, 10.2237f, 7.99991f, 10.4996f)
                curveTo(7.99991f, 10.7757f, 8.22381f, 10.9996f, 8.49991f, 10.9996f)
                horizontalLineTo(14.4999f)
                close()
            }
        }.build()
        
        return _TextAlignMiddle!!
    }

private var _TextAlignMiddle: ImageVector? = null


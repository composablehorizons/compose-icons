package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LetterCaseUppercase: ImageVector
    get() {
        if (_LetterCaseUppercase != null) return _LetterCaseUppercase!!
        
        _LetterCaseUppercase = ImageVector.Builder(
            name = "letter-case-uppercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.01858f, 11.7432f)
                curveTo(0.92273f, 12.0019f, 0.634867f, 12.1337f, 0.375998f, 12.0381f)
                curveTo(0.117505f, 11.9421f, -0.0144397f, 11.6552f, 0.0810757f, 11.3965f)
                lineTo(1.01858f, 11.7432f)
                close()
                moveTo(7.16994f, 11.3965f)
                curveTo(7.26534f, 11.6553f, 7.13266f, 11.9423f, 6.87404f, 12.0381f)
                curveTo(6.61513f, 12.1337f, 6.32728f, 12.002f, 6.23147f, 11.7432f)
                lineTo(7.16994f, 11.3965f)
                close()
                moveTo(8.76467f, 11.7432f)
                curveTo(8.66879f, 12.002f, 8.38099f, 12.1338f, 8.12209f, 12.0381f)
                curveTo(7.86367f, 11.9421f, 7.73169f, 11.6552f, 7.82717f, 11.3965f)
                lineTo(8.76467f, 11.7432f)
                close()
                moveTo(14.916f, 11.3965f)
                curveTo(15.0115f, 11.6553f, 14.8789f, 11.9423f, 14.6201f, 12.0381f)
                curveTo(14.3612f, 12.1337f, 14.0733f, 12.002f, 13.9776f, 11.7432f)
                lineTo(14.916f, 11.3965f)
                close()
                moveTo(3.62502f, 2.75001f)
                curveTo(3.83403f, 2.75007f, 4.02107f, 2.88026f, 4.09377f, 3.07618f)
                lineTo(7.16994f, 11.3965f)
                lineTo(6.70022f, 11.5693f)
                lineTo(6.23147f, 11.7432f)
                lineTo(5.22365f, 9.01563f)
                horizontalLineTo(2.02639f)
                lineTo(1.01858f, 11.7432f)
                lineTo(0.549826f, 11.5693f)
                lineTo(0.0810757f, 11.3965f)
                lineTo(3.15627f, 3.07618f)
                lineTo(3.1885f, 3.00587f)
                curveTo(3.27579f, 2.84968f, 3.44214f, 2.75012f, 3.62502f, 2.75001f)
                close()
                moveTo(11.3711f, 2.75001f)
                curveTo(11.5802f, 2.75001f, 11.7671f, 2.88023f, 11.8399f, 3.07618f)
                lineTo(14.916f, 11.3965f)
                lineTo(14.4463f, 11.5693f)
                lineTo(13.9776f, 11.7432f)
                lineTo(12.9697f, 9.01563f)
                horizontalLineTo(9.77248f)
                lineTo(8.76467f, 11.7432f)
                lineTo(8.29592f, 11.5693f)
                lineTo(7.82717f, 11.3965f)
                lineTo(10.9024f, 3.07618f)
                lineTo(10.9346f, 3.00587f)
                curveTo(11.0219f, 2.84967f, 11.1883f, 2.75016f, 11.3711f, 2.75001f)
                close()
                moveTo(2.34084f, 8.16602f)
                horizontalLineTo(4.9092f)
                lineTo(3.62502f, 4.69141f)
                lineTo(2.34084f, 8.16602f)
                close()
                moveTo(10.0869f, 8.16602f)
                horizontalLineTo(12.6553f)
                lineTo(11.3711f, 4.69141f)
                lineTo(10.0869f, 8.16602f)
                close()
            }
        }.build()
        
        return _LetterCaseUppercase!!
    }

private var _LetterCaseUppercase: ImageVector? = null


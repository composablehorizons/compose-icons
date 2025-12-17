package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.WholeWord: ImageVector
    get() {
        if (_WholeWord != null) return _WholeWord!!
        
        _WholeWord = ImageVector.Builder(
            name = "whole-word",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 12.5f)
                curveTo(15.776f, 12.5f, 16f, 12.724f, 16f, 13f)
                verticalLineTo(13.5f)
                curveTo(16f, 14.327f, 15.327f, 15f, 14.5f, 15f)
                horizontalLineTo(1.5f)
                curveTo(0.673f, 15f, 0f, 14.327f, 0f, 13.5f)
                verticalLineTo(13f)
                curveTo(0f, 12.724f, 0.224f, 12.5f, 0.5f, 12.5f)
                curveTo(0.776f, 12.5f, 1f, 12.724f, 1f, 13f)
                verticalLineTo(13.5f)
                curveTo(1f, 13.775f, 1.224f, 14f, 1.5f, 14f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 14f, 15f, 13.775f, 15f, 13.5f)
                verticalLineTo(13f)
                curveTo(15f, 12.724f, 15.224f, 12.5f, 15.5f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.8584f, 5.6709f)
                curveTo(6.16516f, 5.73603f, 6.94308f, 6.48734f, 6.99707f, 7.69922f)
                lineTo(7f, 7.83594f)
                verticalLineTo(11.5107f)
                curveTo(6.996f, 11.7596f, 6.80919f, 11.9649f, 6.56836f, 11.998f)
                lineTo(6.5f, 12.0029f)
                curveTo(6.24709f, 12.0029f, 6.038f, 11.8152f, 6.00488f, 11.5713f)
                lineTo(6f, 11.5029f)
                verticalLineTo(11.4326f)
                curveTo(5.341f, 11.8096f, 4.73199f, 12.0029f, 4.16699f, 12.0029f)
                curveTo(2.941f, 12.0029f, 2f, 11.1399f, 2f, 9.83594f)
                curveTo(2.00003f, 8.68597f, 2.79247f, 7.83185f, 4.10645f, 7.67285f)
                curveTo(4.7283f, 7.59793f, 5.35918f, 7.64552f, 5.99902f, 7.81348f)
                curveTo(5.99202f, 7.07548f, 5.62762f, 6.70995f, 4.80762f, 6.66895f)
                curveTo(4.16686f, 6.637f, 3.7161f, 6.72717f, 3.45215f, 6.91211f)
                curveTo(3.22615f, 7.07111f, 2.91386f, 7.01604f, 2.75586f, 6.79004f)
                curveTo(2.5969f, 6.56404f, 2.65194f, 6.25174f, 2.87793f, 6.09375f)
                curveTo(3.31692f, 5.78579f, 3.91404f, 5.65006f, 4.66699f, 5.66406f)
                lineTo(4.8584f, 5.6709f)
                close()
                moveTo(5.79688f, 8.81836f)
                curveTo(5.25888f, 8.67037f, 4.73558f, 8.62843f, 4.22559f, 8.69043f)
                curveTo(3.40389f, 8.79054f, 2.99902f, 9.22747f, 2.99902f, 9.86035f)
                curveTo(2.99917f, 10.5911f, 3.47413f, 11.0273f, 4.16602f, 11.0273f)
                curveTo(4.62001f, 11.0273f, 5.17799f, 10.8168f, 5.83398f, 10.3848f)
                lineTo(5.99902f, 10.2725f)
                verticalLineTo(8.87891f)
                lineTo(5.79688f, 8.81836f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.55078f, 2.00586f)
                curveTo(9.78578f, 2.02986f, 9.97307f, 2.21715f, 9.99707f, 2.45215f)
                curveTo(10f, 2.46907f, 10f, 2.48601f, 10f, 2.50293f)
                verticalLineTo(6.60254f)
                curveTo(10.418f, 6.22566f, 10.9371f, 6.00293f, 11.5f, 6.00293f)
                curveTo(12.881f, 6.00293f, 14f, 7.34596f, 14f, 9.00293f)
                curveTo(14f, 10.6599f, 12.881f, 12.0029f, 11.5f, 12.0029f)
                curveTo(10.9371f, 12.0029f, 10.418f, 11.7802f, 10f, 11.4033f)
                verticalLineTo(11.5029f)
                curveTo(10f, 11.7619f, 9.80278f, 11.974f, 9.55078f, 12f)
                curveTo(9.53385f, 12.003f, 9.51693f, 12.0029f, 9.5f, 12.0029f)
                curveTo(9.224f, 12.0029f, 9f, 11.7789f, 9f, 11.5029f)
                verticalLineTo(2.50293f)
                curveTo(9f, 2.486f, 9.00095f, 2.46907f, 9.00293f, 2.45215f)
                curveTo(9.02793f, 2.20015f, 9.241f, 2.00293f, 9.5f, 2.00293f)
                curveTo(9.51692f, 2.00293f, 9.53386f, 2.00388f, 9.55078f, 2.00586f)
                close()
                moveTo(11.4355f, 7.00391f)
                curveTo(11.0307f, 7.03208f, 10.5769f, 7.31545f, 10.29f, 7.82227f)
                curveTo(10.1232f, 8.12611f, 10.018f, 8.49479f, 10.002f, 8.89453f)
                curveTo(9.99995f, 8.92952f, 10f, 8.96597f, 10f, 9.00195f)
                curveTo(10f, 9.03795f, 10.001f, 9.07438f, 10.002f, 9.10938f)
                curveTo(10.018f, 9.50814f, 10.1222f, 9.87582f, 10.2891f, 10.1797f)
                curveTo(10.576f, 10.6875f, 11.0307f, 10.9728f, 11.4355f, 11f)
                curveTo(11.4565f, 11.002f, 11.478f, 11.002f, 11.5f, 11.002f)
                curveTo(11.522f, 11.002f, 11.5435f, 11.001f, 11.5645f, 11f)
                curveTo(11.9693f, 10.9728f, 12.424f, 10.6875f, 12.7109f, 10.1797f)
                curveTo(12.8778f, 9.87582f, 12.982f, 9.50814f, 12.998f, 9.10938f)
                curveTo(13f, 9.07438f, 13f, 9.03795f, 13f, 9.00195f)
                curveTo(13f, 8.96597f, 12.999f, 8.92952f, 12.998f, 8.89453f)
                curveTo(12.982f, 8.49479f, 12.8768f, 8.12611f, 12.71f, 7.82227f)
                curveTo(12.4231f, 7.31545f, 11.9693f, 7.03109f, 11.5645f, 7.00391f)
                curveTo(11.5435f, 7.00191f, 11.522f, 7.00195f, 11.5f, 7.00195f)
                curveTo(11.478f, 7.00195f, 11.4565f, 7.00291f, 11.4355f, 7.00391f)
                close()
            }
        }.build()
        
        return _WholeWord!!
    }

private var _WholeWord: ImageVector? = null


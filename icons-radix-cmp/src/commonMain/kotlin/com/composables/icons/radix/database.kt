package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50098f, 1f)
                curveTo(8.92616f, 1.00005f, 10.2341f, 1.17101f, 11.2002f, 1.45801f)
                curveTo(11.6803f, 1.60065f, 12.1023f, 1.77911f, 12.4141f, 1.99805f)
                curveTo(12.7132f, 2.20815f, 13.0037f, 2.52435f, 13.0039f, 2.95312f)
                curveTo(13.0039f, 2.96153f, 13.0012f, 2.9702f, 13.001f, 2.97852f)
                curveTo(13.0013f, 2.98567f, 13.0039f, 2.99276f, 13.0039f, 3f)
                verticalLineTo(11.7324f)
                lineTo(12.9932f, 11.8867f)
                curveTo(12.9443f, 12.2389f, 12.7317f, 12.5363f, 12.4629f, 12.7695f)
                curveTo(12.1543f, 13.0371f, 11.7281f, 13.2615f, 11.2246f, 13.4424f)
                curveTo(10.2154f, 13.8049f, 8.87594f, 13.9999f, 7.50098f, 14f)
                curveTo(6.12589f, 14f, 4.78574f, 13.8049f, 3.77637f, 13.4424f)
                curveTo(3.27287f, 13.2615f, 2.84664f, 13.0371f, 2.53809f, 12.7695f)
                curveTo(2.26925f, 12.5364f, 2.05767f, 12.2389f, 2.00879f, 11.8867f)
                lineTo(1.99805f, 11.7324f)
                verticalLineTo(3f)
                curveTo(1.99805f, 2.99244f, 1.99963f, 2.98501f, 2f, 2.97754f)
                curveTo(1.9998f, 2.96955f, 1.99805f, 2.9612f, 1.99805f, 2.95312f)
                curveTo(1.99821f, 2.52441f, 2.28785f, 2.20815f, 2.58691f, 1.99805f)
                curveTo(2.8986f, 1.77923f, 3.32086f, 1.60059f, 3.80078f, 1.45801f)
                curveTo(4.76702f, 1.17103f, 6.07571f, 1f, 7.50098f, 1f)
                close()
                moveTo(12.0967f, 8.30078f)
                curveTo(11.8458f, 8.45474f, 11.5519f, 8.59139f, 11.2246f, 8.70898f)
                curveTo(10.2154f, 9.07155f, 8.87595f, 9.26752f, 7.50098f, 9.26758f)
                curveTo(6.12587f, 9.26758f, 4.78574f, 9.07155f, 3.77637f, 8.70898f)
                curveTo(3.4492f, 8.59142f, 3.15514f, 8.45468f, 2.9043f, 8.30078f)
                verticalLineTo(11.7324f)
                lineTo(2.91309f, 11.7891f)
                curveTo(2.93137f, 11.8568f, 2.98615f, 11.9568f, 3.13281f, 12.084f)
                curveTo(3.32691f, 12.2523f, 3.64001f, 12.4297f, 4.08301f, 12.5889f)
                curveTo(4.96749f, 12.9066f, 6.19793f, 13.0928f, 7.50098f, 13.0928f)
                curveTo(8.8039f, 13.0927f, 10.0336f, 12.9066f, 10.918f, 12.5889f)
                curveTo(11.361f, 12.4297f, 11.6741f, 12.2523f, 11.8682f, 12.084f)
                curveTo(12.0147f, 11.9568f, 12.0696f, 11.8567f, 12.0879f, 11.7891f)
                lineTo(12.0967f, 11.7324f)
                verticalLineTo(8.30078f)
                close()
                moveTo(12.0967f, 4.0957f)
                curveTo(11.837f, 4.23069f, 11.5333f, 4.34927f, 11.2002f, 4.44824f)
                curveTo(10.2341f, 4.73524f, 8.92616f, 4.9062f, 7.50098f, 4.90625f)
                curveTo(6.07561f, 4.90625f, 4.76704f, 4.73526f, 3.80078f, 4.44824f)
                curveTo(3.46798f, 4.34937f, 3.16389f, 4.23153f, 2.9043f, 4.09668f)
                verticalLineTo(7f)
                lineTo(2.91211f, 7.05664f)
                curveTo(2.93053f, 7.12435f, 2.98611f, 7.22433f, 3.13281f, 7.35156f)
                curveTo(3.32687f, 7.51979f, 3.64019f, 7.69634f, 4.08301f, 7.85547f)
                curveTo(4.96749f, 8.17317f, 6.19791f, 8.36035f, 7.50098f, 8.36035f)
                curveTo(8.80391f, 8.36029f, 10.0336f, 8.17316f, 10.918f, 7.85547f)
                curveTo(11.3608f, 7.69634f, 11.6741f, 7.5198f, 11.8682f, 7.35156f)
                curveTo(12.0146f, 7.22449f, 12.0696f, 7.12433f, 12.0879f, 7.05664f)
                lineTo(12.0967f, 7f)
                verticalLineTo(4.0957f)
                close()
                moveTo(7.50098f, 1.90625f)
                curveTo(6.13806f, 1.90625f, 4.92078f, 2.07141f, 4.05957f, 2.32715f)
                curveTo(3.62628f, 2.45586f, 3.30767f, 2.60037f, 3.1084f, 2.74023f)
                curveTo(3.01018f, 2.80923f, 2.9547f, 2.86778f, 2.92676f, 2.9082f)
                curveTo(2.91402f, 2.92674f, 2.90851f, 2.93984f, 2.90625f, 2.94629f)
                curveTo(2.90534f, 2.94896f, 2.90456f, 2.95121f, 2.9043f, 2.95215f)
                verticalLineTo(2.9541f)
                curveTo(2.90442f, 2.95483f, 2.90522f, 2.95695f, 2.90625f, 2.95996f)
                curveTo(2.90842f, 2.96626f, 2.9138f, 2.97916f, 2.92676f, 2.99805f)
                curveTo(2.95461f, 3.03848f, 3.00987f, 3.09681f, 3.1084f, 3.16602f)
                curveTo(3.30765f, 3.30595f, 3.62603f, 3.45031f, 4.05957f, 3.5791f)
                curveTo(4.92079f, 3.83487f, 6.13796f, 4f, 7.50098f, 4f)
                curveTo(8.86397f, 3.99995f, 10.0813f, 3.83491f, 10.9424f, 3.5791f)
                curveTo(11.3755f, 3.45037f, 11.6934f, 3.30586f, 11.8926f, 3.16602f)
                curveTo(11.9909f, 3.09689f, 12.0464f, 3.03844f, 12.0742f, 2.99805f)
                curveTo(12.087f, 2.97932f, 12.0926f, 2.96626f, 12.0947f, 2.95996f)
                curveTo(12.0957f, 2.95708f, 12.0966f, 2.95482f, 12.0967f, 2.9541f)
                verticalLineTo(2.95215f)
                curveTo(12.0964f, 2.95124f, 12.0957f, 2.94908f, 12.0947f, 2.94629f)
                curveTo(12.0925f, 2.93987f, 12.0871f, 2.92691f, 12.0742f, 2.9082f)
                curveTo(12.0463f, 2.86776f, 11.9911f, 2.8094f, 11.8926f, 2.74023f)
                curveTo(11.6934f, 2.60036f, 11.3756f, 2.45589f, 10.9424f, 2.32715f)
                curveTo(10.0813f, 2.07134f, 8.86397f, 1.9063f, 7.50098f, 1.90625f)
                close()
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null


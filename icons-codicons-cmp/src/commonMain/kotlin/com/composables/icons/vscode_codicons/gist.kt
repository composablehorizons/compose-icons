package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Gist: ImageVector
    get() {
        if (_Gist != null) return _Gist!!
        
        _Gist = ImageVector.Builder(
            name = "gist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.56f, 4.35f)
                lineTo(10.65f, 1.44f)
                curveTo(10.368f, 1.16009f, 9.98734f, 1.00208f, 9.59f, 1f)
                horizontalLineTo(6f)
                curveTo(5.47005f, 1.00158f, 4.96227f, 1.2128f, 4.58753f, 1.58753f)
                curveTo(4.2128f, 1.96227f, 4.00158f, 2.47005f, 4f, 3f)
                verticalLineTo(8.83f)
                curveTo(4.28129f, 8.9031f, 4.53721f, 9.05181f, 4.74f, 9.26f)
                curveTo(4.84688f, 9.3602f, 4.93494f, 9.47874f, 5f, 9.61f)
                verticalLineTo(3f)
                curveTo(5f, 2.73478f, 5.10536f, 2.48043f, 5.29289f, 2.29289f)
                curveTo(5.48043f, 2.10536f, 5.73478f, 2f, 6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(4.5f)
                curveTo(9f, 4.89782f, 9.15804f, 5.27936f, 9.43934f, 5.56066f)
                curveTo(9.72064f, 5.84196f, 10.1022f, 6f, 10.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 13.2652f, 12.8946f, 13.5196f, 12.7071f, 13.7071f)
                curveTo(12.5196f, 13.8946f, 12.2652f, 14f, 12f, 14f)
                horizontalLineTo(10.48f)
                lineTo(9.47f, 15f)
                horizontalLineTo(12f)
                curveTo(12.5299f, 14.9984f, 13.0377f, 14.7872f, 13.4125f, 14.4125f)
                curveTo(13.7872f, 14.0377f, 13.9984f, 13.5299f, 14f, 13f)
                verticalLineTo(5.41f)
                curveTo(13.9979f, 5.01266f, 13.8399f, 4.63202f, 13.56f, 4.35f)
                close()
                moveTo(10.5f, 5f)
                curveTo(10.3674f, 5f, 10.2402f, 4.94732f, 10.1464f, 4.85355f)
                curveTo(10.0527f, 4.75979f, 10f, 4.63261f, 10f, 4.5f)
                verticalLineTo(2.21f)
                lineTo(12.79f, 5f)
                horizontalLineTo(10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.47798f, 14.978f)
                curveTo(3.34548f, 14.9777f, 3.21852f, 14.9249f, 3.12498f, 14.831f)
                lineTo(1.14598f, 12.854f)
                curveTo(1.09942f, 12.8076f, 1.06247f, 12.7524f, 1.03727f, 12.6917f)
                curveTo(1.01206f, 12.6309f, 0.999084f, 12.5658f, 0.999084f, 12.5f)
                curveTo(0.999084f, 12.4343f, 1.01206f, 12.3691f, 1.03727f, 12.3084f)
                curveTo(1.06247f, 12.2476f, 1.09942f, 12.1925f, 1.14598f, 12.146f)
                lineTo(3.14598f, 10.146f)
                curveTo(3.23986f, 10.0521f, 3.3672f, 9.99939f, 3.49998f, 9.99939f)
                curveTo(3.63275f, 9.99939f, 3.76009f, 10.0521f, 3.85398f, 10.146f)
                curveTo(3.94787f, 10.2399f, 4.00061f, 10.3672f, 4.00061f, 10.5f)
                curveTo(4.00061f, 10.6328f, 3.94787f, 10.7601f, 3.85398f, 10.854f)
                lineTo(2.20698f, 12.5f)
                lineTo(3.83198f, 14.124f)
                curveTo(3.90209f, 14.194f, 3.94985f, 14.2831f, 3.96922f, 14.3802f)
                curveTo(3.98858f, 14.4773f, 3.97868f, 14.578f, 3.94076f, 14.6695f)
                curveTo(3.90284f, 14.761f, 3.83862f, 14.8391f, 3.75623f, 14.894f)
                curveTo(3.67384f, 14.949f, 3.577f, 14.9782f, 3.47798f, 14.978f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.52198f, 14.978f)
                curveTo(7.42296f, 14.9782f, 7.32611f, 14.949f, 7.24372f, 14.894f)
                curveTo(7.16134f, 14.8391f, 7.09711f, 14.761f, 7.05919f, 14.6695f)
                curveTo(7.02128f, 14.578f, 7.01137f, 14.4773f, 7.03074f, 14.3802f)
                curveTo(7.05011f, 14.2831f, 7.09787f, 14.194f, 7.16798f, 14.124f)
                lineTo(8.79298f, 12.5f)
                lineTo(7.14598f, 10.854f)
                curveTo(7.05209f, 10.7601f, 6.99935f, 10.6328f, 6.99935f, 10.5f)
                curveTo(6.99935f, 10.3672f, 7.05209f, 10.2399f, 7.14598f, 10.146f)
                curveTo(7.23986f, 10.0521f, 7.3672f, 9.99939f, 7.49998f, 9.99939f)
                curveTo(7.63275f, 9.99939f, 7.76009f, 10.0521f, 7.85398f, 10.146f)
                lineTo(9.85398f, 12.146f)
                curveTo(9.90054f, 12.1925f, 9.93748f, 12.2476f, 9.96269f, 12.3084f)
                curveTo(9.9879f, 12.3691f, 10.0009f, 12.4343f, 10.0009f, 12.5f)
                curveTo(10.0009f, 12.5658f, 9.9879f, 12.6309f, 9.96269f, 12.6917f)
                curveTo(9.93748f, 12.7524f, 9.90054f, 12.8076f, 9.85398f, 12.854f)
                lineTo(7.87498f, 14.831f)
                curveTo(7.78144f, 14.9249f, 7.65447f, 14.9777f, 7.52198f, 14.978f)
                close()
            }
        }.build()
        
        return _Gist!!
    }

private var _Gist: ImageVector? = null


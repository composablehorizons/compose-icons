package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Smiley: ImageVector
    get() {
        if (_Smiley != null) return _Smiley!!
        
        _Smiley = ImageVector.Builder(
            name = "smiley",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25f, 7.75f)
                curveTo(6.66421f, 7.75f, 7f, 7.41421f, 7f, 7f)
                curveTo(7f, 6.58579f, 6.66421f, 6.25f, 6.25f, 6.25f)
                curveTo(5.83579f, 6.25f, 5.5f, 6.58579f, 5.5f, 7f)
                curveTo(5.5f, 7.41421f, 5.83579f, 7.75f, 6.25f, 7.75f)
                close()
                moveTo(6.13646f, 9.66654f)
                curveTo(5.95229f, 9.46078f, 5.6362f, 9.44327f, 5.43043f, 9.62743f)
                curveTo(5.22467f, 9.8116f, 5.20716f, 10.1277f, 5.39132f, 10.3335f)
                curveTo(6.03148f, 11.0487f, 6.96337f, 11.5f, 8f, 11.5f)
                curveTo(9.03663f, 11.5f, 9.96851f, 11.0487f, 10.6087f, 10.3335f)
                curveTo(10.7928f, 10.1277f, 10.7753f, 9.8116f, 10.5696f, 9.62743f)
                curveTo(10.3638f, 9.44327f, 10.0477f, 9.46078f, 9.86353f, 9.66654f)
                curveTo(9.40505f, 10.1788f, 8.74037f, 10.5f, 8f, 10.5f)
                curveTo(7.25963f, 10.5f, 6.59494f, 10.1788f, 6.13646f, 9.66654f)
                close()
                moveTo(10.5f, 7f)
                curveTo(10.5f, 7.41421f, 10.1642f, 7.75f, 9.75f, 7.75f)
                curveTo(9.33579f, 7.75f, 9f, 7.41421f, 9f, 7f)
                curveTo(9f, 6.58579f, 9.33579f, 6.25f, 9.75f, 6.25f)
                curveTo(10.1642f, 6.25f, 10.5f, 6.58579f, 10.5f, 7f)
                close()
                moveTo(14f, 8f)
                curveTo(14f, 4.68629f, 11.3137f, 2f, 8f, 2f)
                curveTo(4.68629f, 2f, 2f, 4.68629f, 2f, 8f)
                curveTo(2f, 11.3137f, 4.68629f, 14f, 8f, 14f)
                curveTo(11.3137f, 14f, 14f, 11.3137f, 14f, 8f)
                close()
                moveTo(3f, 8f)
                curveTo(3f, 5.23858f, 5.23858f, 3f, 8f, 3f)
                curveTo(10.7614f, 3f, 13f, 5.23858f, 13f, 8f)
                curveTo(13f, 10.7614f, 10.7614f, 13f, 8f, 13f)
                curveTo(5.23858f, 13f, 3f, 10.7614f, 3f, 8f)
                close()
            }
        }.build()
        
        return _Smiley!!
    }

private var _Smiley: ImageVector? = null


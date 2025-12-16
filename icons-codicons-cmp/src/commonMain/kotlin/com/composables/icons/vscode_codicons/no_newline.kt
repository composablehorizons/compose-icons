package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.NoNewline: ImageVector
    get() {
        if (_NoNewline != null) return _NoNewline!!
        
        _NoNewline = ImageVector.Builder(
            name = "no-newline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.0013f, 3.49999f)
                verticalLineTo(6.20739f)
                curveTo(12.6787f, 6.11606f, 12.344f, 6.05344f, 12.0002f, 6.02244f)
                verticalLineTo(3.49899f)
                curveTo(12.0002f, 3.22299f, 12.2242f, 2.99899f, 12.5002f, 2.99899f)
                curveTo(12.7762f, 2.99899f, 13.0002f, 3.22299f, 13.0002f, 3.49899f)
                lineTo(13.0013f, 3.49999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.70825f, 8.99999f)
                horizontalLineTo(6.59971f)
                curveTo(6.78281f, 8.64182f, 7.00402f, 8.30637f, 7.25799f, 7.99899f)
                horizontalLineTo(2.70725f)
                lineTo(5.35325f, 5.35299f)
                curveTo(5.54825f, 5.15799f, 5.54825f, 4.84099f, 5.35325f, 4.64599f)
                curveTo(5.15825f, 4.45099f, 4.84125f, 4.45099f, 4.64625f, 4.64599f)
                lineTo(1.14625f, 8.14599f)
                curveTo(0.95125f, 8.34099f, 0.95125f, 8.65799f, 1.14625f, 8.85299f)
                lineTo(4.64625f, 12.353f)
                curveTo(4.74425f, 12.45f, 4.87225f, 12.499f, 5.00025f, 12.499f)
                curveTo(5.12825f, 12.499f, 5.25625f, 12.451f, 5.35425f, 12.353f)
                curveTo(5.54925f, 12.158f, 5.54925f, 11.841f, 5.35425f, 11.646f)
                lineTo(2.70825f, 8.99999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 11.5f)
                curveTo(7f, 13.9853f, 9.01472f, 16f, 11.5f, 16f)
                curveTo(13.9853f, 16f, 16f, 13.9853f, 16f, 11.5f)
                curveTo(16f, 9.01472f, 13.9853f, 7f, 11.5f, 7f)
                curveTo(9.01472f, 7f, 7f, 9.01472f, 7f, 11.5f)
                close()
                moveTo(8f, 11.5f)
                curveTo(8f, 12.2862f, 8.25919f, 13.0118f, 8.69679f, 13.5961f)
                lineTo(13.5961f, 8.69679f)
                curveTo(13.0118f, 8.25919f, 12.2862f, 8f, 11.5f, 8f)
                curveTo(9.567f, 8f, 8f, 9.567f, 8f, 11.5f)
                close()
                moveTo(11.5f, 15f)
                curveTo(10.7138f, 15f, 9.98818f, 14.7408f, 9.40389f, 14.3032f)
                lineTo(14.3032f, 9.40389f)
                curveTo(14.7408f, 9.98818f, 15f, 10.7138f, 15f, 11.5f)
                curveTo(15f, 13.433f, 13.433f, 15f, 11.5f, 15f)
                close()
            }
        }.build()
        
        return _NoNewline!!
    }

private var _NoNewline: ImageVector? = null


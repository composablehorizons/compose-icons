package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Newline: ImageVector
    get() {
        if (_Newline != null) return _Newline!!
        
        _Newline = ImageVector.Builder(
            name = "newline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.49999f)
                verticalLineTo(6.49999f)
                curveTo(14f, 7.87899f, 12.879f, 8.99999f, 11.5f, 8.99999f)
                horizontalLineTo(3.70703f)
                lineTo(6.35303f, 11.646f)
                curveTo(6.54803f, 11.841f, 6.54803f, 12.158f, 6.35303f, 12.353f)
                curveTo(6.25503f, 12.451f, 6.12703f, 12.499f, 5.99903f, 12.499f)
                curveTo(5.87103f, 12.499f, 5.74303f, 12.45f, 5.64503f, 12.353f)
                lineTo(2.14503f, 8.85299f)
                curveTo(1.95003f, 8.65799f, 1.95003f, 8.34099f, 2.14503f, 8.14599f)
                lineTo(5.64503f, 4.64599f)
                curveTo(5.84003f, 4.45099f, 6.15703f, 4.45099f, 6.35203f, 4.64599f)
                curveTo(6.54703f, 4.84099f, 6.54703f, 5.15799f, 6.35203f, 5.35299f)
                lineTo(3.70603f, 7.99899f)
                horizontalLineTo(11.499f)
                curveTo(12.326f, 7.99899f, 12.999f, 7.32599f, 12.999f, 6.49899f)
                verticalLineTo(3.49899f)
                curveTo(12.999f, 3.22299f, 13.223f, 2.99899f, 13.499f, 2.99899f)
                curveTo(13.775f, 2.99899f, 13.999f, 3.22299f, 13.999f, 3.49899f)
                lineTo(14f, 3.49999f)
                close()
            }
        }.build()
        
        return _Newline!!
    }

private var _Newline: ImageVector? = null


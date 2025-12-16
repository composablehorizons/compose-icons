package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ExclamationMark: ImageVector
    get() {
        if (_ExclamationMark != null) return _ExclamationMark!!
        
        _ExclamationMark = ImageVector.Builder(
            name = "exclamation-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49971f, 10.7503f)
                curveTo(7.91393f, 10.7503f, 8.24971f, 11.086f, 8.24971f, 11.5003f)
                curveTo(8.24955f, 11.9143f, 7.91383f, 12.2503f, 7.49971f, 12.2503f)
                curveTo(7.08572f, 12.2501f, 6.74987f, 11.9142f, 6.74971f, 11.5003f)
                curveTo(6.74971f, 11.0861f, 7.08563f, 10.7504f, 7.49971f, 10.7503f)
                close()
                moveTo(7.48311f, 2.25029f)
                curveTo(8.00061f, 2.25054f, 8.41411f, 2.68038f, 8.39424f, 3.19756f)
                lineTo(8.20577f, 8.80498f)
                curveTo(8.19119f, 9.18285f, 7.8808f, 9.48168f, 7.50264f, 9.48174f)
                curveTo(7.12444f, 9.48174f, 6.81409f, 9.18288f, 6.79952f, 8.80498f)
                lineTo(6.571f, 3.19756f)
                curveTo(6.55111f, 2.68023f, 6.9654f, 2.25029f, 7.48311f, 2.25029f)
                close()
            }
        }.build()
        
        return _ExclamationMark!!
    }

private var _ExclamationMark: ImageVector? = null


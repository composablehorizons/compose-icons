package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) return _EnvelopeOpen!!
        
        _EnvelopeOpen = ImageVector.Builder(
            name = "envelope-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.16016f, 0.118583f)
                curveTo(7.41609f, 0.026115f, 7.70086f, 0.0422529f, 7.94727f, 0.165458f)
                lineTo(14.4473f, 3.41546f)
                lineTo(14.5684f, 3.48675f)
                curveTo(14.8359f, 3.67163f, 14.9999f, 3.97791f, 15f, 4.30901f)
                verticalLineTo(12.0004f)
                curveTo(14.9998f, 12.5525f, 14.5521f, 13.0004f, 14f, 13.0004f)
                horizontalLineTo(1f)
                curveTo(0.447856f, 13.0004f, 2.2869E-4f, 12.5525f, 0f, 12.0004f)
                verticalLineTo(4.30901f)
                curveTo(1.5935E-4f, 3.93055f, 0.214303f, 3.58486f, 0.552734f, 3.41546f)
                lineTo(7.05273f, 0.165458f)
                lineTo(7.16016f, 0.118583f)
                close()
                moveTo(7.70996f, 8.19866f)
                curveTo(7.57876f, 8.26772f, 7.42124f, 8.26772f, 7.29004f, 8.19866f)
                lineTo(1f, 4.88421f)
                verticalLineTo(12.0004f)
                horizontalLineTo(14f)
                verticalLineTo(4.88421f)
                lineTo(7.70996f, 8.19866f)
                close()
                moveTo(1.43066f, 4.09319f)
                lineTo(7.5f, 7.29143f)
                lineTo(13.5684f, 4.09319f)
                lineTo(7.5f, 1.05901f)
                lineTo(1.43066f, 4.09319f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null


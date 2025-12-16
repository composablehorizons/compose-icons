package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignLeft: ImageVector
    get() {
        if (_AlignLeft != null) return _AlignLeft!!
        
        _AlignLeft = ImageVector.Builder(
            name = "align-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(-5.46388E-7f, 1.49999f)
                curveTo(1.19309E-6f, 1.22385f, 0.223856f, 0.999992f, 0.499995f, 0.999992f)
                curveTo(0.776135f, 0.999992f, 0.99999f, 1.22385f, 0.999991f, 1.49999f)
                lineTo(0.999992f, 5.99995f)
                lineTo(11.9999f, 5.99995f)
                curveTo(12.5522f, 5.99995f, 12.9999f, 6.44766f, 12.9999f, 6.99994f)
                lineTo(12.9999f, 7.99993f)
                curveTo(12.9999f, 8.55221f, 12.5522f, 8.99993f, 11.9999f, 8.99993f)
                lineTo(0.999992f, 8.99993f)
                lineTo(0.999992f, 13.4999f)
                curveTo(0.999992f, 13.776f, 0.776136f, 13.9999f, 0.499996f, 13.9999f)
                curveTo(0.223856f, 13.9999f, -2.18555E-8f, 13.776f, -2.18555E-8f, 13.4999f)
                lineTo(-5.46388E-7f, 1.49999f)
                close()
            }
        }.build()
        
        return _AlignLeft!!
    }

private var _AlignLeft: ImageVector? = null


package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpaceBetweenHorizontally: ImageVector
    get() {
        if (_SpaceBetweenHorizontally != null) return _SpaceBetweenHorizontally!!
        
        _SpaceBetweenHorizontally = ImageVector.Builder(
            name = "space-between-horizontally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.99995f, 7.99993f)
                curveTo(5.99995f, 8.55221f, 5.55224f, 8.99993f, 4.99996f, 8.99993f)
                lineTo(0.999992f, 8.99993f)
                lineTo(0.999991f, 13.4999f)
                curveTo(0.999991f, 13.776f, 0.776135f, 13.9999f, 0.499995f, 13.9999f)
                curveTo(0.223855f, 13.9999f, -5.58458E-7f, 13.776f, -5.46388E-7f, 13.4999f)
                lineTo(-2.18555E-8f, 1.49999f)
                curveTo(1.89755E-6f, 1.22385f, 0.223857f, 0.999991f, 0.499996f, 0.999991f)
                curveTo(0.776135f, 0.999991f, 0.99999f, 1.22385f, 0.999992f, 1.49999f)
                lineTo(0.999992f, 5.99995f)
                lineTo(4.99996f, 5.99995f)
                curveTo(5.55224f, 5.99995f, 5.99995f, 6.44766f, 5.99995f, 6.99994f)
                lineTo(5.99995f, 7.99993f)
                close()
                moveTo(9.99992f, 8.99993f)
                curveTo(9.44764f, 8.99993f, 8.99993f, 8.55221f, 8.99993f, 7.99993f)
                lineTo(8.99993f, 6.99994f)
                curveTo(8.99993f, 6.44766f, 9.44764f, 5.99995f, 9.99992f, 5.99995f)
                lineTo(13.9999f, 5.99995f)
                lineTo(13.9999f, 1.49999f)
                curveTo(13.9999f, 1.22385f, 14.2237f, 0.999992f, 14.4999f, 0.999992f)
                curveTo(14.776f, 0.999992f, 14.9999f, 1.22385f, 14.9999f, 1.49999f)
                lineTo(14.9999f, 13.4999f)
                curveTo(14.9999f, 13.776f, 14.776f, 13.9999f, 14.4999f, 13.9999f)
                curveTo(14.2237f, 13.9999f, 13.9999f, 13.776f, 13.9999f, 13.4999f)
                lineTo(13.9999f, 8.99993f)
                lineTo(9.99992f, 8.99993f)
                close()
            }
        }.build()
        
        return _SpaceBetweenHorizontally!!
    }

private var _SpaceBetweenHorizontally: ImageVector? = null


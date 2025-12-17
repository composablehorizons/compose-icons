package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) return _MagnifyingGlassCircle!!
        
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "magnifying-glass-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.25f, 10.875f)
                arcToRelative(2.625f, 2.625f, 0f, true, true, 5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, false, true, -5.25f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveToRelative(-1.125f, 4.5f)
                arcToRelative(4.125f, 4.125f, 0f, true, false, 2.338f, 7.524f)
                lineToRelative(2.007f, 2.006f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.006f, -2.007f)
                arcToRelative(4.125f, 4.125f, 0f, false, false, -3.399f, -6.463f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassCircle!!
    }

private var _MagnifyingGlassCircle: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Layers_clear: ImageVector
    get() {
        if (_Layers_clear != null) return _Layers_clear!!
        
        _Layers_clear = ImageVector.Builder(
            name = "layers_clear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(759f, 297f)
                quadToRelative(31f, 24f, 31f, 63f)
                reflectiveQuadToRelative(-31f, 63f)
                lineToRelative(-87f, 67f)
                quadToRelative(-12f, 9f, -27f, 8.5f)
                reflectiveQuadTo(619f, 487f)
                lineTo(362f, 228f)
                quadToRelative(-13f, -13f, -11.5f, -31f)
                reflectiveQuadToRelative(15.5f, -29f)
                lineToRelative(65f, -50f)
                quadToRelative(22f, -17f, 49f, -17f)
                reflectiveQuadToRelative(49f, 17f)
                lineToRelative(230f, 179f)
                close()
                moveToRelative(5f, 559f)
                lineTo(632f, 724f)
                lineToRelative(-103f, 80f)
                quadToRelative(-22f, 17f, -49f, 17f)
                reflectiveQuadToRelative(-49f, -17f)
                lineTo(161f, 594f)
                quadToRelative(-16f, -12f, -15.5f, -31.5f)
                reflectiveQuadTo(162f, 531f)
                quadToRelative(11f, -8f, 24f, -8f)
                reflectiveQuadToRelative(24f, 8f)
                lineToRelative(270f, 209f)
                lineToRelative(94f, -73f)
                lineToRelative(-70f, -68f)
                horizontalLineToRelative(29f)
                lineToRelative(-4f, 2f)
                quadToRelative(-22f, 17f, -49f, 17.5f)
                reflectiveQuadTo(431f, 602f)
                lineTo(201f, 423f)
                quadToRelative(-31f, -24f, -31f, -63f)
                reflectiveQuadToRelative(31f, -63f)
                lineToRelative(2f, -2f)
                lineTo(84f, 177f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(83f, 120f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(35f, -325f)
                quadToRelative(15f, 12f, 15f, 31f)
                reflectiveQuadToRelative(-15f, 32f)
                lineToRelative(-12f, 10f)
                quadToRelative(-12f, 10f, -27f, 9f)
                reflectiveQuadToRelative(-26f, -12f)
                quadToRelative(-13f, -13f, -12f, -31.5f)
                reflectiveQuadToRelative(16f, -29.5f)
                lineToRelative(12f, -9f)
                quadToRelative(11f, -8f, 24.5f, -8f)
                reflectiveQuadToRelative(24.5f, 8f)
                close()
            }
        }.build()
        
        return _Layers_clear!!
    }

private var _Layers_clear: ImageVector? = null


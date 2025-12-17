package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directions_alt_off: ImageVector
    get() {
        if (_Directions_alt_off != null) return _Directions_alt_off!!
        
        _Directions_alt_off = ImageVector.Builder(
            name = "directions_alt_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(639f, 752f)
                lineTo(535f, 856f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadTo(479f, 880f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(423f, 856f)
                lineTo(103f, 536f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(79f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(104f, -104f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                lineTo(639f, 752f)
                close()
                moveTo(523f, 636f)
                lineToRelative(-57f, -56f)
                lineToRelative(-16f, 16f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(16f, -16f)
                close()
                moveTo(406f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-7f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(279f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(319f, 520f)
                horizontalLineToRelative(87f)
                close()
                moveToRelative(231f, 0f)
                lineToRelative(13f, -12f)
                quadToRelative(13f, -11f, 12.5f, -28f)
                reflectiveQuadTo(650f, 451f)
                lineTo(507f, 308f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-4f, 4f, -6.5f, 8f)
                reflectiveQuadToRelative(-4.5f, 9f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(74f, -74f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(320f, 320f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(855f, 536f)
                lineToRelative(-73f, 73f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(725f, 609f)
                lineToRelative(-88f, -89f)
                close()
            }
        }.build()
        
        return _Directions_alt_off!!
    }

private var _Directions_alt_off: ImageVector? = null


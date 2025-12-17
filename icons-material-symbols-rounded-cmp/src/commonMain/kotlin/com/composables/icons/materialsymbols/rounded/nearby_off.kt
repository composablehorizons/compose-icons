package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nearby_off: ImageVector
    get() {
        if (_Nearby_off != null) return _Nearby_off!!
        
        _Nearby_off = ImageVector.Builder(
            name = "nearby_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 479f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineToRelative(-68f, 68f)
                quadToRelative(-15f, 15f, -36f, 15f)
                reflectiveQuadToRelative(-36f, -15f)
                quadToRelative(-15f, -15f, -15f, -36f)
                reflectiveQuadToRelative(15f, -36f)
                lineToRelative(52f, -52f)
                lineToRelative(-288f, -288f)
                lineToRelative(-52f, 52f)
                quadToRelative(-15f, 15f, -36f, 15f)
                reflectiveQuadToRelative(-36f, -15f)
                quadToRelative(-15f, -15f, -15f, -36f)
                reflectiveQuadToRelative(15f, -36f)
                lineToRelative(66f, -66f)
                quadToRelative(12f, -12f, 27f, -18.5f)
                reflectiveQuadToRelative(31f, -6.5f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(319f, 319f)
                quadToRelative(12f, 11f, 18f, 25.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                close()
                moveTo(642f, 752f)
                lineTo(536f, 856f)
                quadToRelative(-12f, 11f, -26.5f, 17f)
                reflectiveQuadTo(480f, 879f)
                quadToRelative(-15f, 0f, -29.5f, -5.5f)
                reflectiveQuadTo(424f, 856f)
                lineTo(105f, 537f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(81f, 481f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(103f, -104f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(681f, 681f)
                quadToRelative(11f, 11f, 11f, 27f)
                reflectiveQuadToRelative(-11f, 27f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(766f, 875f)
                lineTo(642f, 752f)
                close()
                moveTo(193f, 481f)
                lineToRelative(287f, 287f)
                lineToRelative(90f, -88f)
                lineToRelative(-57f, -57f)
                lineToRelative(-5f, 5f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(333f, 509f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(5f, -5f)
                lineToRelative(-56f, -56f)
                lineToRelative(-89f, 89f)
                close()
                moveToRelative(447f, 15f)
                quadToRelative(-7f, 7f, -16f, 7f)
                reflectiveQuadToRelative(-16f, -7f)
                lineTo(464f, 352f)
                quadToRelative(-7f, -7f, -7f, -16f)
                reflectiveQuadToRelative(7f, -16f)
                quadToRelative(7f, -7f, 16f, -7f)
                reflectiveQuadToRelative(16f, 7f)
                lineToRelative(144f, 144f)
                quadToRelative(7f, 7f, 7f, 16f)
                reflectiveQuadToRelative(-7f, 16f)
                close()
            }
        }.build()
        
        return _Nearby_off!!
    }

private var _Nearby_off: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nearby_off: ImageVector
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
                moveTo(752f, 640f)
                lineToRelative(-72f, -72f)
                lineToRelative(88f, -88f)
                lineToRelative(-288f, -288f)
                lineToRelative(-88f, 88f)
                lineToRelative(-72f, -72f)
                lineToRelative(102f, -102f)
                quadToRelative(12f, -12f, 27f, -18.5f)
                reflectiveQuadToRelative(31f, -6.5f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(319f, 319f)
                quadToRelative(24f, 23f, 24f, 55.5f)
                reflectiveQuadTo(856f, 536f)
                lineTo(752f, 640f)
                close()
                moveToRelative(41f, 263f)
                lineTo(642f, 752f)
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
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-55f, 55f)
                close()
                moveTo(193f, 481f)
                lineToRelative(287f, 287f)
                lineToRelative(90f, -88f)
                lineToRelative(-57f, -57f)
                lineToRelative(-33f, 33f)
                lineToRelative(-175f, -175f)
                lineToRelative(33f, -33f)
                lineToRelative(-56f, -56f)
                lineToRelative(-89f, 89f)
                close()
                moveToRelative(431f, 31f)
                lineTo(448f, 336f)
                lineToRelative(32f, -32f)
                lineToRelative(176f, 176f)
                lineToRelative(-32f, 32f)
                close()
            }
        }.build()
        
        return _Nearby_off!!
    }

private var _Nearby_off: ImageVector? = null


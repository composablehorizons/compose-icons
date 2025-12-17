package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Encrypted_off: ImageVector
    get() {
        if (_Encrypted_off != null) return _Encrypted_off!!
        
        _Encrypted_off = ImageVector.Builder(
            name = "encrypted_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444f, 600f)
                horizontalLineToRelative(44f)
                lineToRelative(-58f, -58f)
                lineToRelative(-6f, 34f)
                quadToRelative(-2f, 9f, 4.5f, 16.5f)
                reflectiveQuadTo(444f, 600f)
                close()
                moveToRelative(218f, 174f)
                quadToRelative(-33f, 35f, -72.5f, 59f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                quadToRelative(-4f, 0f, -25f, -4f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(662f, 774f)
                close()
                moveToRelative(138f, -519f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 33f, -5f, 65.5f)
                reflectiveQuadTo(780f, 574f)
                quadToRelative(-4f, 12f, -13f, 20f)
                reflectiveQuadToRelative(-20f, 10f)
                quadToRelative(-11f, 2f, -22.5f, -0.5f)
                reflectiveQuadTo(703f, 591f)
                lineTo(551f, 438f)
                quadToRelative(5f, -8f, 7f, -17.5f)
                reflectiveQuadToRelative(2f, -20.5f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-11f, 0f, -20f, 2f)
                reflectiveQuadToRelative(-17f, 7f)
                lineTo(316f, 202f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -12f, 6.5f, -22.5f)
                reflectiveQuadTo(330f, 136f)
                lineToRelative(122f, -45f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                close()
            }
        }.build()
        
        return _Encrypted_off!!
    }

private var _Encrypted_off: ImageVector? = null


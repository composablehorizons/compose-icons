package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Encrypted_off: ImageVector
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
                moveTo(800f, 255f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 35f, -5.5f, 69.5f)
                reflectiveQuadTo(778f, 582f)
                quadToRelative(-7f, 21f, -22f, 27.5f)
                reflectiveQuadToRelative(-29f, 1.5f)
                quadToRelative(-14f, -5f, -23.5f, -17.5f)
                reflectiveQuadTo(700f, 563f)
                quadToRelative(10f, -28f, 15f, -58.5f)
                reflectiveQuadToRelative(5f, -60.5f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-122f, 46f)
                quadToRelative(-11f, 4f, -22.5f, 1.5f)
                reflectiveQuadTo(316f, 202f)
                quadToRelative(-16f, -16f, -11f, -37f)
                reflectiveQuadToRelative(25f, -29f)
                lineToRelative(122f, -45f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                close()
                moveTo(480f, 876f)
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
                quadToRelative(-33f, 35f, -72.5f, 59f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(71f, -439f)
                quadToRelative(5f, -8f, 7f, -17.5f)
                reflectiveQuadToRelative(2f, -19.5f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-10f, 0f, -19.5f, 2f)
                reflectiveQuadToRelative(-17.5f, 7f)
                lineToRelative(108f, 108f)
                close()
                moveTo(430f, 542f)
                close()
                moveToRelative(57f, -170f)
                close()
                moveToRelative(-7f, 424f)
                quadToRelative(35f, -11f, 67f, -31f)
                reflectiveQuadToRelative(59f, -47f)
                lineTo(488f, 600f)
                horizontalLineToRelative(-44f)
                quadToRelative(-9f, 0f, -15.5f, -7.5f)
                reflectiveQuadTo(424f, 576f)
                lineToRelative(6f, -34f)
                lineToRelative(-190f, -190f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
            }
        }.build()
        
        return _Encrypted_off!!
    }

private var _Encrypted_off: ImageVector? = null


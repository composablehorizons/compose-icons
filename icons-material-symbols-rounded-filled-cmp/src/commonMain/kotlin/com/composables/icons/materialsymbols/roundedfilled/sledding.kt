package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sledding: ImageVector
    get() {
        if (_Sledding != null) return _Sledding!!
        
        _Sledding = ImageVector.Builder(
            name = "sledding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(765f, 920f)
                quadToRelative(-19f, 0f, -31.5f, -2f)
                reflectiveQuadTo(710f, 912f)
                lineTo(68f, 703f)
                quadToRelative(-12f, -4f, -17.5f, -14.5f)
                reflectiveQuadTo(49f, 666f)
                quadToRelative(4f, -12f, 15f, -18f)
                reflectiveQuadToRelative(23f, -2f)
                lineToRelative(129f, 42f)
                lineToRelative(18f, -57f)
                lineToRelative(-128f, -42f)
                quadToRelative(-12f, -4f, -17.5f, -15f)
                reflectiveQuadTo(87f, 551f)
                quadToRelative(4f, -12f, 14.5f, -17.5f)
                reflectiveQuadTo(124f, 532f)
                lineToRelative(36f, 12f)
                verticalLineToRelative(-138f)
                quadToRelative(0f, -12f, 6.5f, -21.5f)
                reflectiveQuadTo(184f, 370f)
                lineToRelative(195f, -84f)
                quadToRelative(8f, -4f, 15.5f, -5f)
                reflectiveQuadToRelative(16.5f, -1f)
                quadToRelative(34f, 0f, 55f, 29.5f)
                reflectiveQuadToRelative(10f, 64.5f)
                lineToRelative(-42f, 130f)
                lineToRelative(86f, -14f)
                quadToRelative(27f, -5f, 50.5f, 8f)
                reflectiveQuadToRelative(35.5f, 38f)
                lineToRelative(83f, 180f)
                lineToRelative(49f, 16f)
                quadToRelative(12f, 4f, 17.5f, 14.5f)
                reflectiveQuadTo(757f, 769f)
                quadToRelative(-4f, 12f, -15f, 18f)
                reflectiveQuadToRelative(-23f, 2f)
                lineToRelative(-104f, -34f)
                lineToRelative(-19f, 57f)
                lineToRelative(133f, 43f)
                quadToRelative(8f, 2f, 16.5f, 3.5f)
                reflectiveQuadTo(765f, 860f)
                quadToRelative(36f, 0f, 65.5f, -29.5f)
                reflectiveQuadTo(860f, 765f)
                quadToRelative(0f, -28f, -11f, -50.5f)
                reflectiveQuadTo(814f, 677f)
                quadToRelative(-10f, -6f, -14.5f, -17.5f)
                reflectiveQuadTo(799f, 637f)
                quadToRelative(4f, -12f, 14.5f, -17.5f)
                reflectiveQuadToRelative(21.5f, -0.5f)
                quadToRelative(41f, 21f, 63f, 59.5f)
                reflectiveQuadToRelative(22f, 86.5f)
                quadToRelative(0f, 62f, -46.5f, 108.5f)
                reflectiveQuadTo(765f, 920f)
                close()
                moveTo(539f, 794f)
                lineToRelative(19f, -58f)
                lineToRelative(-267f, -86f)
                lineToRelative(-18f, 57f)
                lineToRelative(266f, 87f)
                close()
                moveToRelative(46f, -112f)
                lineToRelative(-47f, -102f)
                lineToRelative(-159f, 35f)
                lineToRelative(206f, 67f)
                close()
                moveToRelative(-305f, -99f)
                quadToRelative(-6f, -13f, -7.5f, -27.5f)
                reflectiveQuadTo(276f, 527f)
                lineToRelative(41f, -127f)
                lineToRelative(-77f, 33f)
                verticalLineToRelative(137f)
                lineToRelative(40f, 13f)
                close()
                moveToRelative(200f, -323f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 260f)
                close()
            }
        }.build()
        
        return _Sledding!!
    }

private var _Sledding: ImageVector? = null


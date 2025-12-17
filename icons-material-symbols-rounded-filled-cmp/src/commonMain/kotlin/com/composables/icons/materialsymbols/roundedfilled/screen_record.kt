package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Screen_record: ImageVector
    get() {
        if (_Screen_record != null) return _Screen_record!!
        
        _Screen_record = ImageVector.Builder(
            name = "screen_record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(320f, -200f)
                quadToRelative(0f, -42f, -10f, -81f)
                reflectiveQuadToRelative(-29f, -74f)
                quadToRelative(-8f, -15f, -6.5f, -32f)
                reflectiveQuadToRelative(15.5f, -27f)
                quadToRelative(14f, -10f, 31f, -6f)
                reflectiveQuadToRelative(25f, 18f)
                quadToRelative(26f, 45f, 40f, 95.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 56f, -14.5f, 107f)
                reflectiveQuadTo(825f, 683f)
                quadToRelative(-8f, 14f, -24.5f, 17.5f)
                reflectiveQuadTo(770f, 694f)
                quadToRelative(-14f, -10f, -16f, -27f)
                reflectiveQuadToRelative(6f, -32f)
                quadToRelative(19f, -35f, 29.5f, -73.5f)
                reflectiveQuadTo(800f, 480f)
                close()
                moveTo(480f, 160f)
                quadToRelative(-43f, 0f, -81.5f, 10.5f)
                reflectiveQuadTo(325f, 200f)
                quadToRelative(-15f, 8f, -32f, 6f)
                reflectiveQuadToRelative(-27f, -16f)
                quadToRelative(-10f, -14f, -6.5f, -30.5f)
                reflectiveQuadTo(277f, 135f)
                quadToRelative(45f, -26f, 96f, -40.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(56f, 0f, 107f, 14.5f)
                reflectiveQuadToRelative(96f, 40.5f)
                quadToRelative(15f, 8f, 18.5f, 24.5f)
                reflectiveQuadTo(695f, 190f)
                quadToRelative(-10f, 14f, -27f, 16f)
                reflectiveQuadToRelative(-32f, -6f)
                quadToRelative(-35f, -19f, -74f, -29.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveTo(160f, 480f)
                quadToRelative(0f, 43f, 10.5f, 81.5f)
                reflectiveQuadTo(200f, 635f)
                quadToRelative(8f, 15f, 6f, 32f)
                reflectiveQuadToRelative(-16f, 27f)
                quadToRelative(-14f, 10f, -30.5f, 6.5f)
                reflectiveQuadTo(135f, 683f)
                quadToRelative(-26f, -45f, -40.5f, -96f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -56f, 14f, -106.5f)
                reflectiveQuadToRelative(40f, -95.5f)
                quadToRelative(8f, -14f, 25f, -18f)
                reflectiveQuadToRelative(31f, 6f)
                quadToRelative(14f, 10f, 15.5f, 27f)
                reflectiveQuadToRelative(-6.5f, 32f)
                quadToRelative(-19f, 35f, -29f, 74f)
                reflectiveQuadToRelative(-10f, 81f)
                close()
                moveToRelative(320f, 320f)
                quadToRelative(42f, 0f, 81f, -10f)
                reflectiveQuadToRelative(74f, -29f)
                quadToRelative(15f, -8f, 31.5f, -6f)
                reflectiveQuadToRelative(26.5f, 16f)
                quadToRelative(10f, 14f, 6.5f, 30.5f)
                reflectiveQuadTo(682f, 826f)
                quadToRelative(-45f, 26f, -95.5f, 40f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-56f, 0f, -106.5f, -14f)
                reflectiveQuadTo(278f, 826f)
                quadToRelative(-14f, -8f, -18f, -25f)
                reflectiveQuadToRelative(6f, -31f)
                quadToRelative(10f, -14f, 27f, -15.5f)
                reflectiveQuadToRelative(32f, 6.5f)
                quadToRelative(35f, 19f, 74f, 29f)
                reflectiveQuadToRelative(81f, 10f)
                close()
            }
        }.build()
        
        return _Screen_record!!
    }

private var _Screen_record: ImageVector? = null


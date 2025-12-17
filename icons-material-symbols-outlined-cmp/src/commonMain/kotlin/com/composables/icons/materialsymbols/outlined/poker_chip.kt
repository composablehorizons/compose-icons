package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Poker_chip: ImageVector
    get() {
        if (_Poker_chip != null) return _Poker_chip!!
        
        _Poker_chip = ImageVector.Builder(
            name = "poker_chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -83f)
                verticalLineToRelative(-40f)
                quadToRelative(-35f, -5f, -67.5f, -19f)
                reflectiveQuadTo(312f, 704f)
                lineToRelative(-28f, 29f)
                quadToRelative(33f, 26f, 72.5f, 42.5f)
                reflectiveQuadTo(440f, 797f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(44f, -5f, 83.5f, -21.5f)
                reflectiveQuadTo(676f, 733f)
                lineToRelative(-28f, -29f)
                quadToRelative(-28f, 20f, -60.5f, 34f)
                reflectiveQuadTo(520f, 757f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-40f, -117f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(253f, -4f)
                quadToRelative(26f, -33f, 42.5f, -72.5f)
                reflectiveQuadTo(797f, 520f)
                horizontalLineToRelative(-40f)
                quadToRelative(-5f, 35f, -19f, 67.5f)
                reflectiveQuadTo(704f, 648f)
                lineToRelative(29f, 28f)
                close()
                moveToRelative(-506f, 0f)
                lineToRelative(29f, -29f)
                quadToRelative(-20f, -28f, -34f, -60f)
                reflectiveQuadToRelative(-19f, -67f)
                horizontalLineToRelative(-40f)
                quadToRelative(5f, 44f, 21.5f, 83.5f)
                reflectiveQuadTo(227f, 676f)
                close()
                moveToRelative(253f, -36f)
                lineTo(360f, 480f)
                lineToRelative(120f, -160f)
                lineToRelative(120f, 160f)
                lineToRelative(-120f, 160f)
                close()
                moveTo(163f, 440f)
                horizontalLineToRelative(40f)
                quadToRelative(5f, -35f, 19f, -67f)
                reflectiveQuadToRelative(34f, -60f)
                lineToRelative(-29f, -29f)
                quadToRelative(-26f, 33f, -42.5f, 72.5f)
                reflectiveQuadTo(163f, 440f)
                close()
                moveToRelative(594f, 0f)
                horizontalLineToRelative(40f)
                quadToRelative(-5f, -44f, -22f, -83.5f)
                reflectiveQuadTo(732f, 284f)
                lineToRelative(-28f, 28f)
                quadToRelative(20f, 28f, 34f, 60.5f)
                reflectiveQuadToRelative(19f, 67.5f)
                close()
                moveTo(313f, 256f)
                quadToRelative(28f, -20f, 60f, -34f)
                reflectiveQuadToRelative(67f, -19f)
                verticalLineToRelative(-40f)
                quadToRelative(-44f, 5f, -83.5f, 21.5f)
                reflectiveQuadTo(284f, 227f)
                lineToRelative(29f, 29f)
                close()
                moveToRelative(335f, 0f)
                lineToRelative(28f, -28f)
                quadToRelative(-33f, -26f, -72.5f, -43f)
                reflectiveQuadTo(520f, 163f)
                verticalLineToRelative(40f)
                quadToRelative(35f, 5f, 67.5f, 19f)
                reflectiveQuadToRelative(60.5f, 34f)
                close()
            }
        }.build()
        
        return _Poker_chip!!
    }

private var _Poker_chip: ImageVector? = null


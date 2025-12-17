package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bomb: ImageVector
    get() {
        if (_Bomb != null) return _Bomb!!
        
        _Bomb = ImageVector.Builder(
            name = "bomb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(346f, 832f)
                quadToRelative(91f, 0f, 155.5f, -64.5f)
                reflectiveQuadTo(566f, 612f)
                quadToRelative(0f, -31f, -8.5f, -61f)
                reflectiveQuadTo(532f, 494f)
                lineToRelative(-26f, -41f)
                lineToRelative(42f, -72f)
                lineToRelative(-104f, -60f)
                lineToRelative(-42f, 72f)
                horizontalLineToRelative(-44f)
                quadToRelative(-94f, 0f, -163.5f, 60f)
                reflectiveQuadTo(125f, 610f)
                quadToRelative(0f, 92f, 64.5f, 157f)
                reflectiveQuadTo(346f, 832f)
                close()
                moveToRelative(494f, -480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 312f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 272f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 312f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 352f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(620f, 132f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 92f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 12f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 52f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 132f)
                close()
                moveToRelative(127f, 53f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(29f, -29f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-29f, 29f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(346f, 612f)
                close()
                moveToRelative(334f, -310f)
                quadToRelative(-5f, 0f, -10f, -1f)
                reflectiveQuadToRelative(-10f, -4f)
                lineToRelative(-35f, -20f)
                quadToRelative(-14f, -8f, -30.5f, -3.5f)
                reflectiveQuadTo(570f, 292f)
                lineToRelative(-5f, 8f)
                lineToRelative(40f, 23f)
                quadToRelative(21f, 12f, 27.5f, 36f)
                reflectiveQuadToRelative(-5.5f, 45f)
                lineToRelative(-27f, 48f)
                quadToRelative(23f, 36f, 34.5f, 76.5f)
                reflectiveQuadTo(646f, 612f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(346f, 912f)
                quadToRelative(-125f, 0f, -212.5f, -88.5f)
                reflectiveQuadTo(46f, 610f)
                quadToRelative(0f, -125f, 86.5f, -211.5f)
                reflectiveQuadTo(344f, 312f)
                horizontalLineToRelative(13f)
                lineToRelative(27f, -47f)
                quadToRelative(12f, -22f, 36f, -28.5f)
                reflectiveQuadToRelative(46f, 6.5f)
                lineToRelative(30f, 17f)
                lineToRelative(5f, -8f)
                quadToRelative(23f, -43f, 72f, -56f)
                reflectiveQuadToRelative(92f, 12f)
                lineToRelative(34f, 19f)
                quadToRelative(9f, 5f, 15f, 14.5f)
                reflectiveQuadToRelative(6f, 20.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 302f)
                close()
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null


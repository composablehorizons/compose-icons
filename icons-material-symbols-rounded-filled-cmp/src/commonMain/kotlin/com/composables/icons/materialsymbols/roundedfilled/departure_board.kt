package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Departure_board: ImageVector
    get() {
        if (_Departure_board != null) return _Departure_board!!
        
        _Departure_board = ImageVector.Builder(
            name = "departure_board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 272f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 8f, 3f, 15.5f)
                reflectiveQuadToRelative(8f, 12.5f)
                lineToRelative(60f, 61f)
                quadToRelative(6f, 6f, 15f, 6f)
                reflectiveQuadToRelative(15f, -6f)
                quadToRelative(6f, -6f, 6f, -15f)
                reflectiveQuadToRelative(-6f, -15f)
                lineToRelative(-61f, -59f)
                close()
                moveToRelative(-20f, 208f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -82f, 58f, -141f)
                reflectiveQuadToRelative(142f, -59f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveTo(260f, 680f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 680f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(540f, 680f)
                close()
                moveTo(180f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 820f)
                verticalLineToRelative(-62f)
                quadToRelative(-20f, -21f, -30f, -46.5f)
                reflectiveQuadTo(80f, 660f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -72f, 66.5f, -110f)
                reflectiveQuadTo(362f, 123f)
                quadToRelative(29f, -2f, 45f, 22.5f)
                reflectiveQuadToRelative(5f, 53.5f)
                quadToRelative(-6f, 20f, -9f, 41.5f)
                reflectiveQuadToRelative(-3f, 42.5f)
                quadToRelative(0f, 15f, -9.5f, 26f)
                reflectiveQuadTo(366f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(260f)
                quadToRelative(14f, 0f, 27f, 6.5f)
                reflectiveQuadToRelative(22f, 17.5f)
                quadToRelative(17f, 20f, 37f, 35.5f)
                reflectiveQuadToRelative(43f, 27.5f)
                quadToRelative(32f, 17f, 66.5f, 25.5f)
                reflectiveQuadTo(686f, 560f)
                quadToRelative(14f, 0f, 24f, 8.5f)
                reflectiveQuadToRelative(10f, 22.5f)
                verticalLineToRelative(69f)
                quadToRelative(0f, 26f, -10f, 51.5f)
                reflectiveQuadTo(680f, 758f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 820f)
                verticalLineToRelative(-20f)
                horizontalLineTo(240f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 880f)
                close()
            }
        }.build()
        
        return _Departure_board!!
    }

private var _Departure_board: ImageVector? = null


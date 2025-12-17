package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Departure_board: ImageVector
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
                moveTo(746f, 376f)
                lineToRelative(30f, -30f)
                lineToRelative(-76f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 88f)
                close()
                moveTo(178f, 240f)
                horizontalLineToRelative(234f)
                horizontalLineToRelative(-234f)
                close()
                moveToRelative(62f, 280f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-400f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-82f)
                quadToRelative(-20f, -21f, -30f, -46.5f)
                reflectiveQuadTo(80f, 660f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -89f, 82.5f, -124.5f)
                reflectiveQuadTo(451f, 120f)
                quadToRelative(-13f, 18f, -22.5f, 38f)
                reflectiveQuadTo(412f, 199f)
                quadToRelative(-102f, 2f, -157.5f, 12f)
                reflectiveQuadTo(178f, 240f)
                horizontalLineToRelative(225f)
                quadToRelative(-3f, 20f, -3f, 40f)
                reflectiveQuadToRelative(3f, 40f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(291f)
                quadToRelative(17f, 24f, 38f, 44.5f)
                reflectiveQuadToRelative(47f, 35.5f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 720f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 640f)
                verticalLineToRelative(-83f)
                quadToRelative(20f, 3f, 40f, 3f)
                reflectiveQuadToRelative(40f, -3f)
                verticalLineToRelative(103f)
                quadToRelative(0f, 26f, -10f, 51.5f)
                reflectiveQuadTo(680f, 758f)
                verticalLineToRelative(82f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 840f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 880f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(520f, -400f)
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
            }
        }.build()
        
        return _Departure_board!!
    }

private var _Departure_board: ImageVector? = null


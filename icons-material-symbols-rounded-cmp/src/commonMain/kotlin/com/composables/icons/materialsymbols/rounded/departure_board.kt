package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Departure_board: ImageVector
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
                moveTo(178f, 240f)
                horizontalLineToRelative(234f)
                horizontalLineToRelative(-234f)
                close()
                moveToRelative(62f, 280f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-400f)
                close()
                moveTo(180f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 820f)
                verticalLineToRelative(-62f)
                quadToRelative(-20f, -21f, -30f, -46.5f)
                reflectiveQuadTo(80f, 660f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -88f, 79.5f, -124f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(0f, 17f, -10.5f, 28.5f)
                reflectiveQuadTo(402f, 200f)
                quadToRelative(-96f, 0f, -150f, 11.5f)
                reflectiveQuadTo(178f, 240f)
                horizontalLineToRelative(182f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 320f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(321f)
                quadToRelative(17f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 720f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 640f)
                verticalLineToRelative(-39f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 561f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 601f)
                verticalLineToRelative(59f)
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
                moveToRelative(500f, -400f)
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
                moveToRelative(160f, -408f)
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
            }
        }.build()
        
        return _Departure_board!!
    }

private var _Departure_board: ImageVector? = null


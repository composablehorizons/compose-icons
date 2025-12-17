package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mosque: ImageVector
    get() {
        if (_Mosque != null) return _Mosque!!
        
        _Mosque = ImageVector.Builder(
            name = "mosque",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-491f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(0f, 280f)
                quadToRelative(0f, -23f, 24f, -56f)
                reflectiveQuadToRelative(56f, -64f)
                quadToRelative(32f, 31f, 56f, 64f)
                reflectiveQuadToRelative(24f, 56f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(120f, 349f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-158f)
                horizontalLineToRelative(62f)
                quadToRelative(-11f, -17f, -16.5f, -37f)
                reflectiveQuadToRelative(-5.5f, -41f)
                quadToRelative(0f, -40f, 19f, -74f)
                reflectiveQuadToRelative(51f, -56f)
                lineToRelative(170f, -114f)
                lineToRelative(170f, 114f)
                quadToRelative(32f, 22f, 51f, 56f)
                reflectiveQuadToRelative(19f, 74f)
                quadToRelative(0f, 21f, -5.5f, 41f)
                reflectiveQuadTo(698f, 362f)
                horizontalLineToRelative(62f)
                verticalLineToRelative(158f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-171f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(0f, -23f, 24f, -56f)
                reflectiveQuadToRelative(56f, -64f)
                quadToRelative(32f, 31f, 56f, 64f)
                reflectiveQuadToRelative(24f, 56f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(920f, 349f)
                verticalLineToRelative(491f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                close()
                moveToRelative(356f, -480f)
                horizontalLineToRelative(168f)
                quadToRelative(32f, 0f, 54f, -22f)
                reflectiveQuadToRelative(22f, -54f)
                quadToRelative(0f, -20f, -9f, -36.5f)
                reflectiveQuadTo(606f, 220f)
                lineToRelative(-126f, -84f)
                lineToRelative(-126f, 84f)
                quadToRelative(-16f, 11f, -25f, 27.5f)
                reflectiveQuadToRelative(-9f, 36.5f)
                quadToRelative(0f, 32f, 22f, 54f)
                reflectiveQuadToRelative(54f, 22f)
                close()
                moveTo(120f, 760f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(680f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(360f, -320f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 2f)
                close()
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null


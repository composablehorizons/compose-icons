package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mosque: ImageVector
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
                moveTo(40f, 760f)
                verticalLineToRelative(-411f)
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
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, 16f, -48f)
                reflectiveQuadToRelative(46f, -30f)
                quadToRelative(-11f, -17f, -16.5f, -37f)
                reflectiveQuadToRelative(-5.5f, -41f)
                quadToRelative(0f, -40f, 19f, -74f)
                reflectiveQuadToRelative(51f, -56f)
                lineToRelative(125f, -84f)
                quadToRelative(20f, -14f, 45f, -14f)
                reflectiveQuadToRelative(45f, 14f)
                lineToRelative(125f, 84f)
                quadToRelative(32f, 22f, 51f, 56f)
                reflectiveQuadToRelative(19f, 74f)
                quadToRelative(0f, 21f, -5.5f, 41f)
                reflectiveQuadTo(698f, 362f)
                quadToRelative(30f, 7f, 46f, 30f)
                reflectiveQuadToRelative(16f, 48f)
                verticalLineToRelative(80f)
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
                verticalLineToRelative(411f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                close()
                moveToRelative(356f, -400f)
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
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 600f)
                horizontalLineToRelative(-80f)
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


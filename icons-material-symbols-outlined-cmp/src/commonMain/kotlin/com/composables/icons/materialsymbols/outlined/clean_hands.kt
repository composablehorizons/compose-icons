package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Clean_hands: ImageVector
    get() {
        if (_Clean_hands != null) return _Clean_hands!!
        
        _Clean_hands = ImageVector.Builder(
            name = "clean_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 740f)
                lineToRelative(278f, 76f)
                lineToRelative(238f, -74f)
                quadToRelative(-5f, -9f, -14.5f, -15.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(558f)
                quadToRelative(-27f, 0f, -43f, -2f)
                reflectiveQuadToRelative(-33f, -8f)
                lineToRelative(-93f, -31f)
                lineToRelative(22f, -78f)
                lineToRelative(81f, 27f)
                quadToRelative(17f, 5f, 40f, 8f)
                reflectiveQuadToRelative(68f, 4f)
                quadToRelative(0f, -11f, -6.5f, -21f)
                reflectiveQuadTo(578f, 606f)
                lineToRelative(-234f, -86f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(304f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                lineToRelative(235f, 87f)
                quadToRelative(33f, 12f, 53.5f, 42f)
                reflectiveQuadToRelative(20.5f, 66f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 33f)
                reflectiveQuadToRelative(35f, 87f)
                verticalLineToRelative(40f)
                lineTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(480f, -334f)
                lineToRelative(-80f, -30f)
                quadToRelative(-2f, -48f, -36.5f, -82f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(-33f, 0f, -60.5f, 16.5f)
                reflectiveQuadTo(296f, 380f)
                horizontalLineToRelative(-86f)
                quadToRelative(17f, -51f, 56.5f, -88f)
                reflectiveQuadToRelative(93.5f, -48f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(220f)
                quadToRelative(34f, 0f, 64f, 11f)
                reflectiveQuadToRelative(55f, 30f)
                lineToRelative(-57f, 57f)
                quadToRelative(-14f, -8f, -29.5f, -13f)
                reflectiveQuadToRelative(-32.5f, -5f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(84f)
                quadToRelative(69f, 14f, 114.5f, 68.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(26f)
                close()
                moveToRelative(-200f, -86f)
                close()
                moveToRelative(360f, 20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(0f, -23f, 17f, -57f)
                reflectiveQuadToRelative(63f, -103f)
                quadToRelative(46f, 69f, 63f, 103f)
                reflectiveQuadToRelative(17f, 57f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 400f)
                close()
            }
        }.build()
        
        return _Clean_hands!!
    }

private var _Clean_hands: ImageVector? = null


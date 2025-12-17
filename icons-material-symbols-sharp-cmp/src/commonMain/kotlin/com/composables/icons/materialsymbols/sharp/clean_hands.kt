package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Clean_hands: ImageVector
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
                moveTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(318f)
                lineToRelative(322f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                lineTo(560f, 900f)
                close()
                moveTo(120f, 800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(438f, 16f)
                lineToRelative(238f, -74f)
                verticalLineToRelative(-22f)
                horizontalLineTo(513f)
                lineToRelative(-125f, -42f)
                lineToRelative(24f, -76f)
                lineToRelative(117f, 38f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(-26f)
                lineToRelative(-256f, -94f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                lineToRelative(278f, 76f)
                close()
                moveToRelative(42f, -350f)
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


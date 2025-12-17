package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Clean_hands: ImageVector
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
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, 0f)
                lineToRelative(-280f, -79f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(79f)
                lineToRelative(321f, 120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                lineToRelative(-70f, -27f)
                lineToRelative(-14f, 37f)
                lineToRelative(84f, 30f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                lineTo(560f, 880f)
                close()
                moveToRelative(40f, -414f)
                lineToRelative(-230f, -86f)
                horizontalLineTo(210f)
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
                moveToRelative(160f, -66f)
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


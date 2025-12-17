package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Clean_hands: ImageVector
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
                moveTo(280f, 801f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(64f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(14f, 3.5f)
                lineToRelative(277f, 103f)
                quadToRelative(14f, 5f, 22.5f, 18f)
                reflectiveQuadToRelative(8.5f, 27f)
                quadToRelative(0f, 21f, -14.5f, 34f)
                reflectiveQuadTo(632f, 640f)
                horizontalLineTo(527f)
                quadToRelative(-5f, 0f, -7.5f, -0.5f)
                reflectiveQuadTo(513f, 637f)
                lineToRelative(-64f, -25f)
                lineToRelative(-13f, 39f)
                lineToRelative(77f, 27f)
                quadToRelative(2f, 1f, 6f, 1.5f)
                reflectiveQuadToRelative(7f, 0.5f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 56f, 23f)
                reflectiveQuadToRelative(24f, 57f)
                lineTo(561f, 880f)
                lineToRelative(-281f, -79f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(560f, -414f)
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


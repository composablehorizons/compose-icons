package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_stories_off: ImageVector
    get() {
        if (_Auto_stories_off != null) return _Auto_stories_off!!
        
        _Auto_stories_off = ImageVector.Builder(
            name = "auto_stories_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(822f, 934f)
                lineTo(618f, 730f)
                quadToRelative(-38f, 10f, -72.5f, 27.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-59f, 0f, -114f, 18.5f)
                reflectiveQuadTo(40f, 787f)
                verticalLineToRelative(-565f)
                quadToRelative(11f, -8f, 22f, -14.5f)
                reflectiveQuadTo(84f, 196f)
                lineToRelative(-58f, -58f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(98f, -128f)
                lineTo(758f, 644f)
                quadToRelative(21f, 3f, 41.5f, 8f)
                reflectiveQuadToRelative(40.5f, 12f)
                verticalLineToRelative(-480f)
                lineToRelative(80f, 33f)
                verticalLineToRelative(589f)
                close()
                moveTo(480f, 704f)
                quadToRelative(18f, -11f, 36.5f, -20f)
                reflectiveQuadToRelative(38.5f, -17f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(161f, -177f)
                lineToRelative(-81f, -81f)
                verticalLineToRelative(-226f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(400f)
                lineTo(641f, 527f)
                close()
                moveTo(480f, 366f)
                lineTo(274f, 160f)
                quadToRelative(54f, 2f, 106f, 16.5f)
                reflectiveQuadTo(480f, 220f)
                verticalLineToRelative(146f)
                close()
            }
        }.build()
        
        return _Auto_stories_off!!
    }

private var _Auto_stories_off: ImageVector? = null


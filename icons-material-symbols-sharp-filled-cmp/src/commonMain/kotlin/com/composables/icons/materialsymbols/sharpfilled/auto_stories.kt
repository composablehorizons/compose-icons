package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_stories: ImageVector
    get() {
        if (_Auto_stories != null) return _Auto_stories!!
        
        _Auto_stories = ImageVector.Builder(
            name = "auto_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-59f, 0f, -114f, 18.5f)
                reflectiveQuadTo(40f, 787f)
                verticalLineToRelative(-565f)
                quadToRelative(48f, -34f, 104.5f, -48f)
                reflectiveQuadTo(260f, 160f)
                quadToRelative(58f, 0f, 114f, 15f)
                reflectiveQuadToRelative(106f, 45f)
                verticalLineToRelative(484f)
                quadToRelative(50f, -31f, 105.5f, -47.5f)
                reflectiveQuadTo(700f, 640f)
                quadToRelative(36f, 0f, 71f, 6f)
                reflectiveQuadToRelative(69f, 18f)
                verticalLineToRelative(-480f)
                quadToRelative(21f, 7f, 41.5f, 16f)
                reflectiveQuadToRelative(38.5f, 22f)
                verticalLineToRelative(565f)
                quadToRelative(-51f, -30f, -106f, -48.5f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-60f, 0f, -116f, 21f)
                reflectiveQuadToRelative(-104f, 59f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(-380f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(400f)
                lineTo(560f, 600f)
                close()
            }
        }.build()
        
        return _Auto_stories!!
    }

private var _Auto_stories: ImageVector? = null


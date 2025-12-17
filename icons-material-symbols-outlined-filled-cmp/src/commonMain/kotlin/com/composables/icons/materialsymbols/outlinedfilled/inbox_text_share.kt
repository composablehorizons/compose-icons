package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Inbox_text_share: ImageVector
    get() {
        if (_Inbox_text_share != null) return _Inbox_text_share!!
        
        _Inbox_text_share = ImageVector.Builder(
            name = "inbox_text_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(226f)
                quadToRelative(-19f, -9f, -39f, -14.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                verticalLineToRelative(-203f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(168f)
                quadToRelative(9f, 27f, 30f, 47f)
                reflectiveQuadToRelative(47f, 28f)
                quadToRelative(-8f, 54f, 3f, 107f)
                reflectiveQuadToRelative(43f, 98f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -490f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 140f)
                horizontalLineToRelative(237f)
                quadToRelative(27f, -29f, 60.5f, -49f)
                reflectiveQuadToRelative(72.5f, -31f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(800f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(720f, 799f)
                lineToRelative(-81f, -49f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 600f)
                quadToRelative(11f, 0f, 20.5f, 2.5f)
                reflectiveQuadTo(639f, 610f)
                lineToRelative(81f, -48f)
                quadToRelative(0f, -34f, 23.5f, -57.5f)
                reflectiveQuadTo(800f, 481f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 561f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 641f)
                quadToRelative(-11f, 0f, -20.5f, -2.5f)
                reflectiveQuadTo(761f, 631f)
                lineToRelative(-81f, 48f)
                verticalLineToRelative(3f)
                lineToRelative(81f, 48f)
                quadToRelative(9f, -5f, 18.5f, -7.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                close()
            }
        }.build()
        
        return _Inbox_text_share!!
    }

private var _Inbox_text_share: ImageVector? = null


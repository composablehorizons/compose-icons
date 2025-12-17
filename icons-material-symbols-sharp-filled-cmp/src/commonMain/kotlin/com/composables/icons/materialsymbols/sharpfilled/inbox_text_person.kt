package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Inbox_text_person: ImageVector
    get() {
        if (_Inbox_text_person != null) return _Inbox_text_person!!
        
        _Inbox_text_person = ImageVector.Builder(
            name = "inbox_text_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                quadToRelative(28f, -11f, 54.5f, -17f)
                reflectiveQuadToRelative(59.5f, -6f)
                quadToRelative(29f, 0f, 57f, 6f)
                reflectiveQuadToRelative(51f, 17f)
                quadToRelative(23f, 10f, 36f, 30f)
                reflectiveQuadToRelative(13f, 44f)
                verticalLineToRelative(23f)
                horizontalLineTo(560f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(306f)
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
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -490f)
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
            }
        }.build()
        
        return _Inbox_text_person!!
    }

private var _Inbox_text_person: ImageVector? = null


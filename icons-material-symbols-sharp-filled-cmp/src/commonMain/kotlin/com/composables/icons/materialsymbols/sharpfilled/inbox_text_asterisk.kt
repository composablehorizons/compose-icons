package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Inbox_text_asterisk: ImageVector
    get() {
        if (_Inbox_text_asterisk != null) return _Inbox_text_asterisk!!
        
        _Inbox_text_asterisk = ImageVector.Builder(
            name = "inbox_text_asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(378f, 343f)
                lineToRelative(-64f, -47f)
                lineToRelative(61f, -85f)
                lineToRelative(-99f, -32f)
                lineToRelative(24f, -77f)
                lineToRelative(100f, 33f)
                verticalLineToRelative(-105f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(105f)
                lineToRelative(100f, -33f)
                lineToRelative(24f, 77f)
                lineToRelative(-99f, 32f)
                lineToRelative(61f, 85f)
                lineToRelative(-64f, 47f)
                lineToRelative(-62f, -85f)
                lineToRelative(-62f, 85f)
                close()
            }
        }.build()
        
        return _Inbox_text_asterisk!!
    }

private var _Inbox_text_asterisk: ImageVector? = null


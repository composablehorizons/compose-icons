package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chat_add_on: ImageVector
    get() {
        if (_Chat_add_on != null) return _Chat_add_on!!
        
        _Chat_add_on = ImageVector.Builder(
            name = "chat_add_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(283f)
                quadToRelative(-10f, -2f, -20f, -2.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                quadToRelative(-10f, 0f, -20f, 0.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                verticalLineToRelative(-203f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(283f)
                quadToRelative(-2f, 10f, -2.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 20f)
                quadToRelative(0f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(2.5f, 20f)
                horizontalLineTo(240f)
                lineTo(120f, 800f)
                close()
                moveToRelative(160f, -440f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 600f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Chat_add_on!!
    }

private var _Chat_add_on: ImageVector? = null


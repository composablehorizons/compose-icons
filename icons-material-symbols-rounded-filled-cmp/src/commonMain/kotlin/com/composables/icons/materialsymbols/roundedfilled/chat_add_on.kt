package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chat_add_on: ImageVector
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
                moveTo(320f, 360f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 360f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                close()
                moveToRelative(360f, 160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 760f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(-440f, 0f)
                lineToRelative(-86f, 86f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-552f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(174f)
                quadToRelative(0f, 12f, -8.5f, 19.5f)
                reflectiveQuadTo(731f, 400f)
                quadToRelative(-51f, -2f, -97.5f, 15.5f)
                reflectiveQuadTo(550f, 470f)
                quadToRelative(-36f, 37f, -54f, 83.5f)
                reflectiveQuadTo(480f, 651f)
                quadToRelative(1f, 12f, -7f, 20.5f)
                reflectiveQuadToRelative(-19f, 8.5f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Chat_add_on!!
    }

private var _Chat_add_on: ImageVector? = null


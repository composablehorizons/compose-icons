package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Markunread_mailbox: ImageVector
    get() {
        if (_Markunread_mailbox != null) return _Markunread_mailbox!!
        
        _Markunread_mailbox = ImageVector.Builder(
            name = "markunread_mailbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 320f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 240f)
                horizontalLineTo(320f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 520f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(160f)
                verticalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Markunread_mailbox!!
    }

private var _Markunread_mailbox: ImageVector? = null


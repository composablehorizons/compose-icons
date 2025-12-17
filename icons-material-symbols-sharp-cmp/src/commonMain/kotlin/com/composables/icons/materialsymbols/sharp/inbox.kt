package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
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
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                quadToRelative(-30f, 38f, -71.5f, 59f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-47f, 0f, -88.5f, -21f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(280f, -120f)
                quadToRelative(38f, 0f, 69f, -22f)
                reflectiveQuadToRelative(43f, -58f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(168f)
                quadToRelative(12f, 36f, 43f, 58f)
                reflectiveQuadToRelative(69f, 22f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null


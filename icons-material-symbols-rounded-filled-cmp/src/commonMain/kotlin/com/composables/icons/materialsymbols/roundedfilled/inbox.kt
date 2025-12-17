package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Inbox: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -200f)
                quadToRelative(32f, 0f, 59f, -16.5f)
                reflectiveQuadToRelative(44f, -43.5f)
                quadToRelative(6f, -9f, 15f, -14.5f)
                reflectiveQuadToRelative(20f, -5.5f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(142f)
                quadToRelative(11f, 0f, 20f, 5.5f)
                reflectiveQuadToRelative(15f, 14.5f)
                quadToRelative(17f, 27f, 44f, 43.5f)
                reflectiveQuadToRelative(59f, 16.5f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null


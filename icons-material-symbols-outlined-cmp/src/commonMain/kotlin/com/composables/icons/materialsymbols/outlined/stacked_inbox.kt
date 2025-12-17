package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stacked_inbox: ImageVector
    get() {
        if (_Stacked_inbox != null) return _Stacked_inbox!!
        
        _Stacked_inbox = ImageVector.Builder(
            name = "stacked_inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(698f)
                quadToRelative(-21f, 36f, -57f, 58f)
                reflectiveQuadToRelative(-81f, 22f)
                quadToRelative(-45f, 0f, -81f, -22f)
                reflectiveQuadToRelative(-57f, -58f)
                horizontalLineTo(280f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 480f)
                close()
                moveToRelative(200f, 360f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 600f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Stacked_inbox!!
    }

private var _Stacked_inbox: ImageVector? = null


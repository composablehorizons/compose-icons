package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tab_new_right: ImageVector
    get() {
        if (_Tab_new_right != null) return _Tab_new_right!!
        
        _Tab_new_right = ImageVector.Builder(
            name = "tab_new_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(334f)
                quadToRelative(-19f, -7f, -39f, -10.5f)
                reflectiveQuadToRelative(-41f, -3.5f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(320f)
                quadToRelative(0f, 21f, 3.5f, 41f)
                reflectiveQuadToRelative(10.5f, 39f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, 80f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(760f, 920f)
                close()
                moveTo(440f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Tab_new_right!!
    }

private var _Tab_new_right: ImageVector? = null


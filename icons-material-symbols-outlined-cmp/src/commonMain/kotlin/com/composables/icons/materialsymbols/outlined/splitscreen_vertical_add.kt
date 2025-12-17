package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Splitscreen_vertical_add: ImageVector
    get() {
        if (_Splitscreen_vertical_add != null) return _Splitscreen_vertical_add!!
        
        _Splitscreen_vertical_add = ImageVector.Builder(
            name = "splitscreen_vertical_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 200f)
                horizontalLineTo(599f)
                horizontalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(600f)
                verticalLineToRelative(640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(-560f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -640f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-560f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(200f)
                horizontalLineToRelative(160f)
                close()
                moveTo(760f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Splitscreen_vertical_add!!
    }

private var _Splitscreen_vertical_add: ImageVector? = null


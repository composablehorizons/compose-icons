package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Splitscreen_vertical_add: ImageVector
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
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(-360f)
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
                moveToRelative(400f, 640f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 880f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Splitscreen_vertical_add!!
    }

private var _Splitscreen_vertical_add: ImageVector? = null


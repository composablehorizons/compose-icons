package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Move_selection_left: ImageVector
    get() {
        if (_Move_selection_left != null) return _Move_selection_left!!
        
        _Move_selection_left = ImageVector.Builder(
            name = "move_selection_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(320f)
                close()
                moveToRelative(200f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveTo(320f, 480f)
                close()
            }
        }.build()
        
        return _Move_selection_left!!
    }

private var _Move_selection_left: ImageVector? = null


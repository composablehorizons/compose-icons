package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_color_text: ImageVector
    get() {
        if (_Format_color_text != null) return _Format_color_text!!
        
        _Format_color_text = ImageVector.Builder(
            name = "format_color_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 920f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 800f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 960f)
                horizontalLineTo(120f)
                close()
                moveToRelative(165f, -280f)
                quadToRelative(-23f, 0f, -36.5f, -19.5f)
                reflectiveQuadTo(243f, 619f)
                lineToRelative(176f, -469f)
                quadToRelative(5f, -14f, 17f, -22f)
                reflectiveQuadToRelative(26f, -8f)
                horizontalLineToRelative(36f)
                quadToRelative(15f, 0f, 26.5f, 8f)
                reflectiveQuadToRelative(16.5f, 22f)
                lineToRelative(177f, 470f)
                quadToRelative(8f, 22f, -5.5f, 41f)
                reflectiveQuadTo(676f, 680f)
                quadToRelative(-14f, 0f, -26f, -8f)
                reflectiveQuadToRelative(-17f, -22f)
                lineToRelative(-39f, -114f)
                horizontalLineTo(368f)
                lineToRelative(-41f, 115f)
                quadToRelative(-5f, 14f, -16.5f, 21.5f)
                reflectiveQuadTo(285f, 680f)
                close()
                moveToRelative(111f, -224f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
            }
        }.build()
        
        return _Format_color_text!!
    }

private var _Format_color_text: ImageVector? = null


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Text_fields_alt: ImageVector
    get() {
        if (_Text_fields_alt != null) return _Text_fields_alt!!
        
        _Text_fields_alt = ImageVector.Builder(
            name = "text_fields_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 760f)
                close()
                moveToRelative(640f, -110f)
                verticalLineToRelative(-500f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(790f, 120f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(820f, 150f)
                verticalLineToRelative(500f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(790f, 680f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(760f, 650f)
                close()
                moveTo(308f, 536f)
                lineToRelative(-41f, 115f)
                quadToRelative(-5f, 14f, -16.5f, 21.5f)
                reflectiveQuadTo(225f, 680f)
                quadToRelative(-23f, 0f, -36.5f, -19.5f)
                reflectiveQuadTo(183f, 619f)
                lineToRelative(176f, -469f)
                quadToRelative(5f, -14f, 17f, -22f)
                reflectiveQuadToRelative(26f, -8f)
                horizontalLineToRelative(36f)
                quadToRelative(15f, 0f, 26.5f, 8f)
                reflectiveQuadToRelative(16.5f, 22f)
                lineToRelative(177f, 470f)
                quadToRelative(8f, 22f, -5.5f, 41f)
                reflectiveQuadTo(616f, 680f)
                quadToRelative(-14f, 0f, -26f, -8f)
                reflectiveQuadToRelative(-17f, -22f)
                lineToRelative(-39f, -114f)
                horizontalLineTo(308f)
                close()
                moveToRelative(28f, -80f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
            }
        }.build()
        
        return _Text_fields_alt!!
    }

private var _Text_fields_alt: ImageVector? = null


package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Picture_in_picture_off: ImageVector
    get() {
        if (_Picture_in_picture_off != null) return _Picture_in_picture_off!!
        
        _Picture_in_picture_off = ImageVector.Builder(
            name = "picture_in_picture_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineTo(126f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(53f, -175f)
                lineTo(634f, 520f)
                horizontalLineToRelative(66f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 280f)
                horizontalLineTo(500f)
                quadToRelative(-22f, 0f, -38f, 13.5f)
                reflectiveQuadTo(441f, 327f)
                lineTo(274f, 160f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_off!!
    }

private var _Picture_in_picture_off: ImageVector? = null


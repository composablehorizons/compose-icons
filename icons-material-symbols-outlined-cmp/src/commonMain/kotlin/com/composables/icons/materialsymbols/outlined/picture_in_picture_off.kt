package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Picture_in_picture_off: ImageVector
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
                moveTo(554f, 440f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(66f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 460f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 280f)
                horizontalLineTo(500f)
                quadToRelative(-22f, 0f, -38f, 14f)
                reflectiveQuadToRelative(-21f, 34f)
                lineToRelative(33f, 32f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(80f)
                horizontalLineTo(554f)
                close()
                moveToRelative(317f, 317f)
                lineToRelative(-71f, -71f)
                verticalLineToRelative(-446f)
                horizontalLineTo(354f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                close()
                moveTo(383f, 497f)
                close()
                moveToRelative(194f, -34f)
                close()
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_off!!
    }

private var _Picture_in_picture_off: ImageVector? = null


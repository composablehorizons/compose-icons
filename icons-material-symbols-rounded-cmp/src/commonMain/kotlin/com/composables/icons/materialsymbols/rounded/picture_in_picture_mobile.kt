package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Picture_in_picture_mobile: ImageVector
    get() {
        if (_Picture_in_picture_mobile != null) return _Picture_in_picture_mobile!!
        
        _Picture_in_picture_mobile = ImageVector.Builder(
            name = "picture_in_picture_mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(-40f, 320f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(-80f, -40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_mobile!!
    }

private var _Picture_in_picture_mobile: ImageVector? = null


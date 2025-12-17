package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Picture_in_picture_medium: ImageVector
    get() {
        if (_Picture_in_picture_medium != null) return _Picture_in_picture_medium!!
        
        _Picture_in_picture_medium = ImageVector.Builder(
            name = "picture_in_picture_medium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(320f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_medium!!
    }

private var _Picture_in_picture_medium: ImageVector? = null


package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Local_cafe: ImageVector
    get() {
        if (_Local_cafe != null) return _Local_cafe!!
        
        _Local_cafe = ImageVector.Builder(
            name = "local_cafe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 520f)
                verticalLineToRelative(-320f)
                horizontalLineTo(240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 600f)
                close()
                moveToRelative(400f, -280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(320f, 600f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-320f)
                close()
            }
        }.build()
        
        return _Local_cafe!!
    }

private var _Local_cafe: ImageVector? = null


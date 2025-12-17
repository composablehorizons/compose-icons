package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.File_map_stack: ImageVector
    get() {
        if (_File_map_stack != null) return _File_map_stack!!
        
        _File_map_stack = ImageVector.Builder(
            name = "file_map_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -720f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(240f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 400f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(81f, -69f, 120.5f, -127.5f)
                reflectiveQuadTo(720f, 364f)
                quadToRelative(0f, -75f, -48.5f, -119.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(-63f, 0f, -111.5f, 44.5f)
                reflectiveQuadTo(400f, 364f)
                quadToRelative(0f, 50f, 39.5f, 108.5f)
                reflectiveQuadTo(560f, 600f)
                close()
            }
        }.build()
        
        return _File_map_stack!!
    }

private var _File_map_stack: ImageVector? = null


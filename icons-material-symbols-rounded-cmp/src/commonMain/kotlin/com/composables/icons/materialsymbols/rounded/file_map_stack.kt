package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.File_map_stack: ImageVector
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
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -720f)
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


package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.File_map: ImageVector
    get() {
        if (_File_map != null) return _File_map!!
        
        _File_map = ImageVector.Builder(
            name = "file_map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -520f)
                quadToRelative(-76f, 0f, -134f, 53f)
                reflectiveQuadToRelative(-58f, 144f)
                quadToRelative(0f, 73f, 57f, 144f)
                reflectiveQuadToRelative(108f, 116f)
                quadToRelative(6f, 5f, 13f, 7.5f)
                reflectiveQuadToRelative(14f, 2.5f)
                quadToRelative(7f, 0f, 14f, -2.5f)
                reflectiveQuadToRelative(13f, -7.5f)
                quadToRelative(51f, -45f, 108f, -116f)
                reflectiveQuadToRelative(57f, -144f)
                quadToRelative(0f, -91f, -58f, -144f)
                reflectiveQuadToRelative(-134f, -53f)
                close()
                moveToRelative(0f, 250f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(430f, 440f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(480f, 390f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(530f, 440f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(480f, 490f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _File_map!!
    }

private var _File_map: ImageVector? = null


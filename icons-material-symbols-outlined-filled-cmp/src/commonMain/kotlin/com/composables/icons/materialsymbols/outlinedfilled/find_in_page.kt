package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Find_in_page: ImageVector
    get() {
        if (_Find_in_page != null) return _Find_in_page!!
        
        _Find_in_page = ImageVector.Builder(
            name = "find_in_page",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                lineToRelative(200f, 240f)
                verticalLineToRelative(466f)
                lineTo(618f, 600f)
                quadToRelative(11f, -17f, 16.5f, -37f)
                reflectiveQuadToRelative(5.5f, -43f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(23f, 0f, 43f, -5.5f)
                reflectiveQuadToRelative(37f, -16.5f)
                lineTo(768f, 864f)
                quadToRelative(-23f, 10f, -48f, 13f)
                reflectiveQuadToRelative(-50f, 3f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Find_in_page!!
    }

private var _Find_in_page: ImageVector? = null


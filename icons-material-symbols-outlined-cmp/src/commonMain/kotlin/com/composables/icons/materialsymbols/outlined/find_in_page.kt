package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Find_in_page: ImageVector
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
                moveTo(590f, 800f)
                lineToRelative(80f, 80f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                lineToRelative(200f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 20f, -8.5f, 36.5f)
                reflectiveQuadTo(768f, 864f)
                lineTo(560f, 658f)
                quadToRelative(-17f, 11f, -37f, 16.5f)
                reflectiveQuadToRelative(-43f, 5.5f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 43f)
                reflectiveQuadTo(618f, 600f)
                lineToRelative(102f, 104f)
                verticalLineToRelative(-356f)
                lineTo(562f, 160f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(350f)
                close()
                moveTo(480f, 600f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Find_in_page!!
    }

private var _Find_in_page: ImageVector? = null


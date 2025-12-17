package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Find_in_page: ImageVector
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
                horizontalLineToRelative(323f)
                quadToRelative(18f, 0f, 34f, 7.5f)
                reflectiveQuadToRelative(27f, 21.5f)
                lineToRelative(157f, 189f)
                quadToRelative(9f, 11f, 14f, 24f)
                reflectiveQuadToRelative(5f, 27f)
                verticalLineToRelative(451f)
                quadToRelative(0f, 27f, -24.5f, 37f)
                reflectiveQuadToRelative(-43.5f, -9f)
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
                horizontalLineToRelative(333f)
                quadToRelative(20f, 0f, 30f, 12.5f)
                reflectiveQuadToRelative(10f, 27.5f)
                quadToRelative(0f, 15f, -10f, 27.5f)
                reflectiveQuadTo(573f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -280f)
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


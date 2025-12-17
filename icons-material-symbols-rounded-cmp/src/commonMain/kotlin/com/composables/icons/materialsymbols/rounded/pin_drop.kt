package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pin_drop: ImageVector
    get() {
        if (_Pin_drop != null) return _Pin_drop!!
        
        _Pin_drop = ImageVector.Builder(
            name = "pin_drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 659f)
                quadToRelative(99f, -80f, 149.5f, -154f)
                reflectiveQuadTo(680f, 366f)
                quadToRelative(0f, -56f, -20.5f, -95.5f)
                reflectiveQuadToRelative(-50.5f, -64f)
                quadTo(579f, 182f, 544f, 171f)
                reflectiveQuadToRelative(-64f, -11f)
                quadToRelative(-29f, 0f, -64f, 11f)
                reflectiveQuadToRelative(-65f, 35.5f)
                quadToRelative(-30f, 24.5f, -50.5f, 64f)
                reflectiveQuadTo(280f, 366f)
                quadToRelative(0f, 65f, 50.5f, 139f)
                reflectiveQuadTo(480f, 659f)
                close()
                moveToRelative(0f, 85f)
                quadToRelative(-10f, 0f, -19.5f, -3f)
                reflectiveQuadToRelative(-17.5f, -9f)
                quadToRelative(-81f, -63f, -162f, -158.5f)
                reflectiveQuadTo(200f, 366f)
                quadToRelative(0f, -71f, 25.5f, -124.5f)
                reflectiveQuadTo(291f, 152f)
                quadToRelative(40f, -36f, 90f, -54f)
                reflectiveQuadToRelative(99f, -18f)
                quadToRelative(49f, 0f, 99f, 18f)
                reflectiveQuadToRelative(90f, 54f)
                quadToRelative(40f, 36f, 65.5f, 89.5f)
                reflectiveQuadTo(760f, 366f)
                quadToRelative(0f, 112f, -81f, 207.5f)
                reflectiveQuadTo(517f, 732f)
                quadToRelative(-8f, 6f, -17.5f, 9f)
                reflectiveQuadToRelative(-19.5f, 3f)
                close()
                moveToRelative(0f, -304f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -514f)
                close()
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null


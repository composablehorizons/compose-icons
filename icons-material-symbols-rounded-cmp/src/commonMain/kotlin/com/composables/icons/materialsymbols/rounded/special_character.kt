package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Special_character: ImageVector
    get() {
        if (_Special_character != null) return _Special_character!!
        
        _Special_character = ImageVector.Builder(
            name = "special_character",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 200f)
                quadToRelative(-92f, 0f, -156f, 64f)
                reflectiveQuadToRelative(-64f, 156f)
                quadToRelative(0f, 63f, 33f, 116f)
                reflectiveQuadToRelative(90f, 81f)
                quadToRelative(24f, 12f, 40.5f, 32.5f)
                reflectiveQuadTo(440f, 696f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(380f, 840f)
                horizontalLineTo(180f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 780f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(180f, 720f)
                horizontalLineToRelative(140f)
                quadToRelative(-84f, -45f, -132f, -125f)
                reflectiveQuadToRelative(-48f, -175f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(142f, 0f, 241f, 99f)
                reflectiveQuadToRelative(99f, 241f)
                quadToRelative(0f, 95f, -48f, 175f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 780f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 840f)
                horizontalLineTo(580f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 780f)
                verticalLineToRelative(-84f)
                quadToRelative(0f, -26f, 16.5f, -46.5f)
                reflectiveQuadTo(577f, 617f)
                quadToRelative(57f, -28f, 90f, -81f)
                reflectiveQuadToRelative(33f, -116f)
                quadToRelative(0f, -92f, -64f, -156f)
                reflectiveQuadToRelative(-156f, -64f)
                close()
            }
        }.build()
        
        return _Special_character!!
    }

private var _Special_character: ImageVector? = null


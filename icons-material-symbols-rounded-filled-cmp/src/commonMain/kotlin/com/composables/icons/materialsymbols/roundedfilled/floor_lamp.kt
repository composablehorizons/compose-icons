package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Floor_lamp: ImageVector
    get() {
        if (_Floor_lamp != null) return _Floor_lamp!!
        
        _Floor_lamp = ImageVector.Builder(
            name = "floor_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 720f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                quadToRelative(-20f, 0f, -32f, -16f)
                reflectiveQuadToRelative(-6f, -36f)
                lineToRelative(78f, -252f)
                quadToRelative(8f, -25f, 29f, -40.5f)
                reflectiveQuadToRelative(47f, -15.5f)
                horizontalLineToRelative(248f)
                quadToRelative(26f, 0f, 47f, 15.5f)
                reflectiveQuadToRelative(29f, 40.5f)
                lineToRelative(78f, 252f)
                quadToRelative(6f, 20f, -6f, 36f)
                reflectiveQuadToRelative(-32f, 16f)
                horizontalLineTo(520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveTo(360f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Floor_lamp!!
    }

private var _Floor_lamp: ImageVector? = null


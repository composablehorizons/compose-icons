package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 480f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 14f, 12f, 19f)
                reflectiveQuadToRelative(22f, -5f)
                lineToRelative(78f, -78f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-78f, -78f)
                quadToRelative(-10f, -10f, -22f, -5f)
                reflectiveQuadToRelative(-12f, 19f)
                verticalLineToRelative(52f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(80f, 400f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 856f)
                lineTo(104f, 536f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(320f, -320f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(320f, 320f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(856f, 536f)
                lineTo(536f, 856f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(320f, 640f)
                lineToRelative(160f, 160f)
                lineToRelative(320f, -320f)
                lineToRelative(-320f, -320f)
                lineToRelative(-320f, 320f)
                lineToRelative(160f, 160f)
                close()
                moveToRelative(160f, -160f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null


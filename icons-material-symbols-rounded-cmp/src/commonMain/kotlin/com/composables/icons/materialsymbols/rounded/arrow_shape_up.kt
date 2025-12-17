package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_shape_up: ImageVector
    get() {
        if (_Arrow_shape_up != null) return _Arrow_shape_up!!
        
        _Arrow_shape_up = ImageVector.Builder(
            name = "arrow_shape_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineTo(183f)
                quadToRelative(-19f, 0f, -27f, -17f)
                reflectiveQuadToRelative(4f, -32f)
                lineToRelative(289f, -353f)
                quadToRelative(12f, -15f, 31f, -15f)
                reflectiveQuadToRelative(31f, 15f)
                lineToRelative(289f, 353f)
                quadToRelative(12f, 15f, 4f, 32f)
                reflectiveQuadToRelative(-27f, 17f)
                horizontalLineTo(640f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 520f)
                horizontalLineToRelative(71f)
                lineTo(480f, 286f)
                lineTo(289f, 520f)
                horizontalLineToRelative(71f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(80f, -240f)
                close()
            }
        }.build()
        
        return _Arrow_shape_up!!
    }

private var _Arrow_shape_up: ImageVector? = null


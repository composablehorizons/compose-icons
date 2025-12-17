package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_medium: ImageVector
    get() {
        if (_Water_medium != null) return _Water_medium!!
        
        _Water_medium = ImageVector.Builder(
            name = "water_medium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(245f, 486f)
                quadToRelative(47f, -23f, 97.5f, -34.5f)
                reflectiveQuadTo(445f, 440f)
                quadToRelative(30f, 0f, 59.5f, 4f)
                reflectiveQuadToRelative(58.5f, 12f)
                quadToRelative(50f, 14f, 76.5f, 19f)
                reflectiveQuadToRelative(56.5f, 5f)
                horizontalLineToRelative(19f)
                lineToRelative(35f, -320f)
                horizontalLineTo(210f)
                lineToRelative(35f, 326f)
                close()
                moveToRelative(34f, 394f)
                quadToRelative(-31f, 0f, -53.5f, -20.5f)
                reflectiveQuadTo(200f, 809f)
                lineToRelative(-70f, -640f)
                quadToRelative(-4f, -35f, 19.5f, -62f)
                reflectiveQuadToRelative(59.5f, -27f)
                horizontalLineToRelative(542f)
                quadToRelative(36f, 0f, 59.5f, 27f)
                reflectiveQuadToRelative(19.5f, 62f)
                lineToRelative(-70f, 640f)
                quadToRelative(-3f, 30f, -25.5f, 50.5f)
                reflectiveQuadTo(681f, 880f)
                horizontalLineTo(279f)
                close()
            }
        }.build()
        
        return _Water_medium!!
    }

private var _Water_medium: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_loss: ImageVector
    get() {
        if (_Water_loss != null) return _Water_loss!!
        
        _Water_loss = ImageVector.Builder(
            name = "water_loss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(258f, 600f)
                quadToRelative(45f, -20f, 92f, -30f)
                reflectiveQuadToRelative(95f, -10f)
                quadToRelative(30f, 0f, 59.5f, 4f)
                reflectiveQuadToRelative(58.5f, 12f)
                quadToRelative(50f, 14f, 76.5f, 19f)
                reflectiveQuadToRelative(56.5f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(48f, -440f)
                horizontalLineTo(210f)
                lineToRelative(48f, 440f)
                close()
                moveToRelative(21f, 280f)
                quadToRelative(-31f, 0f, -53.5f, -20f)
                reflectiveQuadTo(200f, 809f)
                lineToRelative(-69f, -630f)
                quadToRelative(-5f, -40f, 22f, -69.5f)
                reflectiveQuadToRelative(67f, -29.5f)
                horizontalLineToRelative(520f)
                quadToRelative(40f, 0f, 67f, 29.5f)
                reflectiveQuadToRelative(22f, 69.5f)
                lineToRelative(-69f, 630f)
                quadToRelative(-3f, 31f, -25.5f, 51f)
                reflectiveQuadTo(681f, 880f)
                horizontalLineTo(279f)
                close()
            }
        }.build()
        
        return _Water_loss!!
    }

private var _Water_loss: ImageVector? = null


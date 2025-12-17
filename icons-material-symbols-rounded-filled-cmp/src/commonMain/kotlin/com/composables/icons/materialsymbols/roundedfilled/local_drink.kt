package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_drink: ImageVector
    get() {
        if (_Local_drink != null) return _Local_drink!!
        
        _Local_drink = ImageVector.Builder(
            name = "local_drink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279f, 880f)
                quadToRelative(-31f, 0f, -53.5f, -20.5f)
                reflectiveQuadTo(200f, 809f)
                lineToRelative(-69f, -630f)
                quadToRelative(-5f, -40f, 22f, -69.5f)
                reflectiveQuadToRelative(67f, -29.5f)
                horizontalLineToRelative(520f)
                quadToRelative(40f, 0f, 67f, 29.5f)
                reflectiveQuadToRelative(22f, 69.5f)
                lineToRelative(-69f, 630f)
                quadToRelative(-3f, 30f, -25.5f, 50.5f)
                reflectiveQuadTo(681f, 880f)
                horizontalLineTo(279f)
                close()
                moveToRelative(-53f, -560f)
                horizontalLineToRelative(508f)
                lineToRelative(16f, -160f)
                horizontalLineTo(210f)
                lineToRelative(16f, 160f)
                close()
                moveToRelative(254f, 440f)
                quadToRelative(48f, 0f, 81f, -33f)
                reflectiveQuadToRelative(33f, -81f)
                quadToRelative(0f, -47f, -27.5f, -91f)
                reflectiveQuadTo(511f, 477f)
                quadToRelative(-6f, -8f, -14.5f, -11.5f)
                reflectiveQuadTo(480f, 462f)
                quadToRelative(-8f, 0f, -16.5f, 3.5f)
                reflectiveQuadTo(449f, 477f)
                quadToRelative(-28f, 34f, -55.5f, 78f)
                reflectiveQuadTo(366f, 646f)
                quadToRelative(0f, 48f, 33f, 81f)
                reflectiveQuadToRelative(81f, 33f)
                close()
            }
        }.build()
        
        return _Local_drink!!
    }

private var _Local_drink: ImageVector? = null


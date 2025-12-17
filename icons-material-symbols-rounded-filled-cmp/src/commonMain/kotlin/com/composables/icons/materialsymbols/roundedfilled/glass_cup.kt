package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Glass_cup: ImageVector
    get() {
        if (_Glass_cup != null) return _Glass_cup!!
        
        _Glass_cup = ImageVector.Builder(
            name = "glass_cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279f, 880f)
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
                moveToRelative(-16f, -240f)
                horizontalLineToRelative(435f)
                lineToRelative(52f, -480f)
                horizontalLineTo(210f)
                lineToRelative(53f, 480f)
                close()
            }
        }.build()
        
        return _Glass_cup!!
    }

private var _Glass_cup: ImageVector? = null


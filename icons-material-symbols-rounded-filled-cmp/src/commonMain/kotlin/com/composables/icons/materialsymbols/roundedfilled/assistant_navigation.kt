package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Assistant_navigation: ImageVector
    get() {
        if (_Assistant_navigation != null) return _Assistant_navigation!!
        
        _Assistant_navigation = ImageVector.Builder(
            name = "assistant_navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(348f, 665f)
                lineToRelative(123f, -54f)
                quadToRelative(5f, -2f, 9.5f, -2f)
                reflectiveQuadToRelative(9.5f, 2f)
                lineToRelative(122f, 54f)
                quadToRelative(14f, 6f, 25f, -4.5f)
                reflectiveQuadToRelative(5f, -24.5f)
                lineTo(501f, 292f)
                quadToRelative(-6f, -14f, -21f, -14f)
                reflectiveQuadToRelative(-21f, 14f)
                lineTo(318f, 636f)
                quadToRelative(-6f, 14f, 5f, 24.5f)
                reflectiveQuadToRelative(25f, 4.5f)
                close()
            }
        }.build()
        
        return _Assistant_navigation!!
    }

private var _Assistant_navigation: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Error_med: ImageVector
    get() {
        if (_Error_med != null) return _Error_med!!
        
        _Error_med = ImageVector.Builder(
            name = "error_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369f, 497f)
                lineToRelative(58f, 79f)
                quadToRelative(6f, 8f, 16f, 8f)
                reflectiveQuadToRelative(16f, -8f)
                lineToRelative(58f, -79f)
                lineToRelative(57f, 79f)
                quadToRelative(6f, 8f, 16.5f, 8f)
                reflectiveQuadToRelative(16.5f, -8f)
                lineToRelative(90f, -123f)
                quadToRelative(10f, -14f, 7.5f, -30f)
                reflectiveQuadTo(688f, 397f)
                quadToRelative(-14f, -10f, -30f, -7.5f)
                reflectiveQuadTo(632f, 406f)
                lineToRelative(-42f, 57f)
                lineToRelative(-57f, -79f)
                quadToRelative(-6f, -8f, -16.5f, -8f)
                reflectiveQuadToRelative(-16.5f, 8f)
                lineToRelative(-57f, 79f)
                lineToRelative(-58f, -79f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-90f, 123f)
                quadToRelative(-10f, 14f, -7.5f, 30f)
                reflectiveQuadToRelative(16.5f, 26f)
                quadToRelative(14f, 10f, 30f, 7.5f)
                reflectiveQuadToRelative(26f, -16.5f)
                lineToRelative(41f, -57f)
                close()
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
            }
        }.build()
        
        return _Error_med!!
    }

private var _Error_med: ImageVector? = null


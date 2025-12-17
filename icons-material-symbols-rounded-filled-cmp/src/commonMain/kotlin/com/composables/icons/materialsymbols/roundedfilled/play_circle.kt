package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Play_circle: ImageVector
    get() {
        if (_Play_circle != null) return _Play_circle!!
        
        _Play_circle = ImageVector.Builder(
            name = "play_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(426f, 630f)
                lineToRelative(195f, -125f)
                quadToRelative(14f, -9f, 14f, -25f)
                reflectiveQuadToRelative(-14f, -25f)
                lineTo(426f, 330f)
                quadToRelative(-15f, -10f, -30.5f, -1.5f)
                reflectiveQuadTo(380f, 355f)
                verticalLineToRelative(250f)
                quadToRelative(0f, 18f, 15.5f, 26.5f)
                reflectiveQuadTo(426f, 630f)
                close()
                moveToRelative(54f, 250f)
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
        
        return _Play_circle!!
    }

private var _Play_circle: ImageVector? = null


package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Left_click: ImageVector
    get() {
        if (_Left_click != null) return _Left_click!!
        
        _Left_click = ImageVector.Builder(
            name = "left_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(468f, 720f)
                quadToRelative(-96f, -5f, -162f, -74f)
                reflectiveQuadToRelative(-66f, -166f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(97f, 0f, 166f, 66f)
                reflectiveQuadToRelative(74f, 162f)
                lineToRelative(-84f, -25f)
                quadToRelative(-13f, -54f, -56f, -88.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 57f, 34.5f, 100f)
                reflectiveQuadToRelative(88.5f, 56f)
                lineToRelative(25f, 84f)
                close()
                moveTo(821f, 900f)
                lineTo(650f, 729f)
                lineTo(600f, 880f)
                lineTo(480f, 480f)
                lineToRelative(400f, 120f)
                lineToRelative(-151f, 50f)
                lineToRelative(171f, 171f)
                lineToRelative(-79f, 79f)
                close()
            }
        }.build()
        
        return _Left_click!!
    }

private var _Left_click: ImageVector? = null


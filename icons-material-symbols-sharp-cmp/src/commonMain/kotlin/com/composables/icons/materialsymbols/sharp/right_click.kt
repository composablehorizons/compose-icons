package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Right_click: ImageVector
    get() {
        if (_Right_click != null) return _Right_click!!
        
        _Right_click = ImageVector.Builder(
            name = "right_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(492f, 720f)
                lineToRelative(25f, -84f)
                quadToRelative(54f, -13f, 88.5f, -56f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-57f, 0f, -100f, 34.5f)
                reflectiveQuadTo(324f, 443f)
                lineToRelative(-84f, 25f)
                quadToRelative(5f, -96f, 74f, -162f)
                reflectiveQuadToRelative(166f, -66f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 97f, -66f, 166f)
                reflectiveQuadToRelative(-162f, 74f)
                close()
                moveTo(139f, 900f)
                lineToRelative(-79f, -79f)
                lineToRelative(171f, -171f)
                lineToRelative(-151f, -50f)
                lineToRelative(400f, -120f)
                lineTo(360f, 880f)
                lineToRelative(-50f, -151f)
                lineTo(139f, 900f)
                close()
            }
        }.build()
        
        return _Right_click!!
    }

private var _Right_click: ImageVector? = null


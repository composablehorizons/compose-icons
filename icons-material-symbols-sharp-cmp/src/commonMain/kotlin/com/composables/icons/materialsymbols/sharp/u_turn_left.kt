package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.U_turn_left: ImageVector
    get() {
        if (_U_turn_left != null) return _U_turn_left!!
        
        _U_turn_left = ImageVector.Builder(
            name = "u_turn_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(168f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                lineToRelative(-160f, -160f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-168f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _U_turn_left!!
    }

private var _U_turn_left: ImageVector? = null


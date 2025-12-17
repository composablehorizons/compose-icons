package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Check_circle_unread: ImageVector
    get() {
        if (_Check_circle_unread != null) return _Check_circle_unread!!
        
        _Check_circle_unread = ImageVector.Builder(
            name = "check_circle_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
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
                quadToRelative(28f, 0f, 55.5f, 4f)
                reflectiveQuadToRelative(54.5f, 12f)
                quadToRelative(-11f, 17f, -18f, 36.5f)
                reflectiveQuadTo(562f, 172f)
                quadToRelative(-20f, -6f, -40.5f, -9f)
                reflectiveQuadToRelative(-41.5f, -3f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -21f, -3f, -41.5f)
                reflectiveQuadToRelative(-9f, -40.5f)
                quadToRelative(20f, -3f, 39.5f, -10f)
                reflectiveQuadToRelative(36.5f, -18f)
                quadToRelative(8f, 27f, 12f, 54.5f)
                reflectiveQuadToRelative(4f, 55.5f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-57f, -216f)
                lineToRelative(273f, -273f)
                quadToRelative(-20f, -7f, -37.5f, -17.5f)
                reflectiveQuadTo(625f, 349f)
                lineTo(424f, 550f)
                lineTo(310f, 438f)
                lineToRelative(-56f, 56f)
                lineToRelative(169f, 170f)
                close()
            }
        }.build()
        
        return _Check_circle_unread!!
    }

private var _Check_circle_unread: ImageVector? = null


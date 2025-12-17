package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Check_circle_unread: ImageVector
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
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadTo(197f, 198f)
                quadToRelative(54f, -54f, 126.5f, -85.5f)
                reflectiveQuadTo(479f, 81f)
                quadToRelative(17f, 0f, 33f, 1.5f)
                reflectiveQuadToRelative(32f, 3.5f)
                quadToRelative(17f, 3f, 25f, 19f)
                reflectiveQuadToRelative(1f, 33f)
                quadToRelative(-5f, 15f, -7.5f, 30f)
                reflectiveQuadToRelative(-2.5f, 32f)
                quadToRelative(0f, 45f, 17.5f, 82.5f)
                reflectiveQuadTo(626f, 348f)
                lineTo(423f, 552f)
                lineToRelative(-85f, -86f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(113f, 113f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(246f, -246f)
                quadToRelative(15f, 5f, 30.5f, 7.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(17f, 0f, 32f, -2.5f)
                reflectiveQuadToRelative(30f, -7.5f)
                quadToRelative(17f, -5f, 33f, 2f)
                reflectiveQuadToRelative(19f, 24f)
                quadToRelative(2f, 16f, 3.5f, 31.5f)
                reflectiveQuadTo(879f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(762f, 763f)
                quadToRelative(-54f, 54f, -126.5f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(280f, -560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Check_circle_unread!!
    }

private var _Check_circle_unread: ImageVector? = null


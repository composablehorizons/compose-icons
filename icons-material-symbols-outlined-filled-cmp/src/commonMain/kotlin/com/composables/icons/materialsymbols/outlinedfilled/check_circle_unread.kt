package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Check_circle_unread: ImageVector
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
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 81f)
                quadToRelative(29f, 0f, 56f, 3.5f)
                reflectiveQuadToRelative(53f, 11.5f)
                quadToRelative(-14f, 23f, -21.5f, 49f)
                reflectiveQuadToRelative(-7.5f, 55f)
                quadToRelative(0f, 45f, 17.5f, 82.5f)
                reflectiveQuadTo(626f, 348f)
                lineTo(423f, 552f)
                lineTo(310f, 438f)
                lineToRelative(-57f, 57f)
                lineToRelative(170f, 169f)
                lineToRelative(274f, -274f)
                quadToRelative(15f, 5f, 30.5f, 7.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(29f, 0f, 55f, -7.5f)
                reflectiveQuadToRelative(49f, -21.5f)
                quadToRelative(8f, 26f, 11.5f, 53f)
                reflectiveQuadToRelative(3.5f, 56f)
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


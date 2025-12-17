package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Check_circle_unread: ImageVector
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
                quadToRelative(18f, 0f, 36f, 2f)
                reflectiveQuadToRelative(35f, 5f)
                quadToRelative(16f, 3f, 23.5f, 17.5f)
                reflectiveQuadTo(576f, 134f)
                quadToRelative(-6f, 16f, -21f, 23.5f)
                reflectiveQuadToRelative(-32f, 5.5f)
                quadToRelative(-11f, -2f, -21.5f, -2.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -11f, -0.5f, -21.5f)
                reflectiveQuadTo(797f, 437f)
                quadToRelative(-2f, -17f, 5.5f, -32f)
                reflectiveQuadToRelative(23.5f, -21f)
                quadToRelative(16f, -6f, 30f, 1.5f)
                reflectiveQuadToRelative(17f, 23.5f)
                quadToRelative(3f, 17f, 5f, 35f)
                reflectiveQuadToRelative(2f, 36f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-56f, -330f)
                lineToRelative(-86f, -85f)
                quadToRelative(-11f, -11f, -27.5f, -11f)
                reflectiveQuadTo(282f, 466f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(113f, 114f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(209f, -209f)
                quadToRelative(14f, -14f, 12f, -29.5f)
                reflectiveQuadTo(659f, 371f)
                quadToRelative(-11f, -11f, -26.5f, -12.5f)
                reflectiveQuadTo(603f, 371f)
                lineTo(424f, 550f)
                close()
            }
        }.build()
        
        return _Check_circle_unread!!
    }

private var _Check_circle_unread: ImageVector? = null


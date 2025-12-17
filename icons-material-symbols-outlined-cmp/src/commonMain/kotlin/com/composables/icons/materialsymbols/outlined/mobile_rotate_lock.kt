package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mobile_rotate_lock: ImageVector
    get() {
        if (_Mobile_rotate_lock != null) return _Mobile_rotate_lock!!
        
        _Mobile_rotate_lock = ImageVector.Builder(
            name = "mobile_rotate_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(714f, 360f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(6f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(714f)
                close()
                moveToRelative(46f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(40f)
                close()
                moveTo(496f, 778f)
                lineTo(183f, 464f)
                quadToRelative(-11f, -11f, -16.5f, -25.5f)
                reflectiveQuadTo(161f, 410f)
                quadToRelative(0f, -15f, 5.5f, -29f)
                reflectiveQuadToRelative(16.5f, -25f)
                lineToRelative(173f, -173f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(28.5f, -6f)
                quadToRelative(15f, 0f, 29f, 6f)
                reflectiveQuadToRelative(25f, 17f)
                lineToRelative(313f, 313f)
                quadToRelative(11f, 11f, 17f, 25f)
                reflectiveQuadToRelative(6f, 29f)
                quadToRelative(0f, 14f, -6f, 28.5f)
                reflectiveQuadTo(777f, 604f)
                lineTo(604f, 778f)
                quadToRelative(-11f, 11f, -25f, 16.5f)
                reflectiveQuadToRelative(-29f, 5.5f)
                quadToRelative(-14f, 0f, -28.5f, -5.5f)
                reflectiveQuadTo(496f, 778f)
                close()
                moveToRelative(54f, -58f)
                lineToRelative(170f, -170f)
                lineToRelative(-310f, -310f)
                lineToRelative(-170f, 170f)
                lineToRelative(310f, 310f)
                close()
                moveTo(480f, 960f)
                quadToRelative(-99f, 0f, -186.5f, -37.5f)
                reflectiveQuadToRelative(-153f, -103f)
                quadTo(75f, 754f, 37.5f, 666.5f)
                reflectiveQuadTo(0f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 71f, 24f, 136f)
                reflectiveQuadToRelative(66.5f, 117f)
                quadTo(213f, 785f, 272f, 821.5f)
                reflectiveQuadTo(401f, 873f)
                lineTo(296f, 768f)
                lineToRelative(56f, -56f)
                lineTo(588f, 948f)
                quadToRelative(-26f, 6f, -53.5f, 9f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(0f, -480f)
                close()
                moveToRelative(-107f, -76f)
                quadToRelative(13f, 0f, 21.5f, -9f)
                reflectiveQuadToRelative(8.5f, -21f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(373f, 344f)
                quadToRelative(-12f, 0f, -21f, 8.5f)
                reflectiveQuadToRelative(-9f, 21.5f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
            }
        }.build()
        
        return _Mobile_rotate_lock!!
    }

private var _Mobile_rotate_lock: ImageVector? = null


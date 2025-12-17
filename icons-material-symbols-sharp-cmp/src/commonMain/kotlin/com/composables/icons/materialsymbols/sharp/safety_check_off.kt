package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Safety_check_off: ImageVector
    get() {
        if (_Safety_check_off != null) return _Safety_check_off!!
        
        _Safety_check_off = ImageVector.Builder(
            name = "safety_check_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(666f, 554f)
                quadToRelative(7f, -17f, 10.5f, -35.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -38f, 3.5f)
                reflectiveQuadTo(407f, 294f)
                lineToRelative(259f, 260f)
                close()
                moveToRelative(88f, 88f)
                lineToRelative(-60f, -62f)
                quadToRelative(12f, -32f, 19f, -66.5f)
                reflectiveQuadToRelative(7f, -69.5f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-146f, 55f)
                lineToRelative(-62f, -62f)
                lineToRelative(208f, -78f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 51f, -11.5f, 101f)
                reflectiveQuadTo(754f, 642f)
                close()
                moveToRelative(38f, 262f)
                lineTo(662f, 774f)
                quadToRelative(-38f, 39f, -84.5f, 65.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(423f, 535f)
                close()
                moveToRelative(91f, -135f)
                close()
                moveToRelative(-34f, 396f)
                quadToRelative(35f, -11f, 67f, -31f)
                reflectiveQuadToRelative(59f, -47f)
                lineToRelative(-52f, -52f)
                quadToRelative(-17f, 7f, -35.5f, 10.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -20f, 3.5f, -38.5f)
                reflectiveQuadTo(294f, 406f)
                lineToRelative(-54f, -54f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
            }
        }.build()
        
        return _Safety_check_off!!
    }

private var _Safety_check_off: ImageVector? = null


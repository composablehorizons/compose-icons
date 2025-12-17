package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Safety_check_off: ImageVector
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
                lineToRelative(180f, -67f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 51f, -11.5f, 101f)
                reflectiveQuadTo(754f, 642f)
                close()
                moveTo(480f, 876f)
                quadToRelative(-4f, 0f, -25f, -4f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-172f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(662f, 774f)
                quadToRelative(-33f, 35f, -72.5f, 59f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(34f, -476f)
                close()
                moveToRelative(-91f, 135f)
                close()
                moveToRelative(57f, 261f)
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


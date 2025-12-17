package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Run_circle: ImageVector
    get() {
        if (_Run_circle != null) return _Run_circle!!
        
        _Run_circle = ImageVector.Builder(
            name = "run_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 577f)
                lineToRelative(-45f, -49f)
                lineToRelative(-13f, 66f)
                quadToRelative(-3f, 17f, -16.5f, 26f)
                reflectiveQuadToRelative(-30.5f, 6f)
                lineToRelative(-92f, -19f)
                quadToRelative(-8f, -2f, -12.5f, -8.5f)
                reflectiveQuadTo(308f, 584f)
                quadToRelative(2f, -8f, 9f, -13f)
                reflectiveQuadToRelative(15f, -3f)
                lineToRelative(91f, 19f)
                lineToRelative(39f, -196f)
                lineToRelative(-62f, 23f)
                verticalLineToRelative(46f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -13f, 7f, -23f)
                reflectiveQuadToRelative(19f, -15f)
                lineToRelative(105f, -38f)
                quadToRelative(15f, -5f, 29.5f, 1f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(18f, 37f, 39.5f, 54f)
                reflectiveQuadToRelative(38.5f, 23f)
                quadToRelative(8f, 3f, 14f, 9.5f)
                reflectiveQuadToRelative(6f, 14.5f)
                quadToRelative(0f, 8f, -6f, 13.5f)
                reflectiveQuadToRelative(-14f, 3.5f)
                quadToRelative(-22f, -5f, -48f, -21.5f)
                reflectiveQuadTo(524f, 410f)
                lineToRelative(-17f, 94f)
                lineToRelative(42f, 45f)
                quadToRelative(5f, 5f, 8f, 12.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(123f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-123f)
                close()
                moveToRelative(20f, -257f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 320f)
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
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
            }
        }.build()
        
        return _Run_circle!!
    }

private var _Run_circle: ImageVector? = null


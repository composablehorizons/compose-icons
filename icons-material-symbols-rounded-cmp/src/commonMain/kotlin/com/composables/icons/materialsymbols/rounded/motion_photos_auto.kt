package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Motion_photos_auto: ImageVector
    get() {
        if (_Motion_photos_auto != null) return _Motion_photos_auto!!
        
        _Motion_photos_auto = ImageVector.Builder(
            name = "motion_photos_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 538f)
                horizontalLineToRelative(128f)
                lineToRelative(24f, 65f)
                quadToRelative(3f, 8f, 9.5f, 12.5f)
                reflectiveQuadTo(592f, 620f)
                quadToRelative(14f, 0f, 21.5f, -11f)
                reflectiveQuadToRelative(2.5f, -24f)
                lineTo(514f, 317f)
                quadToRelative(-3f, -8f, -9.5f, -12.5f)
                reflectiveQuadTo(490f, 300f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14.5f, 4.5f)
                reflectiveQuadTo(446f, 317f)
                lineTo(345f, 586f)
                quadToRelative(-5f, 12f, 2f, 23f)
                reflectiveQuadToRelative(21f, 11f)
                quadToRelative(8f, 0f, 14.5f, -4.5f)
                reflectiveQuadTo(392f, 603f)
                lineToRelative(24f, -65f)
                close()
                moveToRelative(16f, -46f)
                lineToRelative(46f, -132f)
                horizontalLineToRelative(4f)
                lineToRelative(46f, 132f)
                horizontalLineToRelative(-96f)
                close()
                moveToRelative(48f, 388f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -32f, 5f, -64f)
                reflectiveQuadToRelative(15f, -63f)
                quadToRelative(5f, -16f, 20.5f, -21.5f)
                reflectiveQuadTo(150f, 334f)
                quadToRelative(15f, 8f, 21.5f, 23.5f)
                reflectiveQuadTo(173f, 390f)
                quadToRelative(-6f, 22f, -9.5f, 44.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-24f, 0f, -47.5f, 3.5f)
                reflectiveQuadTo(386f, 174f)
                quadToRelative(-17f, 5f, -32f, -1f)
                reflectiveQuadToRelative(-22f, -21f)
                quadToRelative(-7f, -15f, -0.5f, -30.5f)
                reflectiveQuadTo(354f, 101f)
                quadToRelative(30f, -11f, 62f, -16f)
                reflectiveQuadToRelative(64f, -5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(220f, 280f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(280f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(220f, 280f)
                close()
                moveToRelative(260f, 200f)
                close()
            }
        }.build()
        
        return _Motion_photos_auto!!
    }

private var _Motion_photos_auto: ImageVector? = null


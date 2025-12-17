package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Motion_photos_auto: ImageVector
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
                moveTo(332f, 620f)
                horizontalLineToRelative(54f)
                lineToRelative(30f, -82f)
                horizontalLineToRelative(128f)
                lineToRelative(30f, 82f)
                horizontalLineToRelative(56f)
                lineTo(508f, 300f)
                horizontalLineToRelative(-56f)
                lineTo(332f, 620f)
                close()
                moveToRelative(100f, -128f)
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
                quadToRelative(0f, -43f, 9f, -84.5f)
                reflectiveQuadToRelative(26f, -80.5f)
                lineToRelative(62f, 62f)
                quadToRelative(-8f, 26f, -12.5f, 51.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-27f, 0f, -52.5f, 4.5f)
                reflectiveQuadTo(377f, 177f)
                lineToRelative(-61f, -61f)
                quadToRelative(40f, -18f, 80f, -27f)
                reflectiveQuadToRelative(84f, -9f)
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
                moveToRelative(20f, 200f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                close()
            }
        }.build()
        
        return _Motion_photos_auto!!
    }

private var _Motion_photos_auto: ImageVector? = null


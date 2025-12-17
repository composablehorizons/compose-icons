package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Move_location: ImageVector
    get() {
        if (_Move_location != null) return _Move_location!!
        
        _Move_location = ImageVector.Builder(
            name = "move_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(720f, 408f)
                verticalLineToRelative(17f)
                quadToRelative(0f, 9f, -2f, 18f)
                quadToRelative(-54f, 11f, -94.5f, 41.5f)
                reflectiveQuadTo(558f, 558f)
                quadToRelative(-25f, 43f, -31.5f, 93f)
                reflectiveQuadToRelative(9.5f, 101f)
                quadToRelative(-20f, 21f, -40.5f, 40.5f)
                reflectiveQuadTo(453f, 832f)
                quadToRelative(-11f, 11f, -25f, 16f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -16f)
                quadToRelative(-41f, -36f, -88f, -84.5f)
                reflectiveQuadToRelative(-86.5f, -104f)
                quadTo(133f, 588f, 106.5f, 528f)
                reflectiveQuadTo(80f, 408f)
                close()
                moveToRelative(320f, 192f)
                quadToRelative(56f, 0f, 101f, -27.5f)
                reflectiveQuadToRelative(71f, -72.5f)
                quadToRelative(-35f, -29f, -79f, -44.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-49f, 0f, -93f, 15.5f)
                reflectiveQuadTo(228f, 500f)
                quadToRelative(26f, 45f, 71f, 72.5f)
                reflectiveQuadTo(400f, 600f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 400f)
                close()
                moveToRelative(377f, 320f)
                horizontalLineTo(650f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(610f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(650f, 640f)
                horizontalLineToRelative(127f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(798f, 812f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(742f, 812f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                close()
            }
        }.build()
        
        return _Move_location!!
    }

private var _Move_location: ImageVector? = null


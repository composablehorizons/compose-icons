package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pill: ImageVector
    get() {
        if (_Pill != null) return _Pill!!
        
        _Pill = ImageVector.Builder(
            name = "pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(345f, 840f)
                quadToRelative(-94f, 0f, -159.5f, -65.5f)
                reflectiveQuadTo(120f, 615f)
                quadToRelative(0f, -45f, 17f, -86f)
                reflectiveQuadToRelative(49f, -73f)
                lineToRelative(270f, -270f)
                quadToRelative(32f, -32f, 73f, -49f)
                reflectiveQuadToRelative(86f, -17f)
                quadToRelative(94f, 0f, 159.5f, 65.5f)
                reflectiveQuadTo(840f, 345f)
                quadToRelative(0f, 45f, -17f, 86f)
                reflectiveQuadToRelative(-49f, 73f)
                lineTo(504f, 774f)
                quadToRelative(-32f, 32f, -73f, 49f)
                reflectiveQuadToRelative(-86f, 17f)
                close()
                moveToRelative(266f, -286f)
                lineToRelative(107f, -106f)
                quadToRelative(20f, -20f, 31f, -47f)
                reflectiveQuadToRelative(11f, -56f)
                quadToRelative(0f, -60f, -42.5f, -102.5f)
                reflectiveQuadTo(615f, 200f)
                quadToRelative(-29f, 0f, -56f, 11f)
                reflectiveQuadToRelative(-47f, 31f)
                lineTo(406f, 349f)
                lineToRelative(205f, 205f)
                close()
                moveTo(345f, 760f)
                quadToRelative(29f, 0f, 56f, -11f)
                reflectiveQuadToRelative(47f, -31f)
                lineToRelative(106f, -107f)
                lineToRelative(-205f, -205f)
                lineToRelative(-107f, 106f)
                quadToRelative(-20f, 20f, -31f, 47f)
                reflectiveQuadToRelative(-11f, 56f)
                quadToRelative(0f, 60f, 42.5f, 102.5f)
                reflectiveQuadTo(345f, 760f)
                close()
            }
        }.build()
        
        return _Pill!!
    }

private var _Pill: ImageVector? = null


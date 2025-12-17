package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Forward_circle: ImageVector
    get() {
        if (_Forward_circle != null) return _Forward_circle!!
        
        _Forward_circle = ImageVector.Builder(
            name = "forward_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(76f, 0f, 132f, -50f)
                reflectiveQuadToRelative(66f, -124f)
                quadToRelative(2f, -11f, -7f, -18.5f)
                reflectiveQuadToRelative(-21f, -7.5f)
                quadToRelative(-11f, 0f, -20.5f, 7f)
                reflectiveQuadTo(618f, 505f)
                quadToRelative(-9f, 49f, -47.5f, 82f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                horizontalLineToRelative(3f)
                lineToRelative(-28f, 29f)
                quadToRelative(-8f, 9f, -8.5f, 21f)
                reflectiveQuadToRelative(8.5f, 21f)
                quadToRelative(9f, 9f, 21.5f, 9f)
                reflectiveQuadToRelative(21.5f, -9f)
                lineToRelative(84f, -84f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-85f, -85f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-9f, 9f, -9f, 21.5f)
                reflectiveQuadToRelative(9f, 21.5f)
                lineToRelative(22f, 23f)
                quadToRelative(-82f, 2f, -139.5f, 60f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, 200f)
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
            }
        }.build()
        
        return _Forward_circle!!
    }

private var _Forward_circle: ImageVector? = null


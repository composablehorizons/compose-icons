package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Counter_8: ImageVector
    get() {
        if (_Counter_8 != null) return _Counter_8!!
        
        _Counter_8 = ImageVector.Builder(
            name = "counter_8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(-40f, -200f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(600f, 600f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(600f, 420f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 360f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(360f, 540f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 680f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Counter_8!!
    }

private var _Counter_8: ImageVector? = null


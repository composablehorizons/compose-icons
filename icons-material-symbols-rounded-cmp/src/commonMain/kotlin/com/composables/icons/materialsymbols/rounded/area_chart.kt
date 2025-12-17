package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Area_chart: ImageVector
    get() {
        if (_Area_chart != null) return _Area_chart!!
        
        _Area_chart = ImageVector.Builder(
            name = "area_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(546f, 173f)
                lineToRelative(134f, 107f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 360f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -25f, 22f, -36f)
                reflectiveQuadToRelative(42f, 4f)
                lineToRelative(96f, 72f)
                lineToRelative(151f, -211f)
                quadToRelative(20f, -28f, 54f, -33f)
                reflectiveQuadToRelative(61f, 17f)
                close()
                moveTo(200f, 440f)
                verticalLineToRelative(144f)
                lineToRelative(120f, 96f)
                lineToRelative(160f, -220f)
                lineToRelative(280f, 218f)
                verticalLineToRelative(-318f)
                horizontalLineTo(652f)
                lineTo(496f, 235f)
                lineTo(298f, 513f)
                lineToRelative(-98f, -73f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null


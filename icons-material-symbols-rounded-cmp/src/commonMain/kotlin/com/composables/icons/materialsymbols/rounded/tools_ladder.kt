package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tools_ladder: ImageVector
    get() {
        if (_Tools_ladder != null) return _Tools_ladder!!
        
        _Tools_ladder = ImageVector.Builder(
            name = "tools_ladder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(238f, 840f)
                quadToRelative(-19f, 0f, -30f, -15.5f)
                reflectiveQuadToRelative(-6f, -33.5f)
                lineToRelative(178f, -643f)
                quadToRelative(4f, -13f, 14f, -20.5f)
                reflectiveQuadToRelative(23f, -7.5f)
                quadToRelative(20f, 0f, 31f, 15.5f)
                reflectiveQuadToRelative(6f, 33.5f)
                lineToRelative(-20f, 71f)
                horizontalLineToRelative(225f)
                lineToRelative(25f, -92f)
                quadToRelative(4f, -13f, 14.5f, -20.5f)
                reflectiveQuadTo(722f, 120f)
                quadToRelative(19f, 0f, 30f, 15.5f)
                reflectiveQuadToRelative(6f, 33.5f)
                lineTo(580f, 812f)
                quadToRelative(-4f, 13f, -14f, 20.5f)
                reflectiveQuadToRelative(-23f, 7.5f)
                quadToRelative(-20f, 0f, -31f, -15.5f)
                reflectiveQuadToRelative(-6f, -33.5f)
                lineToRelative(20f, -71f)
                horizontalLineTo(301f)
                lineToRelative(-25f, 92f)
                quadToRelative(-4f, 13f, -14.5f, 20.5f)
                reflectiveQuadTo(238f, 840f)
                close()
                moveToRelative(141f, -400f)
                horizontalLineToRelative(224f)
                lineToRelative(33f, -120f)
                horizontalLineTo(412f)
                lineToRelative(-33f, 120f)
                close()
                moveToRelative(-55f, 200f)
                horizontalLineToRelative(224f)
                lineToRelative(33f, -120f)
                horizontalLineTo(357f)
                lineToRelative(-33f, 120f)
                close()
            }
        }.build()
        
        return _Tools_ladder!!
    }

private var _Tools_ladder: ImageVector? = null


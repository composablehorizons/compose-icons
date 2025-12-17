package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Heart_broken: ImageVector
    get() {
        if (_Heart_broken != null) return _Heart_broken!!
        
        _Heart_broken = ImageVector.Builder(
            name = "heart_broken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 877f)
                quadTo(347f, 742f, 267.5f, 659f)
                reflectiveQuadToRelative(-121f, -138f)
                quadToRelative(-41.5f, -55f, -54f, -94f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(45f, 0f, 87f, 16.5f)
                reflectiveQuadToRelative(75f, 47.5f)
                lineToRelative(-62f, 216f)
                horizontalLineToRelative(120f)
                lineToRelative(-34f, 335f)
                lineToRelative(114f, -375f)
                horizontalLineTo(480f)
                lineToRelative(71f, -212f)
                quadToRelative(25f, -14f, 52.5f, -21f)
                reflectiveQuadToRelative(56.5f, -7f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                quadToRelative(0f, 48f, -13f, 88f)
                reflectiveQuadToRelative(-55f, 95.5f)
                quadToRelative(-42f, 55.5f, -121f, 138f)
                reflectiveQuadTo(481f, 877f)
                close()
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null


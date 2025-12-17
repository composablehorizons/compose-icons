package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_lux: ImageVector
    get() {
        if (_Water_lux != null) return _Water_lux!!
        
        _Water_lux = ImageVector.Builder(
            name = "water_lux",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(125f, 213f)
                lineToRelative(-57f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 56f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(235f, -93f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(-40f, 160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(275f, -67f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 84f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(5f, -213f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(59f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(54.5f, 20f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(57f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                quadToRelative(38f, 0f, 55.5f, -20f)
                reflectiveQuadToRelative(76.5f, -20f)
                quadToRelative(59f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-57f, 0f, -77.5f, -20f)
                reflectiveQuadTo(746f, 800f)
                quadToRelative(-36f, 0f, -54.5f, 20f)
                reflectiveQuadTo(614f, 840f)
                quadToRelative(-57f, 0f, -77.5f, -20f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-38f, 0f, -56.5f, 20f)
                reflectiveQuadTo(346f, 840f)
                quadToRelative(-59f, 0f, -76.5f, -20f)
                reflectiveQuadTo(214f, 800f)
                quadToRelative(-38f, 0f, -56.5f, 20f)
                reflectiveQuadTo(80f, 840f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(57f, 0f, 76.5f, 20f)
                reflectiveQuadToRelative(55.5f, 20f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(57f, 0f, 77f, 20f)
                reflectiveQuadToRelative(55f, 20f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(57f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-59f, 0f, -78.5f, -20f)
                reflectiveQuadTo(746f, 640f)
                quadToRelative(-36f, 0f, -54.5f, 20f)
                reflectiveQuadTo(614f, 680f)
                quadToRelative(-57f, 0f, -77.5f, -20f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-38f, 0f, -55.5f, 20f)
                reflectiveQuadTo(348f, 680f)
                quadToRelative(-59f, 0f, -78.5f, -20f)
                reflectiveQuadTo(214f, 640f)
                quadToRelative(-36f, 0f, -56.5f, 20f)
                reflectiveQuadTo(80f, 680f)
                close()
            }
        }.build()
        
        return _Water_lux!!
    }

private var _Water_lux: ImageVector? = null


package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Panorama_vertical: ImageVector
    get() {
        if (_Panorama_vertical != null) return _Panorama_vertical!!
        
        _Panorama_vertical = ImageVector.Builder(
            name = "panorama_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -8f, 9.5f, -35.5f)
                reflectiveQuadTo(190f, 731f)
                quadToRelative(11f, -46f, 20.5f, -108.5f)
                reflectiveQuadTo(220f, 480f)
                quadToRelative(0f, -80f, -9.5f, -142.5f)
                reflectiveQuadTo(190f, 229f)
                quadToRelative(-11f, -46f, -20.5f, -73.5f)
                reflectiveQuadTo(160f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 120f)
                quadToRelative(0f, 8f, -9.5f, 35.5f)
                reflectiveQuadTo(770f, 229f)
                quadToRelative(-11f, 46f, -20.5f, 108.5f)
                reflectiveQuadTo(740f, 480f)
                quadToRelative(0f, 80f, 9.5f, 142.5f)
                reflectiveQuadTo(770f, 731f)
                quadToRelative(11f, 46f, 20.5f, 73.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Panorama_vertical!!
    }

private var _Panorama_vertical: ImageVector? = null


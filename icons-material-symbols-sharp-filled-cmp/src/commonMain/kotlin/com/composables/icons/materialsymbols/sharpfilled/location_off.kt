package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Location_off: ImageVector
    get() {
        if (_Location_off != null) return _Location_off!!
        
        _Location_off = ImageVector.Builder(
            name = "location_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(627f, 740f)
                quadToRelative(-32f, 34f, -68f, 69f)
                reflectiveQuadToRelative(-79f, 71f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -32f, 5f, -61f)
                reflectiveQuadToRelative(14f, -55f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-91f, -319f)
                lineTo(551f, 436f)
                quadToRelative(5f, -8f, 7f, -17f)
                reflectiveQuadToRelative(2f, -19f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-10f, 0f, -19f, 2f)
                reflectiveQuadToRelative(-17f, 7f)
                lineTo(271f, 156f)
                quadToRelative(43f, -37f, 97f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 48f, -18f, 98.5f)
                reflectiveQuadTo(728f, 613f)
                close()
            }
        }.build()
        
        return _Location_off!!
    }

private var _Location_off: ImageVector? = null


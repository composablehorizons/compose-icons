package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Heart_broken: ImageVector
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
                moveTo(481f, 814f)
                quadToRelative(-14f, 0f, -27.5f, -5f)
                reflectiveQuadTo(429f, 794f)
                quadToRelative(-109f, -96f, -177f, -161.5f)
                reflectiveQuadToRelative(-106.5f, -115f)
                quadTo(107f, 468f, 93.5f, 427f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(66f, 0f, 116f, 25.5f)
                reflectiveQuadToRelative(36f, 73.5f)
                lineToRelative(-37f, 130f)
                quadToRelative(-5f, 20f, 6.5f, 35.5f)
                reflectiveQuadTo(453f, 400f)
                horizontalLineToRelative(67f)
                lineToRelative(-26f, 254f)
                quadToRelative(-1f, 8f, 6.5f, 9f)
                reflectiveQuadToRelative(9.5f, -6f)
                lineToRelative(74f, -245f)
                quadToRelative(6f, -20f, -6f, -36f)
                reflectiveQuadToRelative(-32f, -16f)
                horizontalLineToRelative(-66f)
                lineToRelative(61f, -181f)
                quadToRelative(11f, -35f, 46f, -47f)
                reflectiveQuadToRelative(73f, -12f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                quadToRelative(0f, 44f, -16f, 87f)
                reflectiveQuadToRelative(-55.5f, 95f)
                quadToRelative(-39.5f, 52f, -106f, 117.5f)
                reflectiveQuadTo(534f, 794f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null


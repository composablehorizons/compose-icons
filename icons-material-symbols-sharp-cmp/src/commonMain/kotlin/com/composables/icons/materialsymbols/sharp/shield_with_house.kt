package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shield_with_house: ImageVector
    get() {
        if (_Shield_with_house != null) return _Shield_with_house!!
        
        _Shield_with_house = ImageVector.Builder(
            name = "shield_with_house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -499f)
                lineTo(256f, 555f)
                quadToRelative(19f, 63f, 56f, 114.5f)
                reflectiveQuadToRelative(88f, 86.5f)
                verticalLineToRelative(-156f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(156f)
                quadToRelative(51f, -35f, 88f, -86.5f)
                reflectiveQuadTo(704f, 555f)
                lineTo(480f, 381f)
                close()
                moveToRelative(0f, -216f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 5f, 0.5f, 11f)
                reflectiveQuadToRelative(0.5f, 11f)
                lineToRelative(239f, -186f)
                lineToRelative(239f, 186f)
                quadToRelative(0f, -5f, 0.5f, -11f)
                reflectiveQuadToRelative(0.5f, -11f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                close()
            }
        }.build()
        
        return _Shield_with_house!!
    }

private var _Shield_with_house: ImageVector? = null


package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shield_with_house: ImageVector
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
                moveTo(480f, 382f)
                lineToRelative(290f, 225f)
                quadToRelative(-29f, 79f, -83.5f, 142.5f)
                reflectiveQuadTo(560f, 850f)
                verticalLineToRelative(-249f)
                horizontalLineTo(400f)
                verticalLineToRelative(249f)
                quadToRelative(-72f, -37f, -126.5f, -100.5f)
                reflectiveQuadTo(190f, 607f)
                lineToRelative(290f, -225f)
                close()
                moveToRelative(0f, -301f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(243f)
                quadToRelative(0f, 20f, -2f, 39.5f)
                reflectiveQuadToRelative(-5f, 39.5f)
                lineTo(480f, 281f)
                lineTo(167f, 523f)
                quadToRelative(-4f, -20f, -5.5f, -39.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-243f)
                lineToRelative(320f, -120f)
                close()
            }
        }.build()
        
        return _Shield_with_house!!
    }

private var _Shield_with_house: ImageVector? = null


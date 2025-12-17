package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(574f, 831f)
                lineToRelative(-214f, -75f)
                lineToRelative(-186f, 72f)
                quadToRelative(-10f, 4f, -19.5f, 2.5f)
                reflectiveQuadTo(137f, 824f)
                quadToRelative(-8f, -5f, -12.5f, -13.5f)
                reflectiveQuadTo(120f, 791f)
                verticalLineToRelative(-561f)
                quadToRelative(0f, -13f, 7.5f, -23f)
                reflectiveQuadToRelative(20.5f, -15f)
                lineToRelative(186f, -63f)
                quadToRelative(6f, -2f, 12.5f, -3f)
                reflectiveQuadToRelative(13.5f, -1f)
                quadToRelative(7f, 0f, 13.5f, 1f)
                reflectiveQuadToRelative(12.5f, 3f)
                lineToRelative(214f, 75f)
                lineToRelative(186f, -72f)
                quadToRelative(10f, -4f, 19.5f, -2.5f)
                reflectiveQuadTo(823f, 136f)
                quadToRelative(8f, 5f, 12.5f, 13.5f)
                reflectiveQuadTo(840f, 169f)
                verticalLineToRelative(561f)
                quadToRelative(0f, 13f, -7.5f, 23f)
                reflectiveQuadTo(812f, 768f)
                lineToRelative(-186f, 63f)
                quadToRelative(-6f, 2f, -12.5f, 3f)
                reflectiveQuadToRelative(-13.5f, 1f)
                quadToRelative(-7f, 0f, -13.5f, -1f)
                reflectiveQuadToRelative(-12.5f, -3f)
                close()
                moveToRelative(-14f, -89f)
                verticalLineToRelative(-468f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(468f)
                lineToRelative(160f, 56f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null


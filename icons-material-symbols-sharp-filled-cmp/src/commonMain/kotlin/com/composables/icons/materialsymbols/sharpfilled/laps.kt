package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Laps: ImageVector
    get() {
        if (_Laps != null) return _Laps!!
        
        _Laps = ImageVector.Builder(
            name = "laps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                lineToRelative(-57f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineToRelative(-7f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(360f, 160f)
                horizontalLineToRelative(240f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(880f, 440f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(600f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(600f, 240f)
                horizontalLineTo(360f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, 83f, 58.5f, 142.5f)
                reflectiveQuadTo(360f, 648f)
                horizontalLineToRelative(16f)
                lineToRelative(-72f, -72f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Laps!!
    }

private var _Laps: ImageVector? = null


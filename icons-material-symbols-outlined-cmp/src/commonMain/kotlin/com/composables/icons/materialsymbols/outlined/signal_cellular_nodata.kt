package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_cellular_nodata: ImageVector
    get() {
        if (_Signal_cellular_nodata != null) return _Signal_cellular_nodata!!
        
        _Signal_cellular_nodata = ImageVector.Builder(
            name = "signal_cellular_nodata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(676f, 860f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveTo(80f, 880f)
                lineToRelative(800f, -799f)
                verticalLineToRelative(427f)
                quadToRelative(-18f, -11f, -38f, -17.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-206f)
                lineTo(273f, 800f)
                horizontalLineToRelative(257f)
                quadToRelative(8f, 23f, 20f, 43f)
                reflectiveQuadToRelative(27f, 37f)
                horizontalLineTo(80f)
                close()
                moveToRelative(193f, -80f)
                lineToRelative(527f, -526f)
                quadToRelative(-76f, 76f, -138f, 137.5f)
                reflectiveQuadToRelative(-121.5f, 121f)
                lineTo(417f, 656f)
                lineTo(273f, 800f)
                close()
            }
        }.build()
        
        return _Signal_cellular_nodata!!
    }

private var _Signal_cellular_nodata: ImageVector? = null


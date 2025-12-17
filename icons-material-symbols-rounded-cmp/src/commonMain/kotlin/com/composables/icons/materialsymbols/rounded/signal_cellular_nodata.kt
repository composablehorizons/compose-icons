package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_cellular_nodata: ImageVector
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
                moveTo(177f, 880f)
                quadToRelative(-18f, 0f, -29f, -12f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(664f, -663f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(16f, 0f, 28f, 11f)
                reflectiveQuadToRelative(12f, 29f)
                verticalLineToRelative(285f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 502f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 462f)
                verticalLineToRelative(-188f)
                lineTo(273f, 800f)
                horizontalLineToRelative(229f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(542f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(502f, 880f)
                horizontalLineTo(177f)
                close()
                moveToRelative(583f, -103f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(648f, 832f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(56f, 56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(872f, 608f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-55f, 56f)
                lineToRelative(55f, 56f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(872f, 832f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-56f, -55f)
                close()
                moveToRelative(-487f, 23f)
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


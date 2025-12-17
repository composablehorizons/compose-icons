package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Step: ImageVector
    get() {
        if (_Step != null) return _Step!!
        
        _Step = ImageVector.Builder(
            name = "step",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 600f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -51f, 34.5f, -85.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 51f, -34.5f, 85.5f)
                reflectiveQuadTo(760f, 600f)
                close()
                moveToRelative(-353f, -80f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(287f)
                lineToRelative(-75f, -76f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(332f, 308f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(144f, 144f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(388f, 652f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(332f, 651f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(75f, -75f)
                close()
            }
        }.build()
        
        return _Step!!
    }

private var _Step: ImageVector? = null


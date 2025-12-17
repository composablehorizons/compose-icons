package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stylus_brush: ImageVector
    get() {
        if (_Stylus_brush != null) return _Stylus_brush!!
        
        _Stylus_brush = ImageVector.Builder(
            name = "stylus_brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(-100f, 0f, -170f, -69.5f)
                reflectiveQuadTo(240f, 398f)
                quadToRelative(0f, -74f, 44f, -139f)
                reflectiveQuadToRelative(96.5f, -114f)
                quadToRelative(52.5f, -49f, 96f, -77f)
                lineToRelative(43.5f, -28f)
                quadToRelative(0f, 57f, 20.5f, 96f)
                reflectiveQuadToRelative(77.5f, 83f)
                quadToRelative(59f, 46f, 80.5f, 85.5f)
                reflectiveQuadTo(720f, 398f)
                quadToRelative(0f, 103f, -70f, 172.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveTo(160f, 840f)
                lineToRelative(40f, -120f)
                horizontalLineToRelative(560f)
                lineToRelative(40f, 120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Stylus_brush!!
    }

private var _Stylus_brush: ImageVector? = null


package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stylus_brush: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(66f, 0f, 113f, -46.5f)
                reflectiveQuadTo(640f, 398f)
                quadToRelative(0f, -35f, -17f, -61.5f)
                reflectiveQuadTo(567f, 280f)
                quadToRelative(-31f, -23f, -55.5f, -49.5f)
                reflectiveQuadTo(470f, 172f)
                quadToRelative(-79f, 65f, -114.5f, 120f)
                reflectiveQuadTo(320f, 398f)
                quadToRelative(0f, 69f, 47f, 115.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -194f)
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


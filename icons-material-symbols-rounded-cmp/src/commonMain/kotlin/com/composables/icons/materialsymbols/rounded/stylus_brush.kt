package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stylus_brush: ImageVector
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
                quadToRelative(0f, -88f, 61f, -165.5f)
                reflectiveQuadTo(443f, 91f)
                quadToRelative(9f, -7f, 19f, -10.5f)
                reflectiveQuadToRelative(20f, -3.5f)
                quadToRelative(16f, 0f, 29f, 8.5f)
                reflectiveQuadToRelative(18f, 24.5f)
                quadToRelative(9f, 29f, 30.5f, 54.5f)
                reflectiveQuadTo(618f, 219f)
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
                moveTo(215f, 840f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(177f, 787f)
                lineToRelative(5f, -12f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(5f, 12f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(745f, 840f)
                horizontalLineTo(215f)
                close()
            }
        }.build()
        
        return _Stylus_brush!!
    }

private var _Stylus_brush: ImageVector? = null


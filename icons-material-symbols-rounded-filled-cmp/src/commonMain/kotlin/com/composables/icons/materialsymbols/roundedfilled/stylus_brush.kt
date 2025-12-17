package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus_brush: ImageVector
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
                quadToRelative(0f, -103f, 69.5f, -185f)
                reflectiveQuadTo(468f, 72f)
                quadToRelative(5f, -3f, 9.5f, -4.5f)
                reflectiveQuadToRelative(9.5f, -1.5f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(15f, 25f)
                quadToRelative(8f, 32f, 29.5f, 60f)
                reflectiveQuadToRelative(61.5f, 59f)
                quadToRelative(59f, 46f, 80.5f, 85.5f)
                reflectiveQuadTo(720f, 398f)
                quadToRelative(0f, 103f, -70f, 172.5f)
                reflectiveQuadTo(480f, 640f)
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


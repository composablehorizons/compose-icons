package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Timer_5_shutter: ImageVector
    get() {
        if (_Timer_5_shutter != null) return _Timer_5_shutter!!
        
        _Timer_5_shutter = ImageVector.Builder(
            name = "timer_5_shutter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(320f)
                verticalLineToRelative(-340f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineTo(440f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 500f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Timer_5_shutter!!
    }

private var _Timer_5_shutter: ImageVector? = null


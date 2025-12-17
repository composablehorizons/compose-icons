package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Burst_mode: ImageVector
    get() {
        if (_Burst_mode != null) return _Burst_mode!!
        
        _Burst_mode = ImageVector.Builder(
            name = "burst_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(440f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(320f)
                lineTo(696f, 460f)
                lineToRelative(-76f, 100f)
                lineToRelative(-56f, -74f)
                lineToRelative(-84f, 114f)
                close()
                moveToRelative(-40f, 80f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Burst_mode!!
    }

private var _Burst_mode: ImageVector? = null


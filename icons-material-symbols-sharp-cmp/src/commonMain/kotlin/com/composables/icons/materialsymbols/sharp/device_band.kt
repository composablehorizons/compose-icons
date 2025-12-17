package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Device_band: ImageVector
    get() {
        if (_Device_band != null) return _Device_band!!
        
        _Device_band = ImageVector.Builder(
            name = "device_band",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(520f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -540f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-460f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-100f)
                horizontalLineTo(400f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Device_band!!
    }

private var _Device_band: ImageVector? = null


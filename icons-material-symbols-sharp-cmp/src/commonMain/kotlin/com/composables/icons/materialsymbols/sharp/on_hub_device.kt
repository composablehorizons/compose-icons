package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.On_hub_device: ImageVector
    get() {
        if (_On_hub_device != null) return _On_hub_device!!
        
        _On_hub_device = ImageVector.Builder(
            name = "on_hub_device",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -120f)
                lineToRelative(-47f, -600f)
                horizontalLineToRelative(414f)
                lineToRelative(-47f, 600f)
                horizontalLineTo(320f)
                close()
                moveToRelative(74f, -80f)
                horizontalLineToRelative(172f)
                lineToRelative(34f, -440f)
                horizontalLineTo(360f)
                lineToRelative(34f, 440f)
                close()
                moveToRelative(0f, -440f)
                horizontalLineToRelative(-34f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-206f)
                close()
            }
        }.build()
        
        return _On_hub_device!!
    }

private var _On_hub_device: ImageVector? = null


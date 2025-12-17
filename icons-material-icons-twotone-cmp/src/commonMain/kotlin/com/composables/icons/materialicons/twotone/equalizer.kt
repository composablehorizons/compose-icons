package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Equalizer: ImageVector
    get() {
        if (_Equalizer != null) return _Equalizer!!
        
        _Equalizer = ImageVector.Builder(
            name = "equalizer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-6f, -5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-6f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Equalizer!!
    }

private var _Equalizer: ImageVector? = null


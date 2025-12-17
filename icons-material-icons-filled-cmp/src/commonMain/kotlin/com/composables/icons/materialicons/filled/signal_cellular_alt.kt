package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Signal_cellular_alt: ImageVector
    get() {
        if (_Signal_cellular_alt != null) return _Signal_cellular_alt!!
        
        _Signal_cellular_alt = ImageVector.Builder(
            name = "signal_cellular_alt",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineTo(5f)
                close()
                moveToRelative(6f, -5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Signal_cellular_alt!!
    }

private var _Signal_cellular_alt: ImageVector? = null


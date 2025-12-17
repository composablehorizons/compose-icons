package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fast_rewind: ImageVector
    get() {
        if (_Fast_rewind != null) return _Fast_rewind!!
        
        _Fast_rewind = ImageVector.Builder(
            name = "fast_rewind",
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
                moveTo(18f, 9.86f)
                verticalLineToRelative(4.28f)
                lineTo(14.97f, 12f)
                lineTo(18f, 9.86f)
                moveToRelative(-9f, 0f)
                verticalLineToRelative(4.28f)
                lineTo(5.97f, 12f)
                lineTo(9f, 9.86f)
                moveTo(20f, 6f)
                lineToRelative(-8.5f, 6f)
                lineToRelative(8.5f, 6f)
                verticalLineTo(6f)
                close()
                moveToRelative(-9f, 0f)
                lineToRelative(-8.5f, 6f)
                lineToRelative(8.5f, 6f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Fast_rewind!!
    }

private var _Fast_rewind: ImageVector? = null


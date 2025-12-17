package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
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
                moveTo(16f, 8f)
                verticalLineToRelative(8f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineToRelative(8f)
                moveToRelative(2f, -2f)
                horizontalLineTo(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(12f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null


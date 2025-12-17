package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Format_clear: ImageVector
    get() {
        if (_Format_clear != null) return _Format_clear!!
        
        _Format_clear = ImageVector.Builder(
            name = "format_clear",
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
                moveTo(3.27f, 5f)
                lineTo(2f, 6.27f)
                lineToRelative(6.97f, 6.97f)
                lineTo(6.5f, 19f)
                horizontalLineToRelative(3f)
                lineToRelative(1.57f, -3.66f)
                lineTo(16.73f, 21f)
                lineTo(18f, 19.73f)
                lineTo(3.55f, 5.27f)
                lineTo(3.27f, 5f)
                close()
                moveTo(6f, 5f)
                verticalLineToRelative(0.18f)
                lineTo(8.82f, 8f)
                horizontalLineToRelative(2.4f)
                lineToRelative(-0.72f, 1.68f)
                lineToRelative(2.1f, 2.1f)
                lineTo(14.21f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Format_clear!!
    }

private var _Format_clear: ImageVector? = null


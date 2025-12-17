package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_clear: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(6.39f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-0.55f, 1.28f)
                lineToRelative(2.09f, 2.1f)
                lineTo(14.21f, 8f)
                close()
                moveTo(3.41f, 4.86f)
                lineTo(2f, 6.27f)
                lineToRelative(6.97f, 6.97f)
                lineTo(6.5f, 19f)
                horizontalLineToRelative(3f)
                lineToRelative(1.57f, -3.66f)
                lineTo(16.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Format_clear!!
    }

private var _Format_clear: ImageVector? = null


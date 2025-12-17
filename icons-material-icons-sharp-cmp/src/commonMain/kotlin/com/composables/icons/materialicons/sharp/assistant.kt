package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Assistant: ImageVector
    get() {
        if (_Assistant != null) return _Assistant!!
        
        _Assistant = ImageVector.Builder(
            name = "assistant",
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
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(6f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(2f)
                close()
                moveToRelative(-7.12f, 10.88f)
                lineTo(12f, 17f)
                lineToRelative(-1.88f, -4.12f)
                lineTo(6f, 11f)
                lineToRelative(4.12f, -1.88f)
                lineTo(12f, 5f)
                lineToRelative(1.88f, 4.12f)
                lineTo(18f, 11f)
                lineToRelative(-4.12f, 1.88f)
                close()
            }
        }.build()
        
        return _Assistant!!
    }

private var _Assistant: ImageVector? = null


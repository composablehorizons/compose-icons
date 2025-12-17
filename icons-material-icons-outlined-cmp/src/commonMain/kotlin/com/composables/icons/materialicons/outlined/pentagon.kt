package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.63f, 9.78f)
                    lineTo(16.56f, 19f)
                    horizontalLineTo(7.44f)
                    lineTo(4.37f, 9.78f)
                    lineTo(12f, 4.44f)
                    lineTo(19.63f, 9.78f)
                    close()
                    moveTo(2f, 9f)
                    lineToRelative(4f, 12f)
                    horizontalLineToRelative(12f)
                    lineToRelative(4f, -12f)
                    lineTo(12f, 2f)
                    lineTo(2f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null


package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_cell: ImageVector
    get() {
        if (_No_cell != null) return _No_cell!!
        
        _No_cell = ImageVector.Builder(
            name = "no_cell",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(5f, 7.83f)
                    verticalLineTo(23f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-1.17f)
                    lineToRelative(0.78f, 0.78f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(7f, 18f)
                    verticalLineTo(9.83f)
                    lineTo(15.17f, 18f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(8.83f, 6f)
                    lineTo(5f, 2.17f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(15.17f)
                    lineToRelative(-2f, -2f)
                    verticalLineTo(6f)
                    horizontalLineTo(8.83f)
                    close()
                }
            }
        }.build()
        
        return _No_cell!!
    }

private var _No_cell: ImageVector? = null


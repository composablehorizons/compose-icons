package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_cell: ImageVector
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
                    moveTo(7f, 21f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(7f)
                    verticalLineTo(21f)
                    close()
                    moveTo(7f, 3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(3f)
                    horizontalLineTo(7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 6f)
                    verticalLineToRelative(8.17f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -1.1f, -0.9f, -1.99f, -2f, -1.99f)
                    lineTo(7f, 1f)
                    curveTo(6.15f, 1f, 5.42f, 1.55f, 5.13f, 2.3f)
                    lineTo(8.83f, 6f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(7f, 3f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(7f)
                    verticalLineTo(3f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(5f, 7.83f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.85f, 0f, 1.58f, -0.55f, 1.87f, -1.3f)
                    lineToRelative(0.91f, 0.91f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(17f, 21f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(21f)
                    close()
                    moveTo(7f, 18f)
                    verticalLineTo(9.83f)
                    lineTo(15.17f, 18f)
                    horizontalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _No_cell!!
    }

private var _No_cell: ImageVector? = null


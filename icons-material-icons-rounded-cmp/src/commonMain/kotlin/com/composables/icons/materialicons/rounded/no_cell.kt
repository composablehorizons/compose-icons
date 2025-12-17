package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_cell: ImageVector
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
                    moveTo(8.83f, 6f)
                    lineToRelative(-3.7f, -3.7f)
                    curveTo(5.42f, 1.55f, 6.15f, 1f, 7f, 1f)
                    lineToRelative(10f, 0.01f)
                    curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 1.99f)
                    verticalLineToRelative(13.17f)
                    lineToRelative(-2f, -2f)
                    verticalLineTo(6f)
                    horizontalLineTo(8.83f)
                    close()
                    moveTo(20.49f, 21.9f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(-0.2f, -0.2f)
                    curveTo(18.58f, 22.45f, 17.85f, 23f, 17f, 23f)
                    horizontalLineTo(7f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(7.83f)
                    lineToRelative(-2.9f, -2.9f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(16.97f, 16.97f)
                    curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                    close()
                    moveTo(15.17f, 18f)
                    lineTo(7f, 9.83f)
                    verticalLineTo(18f)
                    horizontalLineTo(15.17f)
                    close()
                }
            }
        }.build()
        
        return _No_cell!!
    }

private var _No_cell: ImageVector? = null


package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_food: ImageVector
    get() {
        if (_No_food != null) return _No_food!!
        
        _No_food = ImageVector.Builder(
            name = "no_food",
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
                    moveTo(11.35f, 8.52f)
                    lineTo(11f, 5f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(5f)
                    lineToRelative(-1.38f, 13.79f)
                    lineTo(18f, 15.17f)
                    lineTo(11.35f, 8.52f)
                    close()
                    moveTo(21.9f, 21.9f)
                    lineTo(2.1f, 2.1f)
                    lineTo(0.69f, 3.51f)
                    lineToRelative(5.7f, 5.7f)
                    curveTo(3.46f, 9.83f, 1f, 11.76f, 1f, 15f)
                    horizontalLineToRelative(11.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(15f)
                    verticalLineToRelative(-0.17f)
                    lineToRelative(4.49f, 4.49f)
                    lineTo(21.9f, 21.9f)
                    close()
                    moveTo(1f, 23f)
                    horizontalLineToRelative(15f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(1f)
                    verticalLineTo(23f)
                    close()
                }
            }
        }.build()
        
        return _No_food!!
    }

private var _No_food: ImageVector? = null


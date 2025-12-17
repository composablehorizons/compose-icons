package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_food: ImageVector
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
                    moveTo(1f, 21f)
                    horizontalLineToRelative(15.01f)
                    verticalLineToRelative(0.98f)
                    curveToRelative(0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f)
                    horizontalLineTo(2.01f)
                    curveTo(1.45f, 22.99f, 1f, 22.54f, 1f, 21.98f)
                    verticalLineTo(21f)
                    close()
                    moveTo(20.49f, 23.31f)
                    lineTo(16f, 18.83f)
                    verticalLineTo(19f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(13.17f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(1f)
                    curveToRelative(0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f)
                    lineToRelative(-5.7f, -5.7f)
                    lineTo(2.1f, 2.1f)
                    lineTo(13f, 13f)
                    lineToRelative(2f, 2f)
                    lineToRelative(6.9f, 6.9f)
                    lineTo(20.49f, 23.31f)
                    close()
                    moveTo(10.17f, 13f)
                    lineToRelative(-2f, -2f)
                    curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2f)
                    horizontalLineTo(10.17f)
                    close()
                    moveTo(23f, 5f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-5f)
                    lineToRelative(0.23f, 2f)
                    horizontalLineToRelative(9.56f)
                    lineToRelative(-1f, 9.97f)
                    lineToRelative(1.83f, 1.83f)
                    lineTo(23f, 5f)
                    close()
                }
            }
        }.build()
        
        return _No_food!!
    }

private var _No_food: ImageVector? = null


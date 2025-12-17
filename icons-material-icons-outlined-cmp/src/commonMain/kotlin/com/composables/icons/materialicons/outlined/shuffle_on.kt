package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Shuffle_on: ImageVector
    get() {
        if (_Shuffle_on != null) return _Shuffle_on!!
        
        _Shuffle_on = ImageVector.Builder(
            name = "shuffle_on",
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
                    moveTo(21f, 1f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 1f, 1f, 1.9f, 1f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(23f, 1.9f, 22.1f, 1f, 21f, 1f)
                    close()
                    moveTo(5.41f, 4f)
                    lineToRelative(5.18f, 5.17f)
                    lineToRelative(-1.41f, 1.42f)
                    lineTo(4f, 5.42f)
                    lineTo(5.41f, 4f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2.61f)
                    lineToRelative(-3.2f, -3.2f)
                    lineToRelative(1.42f, -1.42f)
                    lineToRelative(3.13f, 3.13f)
                    lineTo(18f, 16.55f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(20f)
                    close()
                    moveTo(20f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7.42f)
                    lineTo(5.41f, 20f)
                    lineTo(4f, 18.59f)
                    lineTo(16.58f, 6f)
                    horizontalLineTo(14f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Shuffle_on!!
    }

private var _Shuffle_on: ImageVector? = null


package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Repeat_one_on: ImageVector
    get() {
        if (_Repeat_one_on != null) return _Repeat_one_on!!
        
        _Repeat_one_on = ImageVector.Builder(
            name = "repeat_one_on",
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
                    moveTo(19f, 19f)
                    horizontalLineTo(6.83f)
                    lineToRelative(1.58f, 1.58f)
                    lineTo(7f, 22f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.42f)
                    lineTo(6.83f, 17f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(10f, 10.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(17f, 10f)
                    lineToRelative(-1.41f, -1.42f)
                    lineTo(17.17f, 7f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(12.17f)
                    lineToRelative(-1.58f, -1.58f)
                    lineTo(17f, 2f)
                    lineToRelative(4f, 4f)
                    lineTo(17f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Repeat_one_on!!
    }

private var _Repeat_one_on: ImageVector? = null


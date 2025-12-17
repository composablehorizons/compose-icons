package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Move_down: ImageVector
    get() {
        if (_Move_down != null) return _Move_down!!
        
        _Move_down = ImageVector.Builder(
            name = "move_down",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 11f)
                        curveToRelative(0f, 2.45f, 1.76f, 4.47f, 4.08f, 4.91f)
                        lineToRelative(-1.49f, -1.49f)
                        lineTo(7f, 13f)
                        lineToRelative(4f, 4.01f)
                        lineTo(7f, 21f)
                        lineToRelative(-1.41f, -1.41f)
                        lineToRelative(1.58f, -1.58f)
                        lineToRelative(0f, -0.06f)
                        curveTo(3.7f, 17.54f, 1f, 14.58f, 1f, 11f)
                        curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8f)
                        curveTo(5.24f, 6f, 3f, 8.24f, 3f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 11f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(-9f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(22f)
                        close()
                        moveTo(20f, 9f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13f)
                        horizontalLineTo(22f)
                        verticalLineTo(20f)
                        horizontalLineTo(13f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Move_down!!
    }

private var _Move_down: ImageVector? = null


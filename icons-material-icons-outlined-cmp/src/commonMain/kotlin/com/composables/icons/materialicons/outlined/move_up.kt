package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Move_up: ImageVector
    get() {
        if (_Move_up != null) return _Move_up!!
        
        _Move_up = ImageVector.Builder(
            name = "move_up",
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
                        moveTo(3f, 13f)
                        curveToRelative(0f, -2.45f, 1.76f, -4.47f, 4.08f, -4.91f)
                        lineTo(5.59f, 9.59f)
                        lineTo(7f, 11f)
                        lineToRelative(4f, -4.01f)
                        lineTo(7f, 3f)
                        lineTo(5.59f, 4.41f)
                        lineToRelative(1.58f, 1.58f)
                        lineToRelative(0f, 0.06f)
                        curveTo(3.7f, 6.46f, 1f, 9.42f, 1f, 13f)
                        curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(8f)
                        curveTo(5.24f, 18f, 3f, 15.76f, 3f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-7f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 4f)
                        horizontalLineTo(22f)
                        verticalLineTo(11f)
                        horizontalLineTo(13f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Move_up!!
    }

private var _Move_up: ImageVector? = null


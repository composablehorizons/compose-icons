package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_fix_off: ImageVector
    get() {
        if (_Auto_fix_off != null) return _Auto_fix_off!!
        
        _Auto_fix_off = ImageVector.Builder(
            name = "auto_fix_off",
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
                        moveTo(22f, 3.55f)
                        lineToRelative(-1.06f, -0.49f)
                        lineTo(20.45f, 2f)
                        curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                        lineToRelative(-0.49f, 1.06f)
                        lineTo(18f, 3.55f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.06f, 0.49f)
                        lineTo(19.55f, 6f)
                        curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                        lineToRelative(0.49f, -1.06f)
                        lineTo(22f, 4.45f)
                        curveTo(22.39f, 4.28f, 22.39f, 3.72f, 22f, 3.55f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.17f, 8.42f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(-1.46f, 1.46f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(2.17f, -2.17f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-2.83f, -2.83f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-2.17f, 2.17f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.17f, 8.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 4.93f)
                        lineToRelative(6.36f, 6.36f)
                        lineToRelative(-6.17f, 6.17f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.83f, 2.83f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(6.17f, -6.17f)
                        lineToRelative(6.36f, 6.36f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveTo(1.71f, 3.91f, 1.71f, 4.54f, 2.1f, 4.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_off!!
    }

private var _Auto_fix_off: ImageVector? = null


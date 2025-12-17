package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_fix_normal: ImageVector
    get() {
        if (_Auto_fix_normal != null) return _Auto_fix_normal!!
        
        _Auto_fix_normal = ImageVector.Builder(
            name = "auto_fix_normal",
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
                        moveTo(20.45f, 6f)
                        lineToRelative(0.49f, -1.06f)
                        lineTo(22f, 4.45f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineToRelative(-1.06f, -0.49f)
                        lineTo(20.45f, 2f)
                        curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                        lineToRelative(-0.49f, 1.06f)
                        lineTo(18f, 3.55f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.06f, 0.49f)
                        lineTo(19.55f, 6f)
                        curveTo(19.72f, 6.39f, 20.28f, 6.39f, 20.45f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.71f, 9.12f)
                        lineToRelative(-2.83f, -2.83f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineTo(2.29f, 17.46f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.83f, 2.83f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(11.17f, -11.17f)
                        curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f)
                        close()
                        moveTo(14.21f, 11.21f)
                        lineToRelative(-1.41f, -1.41f)
                        lineToRelative(1.38f, -1.38f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.21f, 11.21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_normal!!
    }

private var _Auto_fix_normal: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_fix_high: ImageVector
    get() {
        if (_Auto_fix_high != null) return _Auto_fix_high!!
        
        _Auto_fix_high = ImageVector.Builder(
            name = "auto_fix_high",
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
                        moveTo(8.95f, 6f)
                        lineToRelative(0.49f, -1.06f)
                        lineToRelative(1.06f, -0.49f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineTo(9.44f, 3.06f)
                        lineTo(8.95f, 2f)
                        curveTo(8.78f, 1.61f, 8.22f, 1.61f, 8.05f, 2f)
                        lineTo(7.56f, 3.06f)
                        lineTo(6.5f, 3.55f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.06f, 0.49f)
                        lineTo(8.05f, 6f)
                        curveTo(8.22f, 6.39f, 8.78f, 6.39f, 8.95f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.55f, 13.5f)
                        lineToRelative(-0.49f, 1.06f)
                        lineTo(18f, 15.05f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.06f, 0.49f)
                        lineToRelative(0.49f, 1.06f)
                        curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                        lineToRelative(0.49f, -1.06f)
                        lineTo(22f, 15.95f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineToRelative(-1.06f, -0.49f)
                        lineToRelative(-0.49f, -1.06f)
                        curveTo(20.28f, 13.11f, 19.72f, 13.11f, 19.55f, 13.5f)
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
        
        return _Auto_fix_high!!
    }

private var _Auto_fix_high: ImageVector? = null


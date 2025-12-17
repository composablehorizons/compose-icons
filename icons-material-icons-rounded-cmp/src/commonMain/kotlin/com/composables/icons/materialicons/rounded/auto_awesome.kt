package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_awesome: ImageVector
    get() {
        if (_Auto_awesome != null) return _Auto_awesome!!
        
        _Auto_awesome = ImageVector.Builder(
            name = "auto_awesome",
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
                        moveTo(19.46f, 8f)
                        lineToRelative(0.79f, -1.75f)
                        lineTo(22f, 5.46f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineToRelative(-1.75f, -0.79f)
                        lineTo(19.46f, 2f)
                        curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                        lineToRelative(-0.79f, 1.75f)
                        lineTo(16f, 4.54f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.75f, 0.79f)
                        lineTo(18.54f, 8f)
                        curveTo(18.72f, 8.39f, 19.28f, 8.39f, 19.46f, 8f)
                        close()
                        moveTo(11.5f, 9.5f)
                        lineTo(9.91f, 6f)
                        curveTo(9.56f, 5.22f, 8.44f, 5.22f, 8.09f, 6f)
                        lineTo(6.5f, 9.5f)
                        lineTo(3f, 11.09f)
                        curveToRelative(-0.78f, 0.36f, -0.78f, 1.47f, 0f, 1.82f)
                        lineToRelative(3.5f, 1.59f)
                        lineTo(8.09f, 18f)
                        curveToRelative(0.36f, 0.78f, 1.47f, 0.78f, 1.82f, 0f)
                        lineToRelative(1.59f, -3.5f)
                        lineToRelative(3.5f, -1.59f)
                        curveToRelative(0.78f, -0.36f, 0.78f, -1.47f, 0f, -1.82f)
                        lineTo(11.5f, 9.5f)
                        close()
                        moveTo(18.54f, 16f)
                        lineToRelative(-0.79f, 1.75f)
                        lineTo(16f, 18.54f)
                        curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                        lineToRelative(1.75f, 0.79f)
                        lineTo(18.54f, 22f)
                        curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                        lineToRelative(0.79f, -1.75f)
                        lineTo(22f, 19.46f)
                        curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                        lineToRelative(-1.75f, -0.79f)
                        lineTo(19.46f, 16f)
                        curveTo(19.28f, 15.61f, 18.72f, 15.61f, 18.54f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome!!
    }

private var _Auto_awesome: ImageVector? = null


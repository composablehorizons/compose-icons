package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_graph: ImageVector
    get() {
        if (_Auto_graph != null) return _Auto_graph!!
        
        _Auto_graph = ImageVector.Builder(
            name = "auto_graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.06f, 9.94f)
                    lineTo(13f, 9.45f)
                    curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(1.06f, -0.49f)
                    lineTo(14.55f, 7f)
                    curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0f)
                    lineToRelative(0.49f, 1.06f)
                    lineTo(17f, 8.55f)
                    curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(-1.06f, 0.49f)
                    lineTo(15.45f, 11f)
                    curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0f)
                    lineTo(14.06f, 9.94f)
                    close()
                    moveTo(4.45f, 13f)
                    lineToRelative(0.49f, -1.06f)
                    lineTo(6f, 11.45f)
                    curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(-1.06f, -0.49f)
                    lineTo(4.45f, 9f)
                    curveTo(4.28f, 8.61f, 3.72f, 8.61f, 3.55f, 9f)
                    lineToRelative(-0.49f, 1.06f)
                    lineTo(2f, 10.55f)
                    curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(1.06f, 0.49f)
                    lineTo(3.55f, 13f)
                    curveTo(3.72f, 13.39f, 4.28f, 13.39f, 4.45f, 13f)
                    close()
                    moveTo(8.96f, 7.99f)
                    lineToRelative(0.63f, -1.4f)
                    lineToRelative(1.4f, -0.63f)
                    curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(-1.4f, -0.63f)
                    lineToRelative(-0.63f, -1.4f)
                    curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                    lineToRelative(-0.63f, 1.4f)
                    lineToRelative(-1.4f, 0.63f)
                    curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(1.4f, 0.63f)
                    lineToRelative(0.63f, 1.4f)
                    curveTo(8.22f, 8.38f, 8.78f, 8.38f, 8.96f, 7.99f)
                    close()
                    moveTo(22.34f, 8.27f)
                    curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f)
                    lineToRelative(-6.39f, 7.18f)
                    lineToRelative(-3.29f, -3.29f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(-6.04f, 6.05f)
                    curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0f, 1.5f)
                    curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0f)
                    lineToRelative(5.25f, -5.26f)
                    lineToRelative(3.25f, 3.25f)
                    curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f)
                    lineToRelative(7.17f, -8.07f)
                    curveTo(22.73f, 9.24f, 22.71f, 8.64f, 22.34f, 8.27f)
                    close()
                }
            }
        }.build()
        
        return _Auto_graph!!
    }

private var _Auto_graph: ImageVector? = null


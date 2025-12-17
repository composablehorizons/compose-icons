package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hide_source: ImageVector
    get() {
        if (_Hide_source != null) return _Hide_source!!
        
        _Hide_source = ImageVector.Builder(
            name = "hide_source",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(2.1f, 3.51f)
                    lineTo(2.1f, 3.51f)
                    curveTo(1.71f, 3.9f, 1.71f, 4.54f, 2.1f, 4.93f)
                    lineToRelative(1.56f, 1.56f)
                    curveToRelative(-1.25f, 1.88f, -1.88f, 4.2f, -1.59f, 6.69f)
                    curveToRelative(0.52f, 4.54f, 4.21f, 8.23f, 8.75f, 8.75f)
                    curveToRelative(2.49f, 0.29f, 4.81f, -0.34f, 6.69f, -1.59f)
                    lineToRelative(1.56f, 1.56f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.51f, 3.51f)
                    curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    curveToRelative(0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                    lineToRelative(10.94f, 10.94f)
                    curveTo(14.86f, 19.59f, 13.48f, 20f, 12f, 20f)
                    close()
                    moveTo(7.94f, 5.12f)
                    lineTo(6.49f, 3.66f)
                    curveTo(8.07f, 2.61f, 9.96f, 2f, 12f, 2f)
                    curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                    curveToRelative(0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                    lineToRelative(-1.46f, -1.46f)
                    curveTo(19.59f, 14.86f, 20f, 13.48f, 20f, 12f)
                    curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                    curveTo(10.52f, 4f, 9.14f, 4.41f, 7.94f, 5.12f)
                    close()
                }
            }
        }.build()
        
        return _Hide_source!!
    }

private var _Hide_source: ImageVector? = null


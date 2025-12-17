package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
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
                    moveTo(20.69f, 4.05f)
                    curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12f, 5.5f)
                    curveToRelative(-3.89f, 0f, -6.95f, -0.84f, -8.69f, -1.43f)
                    curveTo(2.67f, 3.85f, 2f, 4.33f, 2f, 5.02f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f)
                    curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12f, 18.5f)
                    curveToRelative(3.87f, 0f, 6.66f, 0.76f, 8.69f, 1.45f)
                    curveTo(21.34f, 20.16f, 22f, 19.68f, 22f, 19f)
                    verticalLineTo(5f)
                    curveTo(22f, 4.32f, 21.34f, 3.84f, 20.69f, 4.05f)
                    close()
                    moveTo(17.28f, 15.26f)
                    curveTo(15.62f, 15.1f, 13.84f, 15f, 12f, 15f)
                    curveToRelative(-1.87f, 0f, -3.63f, 0.1f, -5.28f, 0.27f)
                    curveTo(6.27f, 15.31f, 6f, 14.79f, 6.29f, 14.45f)
                    lineToRelative(2.5f, -3f)
                    curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0f)
                    lineToRelative(1.62f, 1.94f)
                    lineToRelative(2.44f, -2.93f)
                    curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0f)
                    lineToRelative(3.32f, 3.99f)
                    curveTo(17.99f, 14.79f, 17.72f, 15.31f, 17.28f, 15.26f)
                    close()
                }
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null


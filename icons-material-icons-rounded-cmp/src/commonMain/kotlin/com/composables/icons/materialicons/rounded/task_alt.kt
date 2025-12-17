package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Task_alt: ImageVector
    get() {
        if (_Task_alt != null) return _Task_alt!!
        
        _Task_alt = ImageVector.Builder(
            name = "task_alt",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.29f, 5.89f)
                lineToRelative(-10f, 10f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(9.29f, -9.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(21.68f, 4.87f, 21.68f, 5.5f, 21.29f, 5.89f)
                close()
                moveTo(15.77f, 2.74f)
                curveToRelative(-1.69f, -0.69f, -3.61f, -0.93f, -5.61f, -0.57f)
                curveTo(6.09f, 2.9f, 2.84f, 6.18f, 2.15f, 10.25f)
                curveTo(1.01f, 17f, 6.63f, 22.78f, 13.34f, 21.91f)
                curveToRelative(3.96f, -0.51f, 7.28f, -3.46f, 8.32f, -7.31f)
                curveToRelative(0.4f, -1.47f, 0.44f, -2.89f, 0.21f, -4.22f)
                curveToRelative(-0.13f, -0.8f, -1.12f, -1.11f, -1.7f, -0.54f)
                verticalLineToRelative(0f)
                curveToRelative(-0.23f, 0.23f, -0.33f, 0.57f, -0.27f, 0.89f)
                curveToRelative(0.22f, 1.33f, 0.12f, 2.75f, -0.52f, 4.26f)
                curveToRelative(-1.16f, 2.71f, -3.68f, 4.7f, -6.61f, 4.97f)
                curveToRelative(-5.1f, 0.47f, -9.33f, -3.85f, -8.7f, -8.98f)
                curveToRelative(0.43f, -3.54f, 3.28f, -6.42f, 6.81f, -6.91f)
                curveToRelative(1.73f, -0.24f, 3.37f, 0.09f, 4.77f, 0.81f)
                curveToRelative(0.39f, 0.2f, 0.86f, 0.13f, 1.17f, -0.18f)
                lineToRelative(0f, 0f)
                curveToRelative(0.48f, -0.48f, 0.36f, -1.29f, -0.24f, -1.6f)
                curveTo(16.31f, 2.98f, 16.04f, 2.85f, 15.77f, 2.74f)
                close()
            }
        }.build()
        
        return _Task_alt!!
    }

private var _Task_alt: ImageVector? = null


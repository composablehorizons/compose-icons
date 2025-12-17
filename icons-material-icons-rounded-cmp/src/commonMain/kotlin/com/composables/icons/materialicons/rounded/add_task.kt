package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_task: ImageVector
    get() {
        if (_Add_task != null) return _Add_task!!
        
        _Add_task = ImageVector.Builder(
            name = "add_task",
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
                verticalLineToRelative(0f)
                curveTo(21.68f, 4.87f, 21.68f, 5.5f, 21.29f, 5.89f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.71f, 0f, -8.48f, -4.09f, -7.95f, -8.9f)
                curveToRelative(0.39f, -3.52f, 3.12f, -6.41f, 6.61f, -6.99f)
                curveToRelative(1.81f, -0.3f, 3.53f, 0.02f, 4.99f, 0.78f)
                curveToRelative(0.39f, 0.2f, 0.86f, 0.13f, 1.17f, -0.18f)
                lineToRelative(0f, 0f)
                curveToRelative(0.48f, -0.48f, 0.36f, -1.29f, -0.24f, -1.6f)
                curveTo(15.11f, 2.36f, 13.45f, 1.95f, 11.68f, 2f)
                curveToRelative(-5.14f, 0.16f, -9.41f, 4.34f, -9.67f, 9.47f)
                curveTo(1.72f, 17.24f, 6.3f, 22f, 12f, 22f)
                curveToRelative(1.2f, 0f, 2.34f, -0.21f, 3.41f, -0.6f)
                curveToRelative(0.68f, -0.25f, 0.87f, -1.13f, 0.35f, -1.65f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.27f, -0.27f, -0.68f, -0.37f, -1.04f, -0.23f)
                curveTo(13.87f, 19.83f, 12.95f, 20f, 12f, 20f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _Add_task!!
    }

private var _Add_task: ImageVector? = null


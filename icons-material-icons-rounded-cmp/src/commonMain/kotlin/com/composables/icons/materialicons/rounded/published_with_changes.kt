package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Published_with_changes: ImageVector
    get() {
        if (_Published_with_changes != null) return _Published_with_changes!!
        
        _Published_with_changes = ImageVector.Builder(
            name = "published_with_changes",
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
                moveTo(16.95f, 10.23f)
                lineToRelative(-5.66f, 5.66f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.95f, -4.95f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(17.34f, 9.21f, 17.34f, 9.84f, 16.95f, 10.23f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f)
                lineToRelative(1.53f, 1.53f)
                curveTo(8.46f, 7.96f, 9f, 7.74f, 9f, 7.29f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(4.21f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineTo(5.2f, 4.7f)
                curveTo(3.24f, 6.52f, 2f, 9.11f, 2f, 12f)
                curveToRelative(0f, 4.75f, 3.32f, 8.73f, 7.76f, 9.75f)
                curveToRelative(0.63f, 0.14f, 1.24f, -0.33f, 1.24f, -0.98f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.47f, -0.33f, -0.87f, -0.79f, -0.98f)
                curveTo(6.66f, 18.98f, 4f, 15.8f, 4f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -4.75f, -3.32f, -8.73f, -7.76f, -9.75f)
                curveTo(13.61f, 2.11f, 13f, 2.58f, 13f, 3.23f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.47f, 0.33f, 0.87f, 0.79f, 0.98f)
                curveTo(17.34f, 5.02f, 20f, 8.2f, 20f, 12f)
                curveToRelative(0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f)
                lineToRelative(-1.53f, -1.53f)
                curveTo(15.54f, 16.04f, 15f, 16.26f, 15f, 16.71f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(18.8f, 19.3f)
                curveTo(20.76f, 17.48f, 22f, 14.89f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Published_with_changes!!
    }

private var _Published_with_changes: ImageVector? = null


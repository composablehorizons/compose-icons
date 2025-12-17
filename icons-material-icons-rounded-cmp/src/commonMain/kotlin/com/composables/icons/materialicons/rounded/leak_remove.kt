package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Leak_remove: ImageVector
    get() {
        if (_Leak_remove != null) return _Leak_remove!!
        
        _Leak_remove = ImageVector.Builder(
            name = "leak_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.12f, 12.04f)
                curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f)
                curveToRelative(0f, -0.59f, -0.51f, -1.06f, -1.1f, -1f)
                curveToRelative(-1.5f, 0.15f, -2.9f, 0.61f, -4.16f, 1.3f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(0.9f, -0.41f, 1.87f, -0.69f, 2.9f, -0.79f)
                close()
                moveToRelative(0.88f, 3.05f)
                curveToRelative(0f, -0.61f, -0.54f, -1.09f, -1.14f, -1f)
                curveToRelative(-0.38f, 0.06f, -0.75f, 0.16f, -1.11f, 0.28f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.37f, -0.15f, 0.63f, -0.49f, 0.63f, -0.9f)
                close()
                moveTo(13.97f, 4.14f)
                curveToRelative(0.06f, -0.59f, -0.4f, -1.11f, -1f, -1.11f)
                curveToRelative(-0.5f, 0f, -0.94f, 0.37f, -0.99f, 0.87f)
                curveToRelative(-0.1f, 1.03f, -0.38f, 2.01f, -0.79f, 2.91f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(0.69f, -1.26f, 1.15f, -2.66f, 1.3f, -4.15f)
                close()
                moveToRelative(-4.04f, 0.02f)
                curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1f, -1.14f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.26f, -0.9f, 0.62f)
                lineToRelative(1.62f, 1.62f)
                curveToRelative(0.13f, -0.35f, 0.22f, -0.72f, 0.28f, -1.1f)
                close()
                moveToRelative(10.51f, 14.72f)
                lineTo(5.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.15f, 2.15f)
                curveToRelative(-0.59f, 0.41f, -1.26f, 0.7f, -1.99f, 0.82f)
                curveToRelative(-0.48f, 0.1f, -0.84f, 0.5f, -0.84f, 1f)
                curveToRelative(0f, 0.61f, 0.54f, 1.09f, 1.14f, 1f)
                curveToRelative(1.17f, -0.19f, 2.23f, -0.68f, 3.13f, -1.37f)
                lineTo(8.73f, 10f)
                curveToRelative(-1.34f, 1.1f, -3f, 1.82f, -4.81f, 1.99f)
                curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f)
                curveToRelative(0f, 0.59f, 0.51f, 1.06f, 1.1f, 1f)
                curveToRelative(2.28f, -0.23f, 4.36f, -1.15f, 6.01f, -2.56f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(-1.4f, 1.65f, -2.33f, 3.72f, -2.56f, 6f)
                curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 1f, 1.11f)
                curveToRelative(0.5f, 0f, 0.94f, -0.37f, 0.99f, -0.87f)
                curveToRelative(0.18f, -1.82f, 0.9f, -3.48f, 1.99f, -4.82f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(-0.69f, 0.9f, -1.18f, 1.96f, -1.37f, 3.13f)
                curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1f, 1.14f)
                curveToRelative(0.49f, 0f, 0.9f, -0.36f, 0.98f, -0.85f)
                curveToRelative(0.12f, -0.73f, 0.42f, -1.4f, 0.82f, -1.99f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.38f, -0.41f, 0.38f, -1.04f, -0.01f, -1.43f)
                close()
            }
        }.build()
        
        return _Leak_remove!!
    }

private var _Leak_remove: ImageVector? = null


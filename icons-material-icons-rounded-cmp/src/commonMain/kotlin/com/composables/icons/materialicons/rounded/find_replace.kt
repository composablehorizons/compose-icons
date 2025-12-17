package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Find_replace: ImageVector
    get() {
        if (_Find_replace != null) return _Find_replace!!
        
        _Find_replace = ImageVector.Builder(
            name = "find_replace",
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
                moveTo(11f, 6f)
                curveToRelative(1.38f, 0f, 2.63f, 0.56f, 3.54f, 1.46f)
                lineToRelative(-1.69f, 1.69f)
                curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(5.21f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.2f, 1.2f)
                curveTo(14.68f, 4.78f, 12.93f, 4f, 11f, 4f)
                curveTo(7.96f, 4f, 5.38f, 5.94f, 4.42f, 8.64f)
                curveToRelative(-0.24f, 0.66f, 0.23f, 1.36f, 0.93f, 1.36f)
                curveToRelative(0.42f, 0f, 0.79f, -0.26f, 0.93f, -0.66f)
                curveTo(6.96f, 7.4f, 8.82f, 6f, 11f, 6f)
                close()
                moveToRelative(5.64f, 9.14f)
                curveToRelative(0.4f, -0.54f, 0.72f, -1.15f, 0.95f, -1.8f)
                curveToRelative(0.23f, -0.65f, -0.25f, -1.34f, -0.94f, -1.34f)
                curveToRelative(-0.42f, 0f, -0.79f, 0.26f, -0.93f, 0.66f)
                curveTo(15.04f, 14.6f, 13.18f, 16f, 11f, 16f)
                curveToRelative(-1.38f, 0f, -2.63f, -0.56f, -3.54f, -1.46f)
                lineToRelative(1.69f, -1.69f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(1.2f, -1.2f)
                curveTo(7.32f, 17.22f, 9.07f, 18f, 11f, 18f)
                curveToRelative(1.55f, 0f, 2.98f, -0.51f, 4.14f, -1.36f)
                lineToRelative(4.11f, 4.11f)
                curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0f)
                curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0f, -1.49f)
                lineToRelative(-4.1f, -4.12f)
                close()
            }
        }.build()
        
        return _Find_replace!!
    }

private var _Find_replace: ImageVector? = null


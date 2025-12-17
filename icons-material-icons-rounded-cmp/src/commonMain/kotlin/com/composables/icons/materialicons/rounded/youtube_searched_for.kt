package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Youtube_searched_for: ImageVector
    get() {
        if (_Youtube_searched_for != null) return _Youtube_searched_for!!
        
        _Youtube_searched_for = ImageVector.Builder(
            name = "youtube_searched_for",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.01f, 14f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-0.27f, -0.27f)
                curveToRelative(1.15f, -1.34f, 1.76f, -3.14f, 1.51f, -5.09f)
                curveTo(17.11f, 6f, 15.1f, 3.78f, 12.5f, 3.18f)
                curveTo(8.26f, 2.2f, 4.51f, 5.53f, 4.51f, 9.5f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-0.47f, 0f, -0.68f, 0.59f, -0.31f, 0.89f)
                lineToRelative(3.4f, 2.75f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.01f)
                lineToRelative(2.9f, -2.79f)
                curveToRelative(0.32f, -0.31f, 0.1f, -0.86f, -0.35f, -0.86f)
                horizontalLineTo(6.51f)
                curveToRelative(0f, -2.49f, 2f, -4.48f, 4.46f, -4.5f)
                curveToRelative(2.44f, -0.02f, 4.54f, 2.05f, 4.54f, 4.49f)
                curveToRelative(0f, 2.48f, -2.02f, 4.51f, -4.5f, 4.51f)
                curveToRelative(-0.45f, 0f, -0.89f, -0.07f, -1.3f, -0.19f)
                curveToRelative(-0.34f, -0.1f, -0.71f, 0f, -0.96f, 0.26f)
                curveToRelative(-0.53f, 0.53f, -0.32f, 1.45f, 0.39f, 1.66f)
                curveToRelative(0.59f, 0.17f, 1.22f, 0.27f, 1.87f, 0.27f)
                curveToRelative(1.61f, 0f, 3.08f, -0.59f, 4.22f, -1.57f)
                lineToRelative(0.27f, 0.27f)
                verticalLineToRelative(0.79f)
                lineToRelative(4.27f, 4.25f)
                curveToRelative(0.41f, 0.41f, 1.07f, 0.41f, 1.48f, 0f)
                curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0f, -1.49f)
                lineTo(17.01f, 14f)
                close()
            }
        }.build()
        
        return _Youtube_searched_for!!
    }

private var _Youtube_searched_for: ImageVector? = null


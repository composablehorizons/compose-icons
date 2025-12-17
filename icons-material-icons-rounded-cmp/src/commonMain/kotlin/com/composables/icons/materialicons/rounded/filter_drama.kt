package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Filter_drama: ImageVector
    get() {
        if (_Filter_drama != null) return _Filter_drama!!
        
        _Filter_drama = ImageVector.Builder(
            name = "filter_drama",
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
                moveTo(19.35f, 10.04f)
                curveTo(18.67f, 6.59f, 15.64f, 4f, 12f, 4f)
                curveTo(9.11f, 4f, 6.61f, 5.64f, 5.36f, 8.04f)
                curveTo(2.35f, 8.36f, 0f, 10.9f, 0f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f)
                close()
                moveTo(19f, 18f)
                horizontalLineTo(6.17f)
                curveToRelative(-2.09f, 0f, -3.95f, -1.53f, -4.15f, -3.61f)
                curveTo(1.79f, 12.01f, 3.66f, 10f, 6f, 10f)
                curveToRelative(1.92f, 0f, 3.53f, 1.36f, 3.91f, 3.17f)
                curveToRelative(0.1f, 0.48f, 0.5f, 0.83f, 0.98f, 0.83f)
                curveToRelative(0.61f, 0f, 1.11f, -0.55f, 0.99f, -1.15f)
                curveToRelative(-0.43f, -2.24f, -2.11f, -4.03f, -4.29f, -4.63f)
                curveToRelative(1.1f, -1.46f, 2.89f, -2.37f, 4.89f, -2.2f)
                curveToRelative(2.88f, 0.25f, 5.01f, 2.82f, 5.01f, 5.71f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.37f)
                curveToRelative(1.45f, 0f, 2.79f, 0.97f, 3.07f, 2.4f)
                curveToRelative(0.39f, 1.91f, -1.08f, 3.6f, -2.93f, 3.6f)
                close()
            }
        }.build()
        
        return _Filter_drama!!
    }

private var _Filter_drama: ImageVector? = null


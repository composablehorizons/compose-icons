package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Soup_kitchen: ImageVector
    get() {
        if (_Soup_kitchen != null) return _Soup_kitchen!!
        
        _Soup_kitchen = ImageVector.Builder(
            name = "soup_kitchen",
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
                moveTo(6.4f, 7f)
                curveTo(6.06f, 7.55f, 6f, 7.97f, 6f, 8.38f)
                curveTo(6f, 9.15f, 7f, 11f, 7f, 12f)
                curveToRelative(0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f)
                horizontalLineTo(5.1f)
                curveToRelative(0f, 0f, 0.4f, -0.55f, 0.4f, -1.5f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveTo(4.5f, 7.97f, 4.56f, 7.55f, 4.9f, 7f)
                horizontalLineTo(6.4f)
                close()
                moveTo(11.4f, 7f)
                curveTo(11.06f, 7.55f, 11f, 7.97f, 11f, 8.38f)
                curveTo(11f, 9.15f, 12f, 11f, 12f, 12f)
                curveToRelative(0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, 0f, 0.4f, -0.55f, 0.4f, -1.5f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveToRelative(0f, -0.41f, 0.06f, -0.83f, 0.4f, -1.38f)
                horizontalLineTo(11.4f)
                close()
                moveTo(8.15f, 7f)
                curveToRelative(-0.34f, 0.55f, -0.4f, 0.97f, -0.4f, 1.38f)
                curveToRelative(0f, 0.77f, 1f, 2.63f, 1f, 3.62f)
                curveToRelative(0f, 0.95f, -0.4f, 1.5f, -0.4f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, 0f, 0.4f, -0.55f, 0.4f, -1.5f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveToRelative(0f, -0.41f, 0.06f, -0.83f, 0.4f, -1.38f)
                horizontalLineTo(8.15f)
                close()
                moveTo(21.47f, 6.5f)
                curveToRelative(0f, 0f, 0.13f, -1.06f, 0.13f, -1.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-1.54f, 0f, -2.81f, 1.16f, -2.98f, 2.65f)
                lineTo(14.53f, 15f)
                horizontalLineTo(4.01f)
                curveToRelative(-0.6f, 0f, -1.09f, 0.53f, -1f, 1.13f)
                curveTo(3.53f, 19.46f, 6.39f, 22f, 9.75f, 22f)
                curveToRelative(3.48f, 0f, 6.34f, -2.73f, 6.71f, -6.23f)
                lineToRelative(1.15f, -10.87f)
                curveTo(17.66f, 4.39f, 18.08f, 4f, 18.6f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.3f, -0.1f, 1.25f, -0.1f, 1.25f)
                lineTo(21.47f, 6.5f)
                close()
            }
        }.build()
        
        return _Soup_kitchen!!
    }

private var _Soup_kitchen: ImageVector? = null


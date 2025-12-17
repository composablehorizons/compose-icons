package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ring_volume: ImageVector
    get() {
        if (_Ring_volume != null) return _Ring_volume!!
        
        _Ring_volume = ImageVector.Builder(
            name = "ring_volume",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23.71f, 16.67f)
                curveTo(20.66f, 13.78f, 16.54f, 12f, 12f, 12f)
                curveTo(7.46f, 12f, 3.34f, 13.78f, 0.29f, 16.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                curveToRelative(0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.45f, -0.48f, 3f, -0.73f, 4.6f, -0.73f)
                reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.7f)
                close()
                moveTo(21.16f, 6.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.56f, 3.55f)
                lineToRelative(1.41f, 1.41f)
                reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                close()
                moveTo(6.4f, 9.81f)
                lineTo(7.81f, 8.4f)
                lineTo(4.26f, 4.84f)
                lineTo(2.84f, 6.26f)
                curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f)
                close()
            }
        }.build()
        
        return _Ring_volume!!
    }

private var _Ring_volume: ImageVector? = null


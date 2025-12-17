package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Lock_reset: ImageVector
    get() {
        if (_Lock_reset != null) return _Lock_reset!!
        
        _Lock_reset = ImageVector.Builder(
            name = "lock_reset",
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
                moveTo(13.26f, 3f)
                curveTo(8.17f, 2.86f, 4f, 6.94f, 4f, 12f)
                horizontalLineTo(2.21f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.8f, -2.79f)
                curveTo(8.46f, 12.54f, 8.24f, 12f, 7.79f, 12f)
                horizontalLineTo(6f)
                curveToRelative(0f, -3.89f, 3.2f, -7.06f, 7.1f, -7f)
                curveToRelative(3.71f, 0.05f, 6.84f, 3.18f, 6.9f, 6.9f)
                curveToRelative(0.06f, 3.91f, -3.1f, 7.1f, -7f, 7.1f)
                curveToRelative(-1.59f, 0f, -3.05f, -0.53f, -4.23f, -1.43f)
                curveToRelative(-0.4f, -0.3f, -0.96f, -0.27f, -1.31f, 0.09f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.43f, 0.43f, -0.39f, 1.14f, 0.09f, 1.5f)
                curveTo(9.06f, 20.31f, 10.95f, 21f, 13f, 21f)
                curveToRelative(5.06f, 0f, 9.14f, -4.17f, 9f, -9.25f)
                curveTo(21.87f, 7.05f, 17.95f, 3.13f, 13.26f, 3f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveTo(16f, 11.45f, 15.55f, 11f, 15f, 11f)
                close()
                moveTo(14f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Lock_reset!!
    }

private var _Lock_reset: ImageVector? = null


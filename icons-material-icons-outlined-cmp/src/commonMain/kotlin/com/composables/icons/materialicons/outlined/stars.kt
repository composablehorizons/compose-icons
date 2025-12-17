package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
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
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveToRelative(7.48f, 7.16f)
                lineToRelative(-5.01f, -0.43f)
                lineToRelative(-2f, -4.71f)
                curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f)
                close()
                moveToRelative(-5.07f, 6.26f)
                lineTo(12f, 13.98f)
                lineToRelative(-2.39f, 1.44f)
                lineToRelative(0.63f, -2.72f)
                lineToRelative(-2.11f, -1.83f)
                lineToRelative(2.78f, -0.24f)
                lineTo(12f, 8.06f)
                lineToRelative(1.09f, 2.56f)
                lineToRelative(2.78f, 0.24f)
                lineToRelative(-2.11f, 1.83f)
                lineToRelative(0.64f, 2.73f)
                close()
                moveToRelative(-2.86f, -11.4f)
                lineToRelative(-2f, 4.72f)
                lineToRelative(-5.02f, 0.43f)
                curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f)
                lineToRelative(3.79f, 3.28f)
                lineToRelative(-1.11f, 4.75f)
                curveTo(5.13f, 16.7f, 4f, 14.48f, 4f, 12f)
                close()
                moveToRelative(3.84f, 6.82f)
                lineTo(12f, 16.31f)
                lineToRelative(4.16f, 2.5f)
                curveToRelative(-1.22f, 0.75f, -2.64f, 1.19f, -4.17f, 1.19f)
                curveToRelative(-1.52f, 0f, -2.94f, -0.44f, -4.15f, -1.18f)
                close()
                moveToRelative(9.25f, -0.65f)
                lineToRelative(-1.11f, -4.75f)
                lineToRelative(3.79f, -3.28f)
                curveToRelative(0.14f, 0.59f, 0.23f, 1.22f, 0.23f, 1.86f)
                curveToRelative(0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null


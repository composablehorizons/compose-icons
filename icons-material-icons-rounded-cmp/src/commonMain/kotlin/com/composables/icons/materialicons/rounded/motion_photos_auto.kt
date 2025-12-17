package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Motion_photos_auto: ImageVector
    get() {
        if (_Motion_photos_auto != null) return _Motion_photos_auto!!
        
        _Motion_photos_auto = ImageVector.Builder(
            name = "motion_photos_auto",
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
                moveTo(4f, 9f)
                lineTo(4f, 9f)
                curveToRelative(0.26f, 0.26f, 0.34f, 0.63f, 0.25f, 0.98f)
                curveToRelative(-0.35f, 1.36f, -0.36f, 2.87f, 0.1f, 4.38f)
                curveToRelative(0.88f, 2.91f, 3.44f, 5.1f, 6.44f, 5.55f)
                curveToRelative(5.52f, 0.81f, 10.19f, -4.06f, 9.03f, -9.62f)
                curveToRelative(-0.65f, -3.13f, -3.23f, -5.61f, -6.37f, -6.16f)
                curveToRelative(-1.21f, -0.21f, -2.38f, -0.15f, -3.46f, 0.13f)
                curveTo(9.64f, 4.35f, 9.26f, 4.26f, 9.01f, 4.01f)
                lineToRelative(0f, 0f)
                curveTo(8.45f, 3.45f, 8.73f, 2.52f, 9.48f, 2.32f)
                curveToRelative(1.47f, -0.38f, 3.06f, -0.44f, 4.7f, -0.09f)
                curveToRelative(3.98f, 0.86f, 7.09f, 4.18f, 7.7f, 8.2f)
                curveToRelative(1.04f, 6.81f, -4.82f, 12.58f, -11.64f, 11.42f)
                curveTo(6.23f, 21.16f, 2.98f, 17.99f, 2.2f, 14f)
                curveToRelative(-0.31f, -1.59f, -0.24f, -3.12f, 0.12f, -4.53f)
                curveTo(2.52f, 8.72f, 3.45f, 8.45f, 4f, 9f)
                close()
                moveTo(7f, 5.5f)
                curveTo(7f, 6.33f, 6.33f, 7f, 5.5f, 7f)
                reflectiveCurveTo(4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                close()
                moveTo(12.03f, 8.99f)
                horizontalLineToRelative(-0.07f)
                lineToRelative(-1.16f, 3.31f)
                horizontalLineToRelative(2.39f)
                lineTo(12.03f, 8.99f)
                close()
                moveTo(12f, 18f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveTo(8.69f, 18f, 12f, 18f)
                close()
                moveTo(8.61f, 14.63f)
                lineToRelative(2.43f, -6.46f)
                curveTo(11.19f, 7.77f, 11.57f, 7.5f, 12f, 7.5f)
                reflectiveCurveToRelative(0.82f, 0.27f, 0.97f, 0.67f)
                lineToRelative(2.43f, 6.46f)
                curveToRelative(0.16f, 0.42f, -0.15f, 0.87f, -0.6f, 0.87f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.17f, -0.61f, -0.43f)
                lineToRelative(-0.56f, -1.61f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(-0.57f, 1.62f)
                curveToRelative(-0.09f, 0.26f, -0.33f, 0.43f, -0.61f, 0.43f)
                curveTo(8.76f, 15.5f, 8.45f, 15.05f, 8.61f, 14.63f)
                close()
            }
        }.build()
        
        return _Motion_photos_auto!!
    }

private var _Motion_photos_auto: ImageVector? = null


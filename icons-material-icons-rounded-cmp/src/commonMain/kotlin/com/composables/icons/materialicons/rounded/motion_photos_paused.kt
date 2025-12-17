package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Motion_photos_paused: ImageVector
    get() {
        if (_Motion_photos_paused != null) return _Motion_photos_paused!!
        
        _Motion_photos_paused = ImageVector.Builder(
            name = "motion_photos_paused",
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
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 6f, 12f, 6f)
                close()
                moveTo(10f, 15f)
                lineTo(10f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveTo(11f, 14.55f, 10.55f, 15f, 10f, 15f)
                close()
                moveTo(14f, 15f)
                lineTo(14f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveTo(15f, 14.55f, 14.55f, 15f, 14f, 15f)
                close()
            }
        }.build()
        
        return _Motion_photos_paused!!
    }

private var _Motion_photos_paused: ImageVector? = null


package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
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
                moveTo(12.01f, 16f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.2f, -0.2f, -0.29f, -0.43f, -0.29f, -0.71f)
                curveToRelative(-0.01f, -0.55f, 0.43f, -0.99f, 0.98f, -1f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.02f, 0f)
                curveToRelative(0.28f, 0f, 0.51f, 0.1f, 0.71f, 0.29f)
                curveToRelative(0.18f, 0.19f, 0.28f, 0.43f, 0.28f, 0.7f)
                reflectiveCurveToRelative(-0.1f, 0.51f, -0.29f, 0.71f)
                reflectiveCurveTo(12.28f, 16f, 12.01f, 16f)
                close()
                moveTo(11.13f, 12.34f)
                curveToRelative(0f, -0.45f, 0.1f, -0.84f, 0.29f, -1.16f)
                curveToRelative(0.19f, -0.33f, 0.53f, -0.7f, 1f, -1.12f)
                curveToRelative(0.28f, -0.25f, 0.48f, -0.47f, 0.61f, -0.66f)
                reflectiveCurveToRelative(0.19f, -0.4f, 0.19f, -0.64f)
                curveToRelative(0f, -0.29f, -0.11f, -0.53f, -0.32f, -0.74f)
                curveToRelative(-0.21f, -0.2f, -0.5f, -0.3f, -0.85f, -0.3f)
                curveToRelative(-0.37f, 0f, -0.74f, 0.1f, -0.96f, 0.3f)
                curveToRelative(-0.21f, 0.2f, -0.4f, 0.45f, -0.4f, 0.98f)
                horizontalLineTo(9f)
                curveToRelative(0f, -1.01f, 0.46f, -1.73f, 0.97f, -2.21f)
                curveTo(10.53f, 6.28f, 11.25f, 6f, 12f, 6f)
                curveToRelative(0.59f, 0f, 1.11f, 0.12f, 1.57f, 0.35f)
                reflectiveCurveToRelative(0.79f, 0.55f, 1.05f, 0.96f)
                reflectiveCurveTo(15f, 8.17f, 15f, 8.66f)
                reflectiveCurveToRelative(-0.1f, 0.9f, -0.31f, 1.25f)
                reflectiveCurveTo(14.21f, 10.62f, 13.8f, 11f)
                curveToRelative(-0.32f, 0.3f, -0.53f, 0.56f, -0.65f, 0.77f)
                reflectiveCurveToRelative(-0.18f, 0.49f, -0.18f, 0.81f)
                verticalLineTo(13f)
                horizontalLineToRelative(-1.85f)
                verticalLineToRelative(-0.66f)
                horizontalLineTo(11.13f)
                close()
                moveTo(18f, 10.2f)
                curveTo(18f, 6.57f, 15.35f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveTo(16.05f, 15.64f, 18f, 12.54f, 18f, 10.2f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.2f, 0f, 8f, 3.22f, 8f, 8.2f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                close()
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null


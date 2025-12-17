package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Copyright: ImageVector
    get() {
        if (_Copyright != null) return _Copyright!!
        
        _Copyright = ImageVector.Builder(
            name = "copyright",
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
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveToRelative(-1.92f, 9.14f)
                curveToRelative(0.05f, 0.33f, 0.16f, 0.63f, 0.3f, 0.88f)
                reflectiveCurveToRelative(0.34f, 0.46f, 0.59f, 0.62f)
                curveToRelative(0.23f, 0.15f, 0.53f, 0.22f, 0.89f, 0.23f)
                curveToRelative(0.21f, -0.01f, 0.41f, -0.03f, 0.6f, -0.1f)
                curveToRelative(0.2f, -0.07f, 0.37f, -0.17f, 0.52f, -0.3f)
                curveToRelative(0.15f, -0.13f, 0.27f, -0.28f, 0.36f, -0.46f)
                curveToRelative(0.09f, -0.18f, 0.14f, -0.37f, 0.15f, -0.58f)
                horizontalLineToRelative(1.79f)
                curveToRelative(-0.01f, 0.41f, -0.12f, 0.79f, -0.3f, 1.15f)
                curveToRelative(-0.18f, 0.36f, -0.43f, 0.67f, -0.74f, 0.94f)
                curveToRelative(-0.31f, 0.27f, -0.67f, 0.48f, -1.08f, 0.63f)
                curveToRelative(-0.41f, 0.15f, -0.85f, 0.23f, -1.32f, 0.23f)
                curveToRelative(-0.65f, 0f, -1.22f, -0.12f, -1.7f, -0.34f)
                curveToRelative(-0.48f, -0.22f, -0.88f, -0.53f, -1.2f, -0.91f)
                reflectiveCurveToRelative(-0.56f, -0.83f, -0.71f, -1.35f)
                curveToRelative(-0.15f, -0.52f, -0.23f, -1.06f, -0.23f, -1.64f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -0.58f, 0.09f, -1.12f, 0.24f, -1.64f)
                curveToRelative(0.15f, -0.52f, 0.39f, -0.97f, 0.71f, -1.36f)
                reflectiveCurveToRelative(0.72f, -0.69f, 1.2f, -0.92f)
                curveToRelative(0.48f, -0.23f, 1.05f, -0.34f, 1.7f, -0.34f)
                curveToRelative(0.51f, 0f, 0.97f, 0.07f, 1.39f, 0.23f)
                curveToRelative(0.42f, 0.16f, 0.78f, 0.38f, 1.08f, 0.66f)
                curveToRelative(0.3f, 0.28f, 0.53f, 0.62f, 0.7f, 1.01f)
                curveToRelative(0.17f, 0.39f, 0.26f, 0.82f, 0.28f, 1.29f)
                horizontalLineToRelative(-1.79f)
                curveToRelative(-0.01f, -0.22f, -0.05f, -0.44f, -0.14f, -0.64f)
                curveToRelative(-0.09f, -0.2f, -0.2f, -0.38f, -0.34f, -0.53f)
                curveToRelative(-0.14f, -0.15f, -0.32f, -0.27f, -0.52f, -0.36f)
                curveToRelative(-0.19f, -0.08f, -0.4f, -0.12f, -0.63f, -0.13f)
                curveToRelative(-0.37f, 0.01f, -0.67f, 0.08f, -0.91f, 0.23f)
                curveToRelative(-0.25f, 0.16f, -0.45f, 0.37f, -0.59f, 0.62f)
                reflectiveCurveToRelative(-0.25f, 0.54f, -0.3f, 0.87f)
                curveToRelative(-0.05f, 0.33f, -0.08f, 0.66f, -0.08f, 1.01f)
                verticalLineToRelative(0.27f)
                curveToRelative(0f, 0.33f, 0.03f, 0.67f, 0.08f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.08f, 10.86f)
                curveToRelative(0.05f, -0.33f, 0.16f, -0.62f, 0.3f, -0.87f)
                reflectiveCurveToRelative(0.34f, -0.46f, 0.59f, -0.62f)
                curveToRelative(0.24f, -0.15f, 0.54f, -0.22f, 0.91f, -0.23f)
                curveToRelative(0.23f, 0.01f, 0.44f, 0.05f, 0.63f, 0.13f)
                curveToRelative(0.2f, 0.09f, 0.38f, 0.21f, 0.52f, 0.36f)
                reflectiveCurveToRelative(0.25f, 0.33f, 0.34f, 0.53f)
                curveToRelative(0.09f, 0.2f, 0.13f, 0.42f, 0.14f, 0.64f)
                horizontalLineToRelative(1.79f)
                curveToRelative(-0.02f, -0.47f, -0.11f, -0.9f, -0.28f, -1.29f)
                curveToRelative(-0.17f, -0.39f, -0.4f, -0.73f, -0.7f, -1.01f)
                curveToRelative(-0.3f, -0.28f, -0.66f, -0.5f, -1.08f, -0.66f)
                curveToRelative(-0.42f, -0.16f, -0.88f, -0.23f, -1.39f, -0.23f)
                curveToRelative(-0.65f, 0f, -1.22f, 0.11f, -1.7f, 0.34f)
                curveToRelative(-0.48f, 0.23f, -0.88f, 0.53f, -1.2f, 0.92f)
                reflectiveCurveToRelative(-0.56f, 0.84f, -0.71f, 1.36f)
                curveToRelative(-0.15f, 0.52f, -0.24f, 1.06f, -0.24f, 1.64f)
                verticalLineToRelative(0.27f)
                curveToRelative(0f, 0.58f, 0.08f, 1.12f, 0.23f, 1.64f)
                curveToRelative(0.15f, 0.52f, 0.39f, 0.97f, 0.71f, 1.35f)
                reflectiveCurveToRelative(0.72f, 0.69f, 1.2f, 0.91f)
                curveToRelative(0.48f, 0.22f, 1.05f, 0.34f, 1.7f, 0.34f)
                curveToRelative(0.47f, 0f, 0.91f, -0.08f, 1.32f, -0.23f)
                curveToRelative(0.41f, -0.15f, 0.77f, -0.36f, 1.08f, -0.63f)
                curveToRelative(0.31f, -0.27f, 0.56f, -0.58f, 0.74f, -0.94f)
                curveToRelative(0.18f, -0.36f, 0.29f, -0.74f, 0.3f, -1.15f)
                horizontalLineToRelative(-1.79f)
                curveToRelative(-0.01f, 0.21f, -0.06f, 0.4f, -0.15f, 0.58f)
                curveToRelative(-0.09f, 0.18f, -0.21f, 0.33f, -0.36f, 0.46f)
                reflectiveCurveToRelative(-0.32f, 0.23f, -0.52f, 0.3f)
                curveToRelative(-0.19f, 0.07f, -0.39f, 0.09f, -0.6f, 0.1f)
                curveToRelative(-0.36f, -0.01f, -0.66f, -0.08f, -0.89f, -0.23f)
                curveToRelative(-0.25f, -0.16f, -0.45f, -0.37f, -0.59f, -0.62f)
                reflectiveCurveToRelative(-0.25f, -0.55f, -0.3f, -0.88f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.67f, -0.08f, -1f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -0.35f, 0.03f, -0.68f, 0.08f, -1.01f)
                close()
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.build()
        
        return _Copyright!!
    }

private var _Copyright: ImageVector? = null


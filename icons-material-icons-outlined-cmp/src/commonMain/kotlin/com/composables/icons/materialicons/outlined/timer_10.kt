package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Timer_10: ImageVector
    get() {
        if (_Timer_10 != null) return _Timer_10!!
        
        _Timer_10 = ImageVector.Builder(
            name = "timer_10",
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
                moveTo(-0.01f, 7.72f)
                verticalLineTo(9.4f)
                lineToRelative(3f, -1f)
                verticalLineTo(18f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-0.25f)
                lineTo(-0.01f, 7.72f)
                close()
                moveToRelative(23.78f, 6.65f)
                curveToRelative(-0.14f, -0.28f, -0.35f, -0.53f, -0.63f, -0.74f)
                curveToRelative(-0.28f, -0.21f, -0.61f, -0.39f, -1.01f, -0.53f)
                reflectiveCurveToRelative(-0.85f, -0.27f, -1.35f, -0.38f)
                curveToRelative(-0.35f, -0.07f, -0.64f, -0.15f, -0.87f, -0.23f)
                curveToRelative(-0.23f, -0.08f, -0.41f, -0.16f, -0.55f, -0.25f)
                reflectiveCurveToRelative(-0.23f, -0.19f, -0.28f, -0.3f)
                curveToRelative(-0.05f, -0.11f, -0.08f, -0.24f, -0.08f, -0.39f)
                curveToRelative(0f, -0.14f, 0.03f, -0.28f, 0.09f, -0.41f)
                reflectiveCurveToRelative(0.15f, -0.25f, 0.27f, -0.34f)
                curveToRelative(0.12f, -0.1f, 0.27f, -0.18f, 0.45f, -0.24f)
                reflectiveCurveToRelative(0.4f, -0.09f, 0.64f, -0.09f)
                curveToRelative(0.25f, 0f, 0.47f, 0.04f, 0.66f, 0.11f)
                reflectiveCurveToRelative(0.35f, 0.17f, 0.48f, 0.29f)
                reflectiveCurveToRelative(0.22f, 0.26f, 0.29f, 0.42f)
                curveToRelative(0.06f, 0.16f, 0.1f, 0.32f, 0.1f, 0.49f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0f, -0.39f, -0.08f, -0.75f, -0.24f, -1.09f)
                reflectiveCurveToRelative(-0.39f, -0.63f, -0.69f, -0.88f)
                curveToRelative(-0.3f, -0.25f, -0.66f, -0.44f, -1.09f, -0.59f)
                curveToRelative(-0.43f, -0.15f, -0.92f, -0.22f, -1.46f, -0.22f)
                curveToRelative(-0.51f, 0f, -0.98f, 0.07f, -1.39f, 0.21f)
                reflectiveCurveToRelative(-0.77f, 0.33f, -1.06f, 0.57f)
                curveToRelative(-0.29f, 0.24f, -0.51f, 0.52f, -0.67f, 0.84f)
                curveToRelative(-0.16f, 0.32f, -0.23f, 0.65f, -0.23f, 1.01f)
                reflectiveCurveToRelative(0.08f, 0.69f, 0.23f, 0.96f)
                curveToRelative(0.15f, 0.28f, 0.36f, 0.52f, 0.64f, 0.73f)
                curveToRelative(0.27f, 0.21f, 0.6f, 0.38f, 0.98f, 0.53f)
                curveToRelative(0.38f, 0.14f, 0.81f, 0.26f, 1.27f, 0.36f)
                curveToRelative(0.39f, 0.08f, 0.71f, 0.17f, 0.95f, 0.26f)
                reflectiveCurveToRelative(0.43f, 0.19f, 0.57f, 0.29f)
                curveToRelative(0.13f, 0.1f, 0.22f, 0.22f, 0.27f, 0.34f)
                curveToRelative(0.05f, 0.12f, 0.07f, 0.25f, 0.07f, 0.39f)
                curveToRelative(0f, 0.32f, -0.13f, 0.57f, -0.4f, 0.77f)
                reflectiveCurveToRelative(-0.66f, 0.29f, -1.17f, 0.29f)
                curveToRelative(-0.22f, 0f, -0.43f, -0.02f, -0.64f, -0.08f)
                curveToRelative(-0.21f, -0.05f, -0.4f, -0.13f, -0.56f, -0.24f)
                curveToRelative(-0.17f, -0.11f, -0.3f, -0.26f, -0.41f, -0.44f)
                curveToRelative(-0.11f, -0.18f, -0.17f, -0.41f, -0.18f, -0.67f)
                horizontalLineToRelative(-1.89f)
                curveToRelative(0f, 0.36f, 0.08f, 0.71f, 0.24f, 1.05f)
                reflectiveCurveToRelative(0.39f, 0.65f, 0.7f, 0.93f)
                curveToRelative(0.31f, 0.27f, 0.69f, 0.49f, 1.15f, 0.66f)
                reflectiveCurveToRelative(0.98f, 0.25f, 1.58f, 0.25f)
                curveToRelative(0.53f, 0f, 1.01f, -0.06f, 1.44f, -0.19f)
                curveToRelative(0.43f, -0.13f, 0.8f, -0.31f, 1.11f, -0.54f)
                curveToRelative(0.31f, -0.23f, 0.54f, -0.51f, 0.71f, -0.83f)
                curveToRelative(0.17f, -0.32f, 0.25f, -0.67f, 0.25f, -1.06f)
                curveToRelative(-0.02f, -0.4f, -0.09f, -0.74f, -0.24f, -1.02f)
                close()
                moveToRelative(-9.96f, -7.32f)
                curveToRelative(-0.34f, -0.4f, -0.75f, -0.7f, -1.23f, -0.88f)
                curveToRelative(-0.47f, -0.18f, -1.01f, -0.27f, -1.59f, -0.27f)
                reflectiveCurveToRelative(-1.11f, 0.09f, -1.59f, 0.27f)
                curveToRelative(-0.48f, 0.18f, -0.89f, 0.47f, -1.23f, 0.88f)
                curveToRelative(-0.34f, 0.41f, -0.6f, 0.93f, -0.79f, 1.59f)
                curveToRelative(-0.18f, 0.65f, -0.28f, 1.45f, -0.28f, 2.39f)
                verticalLineToRelative(1.92f)
                curveToRelative(0f, 0.94f, 0.09f, 1.74f, 0.28f, 2.39f)
                curveToRelative(0.19f, 0.66f, 0.45f, 1.19f, 0.8f, 1.6f)
                curveToRelative(0.34f, 0.41f, 0.75f, 0.71f, 1.23f, 0.89f)
                reflectiveCurveToRelative(1.01f, 0.28f, 1.59f, 0.28f)
                curveToRelative(0.59f, 0f, 1.12f, -0.09f, 1.59f, -0.28f)
                curveToRelative(0.48f, -0.18f, 0.88f, -0.48f, 1.22f, -0.89f)
                reflectiveCurveToRelative(0.6f, -0.94f, 0.78f, -1.6f)
                curveToRelative(0.18f, -0.65f, 0.28f, -1.45f, 0.28f, -2.39f)
                verticalLineToRelative(-1.92f)
                curveToRelative(0f, -0.94f, -0.09f, -1.74f, -0.28f, -2.39f)
                curveToRelative(-0.18f, -0.66f, -0.44f, -1.19f, -0.78f, -1.59f)
                close()
                moveToRelative(-0.92f, 6.17f)
                curveToRelative(0f, 0.6f, -0.04f, 1.11f, -0.12f, 1.53f)
                reflectiveCurveToRelative(-0.2f, 0.76f, -0.36f, 1.02f)
                curveToRelative(-0.16f, 0.26f, -0.36f, 0.45f, -0.59f, 0.57f)
                curveToRelative(-0.23f, 0.12f, -0.51f, 0.18f, -0.82f, 0.18f)
                curveToRelative(-0.3f, 0f, -0.58f, -0.06f, -0.82f, -0.18f)
                reflectiveCurveToRelative(-0.44f, -0.31f, -0.6f, -0.57f)
                curveToRelative(-0.16f, -0.26f, -0.29f, -0.6f, -0.38f, -1.02f)
                reflectiveCurveToRelative(-0.13f, -0.93f, -0.13f, -1.53f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.6f, 0.04f, -1.11f, 0.13f, -1.52f)
                reflectiveCurveToRelative(0.21f, -0.74f, 0.38f, -1f)
                curveToRelative(0.16f, -0.25f, 0.36f, -0.43f, 0.6f, -0.55f)
                curveToRelative(0.24f, -0.11f, 0.51f, -0.17f, 0.81f, -0.17f)
                curveToRelative(0.31f, 0f, 0.58f, 0.06f, 0.81f, 0.17f)
                curveToRelative(0.24f, 0.11f, 0.44f, 0.29f, 0.6f, 0.55f)
                curveToRelative(0.16f, 0.25f, 0.29f, 0.58f, 0.37f, 0.99f)
                reflectiveCurveToRelative(0.13f, 0.92f, 0.13f, 1.52f)
                verticalLineToRelative(2.51f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.build()
        
        return _Timer_10!!
    }

private var _Timer_10: ImageVector? = null


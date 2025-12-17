package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`3d_rotation`: ImageVector
    get() {
        if (_3d_rotation != null) return _3d_rotation!!
        
        _3d_rotation = ImageVector.Builder(
            name = "3d_rotation",
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
                moveTo(7.53f, 21.48f)
                curveTo(4.26f, 19.94f, 1.92f, 16.76f, 1.56f, 13f)
                horizontalLineTo(0.06f)
                curveToRelative(0.51f, 6.16f, 5.66f, 11f, 11.95f, 11f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.81f)
                lineToRelative(-1.33f, 1.32f)
                close()
                moveToRelative(0.89f, -6.52f)
                curveToRelative(-0.19f, 0f, -0.37f, -0.03f, -0.52f, -0.08f)
                curveToRelative(-0.16f, -0.06f, -0.29f, -0.13f, -0.4f, -0.24f)
                curveToRelative(-0.11f, -0.1f, -0.2f, -0.22f, -0.26f, -0.37f)
                curveToRelative(-0.06f, -0.14f, -0.09f, -0.3f, -0.09f, -0.47f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(0f, 0.36f, 0.07f, 0.68f, 0.21f, 0.95f)
                curveToRelative(0.14f, 0.27f, 0.33f, 0.5f, 0.56f, 0.69f)
                curveToRelative(0.24f, 0.18f, 0.51f, 0.32f, 0.82f, 0.41f)
                curveToRelative(0.3f, 0.1f, 0.62f, 0.15f, 0.96f, 0.15f)
                curveToRelative(0.37f, 0f, 0.72f, -0.05f, 1.03f, -0.15f)
                curveToRelative(0.32f, -0.1f, 0.6f, -0.25f, 0.83f, -0.44f)
                reflectiveCurveToRelative(0.42f, -0.43f, 0.55f, -0.72f)
                reflectiveCurveToRelative(0.2f, -0.61f, 0.2f, -0.97f)
                curveToRelative(0f, -0.19f, -0.02f, -0.38f, -0.07f, -0.56f)
                curveToRelative(-0.05f, -0.18f, -0.12f, -0.35f, -0.23f, -0.51f)
                curveToRelative(-0.1f, -0.16f, -0.24f, -0.3f, -0.4f, -0.43f)
                curveToRelative(-0.17f, -0.13f, -0.37f, -0.23f, -0.61f, -0.31f)
                curveToRelative(0.2f, -0.09f, 0.37f, -0.2f, 0.52f, -0.33f)
                curveToRelative(0.15f, -0.13f, 0.27f, -0.27f, 0.37f, -0.42f)
                curveToRelative(0.1f, -0.15f, 0.17f, -0.3f, 0.22f, -0.46f)
                reflectiveCurveToRelative(0.07f, -0.32f, 0.07f, -0.48f)
                curveToRelative(0f, -0.36f, -0.06f, -0.68f, -0.18f, -0.96f)
                reflectiveCurveToRelative(-0.29f, -0.51f, -0.51f, -0.69f)
                curveToRelative(-0.2f, -0.19f, -0.47f, -0.33f, -0.77f, -0.43f)
                curveTo(9.11f, 8.05f, 8.77f, 8f, 8.4f, 8f)
                curveToRelative(-0.36f, 0f, -0.69f, 0.05f, -1f, 0.16f)
                curveToRelative(-0.3f, 0.11f, -0.57f, 0.26f, -0.79f, 0.45f)
                curveToRelative(-0.21f, 0.19f, -0.38f, 0.41f, -0.51f, 0.67f)
                curveToRelative(-0.12f, 0.26f, -0.18f, 0.54f, -0.18f, 0.85f)
                horizontalLineToRelative(1.3f)
                curveToRelative(0f, -0.17f, 0.03f, -0.32f, 0.09f, -0.45f)
                reflectiveCurveToRelative(0.14f, -0.25f, 0.25f, -0.34f)
                reflectiveCurveToRelative(0.23f, -0.17f, 0.38f, -0.22f)
                reflectiveCurveToRelative(0.3f, -0.08f, 0.48f, -0.08f)
                curveToRelative(0.4f, 0f, 0.7f, 0.1f, 0.89f, 0.31f)
                curveToRelative(0.19f, 0.2f, 0.29f, 0.49f, 0.29f, 0.86f)
                curveToRelative(0f, 0.18f, -0.03f, 0.34f, -0.08f, 0.49f)
                reflectiveCurveToRelative(-0.14f, 0.27f, -0.25f, 0.37f)
                curveToRelative(-0.11f, 0.1f, -0.25f, 0.18f, -0.41f, 0.24f)
                curveToRelative(-0.16f, 0.06f, -0.36f, 0.09f, -0.58f, 0.09f)
                horizontalLineToRelative(-0.77f)
                verticalLineToRelative(1.03f)
                horizontalLineToRelative(0.77f)
                curveToRelative(0.22f, 0f, 0.42f, 0.02f, 0.6f, 0.07f)
                reflectiveCurveToRelative(0.33f, 0.13f, 0.45f, 0.23f)
                curveToRelative(0.12f, 0.11f, 0.22f, 0.24f, 0.29f, 0.4f)
                reflectiveCurveToRelative(0.1f, 0.35f, 0.1f, 0.57f)
                curveToRelative(0f, 0.41f, -0.12f, 0.72f, -0.35f, 0.93f)
                curveToRelative(-0.23f, 0.23f, -0.55f, 0.33f, -0.95f, 0.33f)
                close()
                moveToRelative(8.55f, -5.92f)
                curveToRelative(-0.32f, -0.33f, -0.7f, -0.59f, -1.14f, -0.77f)
                curveToRelative(-0.44f, -0.18f, -0.93f, -0.27f, -1.47f, -0.27f)
                horizontalLineTo(12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.3f)
                curveToRelative(0.55f, 0f, 1.06f, -0.09f, 1.51f, -0.27f)
                reflectiveCurveToRelative(0.84f, -0.43f, 1.16f, -0.76f)
                curveToRelative(0.32f, -0.33f, 0.57f, -0.73f, 0.74f, -1.19f)
                curveToRelative(0.17f, -0.47f, 0.26f, -0.99f, 0.26f, -1.57f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0f, -0.58f, -0.09f, -1.1f, -0.26f, -1.57f)
                reflectiveCurveToRelative(-0.42f, -0.87f, -0.74f, -1.2f)
                close()
                moveToRelative(-0.39f, 3.16f)
                curveToRelative(0f, 0.42f, -0.05f, 0.79f, -0.14f, 1.13f)
                curveToRelative(-0.1f, 0.33f, -0.24f, 0.62f, -0.43f, 0.85f)
                curveToRelative(-0.19f, 0.23f, -0.43f, 0.41f, -0.71f, 0.53f)
                curveToRelative(-0.29f, 0.12f, -0.62f, 0.18f, -0.99f, 0.18f)
                horizontalLineToRelative(-0.91f)
                verticalLineTo(9.12f)
                horizontalLineToRelative(0.97f)
                curveToRelative(0.72f, 0f, 1.27f, 0.23f, 1.64f, 0.69f)
                curveToRelative(0.38f, 0.46f, 0.57f, 1.12f, 0.57f, 1.99f)
                verticalLineToRelative(0.4f)
                close()
                moveTo(12.01f, 0f)
                lineToRelative(-0.66f, 0.03f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.96f, 8.48f)
                horizontalLineToRelative(1.5f)
                curveTo(23.45f, 4.84f, 18.3f, 0f, 12.01f, 0f)
                close()
            }
        }.build()
        
        return _3d_rotation!!
    }

private var _3d_rotation: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pool: ImageVector
    get() {
        if (_Pool != null) return _Pool!!
        
        _Pool = ImageVector.Builder(
            name = "pool",
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
                moveTo(6.11f, 5.56f)
                curveTo(7.3f, 5.7f, 8.14f, 6.14f, 9f, 7f)
                lineToRelative(1f, 1f)
                lineToRelative(-3.25f, 3.25f)
                curveToRelative(0.31f, 0.12f, 0.56f, 0.27f, 0.77f, 0.39f)
                curveToRelative(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f)
                reflectiveCurveToRelative(0.78f, -0.13f, 1.15f, -0.36f)
                curveToRelative(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f)
                reflectiveCurveToRelative(1.73f, 0.37f, 2.18f, 0.64f)
                curveToRelative(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f)
                curveToRelative(0.55f, 0f, 0.78f, -0.13f, 1.15f, -0.36f)
                curveToRelative(0.12f, -0.07f, 0.26f, -0.15f, 0.41f, -0.23f)
                lineTo(10.48f, 5f)
                curveTo(9.22f, 3.74f, 8.04f, 3.2f, 6.3f, 3.05f)
                curveTo(5.6f, 2.99f, 5f, 3.56f, 5f, 4.26f)
                verticalLineToRelative(0.09f)
                curveToRelative(0f, 0.63f, 0.49f, 1.13f, 1.11f, 1.21f)
                close()
                moveToRelative(15.24f, 13.35f)
                curveToRelative(-0.17f, -0.06f, -0.32f, -0.15f, -0.5f, -0.27f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f)
                curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f)
                curveToRelative(-0.18f, 0.11f, -0.33f, 0.2f, -0.5f, 0.27f)
                curveToRelative(-0.38f, 0.13f, -0.65f, 0.45f, -0.65f, 0.85f)
                verticalLineToRelative(0.12f)
                curveToRelative(0f, 0.67f, 0.66f, 1.13f, 1.3f, 0.91f)
                curveToRelative(0.37f, -0.13f, 0.65f, -0.3f, 0.89f, -0.44f)
                curveToRelative(0.37f, -0.22f, 0.6f, -0.35f, 1.15f, -0.35f)
                curveToRelative(0.55f, 0f, 0.78f, 0.13f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.23f, 0.14f, 0.51f, 0.31f, 0.88f, 0.44f)
                curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0f, -0.41f, -0.27f, -0.73f, -0.65f, -0.86f)
                close()
                moveTo(3.11f, 16.35f)
                curveToRelative(0.47f, -0.13f, 0.81f, -0.33f, 1.09f, -0.49f)
                curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.23f, 0.14f, 0.5f, 0.3f, 0.85f, 0.43f)
                curveToRelative(0.63f, 0.23f, 1.31f, -0.24f, 1.31f, -0.91f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0f, -0.4f, -0.27f, -0.72f, -0.64f, -0.86f)
                curveToRelative(-0.17f, -0.06f, -0.32f, -0.15f, -0.51f, -0.26f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f)
                reflectiveCurveToRelative(-0.78f, -0.14f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.18f, 0.64f)
                curveToRelative(-0.18f, 0.11f, -0.33f, 0.2f, -0.5f, 0.27f)
                curveToRelative(-0.38f, 0.13f, -0.65f, 0.45f, -0.65f, 0.85f)
                verticalLineToRelative(0.23f)
                curveToRelative(0f, 0.58f, 0.55f, 1.02f, 1.11f, 0.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 16.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 19f, 5.5f)
                close()
            }
        }.build()
        
        return _Pool!!
    }

private var _Pool: ImageVector? = null


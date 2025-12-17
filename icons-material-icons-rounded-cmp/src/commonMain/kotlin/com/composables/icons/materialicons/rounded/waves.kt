package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Waves: ImageVector
    get() {
        if (_Waves != null) return _Waves!!
        
        _Waves = ImageVector.Builder(
            name = "waves",
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
                moveTo(17f, 16.99f)
                curveToRelative(-1.35f, 0f, -2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.33f, -1.18f, 0.6f, -2.05f, 0.6f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.43f, 0.22f, -0.81f, 0.41f, -1.27f, 0.52f)
                curveToRelative(-0.45f, 0.1f, -0.78f, 0.46f, -0.78f, 0.91f)
                verticalLineToRelative(0.1f)
                curveToRelative(0f, 0.6f, 0.56f, 1.03f, 1.14f, 0.91f)
                curveToRelative(0.74f, -0.15f, 1.3f, -0.43f, 1.81f, -0.69f)
                curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f)
                curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.91f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f)
                curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f)
                curveToRelative(-0.75f, -0.39f, -1.6f, -0.81f, -2.95f, -0.81f)
                close()
                moveToRelative(0f, -4.45f)
                curveToRelative(-1.35f, 0f, -2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.43f, 0.21f, -0.81f, 0.41f, -1.28f, 0.52f)
                curveToRelative(-0.44f, 0.1f, -0.77f, 0.46f, -0.77f, 0.91f)
                verticalLineToRelative(0.1f)
                curveToRelative(0f, 0.59f, 0.54f, 1.03f, 1.12f, 0.91f)
                curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f)
                curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f)
                curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.92f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f)
                curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f)
                curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f)
                close()
                moveToRelative(2.95f, -8.08f)
                curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.43f, 0.22f, -0.81f, 0.41f, -1.27f, 0.52f)
                curveToRelative(-0.45f, 0.1f, -0.78f, 0.46f, -0.78f, 0.91f)
                verticalLineToRelative(0.07f)
                curveToRelative(0f, 0.6f, 0.54f, 1.04f, 1.12f, 0.92f)
                curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f)
                curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f)
                curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.92f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f)
                curveToRelative(-0.46f, -0.1f, -0.83f, -0.28f, -1.26f, -0.5f)
                close()
                moveTo(17f, 8.09f)
                curveToRelative(-1.35f, 0f, -2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f)
                reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.43f, 0.23f, -0.8f, 0.42f, -1.26f, 0.52f)
                curveToRelative(-0.45f, 0.1f, -0.79f, 0.46f, -0.79f, 0.92f)
                verticalLineToRelative(0.09f)
                curveToRelative(0f, 0.59f, 0.54f, 1.03f, 1.12f, 0.91f)
                curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f)
                curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.91f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f)
                curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f)
                curveToRelative(-0.75f, -0.39f, -1.6f, -0.81f, -2.95f, -0.81f)
                close()
            }
        }.build()
        
        return _Waves!!
    }

private var _Waves: ImageVector? = null


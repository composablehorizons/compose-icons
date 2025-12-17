package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Forward_30: ImageVector
    get() {
        if (_Forward_30 != null) return _Forward_30!!
        
        _Forward_30 = ImageVector.Builder(
            name = "forward_30",
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
                moveTo(18f, 13f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                verticalLineToRelative(4f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-7.46f, 2.22f)
                curveToRelative(-0.06f, 0.05f, -0.12f, 0.09f, -0.2f, 0.12f)
                reflectiveCurveToRelative(-0.17f, 0.04f, -0.27f, 0.04f)
                curveToRelative(-0.09f, 0f, -0.17f, -0.01f, -0.25f, -0.04f)
                reflectiveCurveToRelative(-0.14f, -0.06f, -0.2f, -0.11f)
                reflectiveCurveToRelative(-0.1f, -0.1f, -0.13f, -0.17f)
                reflectiveCurveToRelative(-0.05f, -0.14f, -0.05f, -0.22f)
                horizontalLineToRelative(-0.85f)
                curveToRelative(0f, 0.21f, 0.04f, 0.39f, 0.12f, 0.55f)
                reflectiveCurveToRelative(0.19f, 0.28f, 0.33f, 0.38f)
                reflectiveCurveToRelative(0.29f, 0.18f, 0.46f, 0.23f)
                reflectiveCurveToRelative(0.35f, 0.07f, 0.53f, 0.07f)
                curveToRelative(0.21f, 0f, 0.41f, -0.03f, 0.6f, -0.08f)
                reflectiveCurveToRelative(0.34f, -0.14f, 0.48f, -0.24f)
                reflectiveCurveToRelative(0.24f, -0.24f, 0.32f, -0.39f)
                reflectiveCurveToRelative(0.12f, -0.33f, 0.12f, -0.53f)
                curveToRelative(0f, -0.23f, -0.06f, -0.44f, -0.18f, -0.61f)
                reflectiveCurveToRelative(-0.3f, -0.3f, -0.54f, -0.39f)
                curveToRelative(0.1f, -0.05f, 0.2f, -0.1f, 0.28f, -0.17f)
                reflectiveCurveToRelative(0.15f, -0.14f, 0.2f, -0.22f)
                reflectiveCurveToRelative(0.1f, -0.16f, 0.13f, -0.25f)
                reflectiveCurveToRelative(0.04f, -0.18f, 0.04f, -0.27f)
                curveToRelative(0f, -0.2f, -0.04f, -0.37f, -0.11f, -0.53f)
                reflectiveCurveToRelative(-0.17f, -0.28f, -0.3f, -0.38f)
                reflectiveCurveToRelative(-0.28f, -0.18f, -0.46f, -0.23f)
                reflectiveCurveToRelative(-0.37f, -0.08f, -0.59f, -0.08f)
                curveToRelative(-0.19f, 0f, -0.38f, 0.03f, -0.54f, 0.08f)
                reflectiveCurveToRelative(-0.32f, 0.13f, -0.44f, 0.23f)
                reflectiveCurveToRelative(-0.23f, 0.22f, -0.3f, 0.37f)
                reflectiveCurveToRelative(-0.11f, 0.3f, -0.11f, 0.48f)
                horizontalLineToRelative(0.85f)
                curveToRelative(0f, -0.07f, 0.02f, -0.14f, 0.05f, -0.2f)
                reflectiveCurveToRelative(0.07f, -0.11f, 0.12f, -0.15f)
                reflectiveCurveToRelative(0.11f, -0.07f, 0.18f, -0.1f)
                reflectiveCurveToRelative(0.14f, -0.03f, 0.22f, -0.03f)
                curveToRelative(0.1f, 0f, 0.18f, 0.01f, 0.25f, 0.04f)
                reflectiveCurveToRelative(0.13f, 0.06f, 0.18f, 0.11f)
                reflectiveCurveToRelative(0.08f, 0.11f, 0.11f, 0.17f)
                reflectiveCurveToRelative(0.04f, 0.14f, 0.04f, 0.22f)
                curveToRelative(0f, 0.18f, -0.05f, 0.32f, -0.16f, 0.43f)
                reflectiveCurveToRelative(-0.26f, 0.16f, -0.48f, 0.16f)
                horizontalLineToRelative(-0.43f)
                verticalLineToRelative(0.66f)
                horizontalLineToRelative(0.45f)
                curveToRelative(0.11f, 0f, 0.2f, 0.01f, 0.29f, 0.04f)
                reflectiveCurveToRelative(0.16f, 0.06f, 0.22f, 0.11f)
                reflectiveCurveToRelative(0.11f, 0.12f, 0.14f, 0.2f)
                reflectiveCurveToRelative(0.05f, 0.18f, 0.05f, 0.29f)
                curveToRelative(0f, 0.09f, -0.01f, 0.17f, -0.04f, 0.24f)
                reflectiveCurveToRelative(-0.08f, 0.11f, -0.13f, 0.17f)
                close()
                moveToRelative(3.9f, -3.44f)
                curveToRelative(-0.18f, -0.07f, -0.37f, -0.1f, -0.59f, -0.1f)
                reflectiveCurveToRelative(-0.41f, 0.03f, -0.59f, 0.1f)
                reflectiveCurveToRelative(-0.33f, 0.18f, -0.45f, 0.33f)
                reflectiveCurveToRelative(-0.23f, 0.34f, -0.29f, 0.57f)
                reflectiveCurveToRelative(-0.1f, 0.5f, -0.1f, 0.82f)
                verticalLineToRelative(0.74f)
                curveToRelative(0f, 0.32f, 0.04f, 0.6f, 0.11f, 0.82f)
                reflectiveCurveToRelative(0.17f, 0.42f, 0.3f, 0.57f)
                reflectiveCurveToRelative(0.28f, 0.26f, 0.46f, 0.33f)
                reflectiveCurveToRelative(0.37f, 0.1f, 0.59f, 0.1f)
                reflectiveCurveToRelative(0.41f, -0.03f, 0.59f, -0.1f)
                reflectiveCurveToRelative(0.33f, -0.18f, 0.45f, -0.33f)
                reflectiveCurveToRelative(0.22f, -0.34f, 0.29f, -0.57f)
                reflectiveCurveToRelative(0.1f, -0.5f, 0.1f, -0.82f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0f, -0.32f, -0.04f, -0.6f, -0.11f, -0.82f)
                reflectiveCurveToRelative(-0.17f, -0.42f, -0.3f, -0.57f)
                reflectiveCurveToRelative(-0.28f, -0.26f, -0.46f, -0.33f)
                close()
                moveToRelative(0.01f, 2.57f)
                curveToRelative(0f, 0.19f, -0.01f, 0.35f, -0.04f, 0.48f)
                reflectiveCurveToRelative(-0.06f, 0.24f, -0.11f, 0.32f)
                reflectiveCurveToRelative(-0.11f, 0.14f, -0.19f, 0.17f)
                reflectiveCurveToRelative(-0.16f, 0.05f, -0.25f, 0.05f)
                reflectiveCurveToRelative(-0.18f, -0.02f, -0.25f, -0.05f)
                reflectiveCurveToRelative(-0.14f, -0.09f, -0.19f, -0.17f)
                reflectiveCurveToRelative(-0.09f, -0.19f, -0.12f, -0.32f)
                reflectiveCurveToRelative(-0.04f, -0.29f, -0.04f, -0.48f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.19f, 0.01f, -0.35f, 0.04f, -0.48f)
                reflectiveCurveToRelative(0.06f, -0.23f, 0.12f, -0.31f)
                reflectiveCurveToRelative(0.11f, -0.14f, 0.19f, -0.17f)
                reflectiveCurveToRelative(0.16f, -0.05f, 0.25f, -0.05f)
                reflectiveCurveToRelative(0.18f, 0.02f, 0.25f, 0.05f)
                reflectiveCurveToRelative(0.14f, 0.09f, 0.19f, 0.17f)
                reflectiveCurveToRelative(0.09f, 0.18f, 0.12f, 0.31f)
                reflectiveCurveToRelative(0.04f, 0.29f, 0.04f, 0.48f)
                verticalLineToRelative(0.97f)
                close()
            }
        }.build()
        
        return _Forward_30!!
    }

private var _Forward_30: ImageVector? = null


package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Supervised_user_circle: ImageVector
    get() {
        if (_Supervised_user_circle != null) return _Supervised_user_circle!!
        
        _Supervised_user_circle = ImageVector.Builder(
            name = "supervised_user_circle",
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
                moveTo(12.5f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveToRelative(-3f, 1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(6.5f, 2f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                curveToRelative(-1.11f, 0f, -2.01f, 0.89f, -2f, 2f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                close()
                moveTo(11.99f, 2.01f)
                curveToRelative(-5.52f, 0f, -10f, 4.48f, -10f, 10f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveToRelative(-4.48f, -10f, -10f, -10f)
                close()
                moveTo(5.84f, 17.12f)
                curveToRelative(0.68f, -0.54f, 2.27f, -1.11f, 3.66f, -1.11f)
                curveToRelative(0.07f, 0f, 0.15f, 0.01f, 0.23f, 0.01f)
                curveToRelative(0.24f, -0.64f, 0.67f, -1.29f, 1.3f, -1.86f)
                curveToRelative(-0.56f, -0.1f, -1.09f, -0.16f, -1.53f, -0.16f)
                curveToRelative(-1.3f, 0f, -3.39f, 0.45f, -4.73f, 1.43f)
                curveToRelative(-0.5f, -1.04f, -0.78f, -2.2f, -0.78f, -3.43f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 1.2f, -0.27f, 2.34f, -0.75f, 3.37f)
                curveToRelative(-1f, -0.59f, -2.36f, -0.87f, -3.24f, -0.87f)
                curveToRelative(-1.52f, 0f, -4.5f, 0.81f, -4.5f, 2.7f)
                verticalLineToRelative(2.78f)
                curveToRelative(-2.27f, -0.13f, -4.29f, -1.21f, -5.66f, -2.86f)
                close()
            }
        }.build()
        
        return _Supervised_user_circle!!
    }

private var _Supervised_user_circle: ImageVector? = null


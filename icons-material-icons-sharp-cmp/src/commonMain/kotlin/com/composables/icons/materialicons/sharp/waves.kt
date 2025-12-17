package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Waves: ImageVector
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
                curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f)
                verticalLineToRelative(1.95f)
                curveToRelative(1.35f, 0f, 2.2f, -0.42f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f)
                verticalLineToRelative(-1.95f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f)
                close()
                moveToRelative(0f, -4.45f)
                curveToRelative(-1.35f, 0f, -2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.32f, -1.17f, 0.6f, -2.05f, 0.6f)
                verticalLineToRelative(1.95f)
                curveToRelative(1.35f, 0f, 2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f)
                verticalLineToRelative(-1.95f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f)
                close()
                moveToRelative(2.95f, -8.08f)
                curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f)
                verticalLineToRelative(1.93f)
                curveToRelative(1.35f, 0f, 2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f)
                verticalLineTo(5.04f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.58f)
                close()
                moveTo(17f, 8.09f)
                curveToRelative(-1.35f, 0f, -2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f)
                reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f)
                reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f)
                curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f)
                verticalLineToRelative(1.95f)
                curveToRelative(1.35f, 0f, 2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f)
                reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f)
                curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f)
                curveToRelative(0.9f, 0f, 1.4f, 0.25f, 2.05f, 0.6f)
                curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f)
                verticalLineTo(9.49f)
                curveToRelative(-0.9f, 0f, -1.4f, -0.25f, -2.05f, -0.6f)
                curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f)
                close()
            }
        }.build()
        
        return _Waves!!
    }

private var _Waves: ImageVector? = null


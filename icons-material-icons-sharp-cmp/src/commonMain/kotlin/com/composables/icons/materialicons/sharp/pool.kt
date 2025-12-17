package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pool: ImageVector
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
                moveTo(10f, 8f)
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
                lineTo(5f, 3f)
                verticalLineToRelative(2.5f)
                lineTo(9f, 7f)
                lineToRelative(1f, 1f)
                close()
                moveToRelative(12f, 8.5f)
                horizontalLineToRelative(-0.02f)
                horizontalLineToRelative(0.02f)
                close()
                moveToRelative(-16.65f, -1f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.06f, 0.63f, 2.16f, 0.64f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
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
                curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                verticalLineToRelative(2f)
                curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.2f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f)
                close()
                moveTo(18.67f, 18f)
                curveToRelative(-1.11f, 0f, -1.73f, 0.37f, -2.18f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f)
                curveToRelative(-0.55f, 0f, -0.78f, -0.14f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                reflectiveCurveToRelative(-0.78f, -0.13f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
                reflectiveCurveToRelative(-1.73f, 0.37f, -2.19f, 0.64f)
                curveToRelative(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f)
                verticalLineToRelative(2f)
                curveToRelative(1.11f, 0f, 1.73f, -0.37f, 2.19f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.6f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.13f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.73f, -0.37f, 2.19f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                reflectiveCurveToRelative(1.72f, -0.37f, 2.18f, -0.64f)
                curveToRelative(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f)
                curveToRelative(0.55f, 0f, 0.78f, 0.14f, 1.15f, 0.36f)
                curveToRelative(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.56f, 0f, -0.78f, -0.13f, -1.15f, -0.36f)
                curveToRelative(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f)
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


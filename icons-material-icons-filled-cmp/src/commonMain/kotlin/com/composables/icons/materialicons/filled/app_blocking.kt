package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.App_blocking: ImageVector
    get() {
        if (_App_blocking != null) return _App_blocking!!
        
        _App_blocking = ImageVector.Builder(
            name = "app_blocking",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveToRelative(-2.5f, 4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.42f, 0f, 0.8f, 0.11f, 1.15f, 0.29f)
                lineToRelative(-3.36f, 3.36f)
                curveToRelative(-0.18f, -0.35f, -0.29f, -0.73f, -0.29f, -1.15f)
                close()
                moveToRelative(2.5f, 2.5f)
                curveToRelative(-0.42f, 0f, -0.8f, -0.11f, -1.15f, -0.29f)
                lineToRelative(3.36f, -3.36f)
                curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(17f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _App_blocking!!
    }

private var _App_blocking: ImageVector? = null


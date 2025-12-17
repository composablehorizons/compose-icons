package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cloud_circle: ImageVector
    get() {
        if (_Cloud_circle != null) return _Cloud_circle!!
        
        _Cloud_circle = ImageVector.Builder(
            name = "cloud_circle",
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
                moveToRelative(4.29f, -9.81f)
                curveToRelative(-0.4f, -2.01f, -2.16f, -3.52f, -4.29f, -3.52f)
                curveToRelative(-1.69f, 0f, -3.15f, 0.96f, -3.88f, 2.36f)
                curveTo(6.36f, 9.21f, 5f, 10.7f, 5f, 12.5f)
                curveTo(5f, 14.43f, 6.57f, 16f, 8.5f, 16f)
                horizontalLineToRelative(7.58f)
                curveToRelative(1.61f, 0f, 2.92f, -1.31f, 2.92f, -2.92f)
                curveToRelative(0f, -1.54f, -1.2f, -2.79f, -2.71f, -2.89f)
                close()
                moveTo(16f, 14f)
                horizontalLineTo(8.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(7.67f, 11f, 8.5f, 11f)
                horizontalLineToRelative(0.9f)
                lineToRelative(0.49f, -1.05f)
                curveToRelative(0.41f, -0.79f, 1.22f, -1.28f, 2.11f, -1.28f)
                curveToRelative(1.13f, 0f, 2.11f, 0.8f, 2.33f, 1.91f)
                lineToRelative(0.28f, 1.42f)
                horizontalLineTo(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Cloud_circle!!
    }

private var _Cloud_circle: ImageVector? = null


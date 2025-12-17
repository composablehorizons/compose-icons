package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cloud_circle: ImageVector
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
                moveToRelative(4.5f, 14f)
                horizontalLineTo(8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                lineToRelative(0.14f, 0.01f)
                curveTo(8.58f, 8.28f, 10.13f, 7f, 12f, 7f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(17.88f, 16f, 16.5f, 16f)
                close()
            }
        }.build()
        
        return _Cloud_circle!!
    }

private var _Cloud_circle: ImageVector? = null


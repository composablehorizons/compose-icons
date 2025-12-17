package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Visibility: ImageVector
    get() {
        if (_Visibility != null) return _Visibility!!
        
        _Visibility = ImageVector.Builder(
            name = "visibility",
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
                moveTo(12f, 6f)
                curveToRelative(3.79f, 0f, 7.17f, 2.13f, 8.82f, 5.5f)
                curveTo(19.17f, 14.87f, 15.79f, 17f, 12f, 17f)
                reflectiveCurveToRelative(-7.17f, -2.13f, -8.82f, -5.5f)
                curveTo(4.83f, 8.13f, 8.21f, 6f, 12f, 6f)
                moveToRelative(0f, -2f)
                curveTo(7f, 4f, 2.73f, 7.11f, 1f, 11.5f)
                curveTo(2.73f, 15.89f, 7f, 19f, 12f, 19f)
                reflectiveCurveToRelative(9.27f, -3.11f, 11f, -7.5f)
                curveTo(21.27f, 7.11f, 17f, 4f, 12f, 4f)
                close()
                moveToRelative(0f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(13.38f, 14f, 12f, 14f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(10.62f, 9f, 12f, 9f)
                moveToRelative(0f, -2f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveTo(9.52f, 16f, 12f, 16f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(14.48f, 7f, 12f, 7f)
                close()
            }
        }.build()
        
        return _Visibility!!
    }

private var _Visibility: ImageVector? = null


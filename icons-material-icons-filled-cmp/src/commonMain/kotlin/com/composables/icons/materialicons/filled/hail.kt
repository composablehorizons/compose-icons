package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hail: ImageVector
    get() {
        if (_Hail != null) return _Hail!!
        
        _Hail = ImageVector.Builder(
            name = "hail",
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
                moveTo(12f, 6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(5f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.4f)
                curveToRelative(-0.1f, 2.2f, -0.8f, 3.9f, -2.3f, 5.1f)
                curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f)
                verticalLineTo(22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineTo(9f)
                verticalLineTo(10.1f)
                curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f)
                curveToRelative(-0.9f, 0.7f, -1.39f, 1.6f, -1.4f, 3.1f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2f, 0.71f, -3.59f, 2.11f, -4.79f)
                curveTo(8.21f, 7.81f, 10f, 7f, 12f, 7f)
                reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f)
                curveTo(16.48f, 5.14f, 17f, 4f, 17f, 2.5f)
                verticalLineTo(2f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Hail!!
    }

private var _Hail: ImageVector? = null


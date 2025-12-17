package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swap_vertical_circle: ImageVector
    get() {
        if (_Swap_vertical_circle != null) return _Swap_vertical_circle!!
        
        _Swap_vertical_circle = ImageVector.Builder(
            name = "swap_vertical_circle",
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
                moveTo(6.5f, 9f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                lineTo(13.5f, 9f)
                horizontalLineTo(11f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                close()
                moveToRelative(7.85f, 9.15f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                lineTo(10.5f, 15f)
                horizontalLineTo(13f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.15f, 3.15f)
                close()
            }
        }.build()
        
        return _Swap_vertical_circle!!
    }

private var _Swap_vertical_circle: ImageVector? = null


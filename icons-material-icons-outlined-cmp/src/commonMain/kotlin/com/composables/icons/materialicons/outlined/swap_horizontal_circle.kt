package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Swap_horizontal_circle: ImageVector
    get() {
        if (_Swap_horizontal_circle != null) return _Swap_horizontal_circle!!
        
        _Swap_horizontal_circle = ImageVector.Builder(
            name = "swap_horizontal_circle",
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
                moveToRelative(3f, -13.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveToRelative(-6f, 4f)
                lineTo(5.5f, 14f)
                lineTo(9f, 17.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _Swap_horizontal_circle!!
    }

private var _Swap_horizontal_circle: ImageVector? = null


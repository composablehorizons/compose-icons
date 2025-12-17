package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swap_vertical_circle: ImageVector
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
                lineTo(10f, 5.5f)
                lineTo(13.5f, 9f)
                horizontalLineTo(11f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                close()
                moveToRelative(11f, 6f)
                lineTo(14f, 18.5f)
                lineTo(10.5f, 15f)
                horizontalLineTo(13f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.5f)
                close()
            }
        }.build()
        
        return _Swap_vertical_circle!!
    }

private var _Swap_vertical_circle: ImageVector? = null


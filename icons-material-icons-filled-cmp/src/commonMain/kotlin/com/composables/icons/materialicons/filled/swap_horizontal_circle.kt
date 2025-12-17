package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swap_horizontal_circle: ImageVector
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
                moveTo(22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                close()
                moveToRelative(-7f, -5.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-4f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineTo(6.5f)
                close()
                moveToRelative(-6f, 11f)
                lineTo(5.5f, 14f)
                lineTo(9f, 10.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.build()
        
        return _Swap_horizontal_circle!!
    }

private var _Swap_horizontal_circle: ImageVector? = null


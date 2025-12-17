package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Swap_calls: ImageVector
    get() {
        if (_Swap_calls != null) return _Swap_calls!!
        
        _Swap_calls = ImageVector.Builder(
            name = "swap_calls",
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
                moveTo(18f, 4f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(5f, 5.79f, 5f, 8f)
                verticalLineToRelative(7f)
                horizontalLineTo(2f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                lineToRelative(-4f, -4f)
                close()
            }
        }.build()
        
        return _Swap_calls!!
    }

private var _Swap_calls: ImageVector? = null


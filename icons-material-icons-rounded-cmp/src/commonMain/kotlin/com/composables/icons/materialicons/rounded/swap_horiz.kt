package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swap_horiz: ImageVector
    get() {
        if (_Swap_horiz != null) return _Swap_horiz!!
        
        _Swap_horiz = ImageVector.Builder(
            name = "swap_horiz",
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
                moveTo(6.14f, 11.86f)
                lineToRelative(-2.78f, 2.79f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0f, 0.71f)
                lineToRelative(2.78f, 2.79f)
                curveToRelative(0.31f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6.99f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                close()
                moveToRelative(14.51f, -3.21f)
                lineToRelative(-2.78f, -2.79f)
                curveToRelative(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.78f, -2.79f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f)
                close()
            }
        }.build()
        
        return _Swap_horiz!!
    }

private var _Swap_horiz: ImageVector? = null


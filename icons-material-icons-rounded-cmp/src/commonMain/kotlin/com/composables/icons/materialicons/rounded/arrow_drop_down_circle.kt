package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_drop_down_circle: ImageVector
    get() {
        if (_Arrow_drop_down_circle != null) return _Arrow_drop_down_circle!!
        
        _Arrow_drop_down_circle = ImageVector.Builder(
            name = "arrow_drop_down_circle",
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
                moveToRelative(-0.35f, 12.65f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.32f, -0.32f, -0.1f, -0.86f, 0.35f, -0.86f)
                horizontalLineToRelative(5.59f)
                curveToRelative(0.45f, 0f, 0.67f, 0.54f, 0.35f, 0.85f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.2f, -0.52f, 0.2f, -0.71f, 0.01f)
                close()
            }
        }.build()
        
        return _Arrow_drop_down_circle!!
    }

private var _Arrow_drop_down_circle: ImageVector? = null


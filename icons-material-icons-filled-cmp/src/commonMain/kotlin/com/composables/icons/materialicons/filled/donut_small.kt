package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
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
                moveTo(11f, 9.16f)
                verticalLineTo(2f)
                curveToRelative(-5f, 0.5f, -9f, 4.79f, -9f, 10f)
                reflectiveCurveToRelative(4f, 9.5f, 9f, 10f)
                verticalLineToRelative(-7.16f)
                curveToRelative(-1f, -0.41f, -2f, -1.52f, -2f, -2.84f)
                reflectiveCurveToRelative(1f, -2.43f, 2f, -2.84f)
                close()
                moveTo(14.86f, 11f)
                horizontalLineTo(22f)
                curveToRelative(-0.48f, -4.75f, -4f, -8.53f, -9f, -9f)
                verticalLineToRelative(7.16f)
                curveToRelative(1f, 0.3f, 1.52f, 0.98f, 1.86f, 1.84f)
                close()
                moveTo(13f, 14.84f)
                verticalLineTo(22f)
                curveToRelative(5f, -0.47f, 8.52f, -4.25f, 9f, -9f)
                horizontalLineToRelative(-7.14f)
                curveToRelative(-0.34f, 0.86f, -0.86f, 1.54f, -1.86f, 1.84f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null


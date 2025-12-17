package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Incomplete_circle: ImageVector
    get() {
        if (_Incomplete_circle != null) return _Incomplete_circle!!
        
        _Incomplete_circle = ImageVector.Builder(
            name = "incomplete_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                curveToRelative(0f, -2.76f, 1.12f, -5.26f, 2.93f, -7.07f)
                lineTo(12f, 12f)
                verticalLineTo(2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Incomplete_circle!!
    }

private var _Incomplete_circle: ImageVector? = null


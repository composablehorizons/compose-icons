package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SuitHeart: ImageVector
    get() {
        if (_SuitHeart != null) return _SuitHeart!!
        
        _SuitHeart = ImageVector.Builder(
            name = "suit-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.755f, 4f, 3.92f)
                curveTo(8f, 2.755f, 9.79f, 1f, 12f, 1f)
                reflectiveCurveToRelative(4f, 1.755f, 4f, 3.92f)
                curveToRelative(0f, 3.263f, -3.234f, 4.414f, -7.608f, 9.608f)
                arcToRelative(0.513f, 0.513f, 0f, false, true, -0.784f, 0f)
                curveTo(3.234f, 9.334f, 0f, 8.183f, 0f, 4.92f)
                curveTo(0f, 2.755f, 1.79f, 1f, 4f, 1f)
            }
        }.build()
        
        return _SuitHeart!!
    }

private var _SuitHeart: ImageVector? = null


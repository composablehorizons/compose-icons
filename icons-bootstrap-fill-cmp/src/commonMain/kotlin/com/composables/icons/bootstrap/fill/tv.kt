package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Tv: ImageVector
    get() {
        if (_Tv != null) return _Tv!!
        
        _Tv = ImageVector.Builder(
            name = "tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 13f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(2f, 2f)
                horizontalLineToRelative(12f)
                reflectiveCurveToRelative(2f, 0f, 2f, 2f)
                verticalLineToRelative(6f)
                reflectiveCurveToRelative(0f, 2f, -2f, 2f)
                horizontalLineTo(2f)
                reflectiveCurveToRelative(-2f, 0f, -2f, -2f)
                verticalLineTo(4f)
                reflectiveCurveToRelative(0f, -2f, 2f, -2f)
            }
        }.build()
        
        return _Tv!!
    }

private var _Tv: ImageVector? = null


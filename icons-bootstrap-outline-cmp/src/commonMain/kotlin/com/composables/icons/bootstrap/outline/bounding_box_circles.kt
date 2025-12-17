package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoundingBoxCircles: ImageVector
    get() {
        if (_BoundingBoxCircles != null) return _BoundingBoxCircles!!
        
        _BoundingBoxCircles = ImageVector.Builder(
            name = "bounding-box-circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 3.937f, -0.5f)
                horizontalLineToRelative(8.126f)
                arcTo(2f, 2f, 0f, true, true, 14.5f, 3.937f)
                verticalLineToRelative(8.126f)
                arcToRelative(2f, 2f, 0f, true, true, -2.437f, 2.437f)
                horizontalLineTo(3.937f)
                arcTo(2f, 2f, 0f, true, true, 1.5f, 12.063f)
                verticalLineTo(3.937f)
                arcTo(2f, 2f, 0f, false, true, 0f, 2f)
                moveToRelative(2.5f, 1.937f)
                verticalLineToRelative(8.126f)
                curveToRelative(0.703f, 0.18f, 1.256f, 0.734f, 1.437f, 1.437f)
                horizontalLineToRelative(8.126f)
                arcToRelative(2f, 2f, 0f, false, true, 1.437f, -1.437f)
                verticalLineTo(3.937f)
                arcTo(2f, 2f, 0f, false, true, 12.063f, 2.5f)
                horizontalLineTo(3.937f)
                arcTo(2f, 2f, 0f, false, true, 2.5f, 3.937f)
                moveTo(14f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveTo(2f, 13f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(12f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _BoundingBoxCircles!!
    }

private var _BoundingBoxCircles: ImageVector? = null


package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowBottomRight: ImageVector
    get() {
        if (_ArrowBottomRight != null) return _ArrowBottomRight!!
        
        _ArrowBottomRight = ImageVector.Builder(
            name = "arrow-bottom-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.4998f, 12f)
                curveTo(11.6322f, 12f, 11.7596f, 11.9471f, 11.8533f, 11.8535f)
                curveTo(11.9468f, 11.7599f, 11.9997f, 11.6323f, 11.9998f, 11.5f)
                verticalLineTo(6f)
                lineTo(11.99f, 5.89844f)
                curveTo(11.9432f, 5.67099f, 11.7411f, 5.50009f, 11.4998f, 5.5f)
                curveTo(11.2582f, 5.50009f, 11.0561f, 5.67154f, 11.0096f, 5.89941f)
                lineTo(10.9998f, 6f)
                verticalLineTo(10.293f)
                lineTo(4.35333f, 3.64648f)
                curveTo(4.15816f, 3.45132f, 3.84158f, 3.45152f, 3.6463f, 3.64648f)
                curveTo(3.45133f, 3.84177f, 3.45114f, 4.15835f, 3.6463f, 4.35352f)
                lineTo(10.2928f, 11f)
                horizontalLineTo(5.99981f)
                curveTo(5.7238f, 11f, 5.49996f, 11.224f, 5.49981f, 11.5f)
                curveTo(5.49996f, 11.776f, 5.7238f, 12f, 5.99981f, 12f)
                horizontalLineTo(11.4998f)
                close()
            }
        }.build()
        
        return _ArrowBottomRight!!
    }

private var _ArrowBottomRight: ImageVector? = null


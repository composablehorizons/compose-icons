package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowTopRight: ImageVector
    get() {
        if (_ArrowTopRight != null) return _ArrowTopRight!!
        
        _ArrowTopRight = ImageVector.Builder(
            name = "arrow-top-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.4998f, 3f)
                curveTo(11.6322f, 3.00005f, 11.7596f, 3.05295f, 11.8533f, 3.14648f)
                curveTo(11.9468f, 3.24013f, 11.9997f, 3.36768f, 11.9998f, 3.5f)
                verticalLineTo(9f)
                lineTo(11.99f, 9.10156f)
                curveTo(11.9432f, 9.32901f, 11.7411f, 9.49991f, 11.4998f, 9.5f)
                curveTo(11.2582f, 9.49991f, 11.0561f, 9.32846f, 11.0096f, 9.10059f)
                lineTo(10.9998f, 9f)
                verticalLineTo(4.70703f)
                lineTo(4.35333f, 11.3535f)
                curveTo(4.15816f, 11.5487f, 3.84158f, 11.5485f, 3.6463f, 11.3535f)
                curveTo(3.45133f, 11.1582f, 3.45114f, 10.8416f, 3.6463f, 10.6465f)
                lineTo(10.2928f, 4f)
                horizontalLineTo(5.99981f)
                curveTo(5.7238f, 3.99996f, 5.49996f, 3.77599f, 5.49981f, 3.5f)
                curveTo(5.49996f, 3.22401f, 5.7238f, 3.00004f, 5.99981f, 3f)
                horizontalLineTo(11.4998f)
                close()
            }
        }.build()
        
        return _ArrowTopRight!!
    }

private var _ArrowTopRight: ImageVector? = null


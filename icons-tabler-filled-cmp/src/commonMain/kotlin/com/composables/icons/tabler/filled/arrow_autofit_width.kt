package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowAutofitWidth: ImageVector
    get() {
        if (_ArrowAutofitWidth != null) return _ArrowAutofitWidth!!
        
        _ArrowAutofitWidth = ImageVector.Builder(
            name = "arrow-autofit-width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.121f, 12.879f)
                arcToRelative(3f, 3f, 0f, false, false, -4.242f, 0f)
                lineToRelative(-0.085f, 0.09f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-0.08f, 0.096f)
                lineToRelative(-0.115f, 0.158f)
                arcToRelative(3f, 3f, 0f, false, false, -0.515f, 1.59f)
                lineToRelative(0.001f, 0.093f)
                horizontalLineToRelative(-6.003f)
                verticalLineToRelative(-0.092f)
                arcToRelative(3f, 3f, 0f, false, false, -5.12f, -2.03f)
                arcToRelative(0.514f, 0.514f, 0f, false, true, -0.878f, -0.363f)
                lineToRelative(-0.001f, -6.515f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(6.514f)
                arcToRelative(0.515f, 0.515f, 0f, false, true, -0.879f, 0.365f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4.584f)
                lineToRelative(1.291f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.097f, -0.112f)
                lineToRelative(-0.071f, -0.11f)
                lineToRelative(-0.054f, -0.114f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.03f, -0.149f)
                lineToRelative(-0.006f, -0.117f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.067f, -0.096f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                moveToRelative(10.989f, -0.148f)
                lineToRelative(0.007f, 0.058f)
                lineToRelative(0.004f, 0.09f)
                lineToRelative(-0.003f, 0.075f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-4.585f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(4.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3f, 3f)
                quadToRelative(0.054f, 0.053f, 0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.054f, 0.114f)
                lineToRelative(0.035f, 0.105f)
                close()
            }
        }.build()
        
        return _ArrowAutofitWidth!!
    }

private var _ArrowAutofitWidth: ImageVector? = null


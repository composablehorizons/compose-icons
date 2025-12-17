package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowAutofitHeight: ImageVector
    get() {
        if (_ArrowAutofitHeight != null) return _ArrowAutofitHeight!!
        
        _ArrowAutofitHeight = ImageVector.Builder(
            name = "arrow-autofit-height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.879f, 3.879f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 4.242f)
                lineToRelative(0.09f, 0.085f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(0.096f, 0.08f)
                lineToRelative(0.158f, 0.115f)
                arcToRelative(3f, 3f, 0f, false, false, 1.59f, 0.515f)
                lineToRelative(0.093f, -0.001f)
                verticalLineToRelative(6.003f)
                horizontalLineToRelative(-0.092f)
                arcToRelative(3f, 3f, 0f, false, false, -2.03f, 5.12f)
                arcToRelative(0.514f, 0.514f, 0f, false, true, -0.363f, 0.878f)
                lineToRelative(-6.515f, 0.001f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(6.514f)
                arcToRelative(0.515f, 0.515f, 0f, false, true, 0.365f, 0.879f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4.584f)
                lineToRelative(1.293f, -1.291f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                lineToRelative(-0.075f, -0.003f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.111f, -0.03f)
                lineToRelative(-0.111f, -0.044f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                verticalLineToRelative(-4.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.852f, 2.011f)
                lineToRelative(0.058f, -0.007f)
                lineToRelative(0.09f, -0.004f)
                lineToRelative(0.075f, 0.003f)
                lineToRelative(0.126f, 0.017f)
                lineToRelative(0.111f, 0.03f)
                lineToRelative(0.111f, 0.044f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.104f, 0.074f)
                lineToRelative(0.082f, 0.073f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.292f)
                verticalLineToRelative(4.585f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(3f, -3f)
                quadToRelative(0.053f, -0.054f, 0.112f, -0.097f)
                lineToRelative(0.11f, -0.071f)
                lineToRelative(0.114f, -0.054f)
                lineToRelative(0.105f, -0.035f)
                close()
            }
        }.build()
        
        return _ArrowAutofitHeight!!
    }

private var _ArrowAutofitHeight: ImageVector? = null


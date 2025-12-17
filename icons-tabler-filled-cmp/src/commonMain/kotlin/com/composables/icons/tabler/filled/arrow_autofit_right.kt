package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowAutofitRight: ImageVector
    get() {
        if (_ArrowAutofitRight != null) return _ArrowAutofitRight!!
        
        _ArrowAutofitRight = ImageVector.Builder(
            name = "arrow-autofit-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(11.001f)
                verticalLineToRelative(-0.092f)
                arcToRelative(3f, 3f, 0f, false, true, 5.12f, -2.03f)
                arcToRelative(0.515f, 0.515f, 0f, false, false, 0.879f, -0.363f)
                verticalLineToRelative(-6.515f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 18f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14.584f)
                lineToRelative(-1.291f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, 1.32f)
                lineToRelative(0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(3f, -3f)
                quadToRelative(0.054f, -0.053f, 0.097f, -0.112f)
                lineToRelative(0.071f, -0.11f)
                lineToRelative(0.054f, -0.114f)
                lineToRelative(0.035f, -0.105f)
                lineToRelative(0.03f, -0.149f)
                lineToRelative(0.006f, -0.117f)
                lineToRelative(-0.003f, -0.075f)
                lineToRelative(-0.017f, -0.126f)
                lineToRelative(-0.03f, -0.111f)
                lineToRelative(-0.044f, -0.111f)
                lineToRelative(-0.052f, -0.098f)
                lineToRelative(-0.067f, -0.096f)
                lineToRelative(-0.08f, -0.09f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                horizontalLineToRelative(-14.586f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _ArrowAutofitRight!!
    }

private var _ArrowAutofitRight: ImageVector? = null


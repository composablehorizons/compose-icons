package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowAutofitUp: ImageVector
    get() {
        if (_ArrowAutofitUp != null) return _ArrowAutofitUp!!
        
        _ArrowAutofitUp = ImageVector.Builder(
            name = "arrow-autofit-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-11.001f)
                horizontalLineToRelative(-0.092f)
                arcToRelative(3f, 3f, 0f, false, true, -2.03f, -5.12f)
                arcToRelative(0.515f, 0.515f, 0f, false, false, -0.363f, -0.879f)
                horizontalLineToRelative(-6.515f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-14.584f)
                lineToRelative(1.293f, 1.291f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, 0.083f)
                lineToRelative(0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.112f, -0.097f)
                lineToRelative(-0.11f, -0.071f)
                lineToRelative(-0.114f, -0.054f)
                lineToRelative(-0.105f, -0.035f)
                lineToRelative(-0.149f, -0.03f)
                lineToRelative(-0.117f, -0.006f)
                lineToRelative(-0.075f, 0.003f)
                lineToRelative(-0.126f, 0.017f)
                lineToRelative(-0.111f, 0.03f)
                lineToRelative(-0.111f, 0.044f)
                lineToRelative(-0.098f, 0.052f)
                lineToRelative(-0.096f, 0.067f)
                lineToRelative(-0.09f, 0.08f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, true, false, 1.414f, 1.414f)
                lineToRelative(1.293f, -1.293f)
                verticalLineToRelative(14.586f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
            }
        }.build()
        
        return _ArrowAutofitUp!!
    }

private var _ArrowAutofitUp: ImageVector? = null


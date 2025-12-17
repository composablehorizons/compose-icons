package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowAutofitContent: ImageVector
    get() {
        if (_ArrowAutofitContent != null) return _ArrowAutofitContent!!
        
        _ArrowAutofitContent = ImageVector.Builder(
            name = "arrow-autofit-content",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.707f, 3.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-1.292f, 1.293f)
                horizontalLineToRelative(4.585f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4.585f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-3f, -3f)
                arcToRelative(1.008f, 1.008f, 0f, false, true, -0.097f, -0.112f)
                lineToRelative(-0.071f, -0.11f)
                lineToRelative(-0.054f, -0.114f)
                lineToRelative(-0.035f, -0.105f)
                lineToRelative(-0.025f, -0.118f)
                lineToRelative(-0.007f, -0.058f)
                lineToRelative(-0.004f, -0.09f)
                lineToRelative(0.003f, -0.075f)
                lineToRelative(0.017f, -0.126f)
                lineToRelative(0.03f, -0.111f)
                lineToRelative(0.044f, -0.111f)
                lineToRelative(0.052f, -0.098f)
                lineToRelative(0.064f, -0.092f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.613f, 3.21f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(3f, 3f)
                arcToRelative(0.927f, 0.927f, 0f, false, true, 0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.054f, 0.114f)
                lineToRelative(0.035f, 0.105f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.006f, 0.118f)
                lineToRelative(-0.003f, 0.075f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-4.585f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(4.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -0.083f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 13f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
        }.build()
        
        return _ArrowAutofitContent!!
    }

private var _ArrowAutofitContent: ImageVector? = null


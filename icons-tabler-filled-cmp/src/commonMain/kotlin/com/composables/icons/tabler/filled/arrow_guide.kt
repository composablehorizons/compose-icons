package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowGuide: ImageVector
    get() {
        if (_ArrowGuide != null) return _ArrowGuide!!
        
        _ArrowGuide = ImageVector.Builder(
            name = "arrow-guide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.707f, 3.293f)
                lineToRelative(3f, 3f)
                quadToRelative(0.054f, 0.053f, 0.097f, 0.112f)
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
                lineToRelative(-0.067f, 0.096f)
                lineToRelative(-0.08f, 0.09f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-4.585f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.829f, -1f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 5.825f, -0.824f)
                horizontalLineToRelative(2.17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(4.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
            }
        }.build()
        
        return _ArrowGuide!!
    }

private var _ArrowGuide: ImageVector? = null


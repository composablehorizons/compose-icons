package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Exchange: ImageVector
    get() {
        if (_Exchange != null) return _Exchange!!
        
        _Exchange = ImageVector.Builder(
            name = "exchange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 1f, 5.83f)
                verticalLineToRelative(4.17f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-0.585f)
                lineToRelative(1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-2.959f, -2.959f)
                arcToRelative(1f, 1f, 0f, false, true, -0.238f, -0.32f)
                lineToRelative(-0.038f, -0.091f)
                lineToRelative(-0.028f, -0.094f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 0.187f, -0.866f)
                lineToRelative(0.076f, -0.084f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                horizontalLineToRelative(0.586f)
                arcToRelative(4f, 4f, 0f, false, false, 3.995f, -3.8f)
                lineToRelative(0.005f, -0.2f)
                verticalLineToRelative(-4.171f)
                arcToRelative(3f, 3f, 0f, false, true, -2f, -2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
                moveToRelative(-8.293f, -0.707f)
                lineToRelative(3f, 3f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 0.263f, 0.95f)
                lineToRelative(-0.01f, 0.031f)
                lineToRelative(-0.003f, 0.018f)
                lineToRelative(-0.008f, 0.018f)
                lineToRelative(-0.007f, 0.027f)
                lineToRelative(-0.016f, 0.035f)
                lineToRelative(-0.01f, 0.032f)
                lineToRelative(-0.007f, 0.01f)
                lineToRelative(-0.005f, 0.014f)
                arcToRelative(1f, 1f, 0f, false, true, -0.232f, 0.316f)
                lineToRelative(-2.965f, 2.963f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(1.291f, -1.293f)
                horizontalLineToRelative(-0.584f)
                arcToRelative(4f, 4f, 0f, false, false, -3.995f, 3.8f)
                lineToRelative(-0.005f, 0.2f)
                verticalLineToRelative(4.171f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -4f, 2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-4.17f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(0.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
            }
        }.build()
        
        return _Exchange!!
    }

private var _Exchange: ImageVector? = null


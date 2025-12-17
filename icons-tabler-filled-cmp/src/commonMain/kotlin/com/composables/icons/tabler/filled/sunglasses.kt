package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Sunglasses: ImageVector
    get() {
        if (_Sunglasses != null) return _Sunglasses!!
        
        _Sunglasses = ImageVector.Builder(
            name = "sunglasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-1.257f)
                lineToRelative(-2.4f, 8f)
                horizontalLineToRelative(5.657f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.656f)
                lineToRelative(-2.4f, -8f)
                horizontalLineToRelative(-1.256f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.958f, 0.713f)
                lineToRelative(3.01f, 10.036f)
                lineToRelative(0.022f, 0.112f)
                lineToRelative(0.008f, 0.08f)
                lineToRelative(0.002f, 2.559f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -8.972f, 0.5f)
                horizontalLineToRelative(-2.056f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -8.972f, -0.5f)
                verticalLineToRelative(-2.518f)
                lineToRelative(0.004f, -0.071f)
                lineToRelative(0.014f, -0.103f)
                lineToRelative(0.018f, -0.076f)
                lineToRelative(3.006f, -10.02f)
                arcToRelative(1f, 1f, 0f, false, true, 0.958f, -0.712f)
                close()
            }
        }.build()
        
        return _Sunglasses!!
    }

private var _Sunglasses: ImageVector? = null


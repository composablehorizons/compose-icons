package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Fountain: ImageVector
    get() {
        if (_Fountain != null) return _Fountain!!
        
        _Fountain = ImageVector.Builder(
            name = "fountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(2f, 2f, 0f, false, false, -3.995f, -0.15f)
                lineToRelative(-0.005f, 0.15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1.993f, -0.117f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1.993f, -0.117f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 5.995f, -0.176f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-9f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 7.001f, -2.645f)
                arcToRelative(3.983f, 3.983f, 0f, false, true, 2.999f, -1.355f)
                close()
            }
        }.build()
        
        return _Fountain!!
    }

private var _Fountain: ImageVector? = null


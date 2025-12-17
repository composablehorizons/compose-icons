package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Lego: ImageVector
    get() {
        if (_Lego != null) return _Lego!!
        
        _Lego = ImageVector.Builder(
            name = "lego",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                lineToRelative(0.2f, 0.005f)
                arcToRelative(4f, 4f, 0f, false, true, 3.795f, 3.795f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(9f)
                arcToRelative(4f, 4f, 0f, false, true, -2.845f, 3.83f)
                lineToRelative(-0.155f, 0.043f)
                verticalLineToRelative(0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-0.127f)
                lineToRelative(-0.155f, -0.042f)
                arcToRelative(4f, 4f, 0f, false, true, -2.84f, -3.631f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-9f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-0.8f, 12.286f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.572f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 6.428f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.014f, -1.414f)
                moveToRelative(-5.69f, -4.286f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Lego!!
    }

private var _Lego: ImageVector? = null


package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareAsterisk: ImageVector
    get() {
        if (_SquareAsterisk != null) return _SquareAsterisk!!
        
        _SquareAsterisk = ImageVector.Builder(
            name = "square-asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-7f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1.631f)
                lineToRelative(-1.445f, -0.963f)
                lineToRelative(-0.101f, -0.06f)
                arcToRelative(1f, 1f, 0f, false, false, -1.009f, 1.724f)
                lineToRelative(1.75f, 1.168f)
                lineToRelative(-1.75f, 1.169f)
                lineToRelative(-0.093f, 0.07f)
                arcToRelative(1f, 1f, 0f, false, false, 1.203f, 1.594f)
                lineToRelative(1.445f, -0.965f)
                verticalLineToRelative(1.632f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-1.631f)
                lineToRelative(1.445f, 0.963f)
                lineToRelative(0.101f, 0.06f)
                arcToRelative(1f, 1f, 0f, false, false, 1.009f, -1.724f)
                lineToRelative(-1.752f, -1.169f)
                lineToRelative(1.752f, -1.167f)
                lineToRelative(0.093f, -0.07f)
                arcToRelative(1f, 1f, 0f, false, false, -1.203f, -1.594f)
                lineToRelative(-1.445f, 0.962f)
                verticalLineToRelative(-1.63f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _SquareAsterisk!!
    }

private var _SquareAsterisk: ImageVector? = null


package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Microphone: ImageVector
    get() {
        if (_Microphone != null) return _Microphone!!
        
        _Microphone = ImageVector.Builder(
            name = "microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(8f, 8f, 0f, false, true, -6.999f, 7.938f)
                lineToRelative(-0.001f, 2.062f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.062f)
                arcToRelative(8f, 8f, 0f, false, true, -7f, -7.938f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(-7f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
            }
        }.build()
        
        return _Microphone!!
    }

private var _Microphone: ImageVector? = null


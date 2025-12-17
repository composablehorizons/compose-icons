package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BoxTissue: ImageVector
    get() {
        if (_BoxTissue != null) return _BoxTissue!!
        
        _BoxTissue = ImageVector.Builder(
            name = "box-tissue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383.88f, 287.82f)
                lineToRelative(64f, -192f)
                horizontalLineTo(338.47f)
                arcToRelative(70.2f, 70.2f, 0f, false, true, -66.59f, -48f)
                arcToRelative(70.21f, 70.21f, 0f, false, false, -66.6f, -48f)
                horizontalLineTo(63.88f)
                lineToRelative(64f, 288f)
                close()
                moveToRelative(-384f, 192f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(448f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineToRelative(-64f)
                horizontalLineTo(-0.12f)
                close()
                moveToRelative(480f, -256f)
                horizontalLineTo(438.94f)
                lineToRelative(-21.33f, 64f)
                horizontalLineToRelative(14.27f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, 32f)
                horizontalLineToRelative(-352f)
                arcToRelative(16f, 16f, 0f, true, true, 0f, -32f)
                horizontalLineTo(95.09f)
                lineToRelative(-14.22f, -64f)
                horizontalLineToRelative(-49f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(512f)
                verticalLineToRelative(-128f)
                arcTo(32f, 32f, 0f, false, false, 479.88f, 223.82f)
                close()
            }
        }.build()
        
        return _BoxTissue!!
    }

private var _BoxTissue: ImageVector? = null


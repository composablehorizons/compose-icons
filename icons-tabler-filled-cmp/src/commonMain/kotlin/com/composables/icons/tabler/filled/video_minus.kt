package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.VideoMinus: ImageVector
    get() {
        if (_VideoMinus != null) return _VideoMinus!!
        
        _VideoMinus = ImageVector.Builder(
            name = "video-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(0.381f)
                lineToRelative(3.106f, -1.552f)
                arcToRelative(2f, 2f, 0f, false, true, 2.894f, 1.789f)
                verticalLineToRelative(6.765f)
                arcToRelative(2f, 2f, 0f, false, true, -2.894f, 1.787f)
                lineToRelative(-3.106f, -1.552f)
                verticalLineToRelative(0.382f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(-2f, 6f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _VideoMinus!!
    }

private var _VideoMinus: ImageVector? = null


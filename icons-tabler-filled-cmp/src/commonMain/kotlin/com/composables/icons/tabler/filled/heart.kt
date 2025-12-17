package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.979f, 3.074f)
                arcToRelative(6f, 6f, 0f, false, true, 4.988f, 1.425f)
                lineToRelative(0.037f, 0.033f)
                lineToRelative(0.034f, -0.03f)
                arcToRelative(6f, 6f, 0f, false, true, 4.733f, -1.44f)
                lineToRelative(0.246f, 0.036f)
                arcToRelative(6f, 6f, 0f, false, true, 3.364f, 10.008f)
                lineToRelative(-0.18f, 0.185f)
                lineToRelative(-0.048f, 0.041f)
                lineToRelative(-7.45f, 7.379f)
                arcToRelative(1f, 1f, 0f, false, true, -1.313f, 0.082f)
                lineToRelative(-0.094f, -0.082f)
                lineToRelative(-7.493f, -7.422f)
                arcToRelative(6f, 6f, 0f, false, true, 3.176f, -10.215f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null


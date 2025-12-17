package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TestPipe2: ImageVector
    get() {
        if (_TestPipe2 != null) return _TestPipe2!!
        
        _TestPipe2 = ImageVector.Builder(
            name = "test-pipe-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                verticalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _TestPipe2!!
    }

private var _TestPipe2: ImageVector? = null


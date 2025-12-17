package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!
        
        _Filter = ImageVector.Builder(
            name = "filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 3f)
                horizontalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2.227f)
                lineToRelative(0.008f, 0.223f)
                arcToRelative(3f, 3f, 0f, false, false, 0.772f, 1.795f)
                lineToRelative(4.22f, 4.641f)
                verticalLineToRelative(8.114f)
                arcToRelative(1f, 1f, 0f, false, false, 1.316f, 0.949f)
                lineToRelative(6f, -2f)
                lineToRelative(0.108f, -0.043f)
                arcToRelative(1f, 1f, 0f, false, false, 0.576f, -0.906f)
                verticalLineToRelative(-6.586f)
                lineToRelative(4.121f, -4.12f)
                arcToRelative(3f, 3f, 0f, false, false, 0.879f, -2.123f)
                verticalLineToRelative(-2.171f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Filter!!
    }

private var _Filter: ImageVector? = null


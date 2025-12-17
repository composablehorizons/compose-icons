package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) return _Hourglass!!
        
        _Hourglass = ImageVector.Builder(
            name = "hourglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(2f)
                arcToRelative(6.996f, 6.996f, 0f, false, true, -3.393f, 6f)
                arcToRelative(6.994f, 6.994f, 0f, false, true, 3.388f, 5.728f)
                lineToRelative(0.005f, 0.272f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-2f)
                arcToRelative(6.996f, 6.996f, 0f, false, true, 3.393f, -6f)
                arcToRelative(6.994f, 6.994f, 0f, false, true, -3.388f, -5.728f)
                lineToRelative(-0.005f, -0.272f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Hourglass!!
    }

private var _Hourglass: ImageVector? = null


package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.LayoutAlignMiddle: ImageVector
    get() {
        if (_LayoutAlignMiddle != null) return _LayoutAlignMiddle!!
        
        _LayoutAlignMiddle = ImageVector.Builder(
            name = "layout-align-middle",
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
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
        }.build()
        
        return _LayoutAlignMiddle!!
    }

private var _LayoutAlignMiddle: ImageVector? = null


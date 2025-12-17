package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ZoomOutArea: ImageVector
    get() {
        if (_ZoomOutArea != null) return _ZoomOutArea!!
        
        _ZoomOutArea = ImageVector.Builder(
            name = "zoom-out-area",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 9f)
                arcToRelative(6f, 6f, 0f, false, true, 4.891f, 9.476f)
                lineToRelative(2.816f, 2.817f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                lineToRelative(-2.817f, -2.816f)
                arcToRelative(6f, 6f, 0f, false, true, -9.476f, -4.891f)
                lineToRelative(0.004f, -0.225f)
                arcToRelative(6f, 6f, 0f, false, true, 5.996f, -5.775f)
                moveToRelative(2f, 5f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-14f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(0f, -5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(3f, -7f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(5f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
                moveToRelative(5f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
            }
        }.build()
        
        return _ZoomOutArea!!
    }

private var _ZoomOutArea: ImageVector? = null


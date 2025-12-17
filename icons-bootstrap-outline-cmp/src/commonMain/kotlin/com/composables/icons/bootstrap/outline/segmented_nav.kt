package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SegmentedNav: ImageVector
    get() {
        if (_SegmentedNav != null) return _SegmentedNav!!
        
        _SegmentedNav = ImageVector.Builder(
            name = "segmented-nav",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(6f, 3f)
                horizontalLineToRelative(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                close()
                moveToRelative(9f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
            }
        }.build()
        
        return _SegmentedNav!!
    }

private var _SegmentedNav: ImageVector? = null


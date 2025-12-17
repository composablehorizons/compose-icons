package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LayoutThreeColumns: ImageVector
    get() {
        if (_LayoutThreeColumns != null) return _LayoutThreeColumns!!
        
        _LayoutThreeColumns = ImageVector.Builder(
            name = "layout-three-columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 0f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 14.5f)
                close()
                moveTo(1.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                close()
                moveTo(10f, 15f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(1f, 0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _LayoutThreeColumns!!
    }

private var _LayoutThreeColumns: ImageVector? = null


package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.NodePlus: ImageVector
    get() {
        if (_NodePlus != null) return _NodePlus!!
        
        _NodePlus = ImageVector.Builder(
            name = "node-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 4f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
                moveTo(6.025f, 7.5f)
                arcToRelative(5f, 5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 10f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 8.5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 6f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 7.5f)
                close()
                moveTo(11f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 5f)
                moveTo(1.5f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _NodePlus!!
    }

private var _NodePlus: ImageVector? = null


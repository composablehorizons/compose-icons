package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ListNested: ImageVector
    get() {
        if (_ListNested != null) return _ListNested!!
        
        _ListNested = ImageVector.Builder(
            name = "list-nested",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 11f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(-2f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 7f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(-2f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 3f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _ListNested!!
    }

private var _ListNested: ImageVector? = null


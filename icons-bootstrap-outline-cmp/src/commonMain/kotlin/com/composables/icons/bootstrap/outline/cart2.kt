package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cart2: ImageVector
    get() {
        if (_Cart2 != null) return _Cart2!!
        
        _Cart2 = ImageVector.Builder(
            name = "cart2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 2f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.485f, 0.379f)
                lineTo(2.89f, 4f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.485f, 0.621f)
                lineToRelative(-1.5f, 6f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 11f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.485f, -0.379f)
                lineTo(1.61f, 3f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(3.14f, 5f)
                lineToRelative(1.25f, 5f)
                horizontalLineToRelative(8.22f)
                lineToRelative(1.25f, -5f)
                close()
                moveTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-2f, 1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                moveToRelative(9f, -1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-2f, 1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
            }
        }.build()
        
        return _Cart2!!
    }

private var _Cart2: ImageVector? = null


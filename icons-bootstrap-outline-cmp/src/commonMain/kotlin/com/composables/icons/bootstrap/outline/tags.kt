package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tags: ImageVector
    get() {
        if (_Tags != null) return _Tags!!
        
        _Tags = ImageVector.Builder(
            name = "tags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2f)
                verticalLineToRelative(4.586f)
                lineToRelative(7f, 7f)
                lineTo(14.586f, 9f)
                lineToRelative(-7f, -7f)
                close()
                moveTo(2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(7f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-4.586f, 4.586f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-7f, -7f)
                arcTo(1f, 1f, 0f, false, true, 2f, 6.586f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(0f, 1f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveTo(1f, 7.086f)
                arcToRelative(1f, 1f, 0f, false, false, 0.293f, 0.707f)
                lineTo(8.75f, 15.25f)
                lineToRelative(-0.043f, 0.043f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-7f, -7f)
                arcTo(1f, 1f, 0f, false, true, 0f, 7.586f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Tags!!
    }

private var _Tags: ImageVector? = null


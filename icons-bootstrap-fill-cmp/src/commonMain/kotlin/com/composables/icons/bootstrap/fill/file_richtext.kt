package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileRichtext: ImageVector
    get() {
        if (_FileRichtext != null) return _FileRichtext!!
        
        _FileRichtext = ImageVector.Builder(
            name = "file-richtext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(7f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                moveToRelative(-0.861f, 1.542f)
                lineToRelative(1.33f, 0.886f)
                lineToRelative(1.854f, -1.855f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.289f, -0.047f)
                lineToRelative(1.888f, 0.974f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(7f)
                reflectiveCurveToRelative(1.54f, -1.274f, 1.639f, -1.208f)
                moveTo(5f, 9f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(0f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _FileRichtext!!
    }

private var _FileRichtext: ImageVector? = null


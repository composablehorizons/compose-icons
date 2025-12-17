package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkPpt: ImageVector
    get() {
        if (_FileEarmarkPpt != null) return _FileEarmarkPpt!!
        
        _FileEarmarkPpt = ImageVector.Builder(
            name = "file-earmark-ppt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.188f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(1.188f)
                arcToRelative(1.75f, 1.75f, 0f, true, true, 0f, 3.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(5.293f)
                arcTo(1f, 1f, 0f, false, true, 10f, 0.293f)
                lineTo(13.707f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(5.5f, 1.5f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineTo(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.188f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 0f, -5.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkPpt!!
    }

private var _FileEarmarkPpt: ImageVector? = null


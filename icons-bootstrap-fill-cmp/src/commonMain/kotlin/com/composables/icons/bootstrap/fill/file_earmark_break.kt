package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkBreak: ImageVector
    get() {
        if (_FileEarmarkBreak != null) return _FileEarmarkBreak!!
        
        _FileEarmarkBreak = ImageVector.Builder(
            name = "file-earmark-break",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(5.293f)
                arcTo(1f, 1f, 0f, false, true, 10f, 0.293f)
                lineTo(13.707f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(5.5f, 1.5f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveTo(0.5f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _FileEarmarkBreak!!
    }

private var _FileEarmarkBreak: ImageVector? = null


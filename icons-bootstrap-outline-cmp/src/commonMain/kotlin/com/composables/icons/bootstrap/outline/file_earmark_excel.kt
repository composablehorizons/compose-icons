package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkExcel: ImageVector
    get() {
        if (_FileEarmarkExcel != null) return _FileEarmarkExcel!!
        
        _FileEarmarkExcel = ImageVector.Builder(
            name = "file-earmark-excel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.884f, 6.68f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.768f, 0.64f)
                lineTo(7.349f, 10f)
                lineToRelative(-2.233f, 2.68f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.768f, 0.64f)
                lineTo(8f, 10.781f)
                lineToRelative(2.116f, 2.54f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.768f, -0.641f)
                lineTo(8.651f, 10f)
                lineToRelative(2.233f, -2.68f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.768f, -0.64f)
                lineTo(8f, 9.219f)
                lineToRelative(-2.116f, -2.54f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkExcel!!
    }

private var _FileEarmarkExcel: ImageVector? = null


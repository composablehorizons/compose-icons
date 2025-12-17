package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkMedical: ImageVector
    get() {
        if (_FileEarmarkMedical != null) return _FileEarmarkMedical!!
        
        _FileEarmarkMedical = ImageVector.Builder(
            name = "file-earmark-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(-3f, 2f)
                verticalLineToRelative(0.634f)
                lineToRelative(0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.5f, 0.866f)
                lineTo(7f, 7f)
                lineToRelative(0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.5f, 0.866f)
                lineTo(6.5f, 7.866f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-0.634f)
                lineToRelative(-0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.5f, -0.866f)
                lineTo(5f, 7f)
                lineToRelative(-0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.866f)
                lineToRelative(0.549f, 0.317f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                moveToRelative(-2f, 4.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(0f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _FileEarmarkMedical!!
    }

private var _FileEarmarkMedical: ImageVector? = null


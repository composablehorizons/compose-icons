package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkMedical: ImageVector
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
                moveTo(7.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.634f)
                lineToRelative(-0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.5f, 0.866f)
                lineTo(6f, 7f)
                lineToRelative(-0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.5f, 0.866f)
                lineToRelative(0.549f, -0.317f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-0.634f)
                lineToRelative(0.549f, 0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.5f, -0.866f)
                lineTo(8f, 7f)
                lineToRelative(0.549f, -0.317f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.5f, -0.866f)
                lineToRelative(-0.549f, 0.317f)
                close()
                moveToRelative(-2f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
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
        
        return _FileEarmarkMedical!!
    }

private var _FileEarmarkMedical: ImageVector? = null


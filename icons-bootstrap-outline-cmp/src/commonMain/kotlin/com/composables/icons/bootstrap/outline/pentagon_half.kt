package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PentagonHalf: ImageVector
    get() {
        if (_PentagonHalf != null) return _PentagonHalf!!
        
        _PentagonHalf = ImageVector.Builder(
            name = "pentagon-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.288f)
                lineToRelative(6.578f, 5.345f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.161f, 0.539f)
                lineToRelative(-2.362f, 7.479f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.476f, 0.349f)
                horizontalLineTo(8f)
                close()
                moveToRelative(7.898f, 5.536f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.162f, -0.538f)
                lineTo(8.316f, 0.256f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.631f, 0f)
                lineTo(0.264f, 6.286f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.162f, 0.538f)
                lineToRelative(2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.476f, 0.349f)
                horizontalLineToRelative(9.268f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.476f, -0.35f)
                close()
            }
        }.build()
        
        return _PentagonHalf!!
    }

private var _PentagonHalf: ImageVector? = null


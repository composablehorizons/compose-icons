package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.685f, 1.545f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.63f, 0f)
                lineToRelative(6.263f, 5.088f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.161f, 0.539f)
                lineToRelative(-2.362f, 7.479f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.476f, 0.349f)
                horizontalLineTo(4.099f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.476f, -0.35f)
                lineTo(1.26f, 7.173f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.161f, -0.54f)
                lineToRelative(6.263f, -5.087f)
                close()
                moveToRelative(8.213f, 5.28f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.162f, -0.54f)
                lineTo(8.316f, 0.257f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.631f, 0f)
                lineTo(0.264f, 6.286f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.162f, 0.538f)
                lineToRelative(2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.476f, 0.349f)
                horizontalLineToRelative(9.268f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.476f, -0.35f)
                lineToRelative(2.788f, -8.826f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null


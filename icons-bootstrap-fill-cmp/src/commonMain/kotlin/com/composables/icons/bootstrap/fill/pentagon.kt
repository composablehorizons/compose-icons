package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pentagon: ImageVector
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
                moveTo(7.685f, 0.256f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.63f, 0f)
                lineToRelative(7.421f, 6.03f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.162f, 0.538f)
                lineToRelative(-2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.476f, 0.349f)
                horizontalLineTo(3.366f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.476f, -0.35f)
                lineTo(0.102f, 6.825f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.162f, -0.538f)
                lineToRelative(7.42f, -6.03f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null


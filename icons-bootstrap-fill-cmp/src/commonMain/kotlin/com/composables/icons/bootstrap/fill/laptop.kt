package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Laptop: ImageVector
    get() {
        if (_Laptop != null) return _Laptop!!
        
        _Laptop = ImageVector.Builder(
            name = "laptop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 3.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(14f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 2f)
                close()
                moveTo(0f, 12.5f)
                horizontalLineToRelative(16f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 12.5f)
            }
        }.build()
        
        return _Laptop!!
    }

private var _Laptop: ImageVector? = null


package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.643f, 15f)
                curveTo(13.979f, 15f, 15f, 13.845f, 15f, 12.5f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(7.5f)
                curveTo(1f, 13.845f, 2.021f, 15f, 3.357f, 15f)
                close()
                moveTo(5.5f, 7f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveTo(0.8f, 1f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.8f, 0.8f)
                verticalLineTo(3f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.8f, 0.8f)
                horizontalLineToRelative(14.4f)
                arcTo(0.8f, 0.8f, 0f, false, false, 16f, 3f)
                verticalLineTo(1.8f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.8f, -0.8f)
                close()
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null


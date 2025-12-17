package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Display: ImageVector
    get() {
        if (_Display != null) return _Display!!
        
        _Display = ImageVector.Builder(
            name = "display",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                quadToRelative(0f, 1f, -0.25f, 1.5f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-0.75f)
                quadTo(10f, 13f, 10f, 12f)
                horizontalLineToRelative(4f)
                curveToRelative(2f, 0f, 2f, -2f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -2f, -2f, -2f, -2f, -2f)
                horizontalLineTo(2f)
                curveTo(0f, 2f, 0f, 4f, 0f, 4f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2f, 2f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Display!!
    }

private var _Display: ImageVector? = null


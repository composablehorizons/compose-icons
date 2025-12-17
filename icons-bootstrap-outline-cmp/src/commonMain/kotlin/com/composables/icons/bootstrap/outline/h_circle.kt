package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HCircle: ImageVector
    get() {
        if (_HCircle != null) return _HCircle!!
        
        _HCircle = ImageVector.Builder(
            name = "h-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-5f, -3.998f)
                verticalLineTo(12f)
                horizontalLineTo(9.67f)
                verticalLineTo(8.455f)
                horizontalLineTo(6.33f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(4.002f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(3.322f)
                horizontalLineToRelative(3.34f)
                verticalLineTo(4.002f)
                close()
            }
        }.build()
        
        return _HCircle!!
    }

private var _HCircle: ImageVector? = null


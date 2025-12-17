package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`1Circle`: ImageVector
    get() {
        if (_1Circle != null) return _1Circle!!
        
        _1Circle = ImageVector.Builder(
            name = "1-circle",
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
                moveTo(9.283f, 4.002f)
                verticalLineTo(12f)
                horizontalLineTo(7.971f)
                verticalLineTo(5.338f)
                horizontalLineToRelative(-0.065f)
                lineTo(6.072f, 6.656f)
                verticalLineTo(5.385f)
                lineToRelative(1.899f, -1.383f)
                close()
            }
        }.build()
        
        return _1Circle!!
    }

private var _1Circle: ImageVector? = null


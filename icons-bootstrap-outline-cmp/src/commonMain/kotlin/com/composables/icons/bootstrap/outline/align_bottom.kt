package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) return _AlignBottom!!
        
        _AlignBottom = ImageVector.Builder(
            name = "align-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 1f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 2f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, false, true, 9f, 13f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 6f, 12f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, false, true, 7f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 14f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                close()
                moveToRelative(13f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(-13f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-13f)
                close()
            }
        }.build()
        
        return _AlignBottom!!
    }

private var _AlignBottom: ImageVector? = null


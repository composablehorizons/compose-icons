package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AlignMiddle: ImageVector
    get() {
        if (_AlignMiddle != null) return _AlignMiddle!!
        
        _AlignMiddle = ImageVector.Builder(
            name = "align-middle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                close()
                moveTo(1f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1f, 8f)
                moveToRelative(14f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
            }
        }.build()
        
        return _AlignMiddle!!
    }

private var _AlignMiddle: ImageVector? = null


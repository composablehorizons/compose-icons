package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Ladder: ImageVector
    get() {
        if (_Ladder != null) return _Ladder!!
        
        _Ladder = ImageVector.Builder(
            name = "ladder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Ladder!!
    }

private var _Ladder: ImageVector? = null


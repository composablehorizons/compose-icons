package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Box2: ImageVector
    get() {
        if (_Box2 != null) return _Box2!!
        
        _Box2 = ImageVector.Builder(
            name = "box2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.95f, 0.4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.8f, -0.4f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.8f, 0.4f)
                lineToRelative(2.85f, 3.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.1f, 0.3f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.1f, -0.3f)
                close()
                moveTo(7.5f, 1f)
                horizontalLineTo(3.75f)
                lineTo(1.5f, 4f)
                horizontalLineToRelative(6f)
                close()
                moveToRelative(1f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                lineToRelative(-2.25f, -3f)
                close()
                moveTo(15f, 5f)
                horizontalLineTo(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Box2!!
    }

private var _Box2: ImageVector? = null


package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Box2: ImageVector
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
                moveTo(3.75f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, 0.4f)
                lineTo(0.1f, 4.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.1f, 0.3f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.1f, -0.3f)
                lineTo(13.05f, 0.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, -0.4f)
                close()
                moveTo(15f, 4.667f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(-0.333f)
                lineTo(1.5f, 4f)
                horizontalLineToRelative(6f)
                verticalLineTo(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Box2!!
    }

private var _Box2: ImageVector? = null


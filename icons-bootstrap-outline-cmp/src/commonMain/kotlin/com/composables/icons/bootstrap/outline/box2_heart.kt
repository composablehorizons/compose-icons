package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Box2Heart: ImageVector
    get() {
        if (_Box2Heart != null) return _Box2Heart!!
        
        _Box2Heart = ImageVector.Builder(
            name = "box2-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 7.982f)
                curveTo(9.664f, 6.309f, 13.825f, 9.236f, 8f, 13f)
                curveTo(2.175f, 9.236f, 6.336f, 6.31f, 8f, 7.982f)
            }
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
                moveToRelative(0f, 1f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(8.5f, 4f)
                verticalLineTo(1f)
                horizontalLineToRelative(3.75f)
                lineToRelative(2.25f, 3f)
                close()
                moveTo(15f, 5f)
                verticalLineToRelative(10f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Box2Heart!!
    }

private var _Box2Heart: ImageVector? = null


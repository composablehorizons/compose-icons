package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BlockquoteRight: ImageVector
    get() {
        if (_BlockquoteRight != null) return _BlockquoteRight!!
        
        _BlockquoteRight = ImageVector.Builder(
            name = "blockquote-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(10.113f, -5.373f)
                arcToRelative(7f, 7f, 0f, false, false, -0.445f, -0.275f)
                lineToRelative(0.21f, -0.352f)
                quadToRelative(0.183f, 0.111f, 0.452f, 0.287f)
                quadToRelative(0.27f, 0.176f, 0.51f, 0.428f)
                quadToRelative(0.234f, 0.246f, 0.398f, 0.562f)
                quadToRelative(0.164f, 0.31f, 0.164f, 0.692f)
                quadToRelative(0f, 0.54f, -0.216f, 0.873f)
                quadToRelative(-0.217f, 0.328f, -0.721f, 0.328f)
                quadToRelative(-0.322f, 0f, -0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.188f, -0.463f)
                quadToRelative(0f, -0.345f, 0.211f, -0.521f)
                quadToRelative(0.205f, -0.182f, 0.569f, -0.182f)
                horizontalLineToRelative(0.281f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.123f, -0.498f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.252f, -0.37f)
                arcToRelative(2f, 2f, 0f, false, false, -0.346f, -0.298f)
                moveToRelative(-2.168f, 0f)
                arcTo(7f, 7f, 0f, false, false, 10f, 6.352f)
                lineTo(10.21f, 6f)
                quadToRelative(0.183f, 0.111f, 0.452f, 0.287f)
                quadToRelative(0.27f, 0.176f, 0.51f, 0.428f)
                quadToRelative(0.234f, 0.246f, 0.398f, 0.562f)
                quadToRelative(0.164f, 0.31f, 0.164f, 0.692f)
                quadToRelative(0f, 0.54f, -0.216f, 0.873f)
                quadToRelative(-0.217f, 0.328f, -0.721f, 0.328f)
                quadToRelative(-0.322f, 0f, -0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.188f, -0.463f)
                quadToRelative(0f, -0.345f, 0.211f, -0.521f)
                quadToRelative(0.206f, -0.182f, 0.569f, -0.182f)
                horizontalLineToRelative(0.281f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.117f, -0.492f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.258f, -0.375f)
                arcToRelative(2f, 2f, 0f, false, false, -0.346f, -0.3f)
                close()
            }
        }.build()
        
        return _BlockquoteRight!!
    }

private var _BlockquoteRight: ImageVector? = null


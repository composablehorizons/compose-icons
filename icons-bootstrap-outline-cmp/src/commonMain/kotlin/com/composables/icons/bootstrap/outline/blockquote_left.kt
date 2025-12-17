package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BlockquoteLeft: ImageVector
    get() {
        if (_BlockquoteLeft != null) return _BlockquoteLeft!!
        
        _BlockquoteLeft = ImageVector.Builder(
            name = "blockquote-left",
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
                moveToRelative(5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(-5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0.79f, -5.373f)
                quadToRelative(0.168f, -0.117f, 0.444f, -0.275f)
                lineTo(3.524f, 6f)
                quadToRelative(-0.183f, 0.111f, -0.452f, 0.287f)
                quadToRelative(-0.27f, 0.176f, -0.51f, 0.428f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -0.398f, 0.562f)
                quadTo(2f, 7.587f, 2f, 7.969f)
                quadToRelative(0f, 0.54f, 0.217f, 0.873f)
                quadToRelative(0.217f, 0.328f, 0.72f, 0.328f)
                quadToRelative(0.322f, 0f, 0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, 0.188f, -0.463f)
                quadToRelative(0f, -0.345f, -0.211f, -0.521f)
                quadToRelative(-0.205f, -0.182f, -0.568f, -0.182f)
                horizontalLineToRelative(-0.282f)
                quadToRelative(0.036f, -0.305f, 0.123f, -0.498f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, 0.252f, -0.37f)
                arcToRelative(2f, 2f, 0f, false, true, 0.346f, -0.298f)
                close()
                moveToRelative(2.167f, 0f)
                quadToRelative(0.17f, -0.117f, 0.445f, -0.275f)
                lineTo(5.692f, 6f)
                quadToRelative(-0.183f, 0.111f, -0.452f, 0.287f)
                quadToRelative(-0.27f, 0.176f, -0.51f, 0.428f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -0.398f, 0.562f)
                quadToRelative(-0.165f, 0.31f, -0.164f, 0.692f)
                quadToRelative(0f, 0.54f, 0.217f, 0.873f)
                quadToRelative(0.217f, 0.328f, 0.72f, 0.328f)
                quadToRelative(0.322f, 0f, 0.504f, -0.211f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, 0.188f, -0.463f)
                quadToRelative(0f, -0.345f, -0.211f, -0.521f)
                quadToRelative(-0.205f, -0.182f, -0.568f, -0.182f)
                horizontalLineToRelative(-0.282f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, 0.118f, -0.492f)
                quadToRelative(0.087f, -0.194f, 0.257f, -0.375f)
                arcToRelative(2f, 2f, 0f, false, true, 0.346f, -0.3f)
                close()
            }
        }.build()
        
        return _BlockquoteLeft!!
    }

private var _BlockquoteLeft: ImageVector? = null


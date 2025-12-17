package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MinecartLoaded: ImageVector
    get() {
        if (_MinecartLoaded != null) return _MinecartLoaded!!
        
        _MinecartLoaded = ImageVector.Builder(
            name = "minecart-loaded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 15f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(0f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(8f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(0f, 1f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveTo(0.115f, 3.18f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.491f, 0.592f)
                lineToRelative(-1.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 12f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.491f, -0.408f)
                lineToRelative(-1.5f, -8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.106f, -0.411f)
                close()
                moveToRelative(0.987f, 0.82f)
                lineToRelative(1.313f, 7f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.313f, -7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 1f)
                arcToRelative(2.498f, 2.498f, 0f, false, true, 4f, 0f)
                curveToRelative(0.818f, 0f, 1.545f, 0.394f, 2f, 1f)
                curveToRelative(0.67f, 0f, 1.552f, 0.57f, 2f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.314f, 0f, -0.611f, -0.15f, -0.8f, -0.4f)
                curveToRelative(-0.274f, -0.365f, -0.71f, -0.6f, -1.2f, -0.6f)
                curveToRelative(-0.314f, 0f, -0.611f, -0.15f, -0.8f, -0.4f)
                arcToRelative(1.497f, 1.497f, 0f, false, false, -2.4f, 0f)
                curveToRelative(-0.189f, 0.25f, -0.486f, 0.4f, -0.8f, 0.4f)
                curveToRelative(-0.507f, 0f, -0.955f, 0.251f, -1.228f, 0.638f)
                quadToRelative(-0.136f, 0.194f, -0.308f, 0.362f)
                horizontalLineTo(3f)
                curveToRelative(0.13f, -0.147f, 0.401f, -0.432f, 0.562f, -0.545f)
                arcToRelative(1.6f, 1.6f, 0f, false, false, 0.393f, -0.393f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6f, 1f)
            }
        }.build()
        
        return _MinecartLoaded!!
    }

private var _MinecartLoaded: ImageVector? = null


package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cog: ImageVector
    get() {
        if (_Cog != null) return _Cog!!
        
        _Cog = ImageVector.Builder(
            name = "cog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 1.938f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.025f, 0.274f)
                lineToRelative(0.652f, 1.131f)
                curveToRelative(0.351f, -0.138f, 0.71f, -0.233f, 1.073f, -0.288f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1.306f)
                arcToRelative(5.03f, 5.03f, 0f, false, true, 1.072f, 0.288f)
                lineToRelative(0.654f, -1.132f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.298f, 0.75f)
                lineToRelative(-0.652f, 1.13f)
                curveToRelative(0.286f, 0.23f, 0.55f, 0.492f, 0.785f, 0.786f)
                lineToRelative(1.13f, -0.653f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.75f, 1.3f)
                lineToRelative(-1.13f, 0.652f)
                curveToRelative(0.137f, 0.351f, 0.233f, 0.71f, 0.288f, 1.073f)
                horizontalLineToRelative(1.305f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.306f)
                arcToRelative(5.032f, 5.032f, 0f, false, true, -0.288f, 1.072f)
                lineToRelative(1.132f, 0.654f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 1.298f)
                lineToRelative(-1.13f, -0.652f)
                curveToRelative(-0.23f, 0.286f, -0.492f, 0.55f, -0.786f, 0.785f)
                lineToRelative(0.652f, 1.13f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.298f, 0.75f)
                lineToRelative(-0.653f, -1.13f)
                curveToRelative(-0.351f, 0.137f, -0.71f, 0.233f, -1.073f, 0.288f)
                verticalLineToRelative(1.305f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.306f)
                arcToRelative(5.032f, 5.032f, 0f, false, true, -1.072f, -0.288f)
                lineToRelative(-0.653f, 1.132f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.3f, -0.75f)
                lineToRelative(0.653f, -1.13f)
                arcToRelative(4.966f, 4.966f, 0f, false, true, -0.785f, -0.786f)
                lineToRelative(-1.13f, 0.652f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -1.298f)
                lineToRelative(1.13f, -0.653f)
                arcToRelative(4.965f, 4.965f, 0f, false, true, -0.288f, -1.073f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.306f)
                arcToRelative(5.03f, 5.03f, 0f, false, true, 0.288f, -1.072f)
                lineToRelative(-1.132f, -0.653f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -1.3f)
                lineToRelative(1.13f, 0.653f)
                curveToRelative(0.23f, -0.286f, 0.492f, -0.55f, 0.786f, -0.785f)
                lineToRelative(-0.653f, -1.13f)
                arcTo(0.75f, 0.75f, 0f, false, true, 4.5f, 1.937f)
                close()
                moveToRelative(1.14f, 3.476f)
                arcToRelative(3.501f, 3.501f, 0f, false, false, 0f, 5.172f)
                lineTo(7.135f, 8f)
                lineTo(5.641f, 5.414f)
                close()
                moveTo(8.434f, 8.75f)
                lineTo(6.94f, 11.336f)
                arcToRelative(3.491f, 3.491f, 0f, false, false, 2.81f, -0.305f)
                arcToRelative(3.49f, 3.49f, 0f, false, false, 1.669f, -2.281f)
                horizontalLineTo(8.433f)
                close()
                moveToRelative(2.987f, -1.5f)
                horizontalLineTo(8.433f)
                lineTo(6.94f, 4.664f)
                arcToRelative(3.501f, 3.501f, 0f, false, true, 4.48f, 2.586f)
                close()
            }
        }.build()
        
        return _Cog!!
    }

private var _Cog: ImageVector? = null


package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 0f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                quadToRelative(0f, 0.807f, -0.034f, 1.536f)
                arcToRelative(3f, 3f, 0f, true, true, -1.133f, 5.89f)
                curveToRelative(-0.79f, 1.865f, -1.878f, 2.777f, -2.833f, 3.011f)
                verticalLineToRelative(2.173f)
                lineToRelative(1.425f, 0.356f)
                curveToRelative(0.194f, 0.048f, 0.377f, 0.135f, 0.537f, 0.255f)
                lineTo(13.3f, 15.1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.3f, 0.9f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.3f, -0.9f)
                lineToRelative(1.838f, -1.379f)
                curveToRelative(0.16f, -0.12f, 0.343f, -0.207f, 0.537f, -0.255f)
                lineTo(6.5f, 13.11f)
                verticalLineToRelative(-2.173f)
                curveToRelative(-0.955f, -0.234f, -2.043f, -1.146f, -2.833f, -3.012f)
                arcToRelative(3f, 3f, 0f, true, true, -1.132f, -5.89f)
                arcTo(33f, 33f, 0f, false, true, 2.5f, 0.5f)
                moveToRelative(0.099f, 2.54f)
                arcToRelative(2f, 2f, 0f, false, false, 0.72f, 3.935f)
                curveToRelative(-0.333f, -1.05f, -0.588f, -2.346f, -0.72f, -3.935f)
                moveToRelative(10.083f, 3.935f)
                arcToRelative(2f, 2f, 0f, false, false, 0.72f, -3.935f)
                curveToRelative(-0.133f, 1.59f, -0.388f, 2.885f, -0.72f, 3.935f)
                moveTo(3.504f, 1f)
                quadToRelative(0.01f, 0.775f, 0.056f, 1.469f)
                curveToRelative(0.13f, 2.028f, 0.457f, 3.546f, 0.87f, 4.667f)
                curveTo(5.294f, 9.48f, 6.484f, 10f, 7f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.61f)
                arcToRelative(1f, 1f, 0f, false, true, -0.757f, 0.97f)
                lineToRelative(-1.426f, 0.356f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.179f, 0.085f)
                lineTo(4.5f, 15f)
                horizontalLineToRelative(7f)
                lineToRelative(-0.638f, -0.479f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.18f, -0.085f)
                lineToRelative(-1.425f, -0.356f)
                arcToRelative(1f, 1f, 0f, false, true, -0.757f, -0.97f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 10f)
                curveToRelative(0.516f, 0f, 1.706f, -0.52f, 2.57f, -2.864f)
                curveToRelative(0.413f, -1.12f, 0.74f, -2.64f, 0.87f, -4.667f)
                quadToRelative(0.045f, -0.694f, 0.056f, -1.469f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null


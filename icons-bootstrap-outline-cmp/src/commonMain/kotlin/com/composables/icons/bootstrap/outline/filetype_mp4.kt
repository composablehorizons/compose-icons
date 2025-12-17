package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeMp4: ImageVector
    get() {
        if (_FiletypeMp4 != null) return _FiletypeMp4!!
        
        _FiletypeMp4 = ImageVector.Builder(
            name = "filetype-mp4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(0.706f, 15.849f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.16f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(0.715f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.026f)
                lineTo(0.805f, 11.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(5.278f, -3.999f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.792f)
                verticalLineToRelative(-1.342f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0f, 0.732f, -0.173f)
                quadToRelative(0.304f, -0.175f, 0.463f, -0.474f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.161f, -0.677f)
                quadToRelative(0f, -0.375f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.46f, -0.477f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.733f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.085f, 0.38f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, -0.237f, 0.241f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.375f, 0.082f)
                horizontalLineToRelative(-0.66f)
                verticalLineTo(12.48f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.329f, 0f, 0.513f, 0.181f)
                quadToRelative(0.184f, 0.183f, 0.184f, 0.522f)
                moveToRelative(1.505f, -0.032f)
                quadToRelative(0.4f, -0.65f, 0.791f, -1.301f)
                horizontalLineToRelative(1.14f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(0.49f)
                verticalLineToRelative(0.638f)
                horizontalLineToRelative(-0.49f)
                verticalLineToRelative(0.741f)
                horizontalLineToRelative(-0.741f)
                verticalLineToRelative(-0.741f)
                horizontalLineTo(7.287f)
                verticalLineToRelative(-0.648f)
                quadToRelative(0.353f, -0.66f, 0.747f, -1.31f)
                close()
                moveToRelative(-0.029f, 1.298f)
                verticalLineToRelative(0.02f)
                horizontalLineToRelative(1.219f)
                verticalLineToRelative(-2.021f)
                horizontalLineToRelative(-0.041f)
                quadToRelative(-0.302f, 0.477f, -0.607f, 0.984f)
                quadToRelative(-0.3f, 0.507f, -0.571f, 1.017f)
            }
        }.build()
        
        return _FiletypeMp4!!
    }

private var _FiletypeMp4: ImageVector? = null


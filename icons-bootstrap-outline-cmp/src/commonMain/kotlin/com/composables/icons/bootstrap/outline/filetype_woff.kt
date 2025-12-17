package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeWoff: ImageVector
    get() {
        if (_FiletypeWoff != null) return _FiletypeWoff!!
        
        _FiletypeWoff = ImageVector.Builder(
            name = "filetype-woff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
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
                moveToRelative(-5.464f, 9.688f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.386f, -0.117f, -0.641f)
                arcToRelative(0.86f, 0.86f, 0f, false, false, -0.323f, -0.387f)
                arcToRelative(0.86f, 0.86f, 0f, false, false, -0.468f, -0.129f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.472f, 0.13f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.32f, 0.386f)
                quadToRelative(-0.116f, 0.255f, -0.116f, 0.641f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.384f, 0.117f, 0.641f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, 0.319f, 0.387f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.472f, 0.126f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.468f, -0.126f)
                arcToRelative(0.86f, 0.86f, 0f, false, false, 0.323f, -0.386f)
                arcToRelative(1.55f, 1.55f, 0f, false, false, 0.117f, -0.642f)
                moveToRelative(0.803f, -0.516f)
                verticalLineToRelative(0.513f)
                quadToRelative(0f, 0.563f, -0.205f, 0.973f)
                quadToRelative(-0.205f, 0.406f, -0.59f, 0.627f)
                quadToRelative(-0.38f, 0.216f, -0.916f, 0.216f)
                quadToRelative(-0.534f, 0f, -0.92f, -0.216f)
                arcToRelative(1.46f, 1.46f, 0f, false, true, -0.59f, -0.627f)
                arcToRelative(2.15f, 2.15f, 0f, false, true, -0.204f, -0.973f)
                verticalLineToRelative(-0.513f)
                quadToRelative(0f, -0.569f, 0.205f, -0.975f)
                quadToRelative(0.205f, -0.411f, 0.589f, -0.627f)
                quadToRelative(0.386f, -0.22f, 0.92f, -0.22f)
                quadToRelative(0.536f, 0f, 0.917f, 0.22f)
                quadToRelative(0.384f, 0.219f, 0.589f, 0.63f)
                quadToRelative(0.204f, 0.406f, 0.205f, 0.972f)
                moveToRelative(-6.064f, -0.536f)
                lineToRelative(-0.74f, 2.79f)
                horizontalLineToRelative(-0.73f)
                lineToRelative(-1.055f, -4f)
                horizontalLineToRelative(0.855f)
                lineToRelative(0.601f, 2.903f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.706f, -2.903f)
                horizontalLineToRelative(0.683f)
                lineToRelative(0.706f, 2.903f)
                horizontalLineToRelative(0.04f)
                lineToRelative(0.596f, -2.903f)
                horizontalLineToRelative(0.858f)
                lineToRelative(-1.055f, 4f)
                horizontalLineToRelative(-0.73f)
                lineToRelative(-0.74f, -2.79f)
                close()
                moveToRelative(7.398f, 2.79f)
                verticalLineToRelative(-1.592f)
                horizontalLineToRelative(1.606f)
                verticalLineToRelative(-0.638f)
                horizontalLineToRelative(-1.606f)
                verticalLineToRelative(-1.117f)
                horizontalLineToRelative(1.758f)
                verticalLineToRelative(-0.653f)
                horizontalLineTo(9.882f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(2.988f, -1.592f)
                verticalLineToRelative(1.591f)
                horizontalLineToRelative(-0.791f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(2.548f)
                verticalLineToRelative(0.653f)
                horizontalLineToRelative(-1.757f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypeWoff!!
    }

private var _FiletypeWoff: ImageVector? = null


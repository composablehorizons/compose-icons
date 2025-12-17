package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeMov: ImageVector
    get() {
        if (_FiletypeMov != null) return _FiletypeMov!!
        
        _FiletypeMov = ImageVector.Builder(
            name = "filetype-mov",
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
                moveToRelative(-6.914f, 9.166f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.384f, -0.117f, 0.641f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, -0.323f, 0.387f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.468f, 0.126f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.472f, -0.126f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.32f, -0.386f)
                arcToRelative(1.55f, 1.55f, 0f, false, true, -0.117f, -0.642f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.386f, 0.118f, -0.641f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.319f, -0.387f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.472f, -0.129f)
                quadToRelative(0.263f, 0f, 0.468f, 0.13f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, 0.323f, 0.386f)
                quadToRelative(0.117f, 0.255f, 0.117f, 0.641f)
                moveToRelative(0.802f, 0.519f)
                verticalLineToRelative(-0.513f)
                quadToRelative(0f, -0.565f, -0.205f, -0.972f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -0.588f, -0.63f)
                quadToRelative(-0.381f, -0.22f, -0.917f, -0.22f)
                quadToRelative(-0.534f, 0f, -0.92f, 0.22f)
                arcToRelative(1.44f, 1.44f, 0f, false, false, -0.59f, 0.627f)
                quadToRelative(-0.204f, 0.406f, -0.204f, 0.975f)
                verticalLineToRelative(0.513f)
                quadToRelative(0f, 0.563f, 0.205f, 0.973f)
                quadToRelative(0.205f, 0.406f, 0.589f, 0.627f)
                quadToRelative(0.386f, 0.216f, 0.92f, 0.216f)
                quadToRelative(0.536f, 0f, 0.917f, -0.216f)
                quadToRelative(0.383f, -0.22f, 0.588f, -0.627f)
                quadToRelative(0.205f, -0.41f, 0.205f, -0.973f)
                moveToRelative(-7.182f, 1.74f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.16f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(0.715f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.026f)
                lineToRelative(-1.14f, -2.596f)
                horizontalLineTo(0f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(9.54f, 0f)
                horizontalLineToRelative(-0.952f)
                lineToRelative(-1.34f, -3.999f)
                horizontalLineToRelative(0.918f)
                lineToRelative(0.896f, 3.138f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.888f, -3.138f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }.build()
        
        return _FiletypeMov!!
    }

private var _FiletypeMov: ImageVector? = null


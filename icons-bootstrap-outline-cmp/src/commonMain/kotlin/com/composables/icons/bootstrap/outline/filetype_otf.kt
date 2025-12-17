package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeOtf: ImageVector
    get() {
        if (_FiletypeOtf != null) return _FiletypeOtf!!
        
        _FiletypeOtf = ImageVector.Builder(
            name = "filetype-otf",
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
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
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
                moveTo(2.622f, 13.666f)
                verticalLineToRelative(0.522f)
                quadToRelative(0f, 0.384f, -0.117f, 0.641f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, -0.322f, 0.387f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.47f, 0.126f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.47f, -0.126f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, -0.32f, -0.386f)
                arcToRelative(1.55f, 1.55f, 0f, false, true, -0.117f, -0.642f)
                verticalLineToRelative(-0.522f)
                quadToRelative(0f, -0.386f, 0.117f, -0.641f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.32f, -0.387f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0.47f, -0.129f)
                quadToRelative(0.265f, 0f, 0.47f, 0.13f)
                arcToRelative(0.86f, 0.86f, 0f, false, true, 0.322f, 0.386f)
                quadToRelative(0.117f, 0.255f, 0.117f, 0.641f)
                moveToRelative(0.803f, 0.519f)
                verticalLineToRelative(-0.513f)
                quadToRelative(0f, -0.565f, -0.205f, -0.972f)
                arcToRelative(1.46f, 1.46f, 0f, false, false, -0.59f, -0.63f)
                quadToRelative(-0.38f, -0.22f, -0.916f, -0.22f)
                quadToRelative(-0.534f, 0f, -0.92f, 0.22f)
                arcToRelative(1.44f, 1.44f, 0f, false, false, -0.589f, 0.627f)
                quadTo(0f, 13.103f, 0f, 13.672f)
                verticalLineToRelative(0.513f)
                quadToRelative(0f, 0.563f, 0.205f, 0.973f)
                quadToRelative(0.205f, 0.406f, 0.589f, 0.627f)
                quadToRelative(0.386f, 0.216f, 0.92f, 0.216f)
                quadToRelative(0.536f, 0f, 0.917f, -0.216f)
                arcToRelative(1.47f, 1.47f, 0f, false, false, 0.589f, -0.627f)
                quadToRelative(0.204f, -0.41f, 0.205f, -0.973f)
                moveToRelative(2f, 1.74f)
                verticalLineToRelative(-3.337f)
                horizontalLineTo(6.56f)
                verticalLineToRelative(-0.662f)
                horizontalLineTo(3.497f)
                verticalLineToRelative(0.662f)
                horizontalLineTo(4.63f)
                verticalLineToRelative(3.337f)
                horizontalLineToRelative(0.794f)
                close()
                moveToRelative(2.251f, -1.59f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(2.548f)
                verticalLineToRelative(0.653f)
                horizontalLineTo(7.676f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.606f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypeOtf!!
    }

private var _FiletypeOtf: ImageVector? = null


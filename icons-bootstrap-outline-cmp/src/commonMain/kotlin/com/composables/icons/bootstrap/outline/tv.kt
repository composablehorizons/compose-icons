package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tv: ImageVector
    get() {
        if (_Tv != null) return _Tv!!
        
        _Tv = ImageVector.Builder(
            name = "tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 13f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(13.991f, 3f)
                lineToRelative(0.024f, 0.001f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.538f, 0.143f)
                arcToRelative(0.76f, 0.76f, 0f, false, true, 0.302f, 0.254f)
                curveToRelative(0.067f, 0.1f, 0.145f, 0.277f, 0.145f, 0.602f)
                verticalLineToRelative(5.991f)
                lineToRelative(-0.001f, 0.024f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.143f, 0.538f)
                arcToRelative(0.76f, 0.76f, 0f, false, true, -0.254f, 0.302f)
                curveToRelative(-0.1f, 0.067f, -0.277f, 0.145f, -0.602f, 0.145f)
                horizontalLineTo(2.009f)
                lineToRelative(-0.024f, -0.001f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.538f, -0.143f)
                arcToRelative(0.76f, 0.76f, 0f, false, true, -0.302f, -0.254f)
                curveTo(1.078f, 10.502f, 1f, 10.325f, 1f, 10f)
                verticalLineTo(4.009f)
                lineToRelative(0.001f, -0.024f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.143f, -0.538f)
                arcToRelative(0.76f, 0.76f, 0f, false, true, 0.254f, -0.302f)
                curveTo(1.498f, 3.078f, 1.675f, 3f, 2f, 3f)
                close()
                moveTo(14f, 2f)
                horizontalLineTo(2f)
                curveTo(0f, 2f, 0f, 4f, 0f, 4f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2f, 2f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(2f, 0f, 2f, -2f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -2f, -2f, -2f, -2f, -2f)
            }
        }.build()
        
        return _Tv!!
    }

private var _Tv: ImageVector? = null


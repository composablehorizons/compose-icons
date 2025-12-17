package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeBmp: ImageVector
    get() {
        if (_FiletypeBmp != null) return _FiletypeBmp!!
        
        _FiletypeBmp = ImageVector.Builder(
            name = "filetype-bmp",
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
                moveTo(0f, 15.849f)
                horizontalLineToRelative(1.664f)
                quadToRelative(0.408f, 0f, 0.72f, -0.132f)
                quadToRelative(0.315f, -0.135f, 0.493f, -0.386f)
                quadToRelative(0.18f, -0.253f, 0.179f, -0.61f)
                arcToRelative(1f, 1f, 0f, false, false, -0.123f, -0.51f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, -0.323f, -0.325f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.445f, -0.14f)
                verticalLineToRelative(-0.036f)
                arcToRelative(1f, 1f, 0f, false, false, 0.352f, -0.16f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.243f, -0.294f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.09f, -0.422f)
                quadToRelative(0f, -0.463f, -0.322f, -0.723f)
                quadToRelative(-0.322f, -0.261f, -0.858f, -0.261f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0.785f, -3.404f)
                horizontalLineToRelative(0.7f)
                quadToRelative(0.28f, 0f, 0.431f, 0.14f)
                quadToRelative(0.155f, 0.138f, 0.155f, 0.384f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.082f, 0.296f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.249f, 0.185f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, -0.433f, 0.064f)
                horizontalLineTo(0.785f)
                close()
                moveToRelative(0f, 1.62f)
                horizontalLineToRelative(0.75f)
                quadToRelative(0.231f, 0f, 0.393f, 0.073f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.24f, 0.211f)
                arcToRelative(0.6f, 0.6f, 0f, false, true, 0.082f, 0.325f)
                quadToRelative(0f, 0.284f, -0.205f, 0.434f)
                quadToRelative(-0.205f, 0.146f, -0.671f, 0.146f)
                horizontalLineTo(0.785f)
                close()
                moveToRelative(3.474f, 1.784f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.16f)
                horizontalLineToRelative(0.515f)
                lineToRelative(0.947f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(0.715f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.026f)
                lineToRelative(-1.14f, -2.596f)
                horizontalLineToRelative(-0.805f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(3.918f, -3.999f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.176f, 0.46f, 0.477f)
                quadToRelative(0.159f, 0.302f, 0.159f, 0.677f)
                reflectiveQuadToRelative(-0.162f, 0.677f)
                quadToRelative(-0.158f, 0.299f, -0.462f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0f, false, true, -0.733f, 0.173f)
                horizontalLineToRelative(-0.803f)
                verticalLineToRelative(1.342f)
                horizontalLineToRelative(-0.79f)
                close()
                moveToRelative(2.06f, 1.714f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.085f, -0.381f)
                quadToRelative(0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.185f, -0.182f, -0.512f, -0.182f)
                horizontalLineToRelative(-0.66f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.375f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.237f, -0.24f)
            }
        }.build()
        
        return _FiletypeBmp!!
    }

private var _FiletypeBmp: ImageVector? = null


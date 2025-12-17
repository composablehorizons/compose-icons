package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePdf: ImageVector
    get() {
        if (_FiletypePdf != null) return _FiletypePdf!!
        
        _FiletypePdf = ImageVector.Builder(
            name = "filetype-pdf",
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
                moveTo(1.6f, 11.85f)
                horizontalLineTo(0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.342f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0f, 0.732f, -0.173f)
                quadToRelative(0.305f, -0.175f, 0.463f, -0.474f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.161f, -0.677f)
                quadToRelative(0f, -0.375f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.46f, -0.477f)
                quadToRelative(-0.3f, -0.18f, -0.732f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.085f, 0.38f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, -0.238f, 0.241f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.375f, 0.082f)
                horizontalLineTo(0.788f)
                verticalLineTo(12.48f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.327f, 0f, 0.512f, 0.181f)
                quadToRelative(0.185f, 0.183f, 0.185f, 0.522f)
                moveToRelative(1.217f, -1.333f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(1.46f)
                quadToRelative(0.602f, 0f, 0.998f, -0.237f)
                arcToRelative(1.45f, 1.45f, 0f, false, false, 0.595f, -0.689f)
                quadToRelative(0.196f, -0.45f, 0.196f, -1.084f)
                quadToRelative(0f, -0.63f, -0.196f, -1.075f)
                arcToRelative(1.43f, 1.43f, 0f, false, false, -0.589f, -0.68f)
                quadToRelative(-0.396f, -0.234f, -1.005f, -0.234f)
                close()
                moveToRelative(0.791f, 0.645f)
                horizontalLineToRelative(0.563f)
                quadToRelative(0.371f, 0f, 0.609f, 0.152f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, 0.354f, 0.454f)
                quadToRelative(0.118f, 0.302f, 0.118f, 0.753f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -0.068f, 0.592f)
                arcToRelative(1.1f, 1.1f, 0f, false, true, -0.196f, 0.422f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.334f, 0.252f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -0.483f, 0.082f)
                horizontalLineToRelative(-0.563f)
                close()
                moveToRelative(3.743f, 1.763f)
                verticalLineToRelative(1.591f)
                horizontalLineToRelative(-0.79f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(2.548f)
                verticalLineToRelative(0.653f)
                horizontalLineTo(7.896f)
                verticalLineToRelative(1.117f)
                horizontalLineToRelative(1.606f)
                verticalLineToRelative(0.638f)
                close()
            }
        }.build()
        
        return _FiletypePdf!!
    }

private var _FiletypePdf: ImageVector? = null


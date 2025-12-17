package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypePpt: ImageVector
    get() {
        if (_FiletypePpt != null) return _FiletypePpt!!
        
        _FiletypePpt = ImageVector.Builder(
            name = "filetype-ppt",
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
                moveToRelative(2.817f, -1.333f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(-1.342f)
                horizontalLineToRelative(0.803f)
                quadToRelative(0.43f, 0f, 0.732f, -0.173f)
                quadToRelative(0.305f, -0.175f, 0.463f, -0.474f)
                quadToRelative(0.162f, -0.302f, 0.161f, -0.677f)
                quadToRelative(0f, -0.375f, -0.158f, -0.677f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.46f, -0.477f)
                quadToRelative(-0.3f, -0.18f, -0.732f, -0.179f)
                moveToRelative(0.545f, 1.333f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.085f, 0.38f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, -0.238f, 0.241f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.375f, 0.082f)
                horizontalLineTo(4.15f)
                verticalLineTo(12.48f)
                horizontalLineToRelative(0.66f)
                quadToRelative(0.327f, 0f, 0.512f, 0.181f)
                quadToRelative(0.185f, 0.183f, 0.185f, 0.522f)
                moveToRelative(2.767f, -0.67f)
                verticalLineToRelative(3.336f)
                horizontalLineTo(7.48f)
                verticalLineToRelative(-3.337f)
                horizontalLineTo(6.346f)
                verticalLineToRelative(-0.662f)
                horizontalLineToRelative(3.065f)
                verticalLineToRelative(0.662f)
                close()
            }
        }.build()
        
        return _FiletypePpt!!
    }

private var _FiletypePpt: ImageVector? = null


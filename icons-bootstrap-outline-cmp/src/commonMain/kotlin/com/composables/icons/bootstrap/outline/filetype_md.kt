package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeMd: ImageVector
    get() {
        if (_FiletypeMd != null) return _FiletypeMd!!
        
        _FiletypeMd = ImageVector.Builder(
            name = "filetype-md",
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
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
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
                moveTo(0.706f, 13.189f)
                verticalLineToRelative(2.66f)
                horizontalLineTo(0f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.806f)
                lineToRelative(1.14f, 2.596f)
                horizontalLineToRelative(0.026f)
                lineToRelative(1.14f, -2.596f)
                horizontalLineToRelative(0.8f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-0.716f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(-0.038f)
                lineToRelative(-0.946f, 2.159f)
                horizontalLineToRelative(-0.516f)
                lineToRelative(-0.952f, -2.16f)
                horizontalLineTo(0.706f)
                close()
                moveToRelative(3.919f, 2.66f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(1.459f)
                quadToRelative(0.609f, 0f, 1.005f, 0.234f)
                reflectiveQuadToRelative(0.589f, 0.68f)
                quadToRelative(0.195f, 0.445f, 0.196f, 1.075f)
                quadToRelative(0f, 0.634f, -0.196f, 1.084f)
                quadToRelative(-0.197f, 0.451f, -0.595f, 0.689f)
                quadToRelative(-0.396f, 0.237f, -1f, 0.237f)
                horizontalLineTo(4.626f)
                close()
                moveToRelative(1.353f, -3.354f)
                horizontalLineToRelative(-0.562f)
                verticalLineToRelative(2.707f)
                horizontalLineToRelative(0.562f)
                quadToRelative(0.279f, 0f, 0.484f, -0.082f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.334f, -0.252f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, 0.196f, -0.422f)
                quadToRelative(0.067f, -0.252f, 0.067f, -0.592f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.117f, -0.753f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.354f, -0.454f)
                quadToRelative(-0.238f, -0.152f, -0.61f, -0.152f)
            }
        }.build()
        
        return _FiletypeMd!!
    }

private var _FiletypeMd: ImageVector? = null


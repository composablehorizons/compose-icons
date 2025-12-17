package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Grid_view: ImageVector
    get() {
        if (_Grid_view != null) return _Grid_view!!
        
        _Grid_view = ImageVector.Builder(
            name = "grid_view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 3f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(3f)
                    horizontalLineTo(3f)
                    close()
                    moveToRelative(6f, 6f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    close()
                    moveToRelative(-6f, 4f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(3f)
                    close()
                    moveToRelative(6f, 6f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    close()
                    moveToRelative(4f, -16f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-8f)
                    close()
                    moveToRelative(6f, 6f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    close()
                    moveToRelative(-6f, 4f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(-8f)
                    close()
                    moveToRelative(6f, 6f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    close()
                }
            }
        }.build()
        
        return _Grid_view!!
    }

private var _Grid_view: ImageVector? = null


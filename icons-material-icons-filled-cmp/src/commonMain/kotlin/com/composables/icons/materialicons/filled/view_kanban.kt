package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.View_kanban: ImageVector
    get() {
        if (_View_kanban != null) return _View_kanban!!
        
        _View_kanban = ImageVector.Builder(
            name = "view_kanban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(9f, 17f)
                    horizontalLineTo(7f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(17f)
                    close()
                    moveTo(13f, 12f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(17f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _View_kanban!!
    }

private var _View_kanban: ImageVector? = null


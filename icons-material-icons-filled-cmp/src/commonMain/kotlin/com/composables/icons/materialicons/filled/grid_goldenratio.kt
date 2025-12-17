package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Grid_goldenratio: ImageVector
    get() {
        if (_Grid_goldenratio != null) return _Grid_goldenratio!!
        
        _Grid_goldenratio = ImageVector.Builder(
            name = "grid_goldenratio",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 11f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-7f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-7f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(22f)
                        close()
                        moveTo(13f, 13f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Grid_goldenratio!!
    }

private var _Grid_goldenratio: ImageVector? = null


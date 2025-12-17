package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Table_bar: ImageVector
    get() {
        if (_Table_bar != null) return _Table_bar!!
        
        _Table_bar = ImageVector.Builder(
            name = "table_bar",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 7.5f)
                        curveTo(22f, 5.57f, 17.52f, 4f, 12f, 4f)
                        reflectiveCurveTo(2f, 5.57f, 2f, 7.5f)
                        curveToRelative(0f, 1.81f, 3.95f, 3.31f, 9f, 3.48f)
                        verticalLineTo(15f)
                        horizontalLineTo(8f)
                        lineToRelative(-2f, 5f)
                        horizontalLineToRelative(2f)
                        lineToRelative(1.2f, -3f)
                        horizontalLineToRelative(5.6f)
                        lineToRelative(1.2f, 3f)
                        horizontalLineToRelative(2f)
                        lineToRelative(-2f, -5f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-4.02f)
                        curveTo(18.05f, 10.81f, 22f, 9.31f, 22f, 7.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Table_bar!!
    }

private var _Table_bar: ImageVector? = null


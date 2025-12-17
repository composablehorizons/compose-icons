package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Maps_home_work: ImageVector
    get() {
        if (_Maps_home_work != null) return _Maps_home_work!!
        
        _Maps_home_work = ImageVector.Builder(
            name = "maps_home_work",
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
                        moveTo(14.16f, 10.4f)
                        lineToRelative(-5f, -3.57f)
                        curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0f)
                        lineToRelative(-5f, 3.57f)
                        curveTo(1.31f, 10.78f, 1f, 11.38f, 1f, 12.03f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-7.97f)
                        curveTo(15f, 11.38f, 14.69f, 10.78f, 14.16f, 10.4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.03f, 3f)
                        horizontalLineToRelative(-9.06f)
                        curveTo(10.88f, 3f, 10f, 3.88f, 10f, 4.97f)
                        lineToRelative(0.09f, 0.09f)
                        curveToRelative(0.08f, 0.05f, 0.16f, 0.09f, 0.24f, 0.14f)
                        lineToRelative(5f, 3.57f)
                        curveToRelative(0.76f, 0.54f, 1.3f, 1.34f, 1.54f, 2.23f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(4.03f)
                        curveToRelative(1.09f, 0f, 1.97f, -0.88f, 1.97f, -1.97f)
                        verticalLineTo(4.97f)
                        curveTo(23f, 3.88f, 22.12f, 3f, 21.03f, 3f)
                        close()
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Maps_home_work!!
    }

private var _Maps_home_work: ImageVector? = null


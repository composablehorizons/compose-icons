package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.House: ImageVector
    get() {
        if (_House != null) return _House!!
        
        _House = ImageVector.Builder(
            name = "house",
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
                        moveTo(7f, 10.19f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-7.81f)
                        lineToRelative(-5f, -4.5f)
                        lineTo(7f, 10.19f)
                        close()
                        moveTo(14f, 10f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveTo(14f, 8.9f, 14f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 9.3f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(2.6f)
                        lineTo(12f, 3f)
                        lineTo(2f, 12f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(3f)
                        lineTo(19f, 9.3f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-7.81f)
                        lineToRelative(5f, -4.5f)
                        lineToRelative(5f, 4.5f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 10f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveTo(10f, 8.9f, 10f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _House!!
    }

private var _House: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Search_off: ImageVector
    get() {
        if (_Search_off != null) return _Search_off!!
        
        _Search_off = ImageVector.Builder(
            name = "search_off",
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
                        moveTo(15.5f, 14f)
                        horizontalLineToRelative(-0.79f)
                        lineToRelative(-0.28f, -0.27f)
                        curveTo(15.41f, 12.59f, 16f, 11.11f, 16f, 9.5f)
                        curveTo(16f, 5.91f, 13.09f, 3f, 9.5f, 3f)
                        curveTo(6.08f, 3f, 3.28f, 5.64f, 3.03f, 9f)
                        horizontalLineToRelative(2.02f)
                        curveTo(5.3f, 6.75f, 7.18f, 5f, 9.5f, 5f)
                        curveTo(11.99f, 5f, 14f, 7.01f, 14f, 9.5f)
                        reflectiveCurveTo(11.99f, 14f, 9.5f, 14f)
                        curveToRelative(-0.17f, 0f, -0.33f, -0.03f, -0.5f, -0.05f)
                        verticalLineToRelative(2.02f)
                        curveTo(9.17f, 15.99f, 9.33f, 16f, 9.5f, 16f)
                        curveToRelative(1.61f, 0f, 3.09f, -0.59f, 4.23f, -1.57f)
                        lineTo(14f, 14.71f)
                        verticalLineToRelative(0.79f)
                        lineToRelative(5f, 4.99f)
                        lineTo(20.49f, 19f)
                        lineTo(15.5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.47f, 10.82f)
                        lineTo(4f, 13.29f)
                        lineTo(1.53f, 10.82f)
                        lineTo(0.82f, 11.53f)
                        lineTo(3.29f, 14f)
                        lineTo(0.82f, 16.47f)
                        lineTo(1.53f, 17.18f)
                        lineTo(4f, 14.71f)
                        lineTo(6.47f, 17.18f)
                        lineTo(7.18f, 16.47f)
                        lineTo(4.71f, 14f)
                        lineTo(7.18f, 11.53f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Search_off!!
    }

private var _Search_off: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Home_work: ImageVector
    get() {
        if (_Home_work != null) return _Home_work!!
        
        _Home_work = ImageVector.Builder(
            name = "home_work",
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
                        moveTo(20f, 3f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1.61f)
                        curveToRelative(0f, 0f, 0f, 0f, 0.01f, 0.01f)
                        lineToRelative(5f, 4.5f)
                        curveTo(16.64f, 10.68f, 17f, 11.5f, 17f, 12.35f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(4f)
                        curveTo(21f, 3.45f, 20.55f, 3f, 20f, 3f)
                        close()
                        moveTo(15f, 7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(7f)
                        close()
                        moveTo(19f, 11f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11f)
                        close()
                        moveTo(19f, 7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 20f)
                        verticalLineToRelative(-7.65f)
                        curveToRelative(0f, -0.28f, -0.12f, -0.55f, -0.33f, -0.74f)
                        lineToRelative(-5f, -4.5f)
                        curveTo(9.48f, 6.93f, 9.24f, 6.85f, 9f, 6.85f)
                        curveToRelative(-0.24f, 0f, -0.48f, 0.09f, -0.67f, 0.26f)
                        lineToRelative(-5f, 4.5f)
                        curveTo(3.12f, 11.79f, 3f, 12.06f, 3f, 12.35f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveTo(14.55f, 21f, 15f, 20.55f, 15f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Home_work!!
    }

private var _Home_work: ImageVector? = null


package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Badge: ImageVector
    get() {
        if (_Badge != null) return _Badge!!
        
        _Badge = ImageVector.Builder(
            name = "badge",
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
                        moveTo(14f, 12f)
                        horizontalLineTo(18f)
                        verticalLineTo(13.5f)
                        horizontalLineTo(14f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 15f)
                        horizontalLineTo(18f)
                        verticalLineTo(16.5f)
                        horizontalLineTo(14f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 7f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-2f)
                        curveTo(9.9f, 2f, 9f, 2.9f, 9f, 4f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9f)
                        curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                        close()
                        moveTo(11f, 7f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 15f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.08f, 16.18f)
                        curveTo(10.44f, 15.9f, 9.74f, 15.75f, 9f, 15.75f)
                        reflectiveCurveToRelative(-1.44f, 0.15f, -2.08f, 0.43f)
                        curveTo(6.36f, 16.42f, 6f, 16.96f, 6f, 17.57f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-0.43f)
                        curveTo(12f, 16.96f, 11.64f, 16.42f, 11.08f, 16.18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Badge!!
    }

private var _Badge: ImageVector? = null


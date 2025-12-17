package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Group_add: ImageVector
    get() {
        if (_Group_add != null) return _Group_add!!
        
        _Group_add = ImageVector.Builder(
            name = "group_add",
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
                        moveTo(8f, 15f)
                        curveToRelative(-2.7f, 0f, -5.8f, 1.29f, -6f, 2.01f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-1f)
                        curveTo(13.8f, 16.29f, 10.7f, 15f, 8f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 10f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 9f)
                        lineTo(22f, 7f)
                        lineTo(20f, 7f)
                        lineTo(20f, 9f)
                        lineTo(18f, 9f)
                        lineTo(18f, 11f)
                        lineTo(20f, 11f)
                        lineTo(20f, 13f)
                        lineTo(22f, 13f)
                        lineTo(22f, 11f)
                        lineTo(24f, 11f)
                        lineTo(24f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 12f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                        reflectiveCurveTo(4f, 5.79f, 4f, 8f)
                        reflectiveCurveTo(5.79f, 12f, 8f, 12f)
                        close()
                        moveTo(8f, 6f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                        reflectiveCurveTo(6f, 9.1f, 6f, 8f)
                        reflectiveCurveTo(6.9f, 6f, 8f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 13f)
                        curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-3f)
                        curveTo(16f, 14.34f, 10.67f, 13f, 8f, 13f)
                        close()
                        moveTo(14f, 18f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(-0.99f)
                        curveTo(2.2f, 16.29f, 5.3f, 15f, 8f, 15f)
                        reflectiveCurveToRelative(5.8f, 1.29f, 6f, 2f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.51f, 4.05f)
                        curveTo(13.43f, 5.11f, 14f, 6.49f, 14f, 8f)
                        reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f)
                        curveTo(14.47f, 11.7f, 16f, 10.04f, 16f, 8f)
                        reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.53f, 13.83f)
                        curveTo(17.42f, 14.66f, 18f, 15.7f, 18f, 17f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        curveTo(20f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Group_add!!
    }

private var _Group_add: ImageVector? = null


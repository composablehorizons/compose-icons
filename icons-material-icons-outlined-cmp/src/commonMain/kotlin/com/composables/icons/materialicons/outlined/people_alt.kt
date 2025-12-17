package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.People_alt: ImageVector
    get() {
        if (_People_alt != null) return _People_alt!!
        
        _People_alt = ImageVector.Builder(
            name = "people_alt",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.67f, 13.13f)
                        curveTo(18.04f, 14.06f, 19f, 15.32f, 19f, 17f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-3f)
                        curveTo(23f, 14.82f, 19.43f, 13.53f, 16.67f, 13.13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 12f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        curveToRelative(-0.47f, 0f, -0.91f, 0.1f, -1.33f, 0.24f)
                        curveTo(14.5f, 5.27f, 15f, 6.58f, 15f, 8f)
                        reflectiveCurveToRelative(-0.5f, 2.73f, -1.33f, 3.76f)
                        curveTo(14.09f, 11.9f, 14.53f, 12f, 15f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 12f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveTo(5f, 5.79f, 5f, 8f)
                        curveTo(5f, 10.21f, 6.79f, 12f, 9f, 12f)
                        close()
                        moveTo(9f, 6f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveTo(7f, 9.1f, 7f, 8f)
                        curveTo(7f, 6.9f, 7.9f, 6f, 9f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 13f)
                        curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-3f)
                        curveTo(17f, 14.34f, 11.67f, 13f, 9f, 13f)
                        close()
                        moveTo(15f, 18f)
                        horizontalLineTo(3f)
                        lineToRelative(0f, -0.99f)
                        curveTo(3.2f, 16.29f, 6.3f, 15f, 9f, 15f)
                        reflectiveCurveToRelative(5.8f, 1.29f, 6f, 2f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _People_alt!!
    }

private var _People_alt: ImageVector? = null


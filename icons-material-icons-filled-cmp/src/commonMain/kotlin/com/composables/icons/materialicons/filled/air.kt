package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Air: ImageVector
    get() {
        if (_Air != null) return _Air!!
        
        _Air = ImageVector.Builder(
            name = "air",
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
                        moveTo(14.5f, 17f)
                        curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(9.5f)
                        curveTo(13.15f, 14f, 14.5f, 15.35f, 14.5f, 17f)
                        close()
                        moveTo(19f, 6.5f)
                        curveTo(19f, 4.57f, 17.43f, 3f, 15.5f, 3f)
                        reflectiveCurveTo(12f, 4.57f, 12f, 6.5f)
                        horizontalLineToRelative(2f)
                        curveTo(14f, 5.67f, 14.67f, 5f, 15.5f, 5f)
                        reflectiveCurveTo(17f, 5.67f, 17f, 6.5f)
                        reflectiveCurveTo(16.33f, 8f, 15.5f, 8f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(13.5f)
                        curveTo(17.43f, 10f, 19f, 8.43f, 19f, 6.5f)
                        close()
                        moveTo(18.5f, 11f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(16.5f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(19.33f, 16f, 18.5f, 16f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(20.43f, 11f, 18.5f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Air!!
    }

private var _Air: ImageVector? = null


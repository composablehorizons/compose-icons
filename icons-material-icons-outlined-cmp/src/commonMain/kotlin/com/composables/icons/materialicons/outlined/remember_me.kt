package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Remember_me: ImageVector
    get() {
        if (_Remember_me != null) return _Remember_me!!
        
        _Remember_me = ImageVector.Builder(
            name = "remember_me",
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
                        moveTo(17f, 1f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                        close()
                        moveTo(17f, 21f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(21f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-0.48f)
                        curveTo(8.47f, 16.53f, 10.22f, 16f, 12f, 16f)
                        reflectiveCurveToRelative(3.53f, 0.53f, 5f, 1.52f)
                        verticalLineTo(18f)
                        close()
                        moveTo(17f, 15.21f)
                        curveTo(15.5f, 14.44f, 13.8f, 14f, 12f, 14f)
                        reflectiveCurveToRelative(-3.5f, 0.44f, -5f, 1.21f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(15.21f)
                        close()
                        moveTo(17f, 4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 13f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                        reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                        reflectiveCurveTo(10.34f, 13f, 12f, 13f)
                        close()
                        moveTo(12f, 9f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(11.45f, 9f, 12f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Remember_me!!
    }

private var _Remember_me: ImageVector? = null


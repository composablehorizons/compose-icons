package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cleaning_services: ImageVector
    get() {
        if (_Cleaning_services != null) return _Cleaning_services!!
        
        _Cleaning_services = ImageVector.Builder(
            name = "cleaning_services",
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
                        moveTo(11f, 3f)
                        horizontalLineTo(13f)
                        verticalLineTo(11f)
                        horizontalLineTo(11f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13f)
                        horizontalLineTo(8f)
                        curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-5f)
                        curveTo(19f, 14.35f, 17.65f, 13f, 16f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 11f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-2f)
                        curveTo(9.9f, 1f, 9f, 1.9f, 9f, 3f)
                        verticalLineToRelative(8f)
                        horizontalLineTo(8f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(18f)
                        verticalLineToRelative(-7f)
                        curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                        close()
                        moveTo(11f, 3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        close()
                        moveTo(19f, 21f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                        verticalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cleaning_services!!
    }

private var _Cleaning_services: ImageVector? = null


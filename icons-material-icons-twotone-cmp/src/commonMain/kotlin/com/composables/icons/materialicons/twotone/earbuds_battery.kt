package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Earbuds_battery: ImageVector
    get() {
        if (_Earbuds_battery != null) return _Earbuds_battery!!
        
        _Earbuds_battery = ImageVector.Builder(
            name = "earbuds_battery",
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
                        moveTo(18f, 9f)
                        horizontalLineTo(20f)
                        verticalLineTo(16f)
                        horizontalLineTo(18f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.62f, 6f)
                        curveTo(8.76f, 6f, 7.25f, 7.51f, 7.25f, 9.38f)
                        verticalLineToRelative(5.25f)
                        curveToRelative(0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f)
                        reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f)
                        verticalLineToRelative(-4.7f)
                        curveTo(3.66f, 9.97f, 3.83f, 10f, 4f, 10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveTo(5.1f, 6f, 4f, 6f)
                        reflectiveCurveTo(2f, 6.9f, 2f, 8f)
                        curveToRelative(0f, 0.04f, 0f, 6.62f, 0f, 6.62f)
                        curveTo(2f, 16.49f, 3.51f, 18f, 5.38f, 18f)
                        reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f)
                        verticalLineTo(9.38f)
                        curveToRelative(0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f)
                        reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f)
                        verticalLineToRelative(4.7f)
                        curveTo(12.34f, 14.03f, 12.17f, 14f, 12f, 14f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -0.04f, 0f, -6.62f, 0f, -6.62f)
                        curveTo(14f, 7.51f, 12.49f, 6f, 10.62f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 7f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(8f)
                        curveTo(22f, 7.45f, 21.55f, 7f, 21f, 7f)
                        close()
                        moveTo(20f, 16f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Earbuds_battery!!
    }

private var _Earbuds_battery: ImageVector? = null


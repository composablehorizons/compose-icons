package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bloodtype: ImageVector
    get() {
        if (_Bloodtype != null) return _Bloodtype!!
        
        _Bloodtype = ImageVector.Builder(
            name = "bloodtype",
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
                        moveTo(12f, 4.67f)
                        curveToRelative(-4.05f, 3.7f, -6f, 6.79f, -6f, 9.14f)
                        curveToRelative(0f, 3.63f, 2.65f, 6.2f, 6f, 6.2f)
                        reflectiveCurveToRelative(6f, -2.57f, 6f, -6.2f)
                        curveTo(18f, 11.46f, 16.05f, 8.36f, 12f, 4.67f)
                        close()
                        moveTo(15f, 18f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(18f)
                        close()
                        moveTo(15f, 13f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 16f)
                        horizontalLineTo(15f)
                        verticalLineTo(18f)
                        horizontalLineTo(9f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 9f)
                        lineTo(11f, 9f)
                        lineTo(11f, 11f)
                        lineTo(9f, 11f)
                        lineTo(9f, 13f)
                        lineTo(11f, 13f)
                        lineTo(11f, 15f)
                        lineTo(13f, 15f)
                        lineTo(13f, 13f)
                        lineTo(15f, 13f)
                        lineTo(15f, 11f)
                        lineTo(13f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveToRelative(-5.33f, 4.55f, -8f, 8.48f, -8f, 11.8f)
                        curveToRelative(0f, 4.98f, 3.8f, 8.2f, 8f, 8.2f)
                        reflectiveCurveToRelative(8f, -3.22f, 8f, -8.2f)
                        curveTo(20f, 10.48f, 17.33f, 6.55f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-3.35f, 0f, -6f, -2.57f, -6f, -6.2f)
                        curveToRelative(0f, -2.34f, 1.95f, -5.44f, 6f, -9.14f)
                        curveToRelative(4.05f, 3.7f, 6f, 6.79f, 6f, 9.14f)
                        curveTo(18f, 17.43f, 15.35f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bloodtype!!
    }

private var _Bloodtype: ImageVector? = null


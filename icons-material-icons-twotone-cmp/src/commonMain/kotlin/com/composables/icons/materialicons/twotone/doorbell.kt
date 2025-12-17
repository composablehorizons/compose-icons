package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Doorbell: ImageVector
    get() {
        if (_Doorbell != null) return _Doorbell!!
        
        _Doorbell = ImageVector.Builder(
            name = "doorbell",
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
                        moveTo(6f, 10f)
                        verticalLineToRelative(9f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-9f)
                        lineToRelative(-6f, -4.5f)
                        lineTo(6f, 10f)
                        close()
                        moveTo(12f, 17.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        horizontalLineToRelative(2f)
                        curveTo(13f, 17.05f, 12.55f, 17.5f, 12f, 17.5f)
                        close()
                        moveTo(12.75f, 9.25f)
                        verticalLineTo(9.5f)
                        curveTo(14.19f, 9.84f, 15f, 11.12f, 15f, 12.66f)
                        verticalLineTo(15f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-2.34f)
                        curveToRelative(0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f)
                        verticalLineTo(9.25f)
                        curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                        reflectiveCurveTo(12.75f, 8.84f, 12.75f, 9.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 3f)
                        lineTo(4f, 9f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(9f)
                        lineTo(12f, 3f)
                        close()
                        moveTo(18f, 19f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-9f)
                        lineToRelative(6f, -4.5f)
                        lineToRelative(6f, 4.5f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.25f, 9.25f)
                        verticalLineTo(9.5f)
                        curveTo(9.82f, 9.84f, 9f, 11.12f, 9f, 12.66f)
                        verticalLineTo(15f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(-2.34f)
                        curveToRelative(0f, -1.54f, -0.81f, -2.82f, -2.25f, -3.16f)
                        verticalLineTo(9.25f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveTo(11.25f, 8.84f, 11.25f, 9.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 17.5f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveTo(11f, 17.05f, 11.45f, 17.5f, 12f, 17.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Doorbell!!
    }

private var _Doorbell: ImageVector? = null


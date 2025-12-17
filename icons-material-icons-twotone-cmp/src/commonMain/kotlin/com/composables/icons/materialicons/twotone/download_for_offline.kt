package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Download_for_offline: ImageVector
    get() {
        if (_Download_for_offline != null) return _Download_for_offline!!
        
        _Download_for_offline = ImageVector.Builder(
            name = "download_for_offline",
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
                        moveTo(12f, 4f)
                        curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                        curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                        reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                        curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                        close()
                        moveTo(11f, 10f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(3f)
                        lineToRelative(-4f, 4f)
                        lineToRelative(-4f, -4f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(17f, 17f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 10f)
                        lineTo(13f, 10f)
                        lineTo(13f, 6f)
                        lineTo(11f, 6f)
                        lineTo(11f, 10f)
                        lineTo(8f, 10f)
                        lineTo(12f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 15f)
                        horizontalLineTo(17f)
                        verticalLineTo(17f)
                        horizontalLineTo(7f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                        reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                        reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Download_for_offline!!
    }

private var _Download_for_offline: ImageVector? = null


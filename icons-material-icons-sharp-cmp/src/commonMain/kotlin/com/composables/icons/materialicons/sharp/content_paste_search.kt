package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Content_paste_search: ImageVector
    get() {
        if (_Content_paste_search != null) return _Content_paste_search!!
        
        _Content_paste_search = ImageVector.Builder(
            name = "content_paste_search",
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
                        moveTo(5f, 5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-6.18f)
                        curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                        reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                        moveTo(12f, 3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.3f, 18.9f)
                        curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f)
                        curveToRelative(0f, -2.5f, -2f, -4.5f, -4.5f, -4.5f)
                        reflectiveCurveTo(12f, 14f, 12f, 16.5f)
                        reflectiveCurveToRelative(2f, 4.5f, 4.5f, 4.5f)
                        curveToRelative(0.9f, 0f, 1.7f, -0.3f, 2.4f, -0.7f)
                        lineToRelative(2.7f, 2.7f)
                        lineToRelative(1.4f, -1.4f)
                        lineTo(20.3f, 18.9f)
                        close()
                        moveTo(16.5f, 19f)
                        curveToRelative(-1.4f, 0f, -2.5f, -1.1f, -2.5f, -2.5f)
                        curveToRelative(0f, -1.4f, 1.1f, -2.5f, 2.5f, -2.5f)
                        reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f)
                        curveTo(19f, 17.9f, 17.9f, 19f, 16.5f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Content_paste_search!!
    }

private var _Content_paste_search: ImageVector? = null


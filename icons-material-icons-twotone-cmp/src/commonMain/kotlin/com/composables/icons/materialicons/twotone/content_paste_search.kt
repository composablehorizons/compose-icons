package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Content_paste_search: ImageVector
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
                        moveTo(10f, 16.5f)
                        curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                        curveToRelative(0.89f, 0f, 1.73f, 0.18f, 2.5f, 0.5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(7f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(5.5f)
                        curveTo(10.18f, 18.23f, 10f, 17.39f, 10f, 16.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5.5f)
                        curveToRelative(0.75f, 0.31f, 1.42f, 0.76f, 2f, 1.32f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4.18f)
                        curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                        reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6.82f)
                        curveTo(11.27f, 20.42f, 10.81f, 19.75f, 10.5f, 19f)
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


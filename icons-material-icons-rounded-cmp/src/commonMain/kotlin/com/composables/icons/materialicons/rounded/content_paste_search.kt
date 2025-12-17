package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Content_paste_search: ImageVector
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
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4.18f)
                        curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                        reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(5f)
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
                        moveTo(22.3f, 20.9f)
                        lineToRelative(-2f, -2f)
                        curveToRelative(0.58f, -1.01f, 0.95f, -2.23f, 0.51f, -3.65f)
                        curveToRelative(-0.53f, -1.72f, -2.04f, -3.05f, -3.84f, -3.22f)
                        curveToRelative(-2.87f, -0.28f, -5.23f, 2.07f, -4.95f, 4.95f)
                        curveToRelative(0.18f, 1.79f, 1.5f, 3.31f, 3.22f, 3.84f)
                        curveToRelative(1.43f, 0.44f, 2.64f, 0.07f, 3.65f, -0.51f)
                        lineToRelative(2f, 2f)
                        curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                        reflectiveCurveTo(22.69f, 21.29f, 22.3f, 20.9f)
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


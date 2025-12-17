package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Content_paste_go: ImageVector
    get() {
        if (_Content_paste_go != null) return _Content_paste_go!!
        
        _Content_paste_go = ImageVector.Builder(
            name = "content_paste_go",
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
                        verticalLineToRelative(6f)
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
                        moveTo(18.01f, 13f)
                        lineTo(16.59f, 14.41f)
                        lineTo(18.17f, 15.99f)
                        lineTo(12f, 15.99f)
                        lineTo(12f, 17.99f)
                        lineTo(18.17f, 17.99f)
                        lineTo(16.59f, 19.58f)
                        lineTo(18.01f, 20.99f)
                        lineTo(22f, 16.99f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Content_paste_go!!
    }

private var _Content_paste_go: ImageVector? = null


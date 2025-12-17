package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hevc: ImageVector
    get() {
        if (_Hevc != null) return _Hevc!!
        
        _Hevc = ImageVector.Builder(
            name = "hevc",
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
                        moveTo(5.5f, 11f)
                        lineTo(4.5f, 11f)
                        lineTo(4.5f, 9f)
                        lineTo(3f, 9f)
                        lineTo(3f, 15f)
                        lineTo(4.5f, 15f)
                        lineTo(4.5f, 12.5f)
                        lineTo(5.5f, 12.5f)
                        lineTo(5.5f, 15f)
                        lineTo(7f, 15f)
                        lineTo(7f, 9f)
                        lineTo(5.5f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 11f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(0.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(11f)
                        horizontalLineTo(21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.25f, 13.5f)
                        lineTo(13.5f, 9f)
                        lineTo(12f, 9f)
                        lineTo(13f, 15f)
                        lineTo(15.5f, 15f)
                        lineTo(16.5f, 9f)
                        lineTo(15f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 9f)
                        lineTo(8f, 15f)
                        lineTo(11.5f, 15f)
                        lineTo(11.5f, 13.5f)
                        lineTo(9.5f, 13.5f)
                        lineTo(9.5f, 12.5f)
                        lineTo(11.5f, 12.5f)
                        lineTo(11.5f, 11f)
                        lineTo(9.5f, 11f)
                        lineTo(9.5f, 10.5f)
                        lineTo(11.5f, 10.5f)
                        lineTo(11.5f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hevc!!
    }

private var _Hevc: ImageVector? = null


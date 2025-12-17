package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Read_more: ImageVector
    get() {
        if (_Read_more != null) return _Read_more!!
        
        _Read_more = ImageVector.Builder(
            name = "read_more",
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
                        moveTo(14f, 9f)
                        horizontalLineToRelative(7f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveTo(13f, 8.55f, 13.45f, 9f, 14f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 15f)
                        horizontalLineToRelative(-7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(7f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(22f, 15.45f, 21.55f, 15f, 21f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 11f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(22f, 11.45f, 21.55f, 11f, 21f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.85f, 7.85f)
                        curveTo(8.54f, 7.54f, 8f, 7.76f, 8f, 8.21f)
                        verticalLineTo(11f)
                        horizontalLineTo(3f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(2.79f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                        lineToRelative(3.79f, -3.79f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineTo(8.85f, 7.85f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Read_more!!
    }

private var _Read_more: ImageVector? = null


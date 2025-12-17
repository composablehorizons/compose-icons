package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Biotech: ImageVector
    get() {
        if (_Biotech != null) return _Biotech!!
        
        _Biotech = ImageVector.Builder(
            name = "biotech",
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
                        moveTo(11.924755f, 4.8613377f)
                        lineTo(12.864455f, 4.5193377f)
                        lineTo(14.574455f, 9.217837f)
                        lineTo(13.634755f, 9.559837f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 10.5f, 9f)
                        arcTo(1f, 1f, 0f, false, true, 9.5f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 11.5f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 19f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        curveToRelative(0f, -1.09f, 0.59f, -2.04f, 1.47f, -2.57f)
                        curveToRelative(0.41f, 0.59f, 1.06f, 1f, 1.83f, 1.06f)
                        curveToRelative(0.7f, 0.06f, 1.36f, -0.19f, 1.85f, -0.62f)
                        lineToRelative(0.59f, 1.61f)
                        lineToRelative(0.94f, -0.34f)
                        lineToRelative(0.34f, 0.94f)
                        lineToRelative(1.88f, -0.68f)
                        lineToRelative(-0.34f, -0.94f)
                        lineToRelative(0.94f, -0.34f)
                        lineTo(13.76f, 2.6f)
                        lineToRelative(-0.94f, 0.34f)
                        lineTo(12.48f, 2f)
                        lineTo(10.6f, 2.68f)
                        lineToRelative(0.34f, 0.94f)
                        lineTo(10f, 3.97f)
                        lineToRelative(0.56f, 1.55f)
                        curveTo(9.39f, 5.48f, 8.37f, 6.27f, 8.08f, 7.38f)
                        curveTo(6.27f, 8.14f, 5f, 9.92f, 5f, 12f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(12.86f, 4.52f)
                        lineToRelative(1.71f, 4.7f)
                        lineToRelative(-0.94f, 0.34f)
                        lineToRelative(-1.71f, -4.7f)
                        lineTo(12.86f, 4.52f)
                        close()
                        moveTo(10.5f, 7f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveTo(9.5f, 7.45f, 9.95f, 7f, 10.5f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null


package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Biotech: ImageVector
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
                        moveTo(13f, 19f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        curveToRelative(0f, -1.09f, 0.59f, -2.04f, 1.46f, -2.56f)
                        curveTo(8.17f, 9.03f, 8f, 8.54f, 8f, 8f)
                        curveToRelative(0f, -0.21f, 0.04f, -0.42f, 0.09f, -0.62f)
                        curveTo(6.28f, 8.13f, 5f, 9.92f, 5f, 12f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.56f, 5.51f)
                        curveTo(11.91f, 5.54f, 13f, 6.64f, 13f, 8f)
                        curveToRelative(0f, 0.75f, -0.33f, 1.41f, -0.85f, 1.87f)
                        lineToRelative(0.59f, 1.62f)
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
                        lineTo(10.56f, 5.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 9.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 8f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Biotech!!
    }

private var _Biotech: ImageVector? = null


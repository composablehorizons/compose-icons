package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sports_cricket: ImageVector
    get() {
        if (_Sports_cricket != null) return _Sports_cricket!!
        
        _Sports_cricket = ImageVector.Builder(
            name = "sports_cricket",
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
                        moveTo(4.4140716f, 7.8394003f)
                        lineTo(5.835343f, 6.418129f)
                        lineTo(12.920485f, 13.503271f)
                        lineTo(11.499214f, 14.924542f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 5.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18.5f, 7f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 5.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 20f, 5.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.04f, 12.79f)
                        lineToRelative(-8.5f, -8.5f)
                        curveTo(6.35f, 4.1f, 6.09f, 4f, 5.83f, 4f)
                        reflectiveCurveTo(5.32f, 4.1f, 5.13f, 4.29f)
                        lineTo(2.29f, 7.13f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                        lineToRelative(8.5f, 8.5f)
                        curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                        curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                        lineToRelative(2.83f, -2.83f)
                        curveTo(15.43f, 13.82f, 15.43f, 13.18f, 15.04f, 12.79f)
                        close()
                        moveTo(11.5f, 14.92f)
                        lineTo(4.41f, 7.83f)
                        lineToRelative(1.42f, -1.42f)
                        lineToRelative(7.09f, 7.09f)
                        lineTo(11.5f, 14.92f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.341213f, 17.7562f)
                        lineTo(15.755413f, 16.342001f)
                        lineTo(19.998014f, 20.584602f)
                        lineTo(18.583815f, 21.998802f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 2f)
                        curveTo(16.57f, 2f, 15f, 3.57f, 15f, 5.5f)
                        curveTo(15f, 7.43f, 16.57f, 9f, 18.5f, 9f)
                        reflectiveCurveTo(22f, 7.43f, 22f, 5.5f)
                        curveTo(22f, 3.57f, 20.43f, 2f, 18.5f, 2f)
                        close()
                        moveTo(18.5f, 7f)
                        curveTo(17.67f, 7f, 17f, 6.33f, 17f, 5.5f)
                        reflectiveCurveTo(17.67f, 4f, 18.5f, 4f)
                        reflectiveCurveTo(20f, 4.67f, 20f, 5.5f)
                        reflectiveCurveTo(19.33f, 7f, 18.5f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_cricket!!
    }

private var _Sports_cricket: ImageVector? = null


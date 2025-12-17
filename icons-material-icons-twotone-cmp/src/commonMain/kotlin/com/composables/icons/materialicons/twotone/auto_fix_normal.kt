package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Auto_fix_normal: ImageVector
    get() {
        if (_Auto_fix_normal != null) return _Auto_fix_normal!!
        
        _Auto_fix_normal = ImageVector.Builder(
            name = "auto_fix_normal",
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
                        moveTo(4.4149027f, 18.166615f)
                        lineTo(11.584897f, 10.99662f)
                        lineTo(12.999097f, 12.410821f)
                        lineTo(5.8291035f, 19.580814f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 7f)
                        lineTo(20.94f, 4.94f)
                        lineTo(23f, 4f)
                        lineTo(20.94f, 3.06f)
                        lineTo(20f, 1f)
                        lineTo(19.06f, 3.06f)
                        lineTo(17f, 4f)
                        lineTo(19.06f, 4.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.71f, 9.12f)
                        lineToRelative(-2.83f, -2.83f)
                        curveTo(14.68f, 6.1f, 14.43f, 6f, 14.17f, 6f)
                        curveToRelative(-0.26f, 0f, -0.51f, 0.1f, -0.71f, 0.29f)
                        lineTo(2.29f, 17.46f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.83f, 2.83f)
                        curveTo(5.32f, 21.9f, 5.57f, 22f, 5.83f, 22f)
                        reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                        lineToRelative(11.17f, -11.17f)
                        curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f)
                        close()
                        moveTo(5.83f, 19.59f)
                        lineToRelative(-1.41f, -1.41f)
                        lineTo(11.59f, 11f)
                        lineTo(13f, 12.41f)
                        lineTo(5.83f, 19.59f)
                        close()
                        moveTo(14.41f, 11f)
                        lineTo(13f, 9.59f)
                        lineToRelative(1.17f, -1.17f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.41f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_normal!!
    }

private var _Auto_fix_normal: ImageVector? = null


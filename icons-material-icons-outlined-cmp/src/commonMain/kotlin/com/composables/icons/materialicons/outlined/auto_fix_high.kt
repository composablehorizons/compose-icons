package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Auto_fix_high: ImageVector
    get() {
        if (_Auto_fix_high != null) return _Auto_fix_high!!
        
        _Auto_fix_high = ImageVector.Builder(
            name = "auto_fix_high",
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
                        moveTo(8.5f, 7f)
                        lineTo(9.44f, 4.94f)
                        lineTo(11.5f, 4f)
                        lineTo(9.44f, 3.06f)
                        lineTo(8.5f, 1f)
                        lineTo(7.56f, 3.06f)
                        lineTo(5.5f, 4f)
                        lineTo(7.56f, 4.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 12.5f)
                        lineTo(19.06f, 14.56f)
                        lineTo(17f, 15.5f)
                        lineTo(19.06f, 16.44f)
                        lineTo(20f, 18.5f)
                        lineTo(20.94f, 16.44f)
                        lineTo(23f, 15.5f)
                        lineTo(20.94f, 14.56f)
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
                        moveTo(14.17f, 8.42f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.41f, 11f)
                        lineTo(13f, 9.59f)
                        lineTo(14.17f, 8.42f)
                        close()
                        moveTo(5.83f, 19.59f)
                        lineToRelative(-1.41f, -1.41f)
                        lineTo(11.59f, 11f)
                        lineTo(13f, 12.41f)
                        lineTo(5.83f, 19.59f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_high!!
    }

private var _Auto_fix_high: ImageVector? = null


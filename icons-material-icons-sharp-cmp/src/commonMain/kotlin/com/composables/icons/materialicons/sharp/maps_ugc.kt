package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Maps_ugc: ImageVector
    get() {
        if (_Maps_ugc != null) return _Maps_ugc!!
        
        _Maps_ugc = ImageVector.Builder(
            name = "maps_ugc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 4f)
                    curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                    reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                    curveToRelative(-1.18f, 0f, -2.34f, -0.26f, -3.43f, -0.78f)
                    curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f)
                    curveToRelative(-0.19f, 0f, -0.38f, 0.03f, -0.56f, 0.08f)
                    lineToRelative(-3.2f, 0.94f)
                    lineToRelative(0.94f, -3.2f)
                    curveToRelative(0.14f, -0.47f, 0.1f, -0.98f, -0.11f, -1.42f)
                    curveTo(4.26f, 14.34f, 4f, 13.18f, 4f, 12f)
                    curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f)
                    lineTo(1f, 23f)
                    lineToRelative(6.71f, -1.97f)
                    curveTo(9.02f, 21.64f, 10.46f, 22f, 12f, 22f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    lineTo(12f, 2f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 11f)
                lineTo(8f, 11f)
                lineTo(8f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 16f)
                lineTo(13f, 16f)
                lineTo(13f, 13f)
                lineTo(16f, 13f)
                lineTo(16f, 11f)
                lineTo(13f, 11f)
                close()
            }
        }.build()
        
        return _Maps_ugc!!
    }

private var _Maps_ugc: ImageVector? = null


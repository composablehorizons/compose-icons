package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Maps_ugc: ImageVector
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
                    curveToRelative(4.97f, 0f, 8.9f, 4.56f, 7.82f, 9.72f)
                    curveToRelative(-0.68f, 3.23f, -3.4f, 5.74f, -6.67f, 6.2f)
                    curveToRelative(-1.59f, 0.22f, -3.14f, -0.01f, -4.58f, -0.7f)
                    curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f)
                    curveToRelative(-0.19f, 0f, -0.38f, 0.03f, -0.56f, 0.08f)
                    lineToRelative(-2.31f, 0.68f)
                    curveToRelative(-0.38f, 0.11f, -0.74f, -0.24f, -0.63f, -0.63f)
                    lineToRelative(0.7f, -2.39f)
                    curveToRelative(0.13f, -0.45f, 0.07f, -0.92f, -0.14f, -1.35f)
                    curveTo(4.26f, 14.34f, 4f, 13.18f, 4f, 12f)
                    curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f)
                    lineToRelative(-1.46f, 4.96f)
                    curveTo(1.29f, 22f, 2f, 22.71f, 2.76f, 22.48f)
                    lineToRelative(4.96f, -1.46f)
                    curveToRelative(1.66f, 0.79f, 3.56f, 1.15f, 5.58f, 0.89f)
                    curveToRelative(4.56f, -0.59f, 8.21f, -4.35f, 8.66f, -8.92f)
                    curveTo(22.53f, 7.03f, 17.85f, 2f, 12f, 2f)
                    lineTo(12f, 2f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                lineTo(12f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                curveTo(13f, 8.45f, 12.55f, 8f, 12f, 8f)
                close()
            }
        }.build()
        
        return _Maps_ugc!!
    }

private var _Maps_ugc: ImageVector? = null


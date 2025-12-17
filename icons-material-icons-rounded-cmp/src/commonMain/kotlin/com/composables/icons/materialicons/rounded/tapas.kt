package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tapas: ImageVector
    get() {
        if (_Tapas != null) return _Tapas!!
        
        _Tapas = ImageVector.Builder(
            name = "tapas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 10f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(21f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.14f)
                curveTo(20.72f, 13.41f, 22f, 11.86f, 22f, 10f)
                close()
                moveTo(20f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                close()
                moveTo(9.86f, 9f)
                lineTo(8f, 9f)
                verticalLineTo(8f)
                lineToRelative(1.86f, 0f)
                curveToRelative(1.31f, 0f, 2.5f, -0.94f, 2.63f, -2.24f)
                curveTo(12.64f, 4.26f, 11.47f, 3f, 10f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveTo(6.45f, 1f, 6f, 1.45f, 6f, 2f)
                verticalLineToRelative(1f)
                lineTo(4.14f, 3f)
                curveToRelative(-1.31f, 0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveTo(1.36f, 6.74f, 2.53f, 8f, 4f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                lineTo(4.14f, 9f)
                curveToRelative(-1.31f, 0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveTo(1.36f, 12.74f, 2.53f, 14f, 4f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                curveToRelative(1.47f, 0f, 2.64f, -1.26f, 2.49f, -2.76f)
                curveTo(12.36f, 9.94f, 11.17f, 9f, 9.86f, 9f)
                close()
            }
        }.build()
        
        return _Tapas!!
    }

private var _Tapas: ImageVector? = null


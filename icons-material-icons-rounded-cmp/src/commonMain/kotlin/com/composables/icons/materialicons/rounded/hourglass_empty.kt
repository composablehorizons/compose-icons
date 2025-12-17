package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hourglass_empty: ImageVector
    get() {
        if (_Hourglass_empty != null) return _Hourglass_empty!!
        
        _Hourglass_empty = ImageVector.Builder(
            name = "hourglass_empty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.17f)
                curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.42f)
                lineTo(10f, 12f)
                lineToRelative(-3.42f, 3.42f)
                curveToRelative(-0.37f, 0.38f, -0.58f, 0.89f, -0.58f, 1.42f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.16f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f)
                lineTo(14f, 12f)
                lineToRelative(3.41f, -3.4f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                close()
                moveToRelative(8f, 14.5f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(-4f, -5f)
                lineToRelative(-4f, -4f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.5f)
                lineToRelative(-4f, 4f)
                close()
            }
        }.build()
        
        return _Hourglass_empty!!
    }

private var _Hourglass_empty: ImageVector? = null


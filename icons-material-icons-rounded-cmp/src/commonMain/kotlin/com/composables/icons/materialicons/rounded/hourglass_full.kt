package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hourglass_full: ImageVector
    get() {
        if (_Hourglass_full != null) return _Hourglass_full!!
        
        _Hourglass_full = ImageVector.Builder(
            name = "hourglass_full",
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
                moveTo(6f, 4f)
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
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Hourglass_full!!
    }

private var _Hourglass_full: ImageVector? = null


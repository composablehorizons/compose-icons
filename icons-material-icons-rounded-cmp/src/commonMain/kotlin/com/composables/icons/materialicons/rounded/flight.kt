package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flight: ImageVector
    get() {
        if (_Flight != null) return _Flight!!
        
        _Flight = ImageVector.Builder(
            name = "flight",
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
                moveTo(21f, 14.58f)
                curveToRelative(0f, -0.36f, -0.19f, -0.69f, -0.49f, -0.89f)
                lineTo(13f, 9f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(10f, 2.67f, 10f, 3.5f)
                verticalLineTo(9f)
                lineToRelative(-7.51f, 4.69f)
                curveToRelative(-0.3f, 0.19f, -0.49f, 0.53f, -0.49f, 0.89f)
                curveToRelative(0f, 0.7f, 0.68f, 1.21f, 1.36f, 1f)
                lineTo(10f, 13.5f)
                verticalLineTo(19f)
                lineToRelative(-1.8f, 1.35f)
                curveToRelative(-0.13f, 0.09f, -0.2f, 0.24f, -0.2f, 0.4f)
                verticalLineToRelative(0.59f)
                curveToRelative(0f, 0.33f, 0.32f, 0.57f, 0.64f, 0.48f)
                lineTo(11.5f, 21f)
                lineToRelative(2.86f, 0.82f)
                curveToRelative(0.32f, 0.09f, 0.64f, -0.15f, 0.64f, -0.48f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.16f, -0.07f, -0.31f, -0.2f, -0.4f)
                lineTo(13f, 19f)
                verticalLineToRelative(-5.5f)
                lineToRelative(6.64f, 2.08f)
                curveToRelative(0.68f, 0.21f, 1.36f, -0.3f, 1.36f, -1f)
                close()
            }
        }.build()
        
        return _Flight!!
    }

private var _Flight: ImageVector? = null


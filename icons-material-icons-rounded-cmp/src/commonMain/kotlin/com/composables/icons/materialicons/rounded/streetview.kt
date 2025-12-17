package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Streetview: ImageVector
    get() {
        if (_Streetview != null) return _Streetview!!
        
        _Streetview = ImageVector.Builder(
            name = "streetview",
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
                moveTo(12.56f, 14.33f)
                curveToRelative(-0.34f, 0.27f, -0.56f, 0.7f, -0.56f, 1.17f)
                verticalLineTo(21f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5.98f)
                curveToRelative(-0.94f, -0.33f, -1.95f, -0.52f, -3f, -0.52f)
                curveToRelative(-2.03f, 0f, -3.93f, 0.7f, -5.44f, 1.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 6f)
                arcTo(5f, 5f, 0f, false, true, 18f, 11f)
                arcTo(5f, 5f, 0f, false, true, 13f, 6f)
                arcTo(5f, 5f, 0f, false, true, 23f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 6f)
                curveToRelative(0f, -1.08f, 0.27f, -2.1f, 0.74f, -3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f)
                lineToRelative(9.82f, -9.82f)
                curveTo(12.23f, 9.42f, 11.5f, 7.8f, 11.5f, 6f)
                close()
            }
        }.build()
        
        return _Streetview!!
    }

private var _Streetview: ImageVector? = null


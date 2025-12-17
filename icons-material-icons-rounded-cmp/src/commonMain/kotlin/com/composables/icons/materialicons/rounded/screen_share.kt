package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screen_share: ImageVector
    get() {
        if (_Screen_share != null) return _Screen_share!!
        
        _Screen_share = ImageVector.Builder(
            name = "screen_share",
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
                moveTo(20f, 18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-7f, -3.53f)
                verticalLineToRelative(-2.19f)
                curveToRelative(-2.78f, 0f, -4.61f, 0.85f, -6f, 2.72f)
                curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6f, -5.87f)
                verticalLineTo(7f)
                lineToRelative(3.61f, 3.36f)
                curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0f, 0.73f)
                lineTo(13f, 14.47f)
                close()
            }
        }.build()
        
        return _Screen_share!!
    }

private var _Screen_share: ImageVector? = null


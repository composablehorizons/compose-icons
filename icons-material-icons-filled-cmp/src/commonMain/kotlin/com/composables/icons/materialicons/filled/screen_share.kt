package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Screen_share: ImageVector
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
                curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                lineTo(22f, 6f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(-7f, -3.53f)
                verticalLineToRelative(-2.19f)
                curveToRelative(-2.78f, 0f, -4.61f, 0.85f, -6f, 2.72f)
                curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6f, -5.87f)
                verticalLineTo(7f)
                lineToRelative(4f, 3.73f)
                lineToRelative(-4f, 3.74f)
                close()
            }
        }.build()
        
        return _Screen_share!!
    }

private var _Screen_share: ImageVector? = null


package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
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
                moveTo(20.99f, 14.04f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10.05f)
                curveToRelative(0.28f, 1.92f, 2.1f, 3.35f, 4.18f, 2.93f)
                curveToRelative(1.34f, -0.27f, 2.43f, -1.37f, 2.7f, -2.71f)
                curveToRelative(0.25f, -1.24f, -0.16f, -2.39f, -0.94f, -3.18f)
                close()
                moveToRelative(-2f, -9.04f)
                lineTo(12f, 8.5f)
                lineTo(5f, 5f)
                horizontalLineToRelative(13.99f)
                close()
                moveToRelative(-3.64f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                lineToRelative(7f, 3.5f)
                lineTo(19f, 7f)
                verticalLineToRelative(6.05f)
                curveToRelative(-0.16f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f)
                curveToRelative(-1.39f, 0f, -2.59f, 0.82f, -3.15f, 2f)
                close()
                moveToRelative(5.15f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null


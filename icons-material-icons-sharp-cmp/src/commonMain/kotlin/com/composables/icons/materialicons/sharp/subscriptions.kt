package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Subscriptions: ImageVector
    get() {
        if (_Subscriptions != null) return _Subscriptions!!
        
        _Subscriptions = ImageVector.Builder(
            name = "subscriptions",
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
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-2f, -6f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineTo(2f)
                close()
                moveToRelative(4f, 8f)
                verticalLineToRelative(12f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineToRelative(20f)
                close()
                moveToRelative(-6f, 6f)
                lineToRelative(-6f, -3.27f)
                verticalLineToRelative(6.53f)
                lineTo(16f, 16f)
                close()
            }
        }.build()
        
        return _Subscriptions!!
    }

private var _Subscriptions: ImageVector? = null


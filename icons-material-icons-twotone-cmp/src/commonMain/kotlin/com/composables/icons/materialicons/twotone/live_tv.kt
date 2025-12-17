package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Live_tv: ImageVector
    get() {
        if (_Live_tv != null) return _Live_tv!!
        
        _Live_tv = ImageVector.Builder(
            name = "live_tv",
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
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(6f, -10f)
                lineToRelative(7f, 4f)
                lineToRelative(-7f, 4f)
                verticalLineToRelative(-8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 10f)
                verticalLineToRelative(8f)
                lineToRelative(7f, -4f)
                close()
                moveToRelative(12f, -4f)
                horizontalLineToRelative(-7.58f)
                lineToRelative(3.29f, -3.29f)
                lineTo(16f, 2f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.69f, 0.71f)
                lineTo(10.56f, 6f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Live_tv!!
    }

private var _Live_tv: ImageVector? = null


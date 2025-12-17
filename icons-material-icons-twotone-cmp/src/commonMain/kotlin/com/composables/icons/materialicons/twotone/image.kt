package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Image: ImageVector
    get() {
        if (_Image != null) return _Image!!
        
        _Image = ImageVector.Builder(
            name = "image",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(4f, -5.86f)
                lineToRelative(2.14f, 2.58f)
                lineToRelative(3f, -3.87f)
                lineTo(18f, 17f)
                horizontalLineTo(6f)
                lineToRelative(3f, -3.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-4.86f, -7.14f)
                lineToRelative(-3f, 3.86f)
                lineTo(9f, 13.14f)
                lineTo(6f, 17f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Image!!
    }

private var _Image: ImageVector? = null


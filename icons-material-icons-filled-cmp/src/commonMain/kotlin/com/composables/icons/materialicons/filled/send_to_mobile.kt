package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Send_to_mobile: ImageVector
    get() {
        if (_Send_to_mobile != null) return _Send_to_mobile!!
        
        _Send_to_mobile = ImageVector.Builder(
            name = "send_to_mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, 0.9f, -1.99f, 2f, -1.99f)
                lineTo(17f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                verticalLineTo(17f)
                close()
                moveTo(22f, 12f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(22f, 12f)
                close()
            }
        }.build()
        
        return _Send_to_mobile!!
    }

private var _Send_to_mobile: ImageVector? = null


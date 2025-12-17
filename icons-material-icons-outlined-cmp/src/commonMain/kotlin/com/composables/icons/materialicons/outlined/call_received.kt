package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Call_received: ImageVector
    get() {
        if (_Call_received != null) return _Call_received!!
        
        _Call_received = ImageVector.Builder(
            name = "call_received",
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
                moveTo(20f, 5.41f)
                lineTo(18.59f, 4f)
                lineTo(7f, 15.59f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8.41f)
                lineTo(20f, 5.41f)
                close()
            }
        }.build()
        
        return _Call_received!!
    }

private var _Call_received: ImageVector? = null


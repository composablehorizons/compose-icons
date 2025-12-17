package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Call_missed: ImageVector
    get() {
        if (_Call_missed != null) return _Call_missed!!
        
        _Call_missed = ImageVector.Builder(
            name = "call_missed",
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
                moveTo(5f, 10.41f)
                lineToRelative(7f, 7f)
                lineToRelative(9f, -9f)
                lineTo(19.59f, 7f)
                lineTo(12f, 14.59f)
                lineTo(6.41f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Call_missed!!
    }

private var _Call_missed: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hourglass_empty: ImageVector
    get() {
        if (_Hourglass_empty != null) return _Hourglass_empty!!
        
        _Hourglass_empty = ImageVector.Builder(
            name = "hourglass_empty",
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
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(0.01f)
                lineTo(6f, 8.01f)
                lineTo(10f, 12f)
                lineToRelative(-4f, 4f)
                lineToRelative(0.01f, 0.01f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-5.99f)
                horizontalLineToRelative(-0.01f)
                lineTo(18f, 16f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -3.99f)
                lineToRelative(-0.01f, -0.01f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 14.5f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(0f, -9f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                verticalLineTo(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.build()
        
        return _Hourglass_empty!!
    }

private var _Hourglass_empty: ImageVector? = null


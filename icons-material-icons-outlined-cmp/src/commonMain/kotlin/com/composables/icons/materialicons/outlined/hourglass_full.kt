package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hourglass_full: ImageVector
    get() {
        if (_Hourglass_full != null) return _Hourglass_full!!
        
        _Hourglass_full = ImageVector.Builder(
            name = "hourglass_full",
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
                moveTo(6f, 2f)
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
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Hourglass_full!!
    }

private var _Hourglass_full: ImageVector? = null


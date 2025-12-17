package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Arrow_forward: ImageVector
    get() {
        if (_Arrow_forward != null) return _Arrow_forward!!
        
        _Arrow_forward = ImageVector.Builder(
            name = "arrow_forward",
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
                moveTo(12f, 4f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(16.17f, 11f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12.17f)
                lineToRelative(-5.58f, 5.59f)
                lineTo(12f, 20f)
                lineToRelative(8f, -8f)
                lineToRelative(-8f, -8f)
                close()
            }
        }.build()
        
        return _Arrow_forward!!
    }

private var _Arrow_forward: ImageVector? = null


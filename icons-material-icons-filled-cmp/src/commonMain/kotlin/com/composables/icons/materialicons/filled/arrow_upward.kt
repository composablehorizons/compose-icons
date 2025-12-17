package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Arrow_upward: ImageVector
    get() {
        if (_Arrow_upward != null) return _Arrow_upward!!
        
        _Arrow_upward = ImageVector.Builder(
            name = "arrow_upward",
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
                moveTo(4f, 12f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11f, 7.83f)
                verticalLineTo(20f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.83f)
                lineToRelative(5.58f, 5.59f)
                lineTo(20f, 12f)
                lineToRelative(-8f, -8f)
                lineToRelative(-8f, 8f)
                close()
            }
        }.build()
        
        return _Arrow_upward!!
    }

private var _Arrow_upward: ImageVector? = null


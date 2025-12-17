package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_drop_up: ImageVector
    get() {
        if (_Arrow_drop_up != null) return _Arrow_drop_up!!
        
        _Arrow_drop_up = ImageVector.Builder(
            name = "arrow_drop_up",
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
                moveTo(8.71f, 12.29f)
                lineTo(11.3f, 9.7f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f)
                horizontalLineTo(9.41f)
                curveToRelative(-0.89f, 0f, -1.33f, -1.08f, -0.7f, -1.71f)
                close()
            }
        }.build()
        
        return _Arrow_drop_up!!
    }

private var _Arrow_drop_up: ImageVector? = null


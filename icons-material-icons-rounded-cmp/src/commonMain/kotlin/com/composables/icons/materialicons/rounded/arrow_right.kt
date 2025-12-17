package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_right: ImageVector
    get() {
        if (_Arrow_right != null) return _Arrow_right!!
        
        _Arrow_right = ImageVector.Builder(
            name = "arrow_right",
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
                moveTo(11.71f, 15.29f)
                lineToRelative(2.59f, -2.59f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(11.71f, 8.7f)
                curveToRelative(-0.63f, -0.62f, -1.71f, -0.18f, -1.71f, 0.71f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 0.9f, 1.08f, 1.34f, 1.71f, 0.71f)
                close()
            }
        }.build()
        
        return _Arrow_right!!
    }

private var _Arrow_right: ImageVector? = null


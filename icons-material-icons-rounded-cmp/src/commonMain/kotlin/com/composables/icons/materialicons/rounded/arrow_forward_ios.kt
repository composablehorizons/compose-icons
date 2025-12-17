package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_forward_ios: ImageVector
    get() {
        if (_Arrow_forward_ios != null) return _Arrow_forward_ios!!
        
        _Arrow_forward_ios = ImageVector.Builder(
            name = "arrow_forward_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.38f, 21.01f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0f)
                lineToRelative(8.31f, -8.31f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(9.15f, 2.98f)
                curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0f)
                reflectiveCurveToRelative(-0.49f, 1.28f, 0f, 1.77f)
                lineTo(14.62f, 12f)
                lineToRelative(-7.25f, 7.25f)
                curveToRelative(-0.48f, 0.48f, -0.48f, 1.28f, 0.01f, 1.76f)
                close()
            }
        }.build()
        
        return _Arrow_forward_ios!!
    }

private var _Arrow_forward_ios: ImageVector? = null


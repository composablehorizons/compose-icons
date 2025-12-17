package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Delicious: ImageVector
    get() {
        if (_Delicious != null) return _Delicious!!
        
        _Delicious = ImageVector.Builder(
            name = "delicious",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(446.5f, 68f)
                curveToRelative(-0.4f, -1.5f, -0.9f, -3f, -1.4f, -4.5f)
                curveToRelative(-0.9f, -2.5f, -2f, -4.8f, -3.3f, -7.1f)
                curveToRelative(-1.4f, -2.4f, -3f, -4.8f, -4.7f, -6.9f)
                curveToRelative(-2.1f, -2.5f, -4.4f, -4.8f, -6.9f, -6.8f)
                curveToRelative(-1.1f, -0.9f, -2.2f, -1.7f, -3.3f, -2.5f)
                curveToRelative(-1.3f, -0.9f, -2.6f, -1.7f, -4f, -2.4f)
                curveToRelative(-1.8f, -1f, -3.6f, -1.8f, -5.5f, -2.5f)
                curveToRelative(-1.7f, -0.7f, -3.5f, -1.3f, -5.4f, -1.7f)
                curveToRelative(-3.8f, -1f, -7.9f, -1.5f, -12f, -1.5f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 4.1f, 0.5f, 8.2f, 1.5f, 12f)
                curveToRelative(2f, 7.7f, 5.8f, 14.6f, 11f, 20.3f)
                curveToRelative(1f, 1.1f, 2.1f, 2.2f, 3.3f, 3.3f)
                curveToRelative(5.7f, 5.2f, 12.6f, 9f, 20.3f, 11f)
                curveToRelative(3.8f, 1f, 7.9f, 1.5f, 12f, 1.5f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(-0.1f, -4.1f, -0.6f, -8.2f, -1.6f, -12f)
                close()
                moveTo(416f, 432f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineTo(224f)
                verticalLineTo(256f)
                horizontalLineTo(32f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(192f)
                close()
            }
        }.build()
        
        return _Delicious!!
    }

private var _Delicious: ImageVector? = null


package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mobile_off: ImageVector
    get() {
        if (_Mobile_off != null) return _Mobile_off!!
        
        _Mobile_off = ImageVector.Builder(
            name = "mobile_off",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.76f, 2.49f)
                lineTo(1.49f, 3.76f)
                lineTo(5f, 7.27f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.02f, 0f, 1.85f, -0.77f, 1.98f, -1.75f)
                lineToRelative(1.72f, 1.72f)
                lineToRelative(1.27f, -1.27f)
                lineTo(2.76f, 2.49f)
                close()
                moveTo(7f, 19f)
                verticalLineTo(9.27f)
                lineTo(16.73f, 19f)
                horizontalLineTo(7f)
                close()
                moveTo(17f, 5f)
                verticalLineToRelative(9.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(7f)
                curveToRelative(-0.85f, 0f, -1.58f, 0.54f, -1.87f, 1.3f)
                lineTo(7.83f, 5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()
        
        return _Mobile_off!!
    }

private var _Mobile_off: ImageVector? = null


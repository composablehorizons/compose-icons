package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Open_in_new_off: ImageVector
    get() {
        if (_Open_in_new_off != null) return _Open_in_new_off!!
        
        _Open_in_new_off = ImageVector.Builder(
            name = "open_in_new_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.79f, 5.8f)
                lineTo(14f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                lineToRelative(-2.79f, -2.8f)
                lineToRelative(-4.09f, 4.09f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(16.79f, 5.8f)
                close()
                moveTo(19f, 12f)
                verticalLineToRelative(4.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(18.17f, 21f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(16.17f, 19f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(9.7f, 15.71f)
                lineTo(8.29f, 14.3f)
                lineToRelative(1.59f, -1.59f)
                lineTo(5f, 7.83f)
                verticalLineTo(19f)
                horizontalLineTo(16.17f)
                close()
                moveTo(7.83f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5f)
                close()
            }
        }.build()
        
        return _Open_in_new_off!!
    }

private var _Open_in_new_off: ImageVector? = null


package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Piano_off: ImageVector
    get() {
        if (_Piano_off != null) return _Piano_off!!
        
        _Piano_off = ImageVector.Builder(
            name = "piano_off",
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(3f, 5.83f)
                verticalLineTo(21f)
                horizontalLineToRelative(15.17f)
                lineToRelative(1.61f, 1.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8.25f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(7.83f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(19f)
                close()
                moveTo(9.75f, 19f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.67f)
                lineToRelative(3.25f, 3.25f)
                verticalLineTo(19f)
                horizontalLineTo(9.75f)
                close()
                moveTo(5.83f, 3f)
                horizontalLineTo(21f)
                verticalLineToRelative(15.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9.17f)
                lineToRelative(-4f, -4f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.17f)
                lineTo(5.83f, 3f)
                close()
            }
        }.build()
        
        return _Piano_off!!
    }

private var _Piano_off: ImageVector? = null


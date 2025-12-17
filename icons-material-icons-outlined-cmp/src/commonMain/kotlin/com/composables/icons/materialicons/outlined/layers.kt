package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
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
                moveTo(11.99f, 18.54f)
                lineToRelative(-7.37f, -5.73f)
                lineTo(3f, 14.07f)
                lineToRelative(9f, 7f)
                lineToRelative(9f, -7f)
                lineToRelative(-1.63f, -1.27f)
                close()
                moveTo(12f, 16f)
                lineToRelative(7.36f, -5.73f)
                lineTo(21f, 9f)
                lineToRelative(-9f, -7f)
                lineToRelative(-9f, 7f)
                lineToRelative(1.63f, 1.27f)
                lineTo(12f, 16f)
                close()
                moveToRelative(0f, -11.47f)
                lineTo(17.74f, 9f)
                lineTo(12f, 13.47f)
                lineTo(6.26f, 9f)
                lineTo(12f, 4.53f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null


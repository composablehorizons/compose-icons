package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Unfold_less: ImageVector
    get() {
        if (_Unfold_less != null) return _Unfold_less!!
        
        _Unfold_less = ImageVector.Builder(
            name = "unfold_less",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 0f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.41f, 18.59f)
                lineTo(8.83f, 20f)
                lineTo(12f, 16.83f)
                lineTo(15.17f, 20f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12f, 14f)
                lineToRelative(-4.59f, 4.59f)
                close()
                moveToRelative(9.18f, -13.18f)
                lineTo(15.17f, 4f)
                lineTo(12f, 7.17f)
                lineTo(8.83f, 4f)
                lineTo(7.41f, 5.41f)
                lineTo(12f, 10f)
                lineToRelative(4.59f, -4.59f)
                close()
            }
        }.build()
        
        return _Unfold_less!!
    }

private var _Unfold_less: ImageVector? = null


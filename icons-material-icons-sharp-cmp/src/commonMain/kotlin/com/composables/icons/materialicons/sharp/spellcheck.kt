package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Spellcheck: ImageVector
    get() {
        if (_Spellcheck != null) return _Spellcheck!!
        
        _Spellcheck = ImageVector.Builder(
            name = "spellcheck",
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
                moveTo(12.45f, 16f)
                horizontalLineToRelative(2.09f)
                lineTo(9.43f, 3f)
                horizontalLineTo(7.57f)
                lineTo(2.46f, 16f)
                horizontalLineToRelative(2.09f)
                lineToRelative(1.12f, -3f)
                horizontalLineToRelative(5.64f)
                lineToRelative(1.14f, 3f)
                close()
                moveToRelative(-6.02f, -5f)
                lineTo(8.5f, 5.48f)
                lineTo(10.57f, 11f)
                horizontalLineTo(6.43f)
                close()
                moveToRelative(15.16f, 0.59f)
                lineToRelative(-8.09f, 8.09f)
                lineTo(9.83f, 16f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.09f, 5.09f)
                lineTo(23f, 13f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Spellcheck!!
    }

private var _Spellcheck: ImageVector? = null


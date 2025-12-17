package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Moving: ImageVector
    get() {
        if (_Moving != null) return _Moving!!
        
        _Moving = ImageVector.Builder(
            name = "moving",
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
                moveTo(19.71f, 9.71f)
                lineTo(22f, 12f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-4.17f, 4.17f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.17f, -1.17f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineTo(2f, 16.59f)
                lineTo(3.41f, 18f)
                lineToRelative(5.29f, -5.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineTo(19.71f, 9.71f)
                close()
            }
        }.build()
        
        return _Moving!!
    }

private var _Moving: ImageVector? = null


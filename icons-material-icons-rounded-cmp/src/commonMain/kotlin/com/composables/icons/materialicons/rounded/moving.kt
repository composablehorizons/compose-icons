package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Moving: ImageVector
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
                moveTo(2.7f, 17.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(4.18f, -4.17f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(6.5f)
                curveTo(22f, 6.22f, 21.78f, 6f, 21.5f, 6f)
                horizontalLineToRelative(-4.29f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-4.17f, 4.17f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.17f, -1.17f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineTo(2.7f, 15.88f)
                curveTo(2.32f, 16.27f, 2.32f, 16.91f, 2.7f, 17.29f)
                close()
            }
        }.build()
        
        return _Moving!!
    }

private var _Moving: ImageVector? = null


package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Label_important: ImageVector
    get() {
        if (_Label_important != null) return _Label_important!!
        
        _Label_important = ImageVector.Builder(
            name = "label_important",
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
                moveTo(5.94f, 18.99f)
                horizontalLineTo(15f)
                curveToRelative(0.65f, 0f, 1.26f, -0.31f, 1.63f, -0.84f)
                lineToRelative(3.95f, -5.57f)
                curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0f, -1.16f)
                lineToRelative(-3.96f, -5.58f)
                curveTo(16.26f, 5.31f, 15.65f, 5f, 15f, 5f)
                horizontalLineTo(5.94f)
                curveToRelative(-0.81f, 0f, -1.28f, 0.93f, -0.81f, 1.59f)
                lineTo(9f, 12f)
                lineToRelative(-3.87f, 5.41f)
                curveToRelative(-0.47f, 0.66f, 0f, 1.58f, 0.81f, 1.58f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null


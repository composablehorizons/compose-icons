package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Label_important_outline: ImageVector
    get() {
        if (_Label_important_outline != null) return _Label_important_outline!!
        
        _Label_important_outline = ImageVector.Builder(
            name = "label_important_outline",
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
                moveTo(15f, 19f)
                horizontalLineTo(4.83f)
                curveToRelative(-0.79f, 0f, -1.27f, -0.88f, -0.84f, -1.54f)
                lineTo(7.5f, 12f)
                lineTo(3.99f, 6.54f)
                curveTo(3.56f, 5.88f, 4.04f, 5f, 4.83f, 5f)
                horizontalLineTo(15f)
                curveToRelative(0.65f, 0f, 1.26f, 0.31f, 1.63f, 0.84f)
                lineToRelative(3.96f, 5.58f)
                curveToRelative(0.25f, 0.35f, 0.25f, 0.81f, 0f, 1.16f)
                lineToRelative(-3.96f, 5.58f)
                curveToRelative(-0.37f, 0.52f, -0.98f, 0.84f, -1.63f, 0.84f)
                close()
                moveToRelative(-8.5f, -2f)
                horizontalLineTo(15f)
                lineToRelative(3.5f, -5f)
                lineTo(15f, 7f)
                horizontalLineTo(6.5f)
                lineToRelative(3.5f, 5f)
                lineToRelative(-3.5f, 5f)
                close()
            }
        }.build()
        
        return _Label_important_outline!!
    }

private var _Label_important_outline: ImageVector? = null


package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Label_important_outline: ImageVector
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
                horizontalLineTo(3f)
                lineToRelative(4.5f, -7f)
                lineTo(3f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.65f, 0f, 1.26f, 0.31f, 1.63f, 0.84f)
                lineTo(21f, 12f)
                lineToRelative(-4.37f, 6.16f)
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

